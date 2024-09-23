package com.test;
import java.sql.*;
 
import com.user.bean.UserBean;
public class RegisterDAO
{
 public int k=0;
 public int register(UserBean ub)
 {
	 try
	 {
		 Connection con=DBConnection.getCon();
		 PreparedStatement ps=con.prepareStatement
				 ("insert into userReg65 values(?,?,?,?,?,?,?)");
		 ps.setString(1, ub.getuName());
		 ps.setString(2, ub.getpWord());
		 ps.setString(3, ub.getfName());
		 ps.setString(4, ub.getlName());
		 ps.setString(5, ub.getAddress());
		 ps.setString(6, ub.getMailId());
		 ps.setLong(7, ub.getPhNo());
		 k=ps.executeUpdate();
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 return k;
 }
}
