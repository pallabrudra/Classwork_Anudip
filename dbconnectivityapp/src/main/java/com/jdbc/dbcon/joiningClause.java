package com.jdbc.dbcon;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class joiningClause {

	public static void main(String[] args) {
		try(Connection con=DatabaseConnection.getDbConnection();
				Scanner sc=new Scanner(System.in))
		{
//			Statement st=con.createStatement();
//			String query="create table account(Id int primary key auto_increment,accNum int,emp_id int,foreign key(emp_id) references emp(id));";
//			int row=st.executeUpdate(query);
//			System.out.println(row+"table is created successfully");
			
//			Statement st2=con.createStatement();
//			String q="insert into account(accNum,emp_id) values(267756,101);";
//			int row=st2.executeUpdate(q);
//			System.out.println(row+" record inserted successfully");
			
			Statement st3=con.createStatement();
			String sql="select e.name,e.salary,a.accNum from emp e inner join account a on e.id=a.emp_id";
			ResultSet rs=st3.executeQuery(sql);
			
			while(rs.next())
			{
				System.out.println("Employee Name: "+rs.getString("name"));
				System.out.println("Employee Salary: "+rs.getInt("salary"));
				System.out.println("Account Number: "+rs.getInt("accNum"));
				System.out.println("===========================================");
			}
		}catch (SQLException e) {
			System.out.println(e);
		}

	}

}
