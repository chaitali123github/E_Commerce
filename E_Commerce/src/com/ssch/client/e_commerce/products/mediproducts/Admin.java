package com.ssch.client.e_commerce.products.mediproducts;

import java.sql.SQLException;
import java.util.Scanner;

public class Admin {

	private static String User_Name = "Admin";
	private static String Password = "Admin";
	
	public static void admin_Login() throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your UserName>>");
		String user = sc.nextLine();
		System.out.println("Enter your Password>>");
		String password = sc.nextLine();
		if (user.equals(User_Name) && password.equals(Password)) {
		System.out.println("Login Successfully........");
		
		System.out.println("*****WELCOME*****" );
		System.out.println("_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_");
		
		System.out.println("1. View Products");
		System.out.println("2. Add Products");
		System.out.println("3. Display User Information");
		System.out.println("4. Exit");
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter your Choice>>");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("****View Products****");
			DisplayProducts.selectDisplayProducts();
			break;
		
		case 2: System.out.println("****Add Products****"); 
		    UserInput.addProduct();
		    break;
		
		case 3:
			System.out.println("****User Information****");
			UserList.displayUserInformation();
			break;
		default :
			System.out.println("Enter Valid Input>>");
			break;
				
		}	
		}
		else {
			System.out.println("Incorrect Username & Password.... Please try again....");
		}	
	
	}


}
