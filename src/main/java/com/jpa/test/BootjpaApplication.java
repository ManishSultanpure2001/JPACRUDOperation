package com.jpa.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		User user1 = new User();
		user1.setName("Manish");
		user1.setCity("Indore");
		user1.setStatus("I am java Coder");

		User user2 = new User();
		user2.setName("Amit");
		user2.setCity("Indore");
		user2.setStatus("I am ROR Coder");

		User user3 = new User();
		user3.setName("Prachi");
		user3.setCity("Indore");
		user3.setStatus("I am PHP Coder");

		User user4 = new User();
		user4.setName("Rohan");
		user4.setCity("Indore");
		user4.setStatus("I am React Coder");

		List<User> list = new ArrayList<User>();
		list.add(user1);
		list.add(user2);
		list.add(user3);
		list.add(user4);

		/* Create user single user */

//		User user11 = userRepository.save(user1);
//		System.out.println(user11);

		/* create Multiple user by sigle go */

//		Iterable<User> allUsers = userRepository.saveAll(list);
//		allUsers.forEach(getUser->{
//			
//			System.out.println(getUser);
//		});

		/* Update the User */

//		Optional<User> findById = userRepository.findById(1);
//		User user = findById.get();
//		System.out.println(user);
//		user.setName("Anita");
//		User save = userRepository.save(user);
//		System.out.println(save);

		/*
		 * get all available user in database findById(id)-> return Optional contaning
		 * your data findAll()-> to get all your of database
		 */
		Iterable<User> itr = userRepository.findAll();
		/* old Way */
//		Iterator<User> iterator = itr.iterator();
//		while(iterator.hasNext()) {
//			User next = iterator.next();
//			System.out.println(next);
//		}

		/* new Way */
//		itr.forEach(new Consumer<User>(){
//
//			@Override
//			public void accept(User t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//			}
//			
//		});

		/* One more Way */
//		itr.forEach(user->{System.out.println(user);});

		/* Deleting the user data */
//		userRepository.delete(user1);
		userRepository.deleteById(1);
		System.out.println("Sucess fully deleted");
		;
	}

}
