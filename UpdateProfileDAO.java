package com.test;
import java.sql.*;

import com.user.bean.UserBean;
public class UpdateProfileDAO 
{
	public int k=0;
	public int update(UserBean ub) 
	{
	try {
	Connection con = DBConnection.getCon();//Accessing DB
	
	PreparedStatement ps = con.prepareStatement
	("update UserReg65 set address=?,mail=?,phno=? where uname=? and pword=?");
	ps.setString(1,ub.getAddress());
	ps.setString(2,ub.getMailId());
	ps.setLong(3,ub.getPhNo());
	ps.setString(4,ub.getuName());
	ps.setString(5,ub.getpWord());
	k = ps.executeUpdate();

	}catch(Exception e) {
	e.printStackTrace();
	}
	return k;
	}
}
