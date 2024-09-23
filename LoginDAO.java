package com.test;
import java.sql.*;

import com.user.bean.UserBean;
public class LoginDAO 
{
	public UserBean ub=null;
	public UserBean login(String uName, String pWord)
	{
		try
		{
			Connection con=DBConnection.getCon(); //Accessing DB Connection
			PreparedStatement ps=con.prepareStatement
					("select * from userReg65 where uname=? and pword=?");
					ps.setString(1, uName);
					ps.setString(2, pWord);
					ResultSet rs=ps.executeQuery();
					if(rs.next())
					{
						ub = new UserBean();
						ub.setuName(rs.getString(1));
						ub.setpWord(rs.getString(2));
						ub.setfName(rs.getString(3));
						ub.setlName(rs.getString(4));
						ub.setAddress(rs.getString(5));
						ub.setMailId(rs.getString(6));
						ub.setPhNo(rs.getLong(7));
					}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ub;
	}

}
