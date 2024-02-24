package com.Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

	// read the config.properties file 
	public Properties pro;
	
	public ConfigDataProvider() throws Exception {
		
		String ConfigPath=System.getProperty("user.dir")+"\\Config\\Config.Properties";
	    FileInputStream fis=new FileInputStream(ConfigPath);
	    pro=new Properties();
	    pro.load(fis);
	}
	
	public String getQAEnvUrl() {
		
		return pro.getProperty("QAEnvUrl");
	}
	
	public String getBrowserName() {
		
		return pro.getProperty("BrowserName");
	}
}
