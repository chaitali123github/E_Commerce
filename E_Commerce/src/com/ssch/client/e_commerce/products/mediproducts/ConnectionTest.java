package com.ssch.client.e_commerce.products.mediproducts;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {

	Connection con = null;
	public Connection getConnectionDetails() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/products", "root", "nanaji2258");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	

}
