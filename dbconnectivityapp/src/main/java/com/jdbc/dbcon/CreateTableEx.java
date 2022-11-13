package com.jdbc.dbcon;

import java.sql.Connection;
import java.sql.Statement;



public class CreateTableEx {

	public static void main(String[] args) {
		//try with resource
		try (Connection conn=DatabaseConnection.getDbConnection()){	
		// create statement
		Statement st=conn.createStatement();
		
		//write/create query
		String sql="create table emp(id int primary key, name varchar(50) not null,"
				+ "email varchar(70) not null,salary int not null)";
		
		//execute query
		st.executeUpdate(sql);
		
		System.out.println("Table created successfully");
				
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
//		finally {
//			try {
//				conn.close();
//			}catch (Exception e) {
//				// TODO: handle exception
//			}
//		}
	}

}
