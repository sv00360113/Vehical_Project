package com.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Vehicle;
import com.serviceimpl.ListAvailableImpl;

/**
 * Servlet implementation class ListallavailableServlet
 */
public class ListallavailableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListallavailableServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ListAvailableImpl lai=new ListAvailableImpl();
		ArrayList<Vehicle> ar=	lai.listAll();
		
		request.setAttribute("list", ar);
		RequestDispatcher rd=request.getRequestDispatcher("/Listallavailable.jsp");
		rd.forward(request, response);
		
		
	
		
	}

}
