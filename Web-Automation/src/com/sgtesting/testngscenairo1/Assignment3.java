package com.sgtesting.testngscenairo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment3 {
    public static WebDriver oBrowser=null;
	private static CharSequence name;
	
    @Test(priority=1)
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
    
    @Test(priority=2)
    private static void navigate()
    {
    	try
    	{
    		oBrowser.get("http://localhost:81/login.do");
    		Thread.sleep(2000);
    		String actual="actiTIME - Login";
    		String expected=oBrowser.getTitle();
    		Assert.assertEquals(actual, expected);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    
    @Test(priority=3,dataProvider="loginDetails")
    private static void login(String username,String pwd)
    {
    	try
    	{
    		oBrowser.findElement(By.id("username")).sendKeys(username);
    		oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
    		oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
    		Thread.sleep(3000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    
    @Test(priority=4)
    private static void minimizeflywindow()
    {
    	try
    	{
    		oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
    		Thread.sleep(5000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    
    @Test(priority=5,dataProvider="customerDetails")
    private static void createcustomer(String name)
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[1]")).click();
    		Thread.sleep(3000);
    		oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
    	    Thread.sleep(2000);
    	    oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
    	    Thread.sleep(5000);
    	    oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys(name);
    	    oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click(); 
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    
    @Test(priority=6)
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
    
    @Test(priority=7)
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
    
    @Test(priority=8)
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
    
    @DataProvider
    public Object[][] loginDetails()
    {
    	Object[][] obj= {{"admin","manager"}};
    	return obj;
    }

  @DataProvider
  public Object[] customerDetails()
  {
	  Object[] obj= {"Askshi"};
	  return obj;
  }
}
