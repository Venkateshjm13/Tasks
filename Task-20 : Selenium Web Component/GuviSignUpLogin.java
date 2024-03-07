package com.guvi.general;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuviSignUpLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();//Create obj for chrome driver
        driver.manage().window().maximize();// Maximize the browser window
		driver.get("https://www.guvi.in/");// Navigate to the Guvi register page
		
		Thread.sleep(1000);
		//Click on the Signup button
		WebElement signupButton = driver.findElement(By.linkText("Sign up"));
		signupButton.click();
		
		// Fill in all the details in signup form
		WebElement fullname = driver.findElement(By.xpath("//input[@id='name']"));
		fullname.sendKeys("VarunTej");
		
		WebElement emailaddress= driver.findElement(By.cssSelector("input[id='email']"));
		emailaddress.sendKeys("varuntej83@gmail.com");
		
		WebElement password = driver.findElement(By.className("password-err"));
		password.sendKeys("tejvarun@1985");
		
		WebElement mobilenumber = driver.findElement(By.id("mobileNumber"));
		mobilenumber.sendKeys("8310047124");
		
		// Click on the Signup button
		WebElement signupButton1 = driver.findElement(By.linkText("Sign Up"));
		signupButton1.click();
		
		Thread.sleep(1000);
		//Click on the May be later 
		WebElement later = driver.findElement(By.xpath("//a[@id='laterBtn']"));
		later.click();
		
		//Verify that the User is registered successfully
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		if(pageTitle.equalsIgnoreCase("GUVI | Sign Up")) {
			System.out.println("User is registered successfully");
		}else {
			System.out.println("User is failed to register");
		}
		
		Thread.sleep(1000);
		driver.get("https://www.guvi.in/");//Again navigate to the guvi home page
		Thread.sleep(1000);
		//Click on the Login button
		WebElement loginButton = driver.findElement(By.linkText("Login"));
		loginButton.click();
		
		//Fill the details in Login form 
		WebElement emailaddress1= driver.findElement(By.id("email"));
		emailaddress1.sendKeys("varuntej83@gmail.com");
		
		WebElement password1= driver.findElement(By.id("password"));
		password1.sendKeys("tejvarun@1985");
		
		//Click on the Login button
		WebElement loginButton1 = driver.findElement(By.className("login-btn"));
		loginButton1.click();
		
		//Verify that the user is logged in successfully
		String loginpageTitle = driver.getTitle();
		System.out.println(loginpageTitle);
		if(loginpageTitle.equalsIgnoreCase("GUVI | Login")) {
			System.out.println("User is logged in successfully");
		}else {
			System.out.println("User is failed to log in");
		}
		
		driver.close(); //Close the browser 
	}

}
