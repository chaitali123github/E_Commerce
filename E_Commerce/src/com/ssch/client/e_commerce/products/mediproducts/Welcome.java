package com.ssch.client.e_commerce.products.mediproducts;

import java.sql.SQLException;

public class Welcome {

	public static void main(String[] args) throws SQLException {
		WelcomePage w = new WelcomePage();
		//UserInput ui = new UserInput();
		//ui.addProduct();
		w.welcome();
	}

}
