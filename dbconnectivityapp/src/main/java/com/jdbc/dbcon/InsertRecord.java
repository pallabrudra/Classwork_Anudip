package com.jdbc.dbcon;

import java.sql.Connection;
import java.sql.Statement;


public class InsertRecord {

	public static void main(String[] args) {
		try(Connection con=DatabaseConnection.getDbConnection())
		{
			//static query- you know values at the compilation time, need to use statement
			Statement st=con.createStatement();
			
			String query="insert into emp values(101,'chandan','chandan@gmail.com',35000)";
			
			int row=st.executeUpdate(query);
			System.out.println(row+ " record inserted successfully");
			
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
