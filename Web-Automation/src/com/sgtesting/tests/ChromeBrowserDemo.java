package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {
	
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		lanchBrowser();
	}
    private static void lanchBrowser()
    {
    	try
    	{
    		oBrowser=new ChromeDriver();
    		
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
   
}
