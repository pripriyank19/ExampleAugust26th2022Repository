package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FinefoxBrowserDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		LanchBrowser();
		
	}
    private static void LanchBrowser()
    {
    	try
    	{
    		oBrowser=new FirefoxDriver();
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}

