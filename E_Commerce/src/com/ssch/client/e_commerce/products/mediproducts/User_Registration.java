package com.ssch.client.e_commerce.products.mediproducts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class User_Registration {
	// Design method which return the connection object to that method.
	
	public Connection getConnectionDetails() {
		Connection con = null;
		try {
			// Step 1 : Load and Register Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Step 2 : Establish the Connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/products","root", "nanaji2258");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;	
	}
	// Create method getUserDetails for getdata.
	
	public void getUserDetails(String userName, String password, String address, String EmailId, String mobileNumber) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			User_Registration user_Registration = new User_Registration();
			con = user_Registration.getConnectionDetails();
			// Method Calling
			// Step 3 :
			ps = con.prepareStatement("Insert into user (userName, userPassword, userAddress,userEmailId,userMobileNumber)values (?,?,?,?,?)");
			ps.setString(1, userName);
			ps.setString(2, password);
			ps.setString(3, address);
			ps.setString(4, EmailId);
			ps.setString(5, mobileNumber);
			// Step 4 :
			int i = ps.executeUpdate();
			System.out.println("Registration Successfully " + i);
			
		} catch (Exception e) {
			e.getMessage();
		}
		finally {
			con.close();
			ps.close();
		}
	}
	public static void addUser() throws SQLException {
		// taking input from user by scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name>>");
		String userName = sc.next();
		System.out.println("Enter your Password>>");
		String userPassword = sc.next();
		System.out.println("Enter your Address>>");
		String userAddress = sc.next();
		System.out.println("Enter your EmailId>>");
		String userEmailId = sc.next();
		System.out.println("Enter your MobileNumber>>");
		String userMobileNumber = sc.next();
		System.out.println("Registration successfully done.....");
		
		 User_Registration user_Registration = new User_Registration(); 
		 // calling method
	    user_Registration.getUserDetails(userName, userPassword, userAddress,userEmailId, userMobileNumber);
		 
		
		
	}




}
