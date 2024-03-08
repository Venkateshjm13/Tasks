package com.guvi.general;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToiframe {

	public static void main(String[] args) {
		 
		WebDriver driver = new ChromeDriver();//Create obj for chrome driver
        driver.manage().window().maximize();// Maximize the browser window
		driver.get("https://the-internet.herokuapp.com/iframe");// Navigate to the iframe page
	
		// Switch to the iframe  using the css selector
		WebElement iframe = driver.findElement(By.cssSelector("iframe[id='mce_0_ifr']"));
        driver.switchTo().frame(iframe);
        //Other way to switch the frame is -> driver.switchTo().frame("mce_0_ifr");
        
        //Located the p tag and writes Hello people
        WebElement ptag = driver.findElement(By.tagName("p"));
        ptag.clear();
        ptag.sendKeys("Hello People");
        
        driver.close();//closing the browser instance 		 
	}
}
