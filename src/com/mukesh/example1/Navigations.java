package com.mukesh.example1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Mukesh\\Pen Driver\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");

		driver.navigate().to("https://www.amazon.in/");

		//Thread.sleep(3000);
		driver.navigate().back();
		//Thread.sleep(3000);

		driver.navigate().forward();
		///Thread.sleep(3000);

		driver.navigate().back();
		driver.navigate().refresh();
	}

}
