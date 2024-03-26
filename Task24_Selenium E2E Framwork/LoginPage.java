package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;

import base.BaseClass;

public class LoginPage extends BaseClass{

	//Locators of the webelements present in the loginpage
	@FindBy(xpath="//a[text()='Log in']")
	WebElement loginLink;
	
	@FindBy(id="loginusername")
	public
	WebElement usernameField;
	
	@FindBy(id="loginpassword")
	WebElement passwordField;
	
	@FindBy(xpath="//button[text()='Log in']")
	WebElement loginButton;
	
	 
	@FindBy(id="nameofuser")
	public
	WebElement checkUsername;
	
	//Constructor of the Loginpage is to initialize the webelements using PageFactory class 
	public LoginPage(WebDriver driver ) {
		this.driver = driver ;
		PageFactory.initElements(driver,this); 
		}

	//method is to click on the Login link
	public void navigateToLogin() {
		loginLink.click();
	}
	
	//method is to enter the username in the username field
	public void enterLoginUsername(String username) {
		 
		usernameField.sendKeys(username);
	}
	//method is to enter the password in the password field
	public void enterLoginPassword(String password) {
		passwordField.sendKeys(password);
	}
	//method is to click on the login button
	public void clickLoginButton() {
		loginButton.click();
	}
	
	//method is to verify the username after logged in 
	public void verifyLoginPageText(String uname) {
		String actualLoginPageText = checkUsername.getText();
		String expectedLoginPageText="Welcome "+uname;
		Assert.assertEquals(actualLoginPageText,expectedLoginPageText);
		System.out.println("Login page actual text is     " +actualLoginPageText + "    expected text is " + expectedLoginPageText);
		 
	}
	
}

