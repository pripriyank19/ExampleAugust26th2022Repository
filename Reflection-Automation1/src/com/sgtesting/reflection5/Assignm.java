package com.sgtesting.reflection5;

import org.openqa.selenium.Alert; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignm {
	public  static WebDriver oBrowser=null;
	
	public void lanchDriver()
    {
    	try
    	{
    		System.setProperty("webdriver.chrome.driver","C:\\GitRepository\\CurrentWorkSpace\\ExampleAugust26th2022Repository\\Web-Automation\\Library\\drivers\\chromedriver.exe");
    		oBrowser=new ChromeDriver();
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
	public void navigate()
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
   
	public void login()
    {
    	try
    	{
    		oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(4000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
	public void minimizefiywindow()
    {
    	try
    	{
    		oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
    		Thread.sleep(2000);	
    	}catch (Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    
	public void createuser()
    {
    	try
    	{
    	   oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
    	   Thread.sleep(3000);
    	   oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
    		Thread.sleep(5000);
    		oBrowser.findElement(By.name("firstName")).sendKeys("demo");
    		oBrowser.findElement(By.name("lastName")).sendKeys("user1");
    		oBrowser.findElement(By.name("email")).sendKeys("demo@gmail");
    		oBrowser.findElement(By.name("username")).sendKeys("demoUser1");
			oBrowser.findElement(By.name("password")).sendKeys("Welcome1");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome1");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
	public void deleteuser()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
    		Thread.sleep(2000);
    		Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
			
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
	public void logout()
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
	public void closeApplication()
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
