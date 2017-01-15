package com.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class until {

		private static String driverClass = "oracle.jdbc.driver.OracleDriver";
		private static String url = "jdbc:oracle:thin:@localhost:1521:XE";
		private static String userName = "PEEYUSH";
		private static String password = "ppiyush";
		
		
		static
		{
			try
			{
				Class.forName(driverClass);
			}
			catch(ClassNotFoundException e)
			{
				e.printStackTrace();
			}
		}
		static Connection getConnection() throws SQLException
		{
			Connection con = DriverManager.getConnection(url, userName, password);
			return con;
		}
		static void closeResultSet(ResultSet rs) throws SQLException
		{
			if(rs!=null)
			{
				rs.close();
				rs = null;
			}
		}
		static void closeStatement(Statement st) throws SQLException
		{
			if(st!=null)
			{
				st.close();
				st = null;
			}
		}
		static void closeConnection(Connection con) throws SQLException
		{
			if(con!=null)
			{
				con.close();
				con = null;
			}
		}
}
