package com.guvi.general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();//Create a new instance of ChromeDriver
		
		driver.get("https://www.google.com"); // Open the Google homepage
		
		// Find the search box element by its name attribute
		WebElement searchBox = driver.findElement(By.name("q")); 
		 
		 
		driver.manage().window().maximize();//Maximize the chrome window
		
		// Enter the search query "Selenium Browser Driver" into the search box
		searchBox.sendKeys("Selenium Browser Driver");
		
		searchBox.submit();//it will submit the search query
		
		driver.close();// Close the browser window
		
	}

}
