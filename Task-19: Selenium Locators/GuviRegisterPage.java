package com.guvi.general;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuviRegisterPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();//Create obj for chrome driver
        driver.manage().window().maximize();// Maximize the browser window
		driver.get("https://www.guvi.in/register");// Navigate to the Guvi register page
		
		 
		//All the possible Locators for Full name
		
		
		WebElement id_locator = driver.findElement(By.id("name"));
		
		WebElement classname_locator = driver.findElement(By.className("form-control"));
		
		WebElement tagname_locator = driver.findElement(By.tagName("input"));
		
		WebElement css_locator = driver.findElement(By.cssSelector("input[id='name']"));
		 
		WebElement xpath_locator = driver.findElement(By.xpath("//input[@id='name']"));
		
		xpath_locator.sendKeys("VarunTej");
		
		//All the possible Locators for Email Address
		
		WebElement id_locator1 = driver.findElement(By.id("email"));
		
		//WebElement classname_locator1 = driver.findElement(By.className("form-control"));
		
		//WebElement tagname_locator1 = driver.findElement(By.tagName("input"));
		
		WebElement css_locator1 = driver.findElement(By.cssSelector("input[id='email']"));
		 
		WebElement xpath_locator1 = driver.findElement(By.xpath("//input[@id='email']"));
		
		css_locator1.sendKeys("varuntej13@gmail.com");
		
		//All the possible Locators for password
		
		WebElement id_locator2 = driver.findElement(By.id("password"));
		
		WebElement classname_locator2 = driver.findElement(By.className("password-err"));
		
		WebElement css_locator2 = driver.findElement(By.cssSelector("input[type='password']"));
		 
		WebElement xpath_locator2 = driver.findElement(By.xpath("//input[@type='password']"));
		
		classname_locator2.sendKeys("tejvarun@1985");
		//All the possible Locators for Mobile number
		
		WebElement id_locator3 = driver.findElement(By.id("mobileNumber"));
		
		WebElement classname_locator3 = driver.findElement(By.className("countrycode-left"));
		
		WebElement css_locator3 = driver.findElement(By.cssSelector("input[id='mobileNumber']"));
		 
		WebElement xpath_locator3 = driver.findElement(By.xpath("//input[@id='mobileNumber']"));
		
		id_locator3.sendKeys("8310047124");
		//All the possible Locators for signup
		
		WebElement id_locator4 = driver.findElement(By.id("signup-btn"));
		
		WebElement classname_locator4 = driver.findElement(By.className("btn"));
		
		WebElement css_locator4 = driver.findElement(By.cssSelector("a[id='signup-btn']"));
		 
		WebElement xpath_locator4 = driver.findElement(By.xpath("//a[@id='signup-btn']"));
		
		WebElement signupButton = driver.findElement(By.linkText("Sign Up"));
		
		signupButton.click();
	
		
		
		 
		
		 
		 
	}

}
