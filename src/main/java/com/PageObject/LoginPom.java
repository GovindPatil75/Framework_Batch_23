package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	
	
	@FindBy(how=How.XPATH,using="//input[@name='emai']")
	private WebElement Email;
	
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement Password;
	
	@FindBy(how=How.XPATH,using="//button[@name='login']")
	private WebElement Btn_login;
	
	public WebElement getEmail() {
		return Email;
		
	}
	
	public WebElement getPassword() {
		return Password;
		
	}
	
	public WebElement getBtn_login() {
		return Btn_login;
		
	}
	
	

}
