package com.jdbc.dbcon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecordUsingPS {

	public static void main(String[] args) {
		try(Connection con=DatabaseConnection.getDbConnection();
				Scanner sc=new Scanner(System.in))
		{
		
			String sql="insert into emp values(?,?,?,?)";
			
			//insert into emp values(102,'Pallab','pallab@gmail.com',50000)
			PreparedStatement ps=con.prepareStatement(sql);
			
			System.out.println("Enter id: ");
			int id=sc.nextInt(); //102
			sc.nextLine();
			
			System.out.println("Enter Name: ");
			String name=sc.nextLine(); 
			
			System.out.println("Enter Email: ");
			String email=sc.nextLine(); 
			
			System.out.println("Enter Salary: ");
			int salary=sc.nextInt(); 
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setInt(4, salary);
			
			int r=ps.executeUpdate();
			System.out.println(r+ "record is inserted successfully");
			
		}catch (SQLException e) {
			System.out.println(e);
		}


	}

}
