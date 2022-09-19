package com.ssch.client.e_commerce.products.mediproducts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserList {

	public static void displayUserInformation() throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			// Step 1:
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Step 2:
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/products", "root", "nanaji2258");
			// select querry
			ps = con.prepareStatement("select * from user");
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("userName: " + rs.getString(1));
				System.out.println("userPassword: " + rs.getString(2));
				System.out.println("userAddress: " + rs.getString(3));
				System.out.println("userEmailId: " + rs.getString(4));
				System.out.println("userMobileNumber: " + rs.getString(5));
				System.out.println("Id: " + rs.getInt(6));
				System.out.println("_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_\n");
					
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
