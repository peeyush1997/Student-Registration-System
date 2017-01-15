package com.project;

import java.util.Scanner;

public class Login {

	private static String  uname="a";
	private static String  password="a";
	static boolean check(String user,String pass )
	{
		if(uname.equals(user) && password.equals(pass))
		{
			return true;
		}
		else
			return false;
	}
	static void setdata()
	{
		Scanner sc=new Scanner(System.in);
		String user="",pass="";
		System.out.println("Enter Username");
		user=sc.next();
		System.out.println("Enter Password");
		pass=sc.next();
		boolean g=check(user,pass);
		if(g==true)
		{
			System.out.println("Sucessfully Logged In");
		}
		else
			check(user,pass);
	}
}
