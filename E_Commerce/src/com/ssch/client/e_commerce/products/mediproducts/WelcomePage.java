package com.ssch.client.e_commerce.products.mediproducts;

import java.sql.SQLException;
import java.util.Scanner;

public class WelcomePage {

	public void welcome() throws SQLException {
		System.out.println("Welcome to Group C1 Shop");
		System.out.println("1. Admin Login");
		System.out.println("2. New User Registration");
		System.out.println("3. User Login");
		System.out.println("4. Exit");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Choice>>");
		int a = sc.nextInt();
		switch (a)
		{
		case 1 :
			System.out.println("Welcome to Admin Page");
			Admin.admin_Login();
			Admin.admin_Menu();
			break;
		case 2 :
			System.out.println("Welcome to Registration Page");
			User_Registration.addUser();
			break;	
		case 3 :
			System.out.println("Welcome to User Login Page");
			User_Login.userLogin();
			User_Login.user_Menu();
			break;
		case 4 :
			System.out.println("Thank You & Visit Again");
			break;
			default :
				System.out.println("Invalid Input");
		}
	}
}
