package com.guvi.general;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToNewWindow {

	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver driver = new ChromeDriver();//Create obj for chrome driver
        driver.manage().window().maximize();// Maximize the browser window
		driver.get("https://the-internet.herokuapp.com/windows");// Navigate to the windows page

		//Click the "Click Here" button to open a new window 
		WebElement clickHereButton = driver.findElement(By.linkText("Click Here"));
		clickHereButton.click();
		
		 
		// Get the window handles
        Set<String> windowHandles = driver.getWindowHandles();

        // Switch to the newly opened window
        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
            
        }
		
        // Verify that the text "New Window" is present on the page
        WebElement newWindow = driver.findElement(By.tagName("h3"));
        String newWindowText = newWindow.getText();
        if (newWindowText.equals("New Window")) {
            System.out.println("The Newly Opened window has text 'New Window'");
        } else {
            System.out.println("The Newly Opened window not having the text 'New Window'");
        }

        Thread.sleep(2000);//Wait for 2 sec on new window
         
        driver.close();// Close the new window
        
        // Switch back to the original window (parent window)
        String parentWindow = windowHandles.iterator().next();
        driver.switchTo().window(parentWindow);
        
        
        // Verify that the original window is active
        WebElement originalWindow = driver.findElement(By.tagName("h3"));
        String originalWindowText = originalWindow.getText();
        if(originalWindowText.equals("Opening a new window")) {
        	System.out.println("Original Window is active");
        } else {
        	System.out.println("Original Window is not active");
        }
        
        driver.quit();//Close the browser
	}

}
