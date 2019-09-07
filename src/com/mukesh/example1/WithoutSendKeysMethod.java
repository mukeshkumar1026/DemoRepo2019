package com.mukesh.example1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WithoutSendKeysMethod {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Mukesh\\Pen Driver\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.facebook.com");

		// This will execute JavaScript in your script
		((JavascriptExecutor) driver).executeScript("document.getElementById('u_0_i').value='Quality';");

		driver.quit();

	}

}
