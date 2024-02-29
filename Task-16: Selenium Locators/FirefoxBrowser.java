package com.guvi.general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FirefoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();//Create a new instance of the Firefox Browser
		
		driver.manage().window().maximize();// Maximize the browser window
		
		driver.get("http://google.com");//Navigate to "http://google.com"
		
		System.out.println("Current URL:"+driver.getCurrentUrl()); // Print the URL of the current page
		
		driver.navigate().refresh();// Reload the page
		
		driver.close();// Close the browser
	}

}
