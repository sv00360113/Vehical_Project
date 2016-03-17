package com.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Customer;
import com.serviceimpl.CustomerlistServiceImpl;

/**
 * Servlet implementation class customerServlet
 */
public class customerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public customerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CustomerlistServiceImpl cust=new CustomerlistServiceImpl();
		
		ArrayList<Customer> ar=new ArrayList<Customer>();
		ar=cust.listCustomer();
		request.setAttribute("list", ar);
		if(ar.size()!=0)
		{
			RequestDispatcher rd=request.getRequestDispatcher("/customerlist.jsp");
			rd.forward(request, response);
		}
		else
		{
			String msg="fail";
			request.setAttribute("msg", msg);
			RequestDispatcher rd2=request.getRequestDispatcher("/customerlist.jsp");
			rd2.forward(request, response);
		}
		
	}

}
