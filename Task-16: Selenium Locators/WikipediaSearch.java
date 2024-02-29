package com.guvi.general;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikipediaSearch {
    public static void main(String[] args) {
         
         
        WebDriver driver = new ChromeDriver();////Create a new instance of the Chrome Browser

        driver.manage().window().maximize();// Maximize the browser window
         
        driver.get("https://www.wikipedia.org/");// Navigate to Wikipedia website

        // Find the search input field and enter the query "Artificial Intelligence"
        WebElement searchInput = driver.findElement(By.id("searchInput"));
        searchInput.sendKeys("Artificial Intelligence"+Keys.RETURN);//Clicks on the search button
        
        // Click on the "History" section link in the search results
        WebElement historySectionLink = driver.findElement(By.linkText("History"));
        historySectionLink.click();
       
        // Print the title of the "History" section
        String pageTitle = driver.getTitle();
        System.out.println("Title of the History section: " + pageTitle);

         
    }
}

