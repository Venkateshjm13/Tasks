package com.guvi.general;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 

public class SnapdealLoginVerification {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();//Create a new instance of the Chrome Browser
		driver.manage().window().maximize();
		driver.get("http://www.snapdeal.com");//Navigate to snapdeal website 
		
		
		// click on Sign in 
		WebElement signIn = driver.findElement(By.className("accountUserName"));
		signIn.click();
		
		//Click on Login button
		WebElement loginButton =driver.findElement(By.xpath("//span[@class='accountBtn btn rippleWhite']"));
		loginButton.click();
		 
		driver.switchTo().frame("iframeLogin");//Switch to iframeLogin 
		 
		// Enter valid Email Id 
		WebElement emailField = driver.findElement(By.id("userName"));
		emailField.sendKeys("jmtharun13@gmail.com");

		//click on Continue button
		WebElement continueButton = driver.findElement(By.xpath("//button[@id='checkUser']"));
		continueButton.click();
		
		Thread.sleep(10000);//Wait for 10 sec to enter the OTP sended to the mobile number that is assoicated with the email
		
		//Click on Continue button after entering OTP
		WebElement continueButton1 = driver.findElement(By.id("loginUsingOtp"));
		continueButton1.click();
		
		//Switch to previous frame 
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		//Verify the user is Logged in successfully
		WebElement userName = driver.findElement(By.className("accountUserName"));
		String userNameText = userName.getText();
		System.out.println("The Username is :"+userNameText);
		
		if(userNameText.equalsIgnoreCase("Tharun")) {
			System.out.println("User is Logged in Successfully");
		}else {
			System.out.println("User is Failed to Login");
		}
		 
	
	}

}
