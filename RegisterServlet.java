package com.test;

import java.io.IOException;

import com.user.bean.UserBean;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
@WebServlet("/reg")
public class RegisterServlet extends HttpServlet 
{
	protected void doPost(HttpServletRequest req, HttpServletResponse  res)throws ServletException , IOException
	{
		UserBean  ub=new UserBean(); //Bean object created
		ub.setuName(req.getParameter("uname"));
		ub.setpWord(req.getParameter("pword"));
		ub.setfName(req.getParameter("fname"));
		ub.setlName(req.getParameter("lname"));
		ub.setAddress(req.getParameter("address"));
		ub.setMailId(req.getParameter("mail"));
		ub.setPhNo(Long.parseLong(req.getParameter("phNo")));
		
		RegisterDAO rd=new RegisterDAO();
		int k = rd.register(ub);
		if(k>0) {
		req.setAttribute("msg", "User registered Successfully...<br>");
		RequestDispatcher rds = req.getRequestDispatcher("RegSuccess.jsp");

		rds.forward(req, res);
		}
		
	}

}
