package com.ssch.client.e_commerce.products.mediproducts;

import java.sql.SQLException;
import java.util.Scanner;

public class User_Login {

	public static void userLogin() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your username>>");
		String userName = sc.nextLine();
		System.out.println("Username: " + userName);
		System.out.println("Enter your password>>");
		String passWord = sc.nextLine();
		System.out.println("Password: " + passWord);
		System.out.println("Login successfully..........");
		
	}
	  public static void user_Menu() throws SQLException {
	  System.out.println("*****WELCOME*****" );
	  
	  System.out.println("_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_");
	  
	  System.out.println("1. View Products");
	  System.out.println("2. Add Products to Cart");
	  System.out.println("3. Remove Products from Cart");
	  System.out.println("4. Exit");
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter your Choice>>");
	 int ch = sc.nextInt(); 
	 switch(ch)
	 { 
	 case 1:
	   System.out.println("****View Products****");
	   DisplayProducts.selectDisplayProducts();
	   break; 
	 case 2:
	   System.out.println("****Add Products to Cart ****");
	   UserInput.addToCart(); 
	   
	   break;
	 case 3: 
	   System.out.println("****Remove Products from Cart****");
	   UserInput.removeFromCart();
	   break;
	 default :
	 System.out.println("Enter Valid Input>>"); 
	    break;
 
 
	}
	
	 }
	
}
