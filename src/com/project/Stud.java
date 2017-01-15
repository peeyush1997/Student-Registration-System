package com.project;

import java.util.Scanner;

public class Stud {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Welcome to Institute");
		Scanner sc=new Scanner(System.in);
		for(;;)
		{
			int ch;
			System.out.println("1. Login");
			System.out.println("2. Student Information");
			System.out.println("3. Logged Out");
			System.out.println("4. Search Data");
			ch=sc.nextInt();
			if(ch==3)
			{
				System.out.println("Successfully Logged Out");
				break;
			}
			switch(ch)
			{
			case 1:		Login.setdata();
						break;
			case 2:		Stud_info.setdata();
						break;
			case 4:		Search.display();
						break;
			}
			
		}

	}

}
