package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginLogoutFireFoxDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		LanchDriver();
		navigate();
		login();
		minimizeflywindow();
		logout();
		CloseApplication();
	}
    private static void LanchDriver()
    {
    	try 
    	{
    		System.setProperty("webdriver.gecko.driver","D:\\ECLIPSE TOOL\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\geckodriver.exe");
    	    oBrowser=new FirefoxDriver();
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void navigate()
    {
    	try
    	{
    		oBrowser.get("http://localhost:81/login.do");
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void login()
    {
    	try 
    	{
    		oBrowser.findElement(By.id("username")).sendKeys("admin");
    		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
    		oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void minimizeflywindow()
    {
    	try
    	{
    	    oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void logout()
    {
    	try
    	{
    		oBrowser.findElement(By.linkText("logout")).click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void CloseApplication()
    {
    	try
    	{
    		oBrowser.close();
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}
