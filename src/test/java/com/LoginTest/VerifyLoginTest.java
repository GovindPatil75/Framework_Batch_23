package com.LoginTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class VerifyLoginTest extends BaseClass{
	
	
	@Test
	public void TC01_VerifyFBLogin_withValidCredentials() {
		
		LoginPom login=PageFactory.initElements(driver,LoginPom.class);
		
		//get Test data from excel
		String EmailValidValue=excel.getStringTestDataFromExcel("LoginTest", 0, 0);
		String PasswordValidValue=excel.getStringTestDataFromExcel("LoginTest", 0, 1);
		
		//send valid email Id
		Library.custom_SendKeys(login.getEmail(), EmailValidValue,"Email");
		//send valid value to Password 
		Library.custom_SendKeys(login.getPassword(),PasswordValidValue,"Password");
		//click login button
		Library.custom_Click(login.getBtn_login(),"Login Button");
		
		String ExpectedTitle="Welcome To FaceBook HomePage";
		String ActualTitle="Welcome To FaceBook HomePage";
		//verify
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
	}

	@Test
	public void TC02_VerifyFBLogin_withValidCredentials() {
		
		LoginPom login=PageFactory.initElements(driver,LoginPom.class);
		
		//get Test data from excel
		String EmailValidValue=excel.getStringTestDataFromExcel("LoginTest", 0, 0);
		String PasswordValidValue=excel.getStringTestDataFromExcel("LoginTest", 0, 1);
		
		//send valid email Id
		Library.custom_SendKeys(login.getEmail(), EmailValidValue,"Email");
		//send valid value to Password 
		Library.custom_SendKeys(login.getPassword(),PasswordValidValue,"Password");
		//click login button
		Library.custom_Click(login.getBtn_login(),"LoginButton");
		
		String ExpectedTitle="Welcome To FaceBook HomePage";
		String ActualTitle=driver.getTitle();
		//verify
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
	}
}
