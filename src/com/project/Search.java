package com.project;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

	public class Search {
		static void display() throws Exception
		{
			String name;
			Scanner sc=new Scanner(System.in);
			Connection con=null;
			Statement stmt=null;
			con=until.getConnection();
			stmt=con.createStatement();
			ResultSet rs=null;
			name=sc.next();
			
			PreparedStatement ps=null;
			ps=con.prepareStatement("select * from student_info s join area a on s.f_name = a.f_name and s.f_name='"+name+"'");
			//4ps.setString(1,name);
			//ResultSet rs=stmt.executeQuery(sql);
			rs=ps.executeQuery();
			ResultSetMetaData rsmd=rs.getMetaData();
			int cols=rsmd.getColumnCount();
			String colData=null;
			for(int i=1; i<=cols; i++)
			{
				System.out.print(rsmd.getColumnName(i)+ " ");
			}
			System.out.println();
			while(rs.next())
			{
				for(int i=1; i<=cols; i++)
				{
					if(rs.getObject(i)!=null)
					{
						colData = rs.getObject(i).toString();
					}
					else {
						colData = "NULL";
					}
					System.out.print(colData);
				}
				System.out.println();
			}
			
		}

	}
