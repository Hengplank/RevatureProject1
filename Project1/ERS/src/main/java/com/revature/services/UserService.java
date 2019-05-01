package com.revature.services;

import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import com.revature.utilities.ConnectionUtil;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.revature.beans.User;

import com.revature.beans.User.UserRole;


import com.revature.beans.Reimbursement;
import com.revature.beans.Reimbursement.RequestStatus;
import com.revature.beans.Reimbursement.RequestType;

import com.revature.dao.ReimbursementDao;
import com.revature.dao.UserDao;
import com.revature.dao.daoimpl.UserDaoImpl;


public class UserService{
	private UserDao ud = null;
	private ReimbursementDao rd = null;
	
//	public User verifyUser(String username, String password) {
//		// TODO Auto-generated method stub
//		//PreparedStatement pstmt = null;
//		//try(Connection conn = ConnectionUtil.getConnection()){
//		//	String sql = "SELECT * FROM ERS_USER WHERE u_username";
//			
//		}
//		return null;
//	}
	
	public User verifyUser(String username, String password) {
		// TODO Auto-generated method stub
		ud = new UserDaoImpl();
		return ud.verifyUser(username, password);
		
		//return null;
	}

	//public User getUser(String username, String password, HttpServletResponse response) {
	public User getUser(String username, String password) {//, HttpServletResponse response) {
		// TODO Auto-generated method stub
		ud = new UserDaoImpl();
		return ud.getUser(username, password);//, response);
		
		//return null;
	}

	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		ud = new UserDaoImpl();
		return ud.updateUser(user);
		
		//return false;
	}

	public boolean denyRequest(int req_id, int resolver_id) {
		// TODO Auto-generated method stub
		ud = new UserDaoImpl();
		return rd.denyRequest(req_id, resolver_id);
		
		//return false;
	}

	public boolean approveRequest(int req_id, int resolver_id) {
		// TODO Auto-generated method stub
		ud = new UserDaoImpl();
		return rd.approveRequest(req_id, resolver_id);
		
		//return false;
	}

	public List<Reimbursement> getPendingRequests(int employee_id) {
		// TODO Auto-generated method stub
		ud = new UserDaoImpl();
		return rd.getPendingRequests(employee_id);
		//return null;
	}

	public List<Reimbursement> getResolvedRequests(int employee_id) {
		// TODO Auto-generated method stub
		ud = new UserDaoImpl();
		return rd.getResolvedRequests(employee_id);
		//return null;
	}

	public List<Reimbursement> getPendingRequests() {
		// TODO Auto-generated method stub\
		ud = new UserDaoImpl();
		return rd.getPendingRequests();
		//return null;
	}

	public List<Reimbursement> getResolvedRequests() {
		// TODO Auto-generated method stub
		ud = new UserDaoImpl();
		return rd.getResolvedRequests();
		//return null;
	}

	public List<User> getEmployees() {
		// TODO Auto-generated method stub
		ud = new UserDaoImpl();
		return ud.getEmployees();
		//return null;
	}

	public boolean createUser(String username, String password, String firstname, String lastname, String email,
			UserRole role) {
		// TODO Auto-generated method stub
		ud = new UserDaoImpl();
		return ud.createUser(username, password, firstname, lastname, email, role);
		//return false;
	}

	public void getReceipt(int receipt_id, OutputStream out) {
		// TODO Auto-generated method stub
		ud = new UserDaoImpl();
		rd.getReceipt(receipt_id, out);
	}

	public void getReceipt(int user_id, int receipt_id, OutputStream out) {
		// TODO Auto-generated method stub
		ud = new UserDaoImpl();
		rd.getReceipt(user_id, receipt_id, out);
	}
}
