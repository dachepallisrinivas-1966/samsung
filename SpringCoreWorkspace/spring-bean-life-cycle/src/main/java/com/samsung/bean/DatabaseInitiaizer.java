package com.samsung.bean;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.samsung.model.User;

@Component
public class DatabaseInitiaizer {

	private List<User> users = new ArrayList<>();

	public void init() {
		User user = new User(1, "User");
		User user1 = new User(2, "Admin");
		User user2 = new User(3, "SuperAdmin");

		users.add(user);
		users.add(user1);
		users.add(user2);
		System.out.println("-----------List of users added in init() method ------------");
		for (User u : users) {
			System.out.println(u);
		}
		// save to database

	}

	public void destroy() {
		// Delete from database
		users.clear();
		System.out.println("-----------After of users removed from List in destroy() method ------------");
		for (User u : users) {
			System.out.println(u);
		}
		System.out.println("End of destroy()  method");
	}
}
