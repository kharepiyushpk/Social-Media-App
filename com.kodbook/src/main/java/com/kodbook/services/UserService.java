package com.kodbook.services;

import com.kodbook.entities.User;

public interface UserService {

	boolean userExist(String username, String email);

	void addUser(User user);

	boolean validate(String username, String password);

}
