package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenrator {

	public static ExtentReports extent;
	public static ExtentReports getReport() {
		
	String ReportPath=System.getProperty("user.dir")+"\\TestReport\\index.html";
		
		//Object cerate
		ExtentSparkReporter reporter=new ExtentSparkReporter(ReportPath);
		reporter.config().setDocumentTitle("Automation Test Report");
		reporter.config().setReportName("Batch 23 Test Report");
		reporter.config().setTheme(Theme.DARK);
		
		//Create Object ExtentReport
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		// System info set 
		extent.setSystemInfo("ProjectName", "ABC");
		extent.setSystemInfo("Automation tool", "Selenium WebDriver");
		extent.setSystemInfo("O.S.", "Window 10");
		extent.setSystemInfo("QA Name", "Pqr");
		return extent;
		
	}
}
