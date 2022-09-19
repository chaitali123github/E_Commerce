package com.ssch.client.e_commerce.products.mediproducts;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserInput{
public void insertProductData(String ProductName, String ProductDiscription, float ProductPrice, int ProductQuantity) throws SQLException {
	
	Connection con = null;
	PreparedStatement ps = null;
	try {
		ConnectionTest connectionTest = new ConnectionTest();
		con = connectionTest.getConnectionDetails();
		ps = con.prepareStatement("Insert into products (ProductName, ProductDiscription, ProductPrice, ProductQuantity) values (?,?,?,?)");
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
		 userInput.insertProductData(ProductName, ProductDiscription, ProductPrice, ProductQuantity);
	 }
 }
}
