package com.guvi.general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPageTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();//Create a new instance of the Chrome Browser
		
		driver.get("http://www.demoblaze.com");//Navigate to "http://google.com"
		
		driver.manage().window().maximize();// Maximize the browser window
		
		String actualResult = driver.getTitle();// Get the title of the page
		String exceptedResult ="STORE";//Assigned the title of the page to variable
		
		if(actualResult.equals(exceptedResult)) {
			System.out.println("Page landed on correct website");
		}else {
			System.out.println("Page not landed on correct website");
		}
		
	}

}
