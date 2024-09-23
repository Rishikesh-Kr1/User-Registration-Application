package com.test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewProfileServlet extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException
	{
		Cookie ck[]=req.getCookies();
		if(ck==null)
		{
			req.setAttribute("msg", "Session Expired....<br>");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
		}
		else
		{
			String fName=ck[0].getValue();
			req.setAttribute("fname", fName);
			req.getRequestDispatcher("ViewProfile.jsp").forward(req, res);
		}
	}
	
}
