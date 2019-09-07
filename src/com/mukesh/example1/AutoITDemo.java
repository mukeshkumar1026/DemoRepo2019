package com.mukesh.example1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo {
	

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Mukesh\\Pen Driver\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://tinyupload.com/");
		 driver.findElement(By.name("uploaded_file")).click();
		 Runtime.getRuntime().exec("C:\\Users\\Mukesh\\Desktop\\Test\\FileUploadScript.exe");

	}

}
