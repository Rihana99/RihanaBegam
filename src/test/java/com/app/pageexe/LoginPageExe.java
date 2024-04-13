package com.app.pageexe;


import com.app.locator.LoginPage_Locator;
import com.app.locator.SearchHotel_Locators;

import base.BaseClass;

public class LoginPageExe extends SearchHotel_Locators {
	
	public static void username() {
		BaseClass.input_text(LoginPage_Locator.getLoginDetails(""), prop_reuse("username"));
	}

	public static void password() {
		BaseClass.input_text(LoginPage_Locator.getLoginDetails(""), prop_reuse("password"));
	}
	
	public static void loginButton() {
		BaseClass.click_value(LoginPage_Locator.getLoginDetails(""));
	}
}
