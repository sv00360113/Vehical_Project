package com.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.serviceimpl.AddServiceImpl;

/**
 * Servlet implementation class AddServlet
 */
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String vid=request.getParameter("vid");
		String vehiclename=request.getParameter("name");
		String chassy=request.getParameter("chassy");
		String reg=request.getParameter("reg");
		String permit=request.getParameter("permit");
		String Vehicle_Type=request.getParameter("vtype");
		String Class=request.getParameter("class");
		String HeavyType=request.getParameter("htype");
		String FuelType=request.getParameter("fuel");
		String Manufacturecompany=request.getParameter("man");
		String Vendor=request.getParameter("vendor");
		String Insuranceno=request.getParameter("ins");
		String Seats=request.getParameter("seats");
		String Availability=request.getParameter("ava");
		String PaymentId=request.getParameter("payment");
		int s=Integer.parseInt(Seats);
		int ava=Integer.parseInt(Availability);
		AddServiceImpl add=new AddServiceImpl();
		int i=add.addService(vid, vehiclename, chassy, reg, permit, Vehicle_Type, Class, HeavyType, FuelType, Manufacturecompany, Vendor, Insuranceno, s, ava, PaymentId);
		
		if(i!=0)
		{
			RequestDispatcher rd=request.getRequestDispatcher("/Updatesucces.jsp");
			rd.forward(request, response);
		}
		else{
			/*String msg="fail";
			request.setAttribute("msg", msg);*/
			RequestDispatcher rd=request.getRequestDispatcher("/Updatefail.jsp");
			rd.forward(request, response);
		}
	}

}
