package com.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.VehicleRental;
import com.service.ListBookingService;
import com.serviceimpl.ListBookingServiceImpl;

/**
 * Servlet implementation class ListallBookingServlet
 */
public class ListallBookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListallBookingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ListBookingServiceImpl lbsi=new ListBookingServiceImpl();
		
		ArrayList<VehicleRental> ar=new ArrayList<VehicleRental>();
		ar=lbsi.listAll();
		if(ar.size()!=0)
		{
			request.setAttribute("list", ar);
			RequestDispatcher rd=request.getRequestDispatcher("/listall.jsp");
			rd.forward(request, response);
		}
		else{
			String msg="fail";
			request.setAttribute("msg", msg);
			RequestDispatcher rd2=request.getRequestDispatcher("/listall.jsp");
			rd2.forward(request, response);
		}
		
		
	}

}
