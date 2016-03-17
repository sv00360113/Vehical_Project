package com.web;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.serviceimpl.BookServiceImpl;

/**
 * Servlet implementation class BookServlet
 */
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*String userid=request.getParameter("userid");
		String vid=request.getParameter("vid");
		String days=request.getParameter("days");
		String from=request.getParameter("fromdate");
		int distance=Integer.parseInt(request.getParameter("distance"));
		*/
		HttpSession session=request.getSession();
		String custId=(String)session.getAttribute("custid");
		String vid=(String)session.getAttribute("vid");
		String days=(String)session.getAttribute("days");
		String fromdate=(String)session.getAttribute("fromdate");
		String todate=(String)session.getAttribute("todate");
		String distance=(String)session.getAttribute("distance");
		int distance1=Integer.parseInt(distance);
		String amount1=request.getParameter("amount");
		int amount=Integer.parseInt(amount1);
		
		/*DateFormat df=new SimpleDateFormat("dd/MM/YYYY");
		
		Date fromdate=df.parse(from);*/
		String to=request.getParameter("todate");
		/*DateFormat df2=new SimpleDateFormat("dd/MM/YYYY");
		
		Date todate=df2.parse(from);*/
		BookServiceImpl bsi=new BookServiceImpl(); 
		int i=bsi.bookVehicle(custId, vid, days, fromdate, todate,distance1,amount);
		if(i!=0)
		{
			RequestDispatcher rd=request.getRequestDispatcher("/Payment.jsp");
			rd.forward(request, response);
		}
		else{
			String msg="fail";
			request.setAttribute("msg", msg);
			RequestDispatcher rd=request.getRequestDispatcher("/Book.jsp");
			rd.include(request, response);
		}
		
		
		
		
	}

}
