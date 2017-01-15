package com.project;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Qualification {

	private static int regno;
	private static String Degree = "";
	private static String C_Name = "";
	private static String U_Name = "";
	private static String Stream = "";
	private static String Pre_Year = "";
	private static String Pass_Year = "";
	private static int    P_Obtained;
	private static String A_Qualification = "";
	
	static void SetData()
	{
	//	String decider = null;
	//	do
		//{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Degree : ");
			 Degree = sc.next();
			System.out.println("Enter Your Collage Name : ");
			 C_Name = sc.next();
			System.out.println("Enter Your University Name : ");
			 U_Name = sc.next();
			System.out.println("Enter Your Stream : ");
			Stream = sc.next();
			System.out.println("Enter Your Present Year : ");
			 Pre_Year = sc.next();
			System.out.println("Enter Your PassOut Year : ");
			 Pass_Year = sc.next();
			System.out.println("Enter Your Present Obtained : ");
			 P_Obtained = sc.nextInt();
		//	System.out.println("Do you have Additional Qualification (y/n)?");
		//	decider = sc.next();
			saveQualification();
	//	}
	//	while("y".equals(decider));
	}
		
	static void saveQualification()
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
		String Query11 = "create table Qualification(Degree varchar(30), C_Name varchar(30), U_Name varchar(50),Stream varchar(50), Pre_Year varchar(30), Pass_Year varchar(30), P_Obtained int)";
		try 
		{
			stmt.execute(Query11);
		} 
		catch (SQLException e) {
		}
		Query11 = "insert into Qualification values('"+Degree+"','"+C_Name+"','"+U_Name+"','"+Stream+"','"+Pre_Year+"','"+Pass_Year+"',"+P_Obtained+")";
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
