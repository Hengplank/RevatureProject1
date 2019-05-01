package com.revature.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

import oracle.jdbc.OracleDriver;

public class ConnectionUtil {
	private static Connection conn = null;

	private static String connURL = "";
	private static String username = "";
	private static String password = "";

	// TODO Link to AWS server
	@Test
	public static Connection getConnection() {
		try {
			// String conn="jdbc:oracle:thin:@localhost:1521:xe";
			connURL = "jdbc:oracle:thin:@db1904.clqgpgrc9fhw.us-east-2.rds.amazonaws.com:1521:orcl";
//		conn = DriverManager.getConnection(
//				"jdbc:oracle:thin:@db1904.clqgpgrc9fhw.us-east-2.rds.amazonaws.com:1521:orcl",
//				"admin",
//				"mypassword"
//				);
			username = "admin";
			password = "mypassword";
			OracleDriver driver = new OracleDriver();
			DriverManager.registerDriver(driver);

			DriverManager.getConnection(connURL, username, password);

			System.out.println("=====<Connected to database and retrieving info...>====");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

}