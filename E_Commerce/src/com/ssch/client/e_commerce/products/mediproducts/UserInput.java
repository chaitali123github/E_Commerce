package com.ssch.client.e_commerce.products.mediproducts;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserInput{
	Connection con = null;
	PreparedStatement ps = null;
	
public void insertProductData(String ProductName, String ProductDiscription, float ProductPrice, int ProductQuantity) throws SQLException {
	try {
		ConnectionTest connectionTest = new ConnectionTest();
		con = connectionTest.getConnectionDetails();
		ps = con.prepareStatement("Insert into mediproducts ( ProductName, ProductDiscription, ProductPrice, ProductQuantity) values (?,?,?,?)");
			
		ps.setString(1, ProductName);
		ps.setString(2, ProductDiscription);	
		ps.setFloat(3, ProductPrice);	
		ps.setInt(4, ProductQuantity);	
		int i = ps.executeUpdate();
		System.out.println("Record is inserted successfully..." + i);
	
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		con.close();
		ps.close();
	}
}
	public void insertProductDataToCart(String ProductId, String ProductName) throws SQLException {
		try {
			ConnectionTest connectionTest = new ConnectionTest();
			con = connectionTest.getConnectionDetails();
			ps = con.prepareStatement("Insert into cart ( ProductId, ProductName) values (?,?)");
				
			ps.setString(1, ProductId);
			ps.setString(2, ProductName);	
				
			int i = ps.executeUpdate();
			System.out.println("Record is inserted successfully..." + i);
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
			ps.close();
		}
}
	public void removeProductDataFromCart(String ProductId) throws SQLException {
		try {
			ConnectionTest connectionTest = new ConnectionTest();
			con = connectionTest.getConnectionDetails();
			ps = con.prepareStatement("delete from cart  where ProductId = ?");
				
			ps.setString(1, ProductId);
			//ps.setString(2, ProductName);	
				
			int i = ps.executeUpdate();
			System.out.println("Record is deleted successfully..." + i);
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
			ps.close();
		}
}
 public static void addProduct() throws SQLException {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter number of Product to add>>");
	 int num = sc.nextInt();
	 for (int i = 0; i < num; i++) {
		 System.out.println("Enter Product Name>>");
		 String ProductName = sc.next();
		 System.out.println("Enter Product Discription>>");
		 String ProductDiscription = sc.next();
		 System.out.println("Enter Product Price>>");
		 float ProductPrice = sc.nextFloat();
		 System.out.println("Enter Product Quantity>>");
		 int ProductQuantity = sc.nextInt();
		 UserInput userInput = new UserInput();
		 userInput.insertProductData( ProductName, ProductDiscription, ProductPrice, ProductQuantity);
	 }
 }
	 public static void addToCart() throws SQLException {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter number of Product to add>>");
		 int num = sc.nextInt();
		 for (int i = 0; i < num; i++) {
			 System.out.println("Enter Product Id>>");
			 String ProductId = sc.next();
			 System.out.println("Enter Product Name>>");
			 String ProductName = sc.next();
			 System.out.println("Products added to cart....");
			 UserInput userInput = new UserInput();
			 userInput.insertProductDataToCart(ProductId, ProductName);
	 }
	 }
		 public static void removeFromCart() throws SQLException  {
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Enter number of Product to remove>>");
			 int num = sc.nextInt();
			 for (int i = 0; i < num; i++) {
				 System.out.println("Enter Product Id>>");
				 String ProductId = sc.next();
				// System.out.println("Enter Product Name>>");
				// String ProductName = sc.next();
				 System.out.println("Products removed from cart....");
				 UserInput userInput = new UserInput();
				 userInput.removeProductDataFromCart(ProductId);	 
	 
 }
	sc.close();
}  
}		 