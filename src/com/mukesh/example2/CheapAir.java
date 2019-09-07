package com.mukesh.example2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheapAir {
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","F:\\Mukesh\\Pen Driver\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.cheapair.com/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	
	driver.findElement(By.id("from1")).sendKeys("Bangalore");
	
	
	
	driver.findElement(By.id("to1")).sendKeys("Patna");
	//driver.findElement(By.class("placeholder")).click();
	
	
	
	
	}
	
	
	

}
