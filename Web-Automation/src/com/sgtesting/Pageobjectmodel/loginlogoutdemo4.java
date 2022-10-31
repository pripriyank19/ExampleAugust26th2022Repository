package com.sgtesting.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginlogoutdemo4 {
public static WebDriver oBrowser=null;
public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		flyoutwindow();
		createuser();
		createuser2();
		createuser3();
		logoutfromadmin();
		loginuser1();
		logoutuser1();
		loginuser2();
		logoutuser2();
		loginuser3();
		logoutuser3();
		closeApplication();
		
	}
    private static void launchBrowser()
    {
    	try
    	{
    		System.setProperty("webdriver.chrome.driver","D:\\ECLIPSE TOOL\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
    		oBrowser=new ChromeDriver();
    		oPage=new ActiTimePage(oBrowser);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
   private static void navigate()
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
  
  
   
   private static void flyoutwindow()
   {
	   try
	   {
		  oPage.getFlyOutWindow().click();
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
		 oPage.getUserButton().click();
		 Thread.sleep(2000);
		 oPage.getAddButton().click();
		 Thread.sleep(2000);
		 oPage.FirstName().sendKeys("amma");
		 oPage.LastName().sendKeys("nana");
		 oPage.EmailId().sendKeys("amma@gmail.com");
		 oPage.UserNameinuser().sendKeys("jaji");
		 oPage.password().sendKeys("kala");
		 oPage.retypepassword().sendKeys("kala");
		 oPage.getCreateUserButton().click();
		 Thread.sleep(2000);
		 
	   }catch(Exception e)
	   {
		   e.printStackTrace();
	   }
   }
   
  
   private static void createuser2()
   {
	   try
	   {
		 oPage.getUserButton().click();
		 Thread.sleep(2000);
		 oPage.getAddButton().click();
		 Thread.sleep(2000);
		 oPage.FirstName().sendKeys("Demo2");
		 oPage.LastName().sendKeys("dd");
		 oPage.EmailId().sendKeys("Demo@gmail.com");
		 oPage.UserNameinuser().sendKeys("pal");
		 oPage.password().sendKeys("2525252");
		 oPage.retypepassword().sendKeys("2525252");
		 oPage.getCreateUserButton().click();
	   }catch(Exception e)
	   {
		   e.printStackTrace();
	   }
   }
   private static void createuser3()
   {
	   try
	   {
		  oPage.getUserButton().click();
		  Thread.sleep(2000);
		  oPage.getAddButton().click();
		  Thread.sleep(2000);
		  oPage.FirstName().sendKeys("Demo3");
		  oPage.LastName().sendKeys("FF");
		  oPage.EmailId().sendKeys("Demo1@gmail.com");
		  oPage.UserNameinuser().sendKeys("hari");
		  oPage.password().sendKeys("45645");
		  oPage.retypepassword().sendKeys("45645");
		  oPage.getCreateUserButton().click();
		  Thread.sleep(2000);
	   }catch(Exception e)
	   {
		   e.printStackTrace();
	   }
   }
   private static void logoutfromadmin()
   {
	   try
	   {
		 oPage.getLogoutLink().click();  
	   }catch(Exception e)
	   {
		   e.printStackTrace();
	   }
   }
   private static void loginuser1()
   {
	   try
	   {
		 oPage.getUserName().sendKeys("user1"); 
		 oPage.getPassword().sendKeys("gamyamki");
		 oPage.getLogin().click();
		 Thread.sleep(2000);
	   }catch(Exception e)
	   {
		   e.printStackTrace();
	   }
   }
  private static void logoutuser1()
   {
	   try
	   {
		 oPage.getLogoutLink().click();  
	   }catch(Exception e)
	   {
		   e.printStackTrace();
	   }
   }
  private static void loginuser2()
   {
	   try
	   {
		 oPage.getUserName().sendKeys("user2"); 
		 oPage.getPassword().sendKeys("gowri");
		 oPage.getLogin().click();
		 Thread.sleep(2000);
	   }catch(Exception e)
	   {
		   e.printStackTrace();
	   }
   }
  private static void logoutuser2()
   {
	   try
	   {
		  oPage.getLogoutLink().click(); 
	   }catch(Exception e) 
	   {
		   e.printStackTrace();
	   }
   }
   private static void loginuser3()
   {
	   try
	   {
		   oPage.getUserName().sendKeys("user3");
		   oPage.getPassword().sendKeys("reddy");
		   oPage.getLogin().click();
		   Thread.sleep(2000);
	   }catch(Exception e)
	   {
		   e.printStackTrace();
	   }
   }
   private static void logoutuser3()
   {
	   try
	   {
		 oPage.getLogoutLink().click();  
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
