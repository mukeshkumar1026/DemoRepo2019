package com.mukesh.example1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Form {

	public static void main(String[] args) {

		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver", "F:\\Mukesh\\Pen Driver\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*
		 * // Create object of ChromeOptions class ChromeOptions options = new
		 * ChromeOptions();
		 *  /
		 * // add parameter which will disable the extension
		 * options.addArguments("--disable-extensions");
		 * 
		 * // Start the chrome session WebDriver driver = new ChromeDriver(options);
		 * 
		 */
		//WebDriver driver = new FirefoxDriver();

		driver.get("http://demo.guru99.com/test/radio.html");
		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));

		// Radio Button1 is selected
		radio1.click();
		System.out.println("Radio Button Option 1 Selected");

		// Radio Button1 is de-selected and Radio Button2 is selected
		radio2.click();
		System.out.println("Radio Button Option 2 Selected");

		// Selecting CheckBox
		WebElement option1 = driver.findElement(By.id("vfb-6-0"));

		// This will Toggle the Check box
		option1.click();

		// Check whether the Check box is toggled on
		if (option1.isSelected()) {
			System.out.println("Checkbox is Toggled On");

		} else {
			System.out.println("Checkbox is Toggled Off");
		}

		// Selecting Checkbox and using isSelected Method
		driver.get("http://demo.guru99.com/test/facebook.html");
		WebElement chkFBPersist = driver.findElement(By.id("persist_box"));
		for (int i = 0; i < 2; i++) {
			chkFBPersist.click();
			System.out.println("Facebook Persists Checkbox Status is -  " + chkFBPersist.isSelected());
		}
		// driver.close();

	}
}
