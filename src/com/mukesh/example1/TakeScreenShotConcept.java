package com.mukesh.example1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotConcept {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Mukesh\\Pen Driver\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");

		TakesScreenshot ts = ((TakesScreenshot) driver);
		File tr = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(tr,
				new File("F:\\Selenium_Java\\RadioButton\\Screenshots\\google.png"));

		// File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(src, new
		// File("F:\\Selenium_Java\\RadioButton\\src\\com\\mukesh\\example1\\google.png"));
		
		driver.quit();
	}

}
