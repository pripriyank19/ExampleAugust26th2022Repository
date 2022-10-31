package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromebrowserDemo1 {
    public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		lanchBrowser();
		 navigate();
		 login();
	 minimizeflyout();
	 Createuser();
	 Modifyuser();
	 Deleteuser();
	 logout();
	 closeApplication();
		
	   }
    
    public static void lanchBrowser()
    {
	    try
	    {
		    System.setProperty("webdriver.chrome.driver","D:\\ECLIPSE TOOL\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
		    oBrowser=new ChromeDriver();
		    Thread.sleep(3000);
	    }catch(Exception e)
	    {
		    e.printStackTrace();
	    }
    }
    public static void navigate()
    {
	    try
	    {
		    oBrowser.get("http://localhost:81/login.do");
		    Thread.sleep(3000);
	     }catch(Exception e)
	     {
	    	 e.printStackTrace();
	     }
    }
   
    public static  void login()
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
   public static void minimizeflyout()
    {
	  try
	  {
		  oBrowser.findElement(By.id("gettingStartedShortcutsPanelId" )).click();
		  Thread.sleep(3000);
	  }catch(Exception e)
	  {
		  e.printStackTrace();
	  }
    } 

     private static void Createuser()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
    		Thread.sleep(5000);
    		oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
    		Thread.sleep(5000);
    		oBrowser.findElement(By.name("firstName")).sendKeys("sarasa");
    		oBrowser.findElement(By.name("middleName")).sendKeys("A");
    		oBrowser.findElement(By.name("lastName")).sendKeys("sk");
    		oBrowser.findElement(By.name("email")).sendKeys("gamy123@gmail.com");
    		oBrowser.findElement(By.name("username")).sendKeys("ramya");
    		oBrowser.findElement(By.name("password")).sendKeys("32456845");
    		oBrowser.findElement(By.name("passwordCopy")).sendKeys("32456845");
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
    		Thread.sleep(2000);
    		
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void Modifyuser()
     {
    	 try
    	 {
    		 oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
    		 Thread.sleep(3000);
    		 oBrowser.findElement(By.xpath("//*[@id=\\'userListTableContainer\\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
    		 Thread.sleep(2000);
    		 oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("demo");
    		 oBrowser.findElement(By.id("userDataLightBox_middleNameField")).sendKeys("b");
    		 oBrowser.findElement(By.name("lastName")).sendKeys("lm");
    		 oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("ganesh123@gmail.com");
    		 oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("fff");
    		 oBrowser.findElement(By.name("password")).sendKeys("12345");
    		 oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("12345");
    		 Thread.sleep(2000);
    		 oBrowser.findElement(By.xpath("//*[@id=\\'userDataLightBox_commitBtn\\']/div/span")).click();
    		 
    	 }catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
     
     }
    private static void Deleteuser()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//span [text()='sk, sarasa A.']")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
    		Thread.sleep(2000);
    		Alert oAlert=oBrowser.switchTo().alert();
    		String Content=oAlert.getText();
    		System.out.println(Content);
    		oAlert.accept();
    		Thread.sleep(2000);
    		
    		
    	}catch(Exception e)
        {
    		e.printStackTrace();
    	
         }
    }
    public static void logout()
    {
 	   try
 	   {
 		   oBrowser.findElement(By.id("logoutLink")).click(); 
 		   Thread.sleep(2000);
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

   