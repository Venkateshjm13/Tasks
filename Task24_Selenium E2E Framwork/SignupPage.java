package page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.BaseClass;
public class SignupPage extends BaseClass{
	
	//Locators of the webelements present in the signuppage
	@FindBy(xpath=".//a[text()='Sign up']")
	WebElement signupLink;
	
	@FindBy(id="sign-username")
	public
	WebElement usernameField;
	
	@FindBy(id="sign-password")
	WebElement passwordField;
	
	@FindBy(xpath=".//button[text()='Sign up']")
	WebElement signupButton;
	
	//Constructor of the Loginpage is to initialize the webelements using PageFactory class 
	public SignupPage(WebDriver driver ) {
		this.driver = driver ;
		PageFactory.initElements(driver,this); 
		}
	
	//method is to click on the signup link
	public void navigateToSignup() {
		signupLink.click();
	}
	//method is to enter the username in the username field
	public void enterSignupUsername(String username) {
		usernameField.sendKeys(username);
	}
	//method is to enter the password in the password field
	public void enterSignupPassword(String password) {
		passwordField.sendKeys(password);
	}
	//method is to click on the signup button
	public void clickButton() {
		signupButton.click();
	}
	
	//method is to verify the alert message after clicked on signup button
	public void verifySingupAlertMessageText() {
		Alert alert = driver.switchTo().alert();
		String actualAlertText = alert.getText();
		String expectedAlertText = "Sign up successful.";
		Assert.assertEquals(actualAlertText,expectedAlertText);
		System.out.println(actualAlertText);
	}
	
	 
	

}

