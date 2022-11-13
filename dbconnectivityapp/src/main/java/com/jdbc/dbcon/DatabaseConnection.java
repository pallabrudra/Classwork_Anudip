package com.jdbc.dbcon;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

	static Connection con=null;
	//this method will create connection and return the connection object
	public static Connection getDbConnection()
	{
		try {
		//register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//establish the connection
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anudip99", "root", "system");
		
		}catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}
}
