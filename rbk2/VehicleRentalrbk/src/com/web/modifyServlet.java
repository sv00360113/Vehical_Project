package com.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Vehicle;
import com.serviceimpl.modifyServiceImpl;

/**
 * Servlet implementation class modifyServlet
 */
public class modifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public modifyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String vid=request.getParameter("id");
		modifyServiceImpl mod=new modifyServiceImpl();
		ArrayList<Vehicle> ar=new ArrayList<Vehicle>();
		ar=mod.modify(vid);
		if(ar.size()!=0)
		{
			request.setAttribute("list11",ar);
			RequestDispatcher rd2=request.getRequestDispatcher("/edit.jsp");
			rd2.forward(request, response);
		}
		else
		{
			String msg="fail";
			request.setAttribute("msg", msg);
			RequestDispatcher rd2=request.getRequestDispatcher("/modify.jsp");
			rd2.forward(request, response);
		}
		
	}

}
