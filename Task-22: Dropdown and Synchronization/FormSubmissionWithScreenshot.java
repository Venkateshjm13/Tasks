package com.guvi.general;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class FormSubmissionWithScreenshot {

	public static void main(String[] args) {
		 
		
		WebDriver driver = new ChromeDriver();//Create obj for chrome driver
		driver.manage().window().maximize();//Maximize the browser window 
		driver.get("https://phptravels.com/demo/");//Navigate to php travels site
		
		List<WebElement> formElements = driver.findElements(By.xpath("//div[@class='form']"));
		 
		//WebDriverWait class to wait for all the form elements
		WebDriverWait explicitWait = new WebDriverWait(driver,Duration.ofSeconds(10));
		explicitWait.until(ExpectedConditions.visibilityOfAllElements(formElements));
		
		//Enter the First name
		WebElement firstName = driver.findElement(By.name("first_name"));
		firstName.sendKeys("Varun");
		//Enter the Last name
		WebElement lastName = driver.findElement(By.name("last_name"));
		lastName.sendKeys("Tej");
		//Enter the Business name
		WebElement businessName = driver.findElement(By.name("business_name"));
		businessName.sendKeys("Hotel");
		//Enter the Email address
		WebElement emailField = driver.findElement(By.name("email"));
		emailField.sendKeys("varuntej13@gmail.com");
		
		//Locate the numbers on the form 
		WebElement num1 =driver.findElement(By.xpath("//span[@id='numb1']"));
		WebElement num2 =driver.findElement(By.xpath("//span[@id='numb2']"));
		
		//Convert String numbers to Integer numbers
		String numberText1 =num1.getText();
		int number1 =Integer.valueOf(numberText1);
		 
		String numberText2 =num2.getText();
		int number2 =Integer.parseInt(numberText2);
		 
		//Logic for Sum Verification 
		int result = number1+number2;
		System.out.println(number1 + "  +   "  + number2 + "  =   " + result);
		
		//Convert Integer result to String 
		String resultasString = String.valueOf(result);
		 

		//Pass the result string into result field 
		WebElement resultFiled  = driver.findElement(By.id("number"));
		resultFiled.sendKeys(resultasString);
		
		//Click on the Submit button
		WebElement submitButton = driver.findElement(By.xpath("//button[text()='Submit']"));
		submitButton.click();
		
		//WebDriverWait class to wait for all the Completed form elements
		List<WebElement> content = driver.findElements(By.xpath("//div[@class='completed']"));
		WebDriverWait explicitWait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
		explicitWait1.until(ExpectedConditions.visibilityOfAllElements(content));
		
		//Verify the form submitted by checking the message displayed
		WebElement message = driver.findElement(By.xpath("//h2/strong[text()=' Thank you!']"));
		String messageText = message.getText();
		System.out.println(messageText);
		if(messageText.equalsIgnoreCase("Thank you!")) {
			System.out.println("The Form is Submitted Successfully");
		}else {
			System.out.println("The Form is Failed to Submit");
		}
		
		//Take  Screenshot after the Form submission
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		String path = System.getProperty("user.dir");
		 
		File dest = new File(path + "/screenshots/AfterFormSubmissionPage.png");
		
		try {
			FileHandler.copy(src, dest);
		}catch(IOException exception){
			exception.printStackTrace();
		}
	}

}
