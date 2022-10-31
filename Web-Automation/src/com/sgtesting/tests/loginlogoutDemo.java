package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginlogoutDemo {
public static WebDriver oBrowser=null;
	
	public static void main(String[] args) {
		lanchBrowser();
		
	}
		private static void lanchBrowser()
		{
			try
			{
				System.getProperty("webdriver.chrome.driver","D:\\ECLIPSE TOOL\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
				oBrowser=new ChromeDriver();
			Thread.sleep(5000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}

	}

}