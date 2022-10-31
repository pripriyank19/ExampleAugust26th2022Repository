package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginlogoutChromeDemo {

		public static WebDriver oBrowser=null;
		public static void main(String[] args) {
			launchBrowser();
			navigate();
			Login();
			minimizeflyoutWindow();
			logout();
			CloseApplication();
		}
      

		private static void launchBrowser()
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
				Thread.sleep(5000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void Login()
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
		private static void minimizeflyoutWindow()
		{
			try
			{
				oBrowser.findElement(By.id("gettingStartedShortcutsPanelId" )).click();		
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
