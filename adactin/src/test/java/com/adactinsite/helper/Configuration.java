package com.adactinsite.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration {
	public static Properties p;
		
	
	public Configuration() throws Throwable  {
		File f=new File("C:\\Users\\Bhuvi\\eclipse-workspace\\adactin\\src\\test\\java\\com\\adatin\\help\\configuration.properties");
		FileInputStream fis=new FileInputStream(f);
		p=new Properties();
		p.load(fis);
	}
public String get_Browser(){
	  String browser = p.getProperty("browser");
	  return browser;
	
	
}
public String get_url() {
	String url=p.getProperty("url");
	return url;
	}

public String get_ccv() {
	String cvv=p.getProperty("CCV");
	return cvv;
	
}
}
