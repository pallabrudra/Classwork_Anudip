package com.jdbc.dbcon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class UpdateEmployee {

	public static void main(String[] args) {
		try(Connection con=DatabaseConnection.getDbConnection();
				Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter Name: ");
			String name=sc.nextLine(); 
			
			System.out.println("Enter Email: ");
			String email=sc.nextLine(); 
			
			System.out.println("Enter Salary: ");
			int salary=sc.nextInt(); 
			
			String query="update emp set name='"+name+"', email='"+email+"',"
					+ "salary='"+salary+"' where id=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			
			System.out.println("Enter id:");
			int id=sc.nextInt(); //102
			
			ps.setInt(1, id);
			int row=ps.executeUpdate();
			String sqll="select * from emp where id='"+id+"'";
			PreparedStatement pst=con.prepareStatement(sqll);
			System.out.println(row+ "row is updated successfully");
			ResultSet rss=pst.executeQuery();
			if(rss.next())
			{
				System.out.println("Employee Id: "+rss.getInt(1));
				System.out.println("Employee Name: "+rss.getString("name"));
				System.out.println("Employee Email: "+rss.getString("email"));
				System.out.println("Employee Salary: "+rss.getInt(4));
				System.out.println("================================================");
			}
			else
				System.out.println("id not found");
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
