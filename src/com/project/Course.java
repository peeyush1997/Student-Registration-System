package com.project;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Course {

	private static int    regno;
	private static String C_Id = "";
	private static String C_Name = "";
	private static String C_joinDate = "";
	private static String C_EndingDate = "";
	private static int    C_Fees;
	
	static void SetData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Course ID : ");
		C_Id = sc.next();
		System.out.println("Enter Your Course Name : ");
		C_Name = sc.next();
		System.out.println("Enter Course Joining Date : ");
		C_joinDate = sc.next();
		System.out.println("Enter Course Ending Date : ");
		C_EndingDate = sc.next();
		System.out.println("Enter Course Fees : ");
		C_Fees = sc.nextInt();
		saveCourse();
	}
	static void saveCourse()
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
		String Query11 = "create table Course(C_Id varchar(30), C_Name varchar(30), C_joinDate Date, C_EndingDate Date, C_Fees int)";
		try 
		{
			stmt.execute(Query11);
		} 
		catch (SQLException e) {
		}
		Query11 = "insert into Course values('"+C_Id+"','"+C_Name+"','"+C_joinDate+"','"+C_EndingDate+"','"+C_Fees+"')";
		try 
		{
			stmt.executeUpdate(Query11);
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	}

}