package com.sgtesting.xpathaxess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class followingsibling {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		lanuchbrowser();
		//navigate();
		//login();

	}
    private static void lanuchbrowser()
    {
    	try
    	{
    		System.getProperty("webdriver.chrome.driver","D:\\ECLIPSE TOOL\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers");
    		oBrowser=new ChromeDriver();
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }

   // private static void navigate()
    {
    	try
    	{
    		oBrowser.get("");
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
   // private static void login()
    {
    	try
    	{
    		
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    }

