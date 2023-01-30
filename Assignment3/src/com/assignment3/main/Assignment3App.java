package com.assignment3.main;

import java.io.IOException;
import java.util.Scanner;

public class Assignment3App {


	public static void main(String[] args) throws IOException {
		new Assignment3App().execute();
	}
	
	private void execute() throws IOException {
		User[] users = new UserService().parseFile("data.txt");
		Scanner scanner = new Scanner(System.in);
		int invalidAttempts= 0;
		User validUser = null;
		while (invalidAttempts <=4 && validUser ==null) {
			System.out.println("Enter your username ");
			String username = scanner.nextLine();
			System.out.println("Enter your password");
			String password= scanner.nextLine();
			validUser = validate(username, password, users);
			if (validUser != null) {
				System.out.println("Welcome:" + validUser.getName());
			} else {
				invalidAttempts++;
				if (invalidAttempts ==5) {
					System.out.println("Too many failed login attempts, you are now locked out");
					System.exit(invalidAttempts);
				} else 
					System.out.println("Invalid login, please try again");
			}
		}
		scanner.close();
		
	}
	
	private User validate(String username, String password, User[] users) {
		for (User user: users) {
			if (username.equalsIgnoreCase(user.getUsername()) && password.equals(user.getPassword())) {

				return user;

			}
		}
		return null;
	
		}
	}