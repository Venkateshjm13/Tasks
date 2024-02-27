package com.guvi.general;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class SimpleWebDriverScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();//Create a new instance of the ChromeDriver
		
		driver.get("https://www.demoblaze.com/index.html");//Open the demoblaze website
		
		driver.manage().window().maximize();//Maximize the chrome window
		
		// Find the button element by its id attribute
		WebElement buttonElement = driver.findElement(By.id("signin2"));
	
		buttonElement.click();//it will clicks the signup button
		
		driver.close();//Close the browser window
	}

}
