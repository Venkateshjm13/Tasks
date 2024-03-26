package test;

import java.time.Duration;

import org.openqa.selenium.Alert;
 
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
 
import org.testng.annotations.Test;

import base.BaseClass;
import page.LoginPage;
public class TC002_LoginPage extends BaseClass{

	@Test(priority=0)
	public void validLoginCredentials() {
		//Create the instance for the LoginPage class by passing driver   
		LoginPage loginPage = new LoginPage(driver);
		//call the navigateToSignup method in order to click on the login link 
		loginPage.navigateToLogin();
		//Add the explicitWait for the username field is clickable or not
		WebDriverWait explicitWait_elementClickable = new WebDriverWait(driver,Duration.ofSeconds(10));
		explicitWait_elementClickable.until(ExpectedConditions.elementToBeClickable(loginPage.usernameField));
		//call the enterLoginUsername method by passing the username as argument
		loginPage.enterLoginUsername("Vijay456");
		//call the enterLoginPassword method by passing the password as argument 
		loginPage.enterLoginPassword("john@52");
		//call the clickButton method to click on Login button
		loginPage.clickLoginButton();
		//Add the explicitwait for the username after login is visible or not 
		WebDriverWait explicitWait_loginName = new WebDriverWait(driver,Duration.ofSeconds(20));
		explicitWait_loginName.until(ExpectedConditions.visibilityOf(loginPage.checkUsername));
		//call the verifyLoginPageText method by passing the logged username 
		loginPage.verifyLoginPageText("Vijay456");
		//if the assertion in the above method is true ., then only the print statement will be printed 
		System.out.println("User is Login Successfully");
		
	}
	
	@Test(priority=1)
	public void unregisteredLoginCredentials()  {
		//Create the instance for the LoginPage class by passing driver 
		LoginPage loginPage1 = new LoginPage(driver);
		//call the navigateToSignup method in order to click on the login link 
		loginPage1.navigateToLogin();
		//Add the explicitWait for the username field is clickable or not
		WebDriverWait explicitWait_elementClickable2 = new WebDriverWait(driver,Duration.ofSeconds(5));
		explicitWait_elementClickable2.until(ExpectedConditions.elementToBeClickable(loginPage1.usernameField));
		//call the enterLoginUsername method by passing the unregistered username as argument
		loginPage1.enterLoginUsername("Joe53");
		//call the enterLoginPassword method by passing the unregistered password as argument 
		loginPage1.enterLoginPassword("joe@35");
		//call the clickButton method to click on Login button
		loginPage1.clickLoginButton();
		//Add the explicit wait to check the alert is present or not 
		WebDriverWait explicitWait2 = new WebDriverWait(driver,Duration.ofSeconds(5));
		explicitWait2.until(ExpectedConditions.alertIsPresent());
		//Switch to the alert present and store the handle of alert in to a variable 
		Alert alert = driver.switchTo().alert(); 
		String actualAlertText = alert.getText();//get the text from the alert dialog box 
		alert.accept();//Click on the ok button present in the alert dialog box 
		String expectedAlertText ="User does not exist.";//Store the expected text in string variable
		//using the assertions compare the actual with expected 
		Assert.assertEquals(actualAlertText,expectedAlertText);
		//Once the assertion return true , then only print statement will be executed
		System.out.println("Failed to Login : User does not exist");
		
	}
}
