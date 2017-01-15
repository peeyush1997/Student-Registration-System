package com.project;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Area {
	private static String  f_name="";
	private static String H_no = "";
	private static String City = "";
	private static String State = "";
	private static String Pincode = "";
	
	static void SetData(String name)
	{
		f_name=name;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter House_no : ");
		H_no = sc.next();
		System.out.println("Enter Your City : ");
		 City = sc.next();
		System.out.println("Enter Your State : ");
		State = sc.next();
		System.out.println("Enter Your Pincode : ");
		 Pincode = sc.next();
		saveArea(f_name, H_no, City, State, Pincode);
	}
	public static void saveArea(String f_name,String H_no,String City,String State,String Pincode)
	{
		Connection con = null;
		Statement stmt = null;
		try
		{
			con = until.getConnection();
			stmt = con.createStatement();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		String Query = "create table Area(f_name varchar(30),H_no varchar(30), City varchar(30), State varchar(50), Pincode varchar(20) ,constraint fk2 foreign key(f_name) references student_info(f_name))";
		try 
		{
			stmt.execute(Query);
		} 
		catch (SQLException e) 
		{
		}
		Query = "insert into Area values('"+f_name+"','"+H_no+"','"+City+"','"+State+"','"+Pincode+"')";

try 
		{
			stmt.executeUpdate(Query);
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
