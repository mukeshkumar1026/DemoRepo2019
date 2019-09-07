package com.mukesh.example1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class WithoutSendKeys {

	@Test
	public void scrollpageDown() throws Throwable {

		// Create a instance of ChromeOptions class
		ChromeOptions options = new ChromeOptions();

		// Add chrome switch to disable notification - "**--disable-notifications**"
		options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver",
				"F:\\Mukesh\\Pen Driver\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();

		Thread.sleep(5000);
		//WebElement send = driver.findElement(By.id("//input[@type='text'"));
		
		WebElement webElements= driver.findElement(By.id("jpform:fromStation"));
		  
		//webElements.sendKeys("NDLS"); 

		((JavascriptExecutor) driver).executeAsyncScript("argument[0].value='NDLS'", webElements);

	}

}
