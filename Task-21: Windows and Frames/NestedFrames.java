package com.guvi.general;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

	public static void main(String[] args){
		 

		WebDriver driver = new ChromeDriver();//Create obj for chrome driver
        driver.manage().window().maximize();// Maximize the browser window
		driver.get("http://the-internet.herokuapp.com/nested_frames");// Navigate to the Nested Frames page

		// Switch to the top frame
        driver.switchTo().frame("frame-top");
        
        // Verify that there are three frames on the page
        List<WebElement> frames = driver.findElements(By.tagName("frame"));
        if (frames.size() == 3) {
            System.out.println("There are three frames on the page");
        } else {
            System.out.println("There are not three frames on the page");
        }
        
        
        //Switch to the LEFT frame
        driver.switchTo().frame("frame-left");
        WebElement leftFrame = driver.findElement(By.xpath("//body[contains(text(),'LEFT')]"));
        String leftFrameText = leftFrame.getText();
        //Verify that the Left Frame has Text "LEFT"
        if(leftFrameText.equalsIgnoreCase("LEFT")) {
        	System.out.println("Left frame has a text 'LEFT'");
        } else {
            System.out.println("Left frame does not have a text 'LEFT'");
        }
        
        // Switch back to the top frame
        driver.switchTo().parentFrame();
         
        //Switch to the Middle frame
        driver.switchTo().frame("frame-middle");
        WebElement middleFrame = driver.findElement(By.id("content"));
        String middleFrameText = middleFrame.getText();
        //Verify that the Middle Frame has Text "MIDDLE"
        if(middleFrameText.equalsIgnoreCase("MIDDLE")) {
        	System.out.println("Middle frame has a text 'MIDDLE'");
        } else {
            System.out.println("Middle frame does not have a text 'MIDDLE'");
        }
        
        // Switch back to the top frame
        driver.switchTo().parentFrame();
        
        //Switch to the Right frame
        driver.switchTo().frame("frame-right");
        WebElement rightFrame = driver.findElement(By.xpath("//body[contains(text(),'RIGHT')]"));
        String rightFrameText = rightFrame.getText();
        //Verify that the Right Frame has Text "RIGHT"
        if(rightFrameText.equalsIgnoreCase("RIGHT")) {
        	System.out.println("Right frame has a text 'RIGHT'");
        } else {
            System.out.println("Right frame does not have a text 'RIGHT'");
        }
        
        // Switch back to the most parent 
        driver.switchTo().defaultContent();
        
        //Switch to the Bottom frame
        driver.switchTo().frame("frame-bottom");
        WebElement bottomFrame = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]"));
        String bottomFrameText = bottomFrame.getText();
        //Verify that the Bottom Frame has Text "BOTTOM"
        if(bottomFrameText.equalsIgnoreCase("BOTTOM")) {
        	System.out.println("Bottom frame has a text 'BOTTOM'");
        } else {
            System.out.println("Bottom frame does not have a text 'BOTTOM'");
        }
        
        // Switch back to the top frame
        driver.switchTo().parentFrame();

        // Verify that the page title is "Frames"
        String pageTitle = driver.getTitle();
        if (pageTitle.equals("Frames")) {
            System.out.println("Page title is Matched");
        } else {
            System.out.println("Page title is not Matched");
             
        }
        
	}

}
