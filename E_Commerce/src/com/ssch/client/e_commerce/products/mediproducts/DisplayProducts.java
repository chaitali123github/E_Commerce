package com.ssch.client.e_commerce.products.mediproducts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DisplayProducts {

	public static void selectDisplayProducts() throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/products", "root", "nanaji2258");
			// select querry
			ps = con.prepareStatement("Select * from mediproducts ");
			rs = ps.executeQuery();
			while (rs.next()) {
				
				System.out.println("ProductName =" + rs.getString(1));
				System.out.println("ProductDiscription =" + rs.getString(2));
				System.out.println("ProductPrice =" + rs.getFloat(3));
				System.out.println("ProductQuantity =" + rs.getInt(4));
				System.out.println("_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
			ps.close();
			rs.close();
		}
	}
}
