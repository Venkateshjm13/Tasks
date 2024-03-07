package com.guvi.general;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
        WebDriver driver = new ChromeDriver();//Create obj for chrome driver
        driver.manage().window().maximize();// Maximize the browser window
        driver.get("https://www.facebook.com/");// Navigate to the Facebook website
        
        // Verify that the website has been redirected to the Facebook homepage
        String pageTitle = driver.getTitle();
        
        if (pageTitle.equalsIgnoreCase("Facebook – log in or sign up")) {
            System.out.println("Successfully redirected to Facebook homepage.");
        } else {
            System.out.println("Failed to redirect to Facebook homepage.");
            driver.quit();
            
        }

        // Click on the "Create new account" button
        WebElement createAccountBtn = driver.findElement(By.linkText("Create new account"));
        createAccountBtn.click();
        Thread.sleep(1500);
        //Enter First name 
        WebElement firstNameField =driver.findElement(By.xpath("//input[@name='firstname']"));
        firstNameField.sendKeys("Varun");
        //Enter last name
        WebElement lastNameField = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastNameField.sendKeys("Tej");
        //Enter email address
        WebElement emailField =driver.findElement(By.xpath("//input[@name='reg_email__']"));
        emailField.sendKeys("varuntej13@gmail.com");
        //Enter confirmation email address
        WebElement re_emailField =driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
        re_emailField.sendKeys("varuntej13@gmail.com");
        //Enter password
        WebElement passwordField = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
        passwordField.sendKeys("tejvarun@1985");
        
        //Select date of birth
        WebElement element = driver.findElement(By.id("day"));
        Select dayDropdown = new Select(element);
        dayDropdown.selectByVisibleText("11");
        
        WebElement element1 = driver.findElement(By.id("month"));
        Select monthDropdown = new Select(element1);
        monthDropdown.selectByVisibleText("May");
        
        WebElement element2 = driver.findElement(By.id("year"));
        Select yearDropdown = new Select(element2);
        yearDropdown.selectByVisibleText("1985");
        
        //Select gender
        WebElement genderRadioButton= driver.findElement(By.xpath("//input[@value='2']"));
        genderRadioButton.click();
        
	
        // Click on the "Sign Up" button
        WebElement signUpBtn = driver.findElement(By.name("websubmit"));
        signUpBtn.click();
	
        Thread.sleep(20000);
        // Verify successful registration
        String signUpPageTitle = driver.getTitle();
        if (signUpPageTitle.equals("Facebook")) {
            System.out.println("Successfully registered on Facebook and redirected to homepage.");
        } else {
            System.out.println("Failed to register on Facebook.");
        }

	
	
	}

}
