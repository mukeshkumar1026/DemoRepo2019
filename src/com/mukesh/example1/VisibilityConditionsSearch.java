package com.mukesh.example1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VisibilityConditionsSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Mukesh\\Pen Driver\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//driver.switchTo().alert().dismiss();
		
		// String title=driver.getTitle("Online Shopping Site for Mobiles, Electronics,
		// Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		driver.findElement(By.name("q")).sendKeys("Mobile");

	}

}
