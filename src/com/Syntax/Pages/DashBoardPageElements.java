package com.Syntax.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Syntax.Utils.BaseClass;

public class DashBoardPageElements {

	@FindBy(id="welcome")
	public WebElement welcome;
	
	public DashBoardPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}