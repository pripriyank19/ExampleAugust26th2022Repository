package com.sgtesting.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assign8 {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		 //navigate();
		 //countoflink();
		navigate();
		login();
		logout() ;
	}
    private static void launchBrowser()
    {
    	try
    	{
    		System.setProperty("webdriver.chrome.driver", "D:\\ECLIPSE TOOL\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
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
    	oBrowser.get("https://www.youtube.com/");	
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
   // private static void countoflink()
    {
    	try
    	{
    	List<WebElement>olist=oBrowser.findElements(By.xpath("//a[@href]"));
    	Thread.sleep(2000);
    	int y=olist.size();
    	System.out.println(y);
    	for(int i=0;i<olist.size();i++)
    	{
    		System.out.println(olist.get(i).getText());
    	}
    	Thread.sleep(4000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void navigate()
    {
    	try
    	{
    	 oBrowser.get("https://www.w3schools.com/");	
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void login()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//*[@id=\'w3loginbtn\']")).click();
    		Thread.sleep(2000);
    	    oBrowser.findElement(By.name("email")).sendKeys("skpriyanka123@gmail.com");
    	    oBrowser.findElement(By.id("current-password")).sendKeys("KrIsHna1@");
    	    oBrowser.findElement(By.xpath("//*[@id=\'root\']/div/div/div[4]/div[1]/div/div[4]/div[1]/button")).click();
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
		 oBrowser.findElement(By.xpath("//*[@id=\'navigation\']/div/button")).click();
		 Thread.sleep(2000);
	   }catch(Exception e)
	   {
		   e.printStackTrace();
	   }
   }
}
