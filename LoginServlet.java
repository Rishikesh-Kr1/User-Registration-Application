package com.test;
import java.io.IOException;

import com.user.bean.UserBean;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
@WebServlet("/log")
public class LoginServlet extends HttpServlet
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws
	ServletException,IOException
	{
		String userName=req.getParameter("uname");
		String userPassword=req.getParameter("pword");
		LoginDAO ld=new LoginDAO();
		UserBean ub=ld.login(userName, userPassword);
		if(ub==null)
		{
			
		}
		else
		{
			ServletContext sct=req.getServletContext();//Accessing ServletContext Object reference
			sct.setAttribute("ubean" ,ub);
			Cookie ck=new Cookie("fname", ub.getfName());
			res.addCookie(ck);
			RequestDispatcher rd=req.getRequestDispatcher("LoginSuccess.jsp");
			rd.forward(req, res);
			
		}
	}
}
