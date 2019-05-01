package com.revature.dao;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.revature.beans.User;
import com.revature.beans.User.UserRole;


public interface UserDao {
	public User verifyUser(String username, String password);
	//public User getUser(String username, String password, HttpServletResponse response);
	public User getUser(String username, String password);//, HttpServletResponse response);
	public boolean updateUser(User user);
	public List<User> getEmployees();
	public boolean createUser(String username, String password, String firstname, 
			String lastname, String email, UserRole role);
	
}
