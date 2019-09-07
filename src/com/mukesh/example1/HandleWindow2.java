package com.mukesh.example1;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Mukesh\\Pen Driver\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		String parent = driver.getWindowHandle();
		System.out.println("Parent window id is: " + parent);
		Set<String> allWindow = driver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList<>(allWindow);
		
		driver.switchTo().window(tabs.get(3));
		driver.close();
		driver.switchTo().window(tabs.get(2));
		driver.close();

		driver.switchTo().window(tabs.get(1));
		driver.close();
		driver.switchTo().window(tabs.get(0));
		driver.close();

		System.out.println("Ttile of parent window is" + driver.getTitle());

	}

}
