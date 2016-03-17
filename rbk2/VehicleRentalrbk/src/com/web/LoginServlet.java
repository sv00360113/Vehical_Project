package com.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Login;
import com.serviceimpl.LoginServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String userid=request.getParameter("username");
		String password=request.getParameter("password");
	
		
		LoginServiceImpl lsi=new LoginServiceImpl();
		ArrayList<Login> ar=lsi.loginService(userid, password);
		if(ar.size()!=0)
		{
			HttpSession session=request.getSession();
			session.setAttribute("userid",userid);
			
			Iterator<Login> it=ar.iterator();
			while(it.hasNext())
			{
				Login l=it.next();
				if(l.getUsertype()==1)
				{
					RequestDispatcher rd=request.getRequestDispatcher("/Admin.jsp");
					rd.forward(request, response);
				}
				else{
					RequestDispatcher rd1=request.getRequestDispatcher("/User.jsp");
					rd1.forward(request, response);
					}
			}
		}
		else
		{
			String msg="fail";
			request.setAttribute("msg", msg);
			RequestDispatcher rd2=request.getRequestDispatcher("/index.jsp");
			rd2.forward(request, response);
		}
		}
	}
