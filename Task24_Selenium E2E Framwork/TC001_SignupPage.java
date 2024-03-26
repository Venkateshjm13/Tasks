package test;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import page.SignupPage;

public class TC001_SignupPage extends BaseClass{
	 
	 
	
	@Test(priority=0)
	public void validSignupCredentials(){
		//Create the instance for the SignupPage class by passing driver   
		SignupPage signupPage = new SignupPage(driver);
		//call the navigateToSignup method in order to click on the signup link 
		signupPage.navigateToSignup();
		//Add the explicitWait for the username field is clickable or not
		WebDriverWait explicitWait_elementClickable = new WebDriverWait(driver,Duration.ofSeconds(5));
		explicitWait_elementClickable.until(ExpectedConditions.elementToBeClickable(signupPage.usernameField));
		//call the enterSignupUsername method by passing the username as argument 
		signupPage.enterSignupUsername("Vijay456");
		//call the enterSignupPassword method by passing the password as argument 
		signupPage.enterSignupPassword("john@52");
		//call the clickButton method to click on Signup button
		signupPage.clickButton();
		//Add the explicit wait to check the alert is present or not 
		WebDriverWait explicitWait_alertPresent = new WebDriverWait(driver,Duration.ofSeconds(5));
		explicitWait_alertPresent.until(ExpectedConditions.alertIsPresent());
		//Switch to the alert present and store the handle of alert in to a variable 
		Alert alert = driver.switchTo().alert(); 
		String actualAlertText = alert.getText();//get the text from the alert dialog box 
		alert.accept();//Click on the ok button present in the alert dialog box 
		String expectedAlertText = "Sign up successful.";//Store the expected text in string variable
		//using the assertions compare the actual with expected 
		Assert.assertEquals(actualAlertText,expectedAlertText); 
		//Once the assertion return true , then only print statement will be executed
		System.out.println("Signup is Successful"); 
	}
	

	@Test(priority=1)
	public void  alreadyExistingSignupCredentials() {
		//Create the instance for the SignupPage class by passing driver   
		SignupPage signupPage1 = new SignupPage(driver);
		//call the navigateToSignup method in order to click on the signup link 
		signupPage1.navigateToSignup();
		//Add the explicitWait for the username field is clickable or not
		WebDriverWait explicitWait_elementClickable = new WebDriverWait(driver,Duration.ofSeconds(5));
		explicitWait_elementClickable.until(ExpectedConditions.elementToBeClickable(signupPage1.usernameField));
		//call the enterSignupUsername method by passing the already exisiting username as argument 
		signupPage1.enterSignupUsername("Vijay456");
		//call the enterSignupPassword method by passing the password as argument 
		signupPage1.enterSignupPassword("joe@52");
		//call the clickButton method to click on Signup button
		signupPage1.clickButton();
		//Add the explicit wait to check the alert is present or not 
		WebDriverWait explicitWait_alertPresent = new WebDriverWait(driver,Duration.ofSeconds(5));
		explicitWait_alertPresent.until(ExpectedConditions.alertIsPresent());
		//Switch to the alert present and store the handle of alert in to a variable 
		Alert alert = driver.switchTo().alert();
		String actualAlertText = alert.getText();//get the text from the alert dialog box 
		alert.accept();//Click on the ok button present in the alert dialog box 
		String expectedAlertText = "This user already exist.";//Store the expected text in string variable
		//using the assertions compare the actual with expected 
		Assert.assertEquals(actualAlertText,expectedAlertText);
		//Once the assertion return true , then only print statement will be executed
		System.out.println("Already exisiting user ., So Failed to Signup ");
	}
}

