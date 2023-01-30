package com.assignment3.main;

public class User {
	private String username;
	private String password;
	private String name;
	
	public User(String[] input) {
		this.username=input[0];
		this.password= input[1];
		this.name=input[2];
	}


	public User(String username, String password, String name) {
		this.username = username;
		this.password = password;
		this.name = name;
	}

	// Creating the getters and setters


	public String getName() {
		return name;
	}

	public String getUsername() {
		return username;

	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

}	
	
	
	

