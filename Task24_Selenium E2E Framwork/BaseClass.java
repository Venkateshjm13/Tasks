package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
 

public class BaseClass {

	String baseUrl="https://www.demoblaze.com/";
	public static WebDriver driver;
	 
	@BeforeMethod
	public void launchBrowser() {
		System.out.println("Browser is Launched Successfully");
		driver=new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		driver.manage().window().maximize();
		 
	}
	 
	@AfterMethod
	public void terminateBrowser() {
		System.out.println("Browser is Closed Successfully");
		driver.close();
	}
}

