package com.test;
import java.sql.*;
public class DBConnection 
{

	private static Connection con;
	private DBConnection()
	{}
	static
	{
		try
		{
			Class.forName(DBInfo.driver);
			con=DriverManager.getConnection(DBInfo.dbURL,DBInfo.userName, DBInfo.password);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	// End of block
	public static Connection getCon()
	{
		return con;
	}
}
