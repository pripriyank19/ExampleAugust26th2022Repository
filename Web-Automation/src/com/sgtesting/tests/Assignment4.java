package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
    public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		lanchDriver();
		navigate();
		login();
		minimizeflywindow();
		createuser();
		modifyuser();
		createcustomer();
		deletecustomer();
		 logout();
		 closeApplication();
	}
    private static void lanchDriver()
    {
    	try
    	{
    		System.setProperty("webdriver.chrome.driver","D:\\ECLIPSE TOOL\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
    		oBrowser=new ChromeDriver();
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
    		Thread.sleep(5000);
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
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void createuser()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[1]")).click();
    		Thread.sleep(3000);
    		oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
    		Thread.sleep(4000);
    		oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
    		Thread.sleep(3000);
    		oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("ganishka");
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void modifyuser()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[1]")).click();
    		Thread.sleep(3000);
    		oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.id("usersManagementBodyTagId")).click();
    		oBrowser.findElement(By.id("userDataLightBox_lastNameField")).click();
    		
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void createcustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[1]")).click();
    		Thread.sleep(3000);
    		oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
    	    Thread.sleep(2000);
    	    oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
    	    Thread.sleep(5000);
    	    oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("mani");
    	    oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click(); 
    	    Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
    private static void deletecustomer()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[1]")).click();
    		Thread.sleep(5000);
    		oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
    		Thread.sleep(3000);
    		oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
    	    Thread.sleep(4000);
    	    oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
    	    Thread.sleep(2000);
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
 		   Thread.sleep(5000);
 	   }catch(Exception e)
 	   {
 		   e.printStackTrace();
 	   }
    }
    private static void closeApplication()
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
