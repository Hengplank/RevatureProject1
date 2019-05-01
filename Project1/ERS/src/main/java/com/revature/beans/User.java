package com.revature.beans;

import java.util.HashMap;
import java.util.Map;

public class User {
	public enum UserRole {
		INVALID(0), EMPLOYEE(1), MANAGER(2);

		private static Map<Integer, UserRole> map = new HashMap<Integer, UserRole>();

		static {
			for (UserRole role : UserRole.values()) {
				map.put(role.id, role);
			}
		}

		private final int id;

		private UserRole(int id) {
			this.id = id;
		}

		public int getId() {
			return id;
		}

		public static UserRole valueOf(int id) {
			return map.get(id);
		}
	}

	private int id;
	private String username;
	private String password;

	public User(int id, String username, String firstName, String lastName, String email, UserRole role) {
		super();
		this.id = id;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.role = role;
	}

	private String firstName;
	private String lastName;
	private String email;
	private UserRole role;

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}

	public User() {

	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", role=" + role + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public User(int id, String username, String password, String firstName, String lastName, String email,
			UserRole role) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.role = role;
	}

	public User(int id, String username, String password, String firstName, String lastName, String email, int role) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		if (role == 1) {
			this.role = UserRole.EMPLOYEE;
		} else if (role == 2) {
			this.role = UserRole.MANAGER;
		} else {
			this.role = UserRole.INVALID;
		}
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
