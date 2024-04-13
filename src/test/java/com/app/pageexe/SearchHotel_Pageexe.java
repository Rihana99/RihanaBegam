package com.app.pageexe;



import com.app.locator.SearchHotel_Locators;

import base.BaseClass;

public class SearchHotel_Pageexe extends LoginPageExe {
	
	public static void location() {
		BaseClass.dropDown_Value(SearchHotel_Locators.getlocation(), excelRead(1,0));
	}

	
}
