package com.mukesh.example1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teat {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Mukesh\\Pen Driver\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.zoopla.co.uk/");
		driver.manage().window().maximize();
		//driver.findElement(By.className("button cookie-banner__button")).click();
		driver.findElement(By.id("search-input-location")).click();
		

	}

}
