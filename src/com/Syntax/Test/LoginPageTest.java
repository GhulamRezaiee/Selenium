package com.Syntax.Test;

import com.Syntax.Pages.DashBoardPageElements;
import com.Syntax.Pages.LoginPageElements;
import com.Syntax.Utils.CommonMethods;
import com.Syntax.Utils.ConfigsReader;

public class LoginPageTest extends CommonMethods{

	public static void main(String[] args) {
		
		setUp();
		
		LoginPageElements login=new LoginPageElements();
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		
		click(login.loginBtn);
		
		DashBoardPageElements dashboard=new DashBoardPageElements();

	}
}