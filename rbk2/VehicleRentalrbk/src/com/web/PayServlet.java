package com.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Payment;
import com.serviceimpl.PaymentServiceImpl;

/**
 * Servlet implementation class PayServlet
 */
public class PayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String rate=null;
		String permit=null;
		String dcharge=null;
		String custid=request.getParameter("userid");
		String vid=request.getParameter("vid");
		String days=request.getParameter("days");
		String fromdate=request.getParameter("fromdate");
		String todate=request.getParameter("todate");
		String distance=request.getParameter("distance");
		int distance1=Integer.parseInt(distance);
		
		//System.out.println(distance1);
		
		HttpSession session1=request.getSession();
		session1.setAttribute("custid", custid);
		session1.setAttribute("vid", vid);
		session1.setAttribute("days", days);
		session1.setAttribute("fromdate", fromdate);
		session1.setAttribute("todate", todate);
		session1.setAttribute("distance", distance);
		
		PaymentServiceImpl psi=new PaymentServiceImpl();
		ArrayList<Payment> ar=psi.payment(vid);
		if(ar.size()!=0)
		{
		for(Payment p:ar)
		{
			 rate=p.getRate();
			 permit=p.getPermitCost();
			 dcharge=p.getDriverCharge();
			
		}
		
		//System.out.println(rate);
		int rate1=Integer.parseInt(rate);
		int permit1=Integer.parseInt(permit);
		int dcharge1=Integer.parseInt(dcharge);
		
		int amount=(rate1 * distance1)+permit1+dcharge1;
		
		request.setAttribute("amount",amount);
		
		
		request.setAttribute("list1", ar);
		RequestDispatcher rd2=request.getRequestDispatcher("/Book.jsp");
		rd2.forward(request, response);
		}
		else{
			String msg1="fail";
			request.setAttribute("msg1", msg1);
			RequestDispatcher rd2=request.getRequestDispatcher("/Book.jsp");
			rd2.forward(request, response);
		}
		
		
		
		
		
		
	}

}
