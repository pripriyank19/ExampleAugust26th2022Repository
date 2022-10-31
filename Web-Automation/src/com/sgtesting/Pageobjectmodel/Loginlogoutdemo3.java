 package com.sgtesting.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginlogoutdemo3 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		LaunchBrowser();
		Navigate();
		login();
		minimizeflyoutwindow();
		logout();
		Customer();
		deletecustomer();
	}

    private static void LaunchBrowser()
    {
    	try
    	{
    		System.setProperty("webdriver.chrome.driver","D:\\ECLIPSE TOOL\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
    		oBrowser=new ChromeDriver();
    		oPage=new ActiTimePage (oBrowser);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }

    private static void Navigate()
    {
    	try
    	{
    		oBrowser.navigate().to("http://localhost:81/login.do");
			Thread.sleep(5000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void login()
    {
    	try
    	{
    		oPage.getUserName().sendKeys("admin");
    		oPage.getPassword().sendKeys("manager");
    	    oPage.getLogin().click();
    	    Thread.sleep(5000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
	
    private static void minimizeflyoutwindow()
    {
    	try
    	{
    		oPage.getFlyOutWindow().click();
    		Thread.sleep(3000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	
    }
    private static void logout()
    {
    	try
    	{
    		oPage.getLogoutLink().click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void Customer()
    {
    	try
    	{
    		oPage.getTaskButton().click();
    		Thread.sleep(3000);
    		oPage.getAddButton1().click();
    		Thread.sleep(2000);
    		oPage.getCreateCustomer().click();
    		Thread.sleep(3000);
    		oPage.getCustomerName().sendKeys("gamyam");
    		Thread.sleep(2000);
    		oPage.getCreateCustomerButton().click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }

    private static void deletecustomer()
    {
    	try
    	{
    		oPage.getTaskButton().click();
    		Thread.sleep(5000);
    	
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}
    
