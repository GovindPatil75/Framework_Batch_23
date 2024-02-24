package com.Utility;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {

	 // multiple reusable methods 
	
	public static ExtentTest test;
	
	public static void custom_SendKeys(WebElement element,String Value,String FieldName) {
		try {
			element.sendKeys(Value);
			test.log(Status.PASS, FieldName+"= Value Succefully Send ="+Value);
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
		}
	}
	
	public static void custom_Click(WebElement element,String FieldName) {
		
		try {
			element.click();
			test.log(Status.PASS, FieldName+"=clicked Succefully");
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
			
		}
		
	}
}
