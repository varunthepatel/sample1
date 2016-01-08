package com.amzi.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.amzi.dao.LoginDao;

public class LoginServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)  
			throws ServletException, IOException {  

		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		
		String n=request.getParameter("username");  
		String p=request.getParameter("userpass"); 
		
		String a="admin";
		String u="varun";
		HttpSession session = request.getSession(false);
		if(session!=null)
		session.setAttribute("name", n);

		
		
		
	/*	if(LoginDao.validate(n, p)){  
			RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");  
			rd.forward(request,response);  
		}
		else{
		out.print("<p style=\"color:red\">Sorry username or password error</p>");  
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");  
		rd.include(request,response);  
*/
		
		if(n.equals(a)){
			RequestDispatcher rd=request.getRequestDispatcher("admin.html");  
			rd.forward(request,response);  
		}
	
	
		else{
			if(n.equals(u)){
		RequestDispatcher rd=request.getRequestDispatcher("student.html");  
		rd.forward(request,response);
			}
			else{
				RequestDispatcher rd=request.getRequestDispatcher("professor.html");  
				rd.forward(request,response);
			}
		}

 	/*
		RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");  
	rd.forward(request,response);
			}  
*/    
		out.close();  
	}  
}  