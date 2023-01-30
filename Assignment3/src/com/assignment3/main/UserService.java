package com.assignment3.main;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class UserService {

	public User[] parseFile(String path) throws IOException {
		User[] users = new User [4];
		BufferedReader fileReader = null;
		try {
			 fileReader = new BufferedReader(new FileReader(path));
			 String line;
			 int i = 0;
			 while ((line = fileReader.readLine()) != null) {
				 users[i] = new User(line.split(","));
				 i++;
			 }
		} finally {
			if (fileReader !=null)
				fileReader.close();
		}
		return users;
	}
}
	
	
	