package com.Syntax.Test;

import com.Syntax.Pages.LoginPage;
import com.Syntax.Utils.CommonMethods;
import com.Syntax.Utils.ConfigsReader;

public class HrmsLoginTest extends CommonMethods{

	public static void main(String[] args) {
		
		setUp();
		
		LoginPage login=new LoginPage();
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		
		sendText(login.password, ConfigsReader.getProperty("password"));
		
		click(login.loginBtn);
		
		wait(5);
		
		tearDown();
		
	}
}