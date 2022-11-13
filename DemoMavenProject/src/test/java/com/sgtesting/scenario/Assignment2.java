package com.sgtesting.scenario;

import org.openqa.selenium.Alert; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment2 {

	public static WebDriver oBrowser=null;



	public static void main(String[] args) {
	}
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
		WebElement oEle=null;
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(2000);
			oEle=oBrowser.findElement(By.xpath("//td[text()='Please identify yourself']"));
			Assert.assertTrue(oEle.isDisplayed());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=3,dataProvider="login")
	private static void login(String username,String pwd)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys(username);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			WebElement olink=oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(olink.isDisplayed());
		}catch(Exception e)
		{
			e.printStackTrace();

		}
	}
	@Test(priority=4)
	private static void minimizeflywindow()
	{
		String excepted;
		try
		{
			excepted="Getting Started Shortcuts";
			WebElement oEle=oBrowser.findElement(By.xpath("//div[test()='Getting Started Shortcuts']"));
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			String actual=oEle.getText();
			Assert.assertEquals(excepted,actual);
		}catch(Exception e)
		{

			e.printStackTrace();
		}
	}
	@Test(priority=5,dataProvider="createuser")
	private static void createuser(String firstname,String lastname,String email)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[1]")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo");

			oBrowser.findElement(By.name("lastName")).sendKeys("user");
			oBrowser.findElement(By.name("email")).sendKeys("Demo@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("DemoUser1");
			oBrowser.findElement(By.name("password")).sendKeys("Welcome123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome123");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	private static void modifyuser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("usersManagementBodyTagId")).click();
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).click();
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).click();
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).click();
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).click();
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).click();
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	private static void deleteuser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();
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
	@Test(priority=8)
	private static void logout()
	{
		 String excepted,actual;
		try
		{
			excepted="//*[@id='logoContainer']";
			oBrowser.findElement(By.linkText("logout")).click();
			Thread.sleep(5000);
			actual=oBrowser.getTitle();
			Assert.assertEquals(excepted, actual);		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=9)
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


	@DataProvider(name="login")
	public Object[][]getloginDetails()
	{
		return new Object[][] {{"admin","manager"}};
	}

	@DataProvider(name="createuser")
	public Object[][]getcreateuserDetails()
	{
		return new Object[][] {{"demo","user","demo@gamil.com"}};
	}
}



