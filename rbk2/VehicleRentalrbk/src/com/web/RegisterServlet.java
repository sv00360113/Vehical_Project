package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.serviceimpl.RegisterServiceImpl;


public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String custid=request.getParameter("customerid");
		String password=request.getParameter("password");
		String firstname=request.getParameter("fname");
		String lastname=request.getParameter("lname");
		String phone=request.getParameter("phone");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		
		RegisterServiceImpl rsi=new RegisterServiceImpl();
		int i=rsi.registrationService(custid, password, firstname, lastname, phone, email, address);
		PrintWriter out=response.getWriter();
		if(i!=0){
			RequestDispatcher rd=request.getRequestDispatcher("/regsuccess.jsp");
			rd.forward(request, response);
		}
		else{
			RequestDispatcher rd=request.getRequestDispatcher("/regfail.jsp");
			rd.forward(request, response);
		}
		}
		//out.println(i+"\t"+"rows inserted");
	}

