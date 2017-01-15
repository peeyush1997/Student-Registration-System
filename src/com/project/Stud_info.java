package com.project;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Stud_info {
		private static String f_name = "";
		private static String l_name = "";
		private static String fa_name = "";
		private static String DOB = "";
		private static String gender = "";
		private static String mo_no = "";
		private static int reg_no = 1000;
		static void setdata() throws Exception
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter First Name: ");
			f_name=sc.next();
			System.out.println("Enter Last Name: ");
			l_name=sc.next();
			System.out.println("Enter father Name: ");
			fa_name=sc.next();
			System.out.println("Enter Date-of-Birth");
			DOB=sc.next();
			System.out.println("Enter Gender: ");
			gender=sc.next();
			System.out.println("Enter Mobile Number :  ");
			mo_no=sc.next();
			System.out.println("Enter the Reg.NO.: ");
			reg_no=reg_no+1;
			Area.SetData(f_name);
			Qualification.SetData();
			Course.SetData();
			create_connection();
		}
		static void create_connection() throws Exception
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
			String query="create table Student_Info(f_name varchar(50),l_name varchar(50),fa_name varchar(50),DOB Date,gender varchar(7),mo_no varchar(50),res_no varchar(50),constraint pk1 primary key(f_name))";
			try 
			{
				stmt.execute(query);
			} 
			catch (SQLException e) 
			{
				
			}				
			String Query1="insert into Student_info values('"+f_name+"','"+l_name+"','"+fa_name+"','"+DOB+"','"+gender+"','"+mo_no+"',"+reg_no+")";
			try 
			{
				stmt.executeUpdate(Query1);
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
	}	

}
