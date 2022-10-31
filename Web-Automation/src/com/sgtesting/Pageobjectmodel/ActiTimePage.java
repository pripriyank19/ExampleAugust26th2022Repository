package com.sgtesting.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	
	
	

	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser,this);
	}
	//WebElement for User Name Text Field
	private WebElement username;
	
	public WebElement getUserName()
	{
		return username;
	}

	//WebElement for Password Text Field
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	
	//WebElement for Login Button
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement Loginbutton;
	public WebElement getLogin()
	{
		return Loginbutton;
	}
	
	//WebElement for FlyOutWindow
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	//WebElement for Logout Link
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogoutLink()
	{
		return oLogout;
	}
	//WebElement for CreateUser Text field
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")
	private WebElement UserButton;
	public WebElement getUserButton()
	{
		return UserButton;
	}
	//WebElement for AddButton
	@FindBy(xpath="//*[@id=\'createUserDiv\']/div/div[1]")
	private WebElement AddButton;
	public WebElement getAddButton()
	{
		return AddButton;
	}
	//WebElement for FirstName
	private WebElement userDataLightBox_firstNameField;
	public WebElement FirstName()
	{
		return userDataLightBox_firstNameField;
	}
	//WebElement for LastName
	private WebElement userDataLightBox_lastNameField;
	public WebElement LastName()
	{
		return userDataLightBox_lastNameField;
	}
	private WebElement userDataLightBox_emailField;
	public WebElement EmailId()
	{
		return userDataLightBox_emailField;
	}
	
	
	private WebElement userDataLightBox_usernameField;
	public WebElement UserNameinuser()
	{
		return userDataLightBox_usernameField;
	}
	private WebElement userDataLightBox_passwordField; 
	public WebElement password()
	{
		return userDataLightBox_passwordField;
	}
	private WebElement userDataLightBox_passwordCopyField;
	public WebElement retypepassword()
	{
		return userDataLightBox_passwordCopyField;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement CreateUserButton;
	public WebElement getCreateUserButton()
	{
		return CreateUserButton;
	}
    //WebElement for TaskButton for Customer
	@FindBy(xpath=("//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[1]"))
	private WebElement TaskButton;
	public WebElement getTaskButton()
	{
		return TaskButton;
	}
	@FindBy(xpath=("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]"))
	private WebElement AddButton1;
	public WebElement getAddButton1()
	{
		return AddButton1;
	}
	@FindBy(xpath=("/html/body/div[14]/div[1]"))
	private WebElement CreateCustomer;
	public WebElement getCreateCustomer()
	{
		return CreateCustomer;
	}
	private WebElement customerLightBox_nameField;
	public WebElement getCustomerName()
	{
		return customerLightBox_nameField;
	}

	@FindBy(xpath=("//*[@id=\'customerLightBox_commitBtn\']/div/span"))
	private WebElement CreateCustomerButton;
	public WebElement getCreateCustomerButton()
	{
		return CreateCustomerButton;
	}
	//WebElement for TaskButton for project
		@FindBy(xpath=("//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[1]"))
		private WebElement TaskButton1;
		public WebElement getTaskButton1()
		{
			return TaskButton;
		}
		@FindBy(xpath=("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]"))
		private WebElement AddButton2;
		public WebElement getAddButton2()
		{
			return AddButton2;
		}
		@FindBy(xpath=("/html/body/div[14]/div[2]"))
		private WebElement CreateProject;
		public WebElement getCreateCProject()
		{
			return CreateProject;
		}
		private WebElement projectPopup_projectNameField;
		public WebElement getProjectName()
		{
			return projectPopup_projectNameField;
		}
		@FindBy(xpath=("//*[@id=\'projectPopup_commitBtn\']/div/span"))
		private WebElement CreateProjectButton;
		public WebElement getCreateProjectButton()
		{
			return CreateProjectButton;
		}
		
		
		//modify the user
		@FindBy(xpath=("//span[@class='userNameSpan']"))
		private WebElement Createduserbutton;
		public WebElement getCreateduserbutton()
		{
			return Createduserbutton;
		}
		
		@FindBy(xpath=("//span[text()='Save Changes']"))
		private WebElement Savechangesbuttoninuser;
		public WebElement getSavechangesbuttoninuser()
		{
			return Savechangesbuttoninuser;
		}
		private WebElement userDataLightBox_deleteBtn;
		public WebElement getdelectuser()
		{
			return userDataLightBox_deleteBtn;
		}
		//modify the customer
		@FindBy(xpath=("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]"))
		private WebElement Creatededitbutton;
		public WebElement getCreatedModifybutton()
		{
			return Creatededitbutton;
		}
		
	}
	

