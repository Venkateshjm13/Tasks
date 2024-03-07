package com.guvi.general;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) {
		 
		WebDriver driver = new ChromeDriver();//Create obj for chrome driver
        driver.manage().window().maximize();// Maximize the browser window
		driver.get("https://jqueryui.com/datepicker/");// Navigate to the date picker page
	
		//Switch to iframe that contains the date picker
		WebElement fr = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(fr);
        
        //Click the Date Box in Datepicker
        WebElement clickDateBox =driver.findElement(By.cssSelector("input[class='hasDatepicker']"));
        clickDateBox.click();
        
        //Click the Next button to select the Next month
        WebElement nextButton =driver.findElement(By.xpath("//span[text()='Next']"));
        nextButton.click();
        
       
        WebElement selectDate = driver.findElement(By.linkText("22"));
        selectDate.click();
        //Print the selected date to console
        System.out.println("The Selected date is " + selectDate.getText());
        
         
        
	}

}
