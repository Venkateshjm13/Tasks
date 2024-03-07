package com.guvi.general;

import java.time.Duration;

import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		// Switch to the frame containing the draggable elements
        driver.switchTo().frame(0);
        //WebElement fr = driver.findElement(By.className("demo-frame"));
        //driver.switchTo().frame(fr);
        
		WebElement sourceElement = driver.findElement(By.id("draggable"));
		WebElement targetElement = driver.findElement(By.id("droppable"));
		 
		Actions action =new Actions(driver);
		action.dragAndDrop(sourceElement,targetElement).build().perform();
		
		 // Verify the color property of the target element's CSS
        String targetColor = targetElement.getCssValue("background-color");
        System.out.println("Color of the target element after drop: " + targetColor);

        // Verify the text of the target element has changed to "Dropped!"
        String targetText = targetElement.getText();
        System.out.println("Text of the target element after drop: " + targetText);
		 
	}

}
