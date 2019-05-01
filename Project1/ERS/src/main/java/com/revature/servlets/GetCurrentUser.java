package com.revature.servlets;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.beans.Reimbursement.RequestType;
import com.revature.dao.UserDao;
import com.revature.dao.daoimpl.UserDaoImpl;

public class GetCurrentUser extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
     * @see HttpServlet#HttpServlet()
     */
    public GetCurrentUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	
	protected UserDao service = new UserDaoImpl();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		String username = request.getParameter("username");
		response.setContentType("text/plain");
		
		PrintWriter out = response.getWriter();
		
	}
	
}