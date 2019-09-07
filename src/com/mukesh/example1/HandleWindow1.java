package com.mukesh.example1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Mukesh\\Pen Driver\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		driver.manage().window().maximize();
		String parent = driver.getWindowHandle();
		System.out.println("Parent window id is: " + parent);

		driver.findElement(By.xpath("//a[contains(@herf,'http://www.google.com\')]")).click();
		Set<String> allWindow = driver.getWindowHandles();
		int count = allWindow.size();
		System.out.println("Total window :" + count);

		for (String child : allWindow) {
			if (!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				driver.findElement(By.name("q")).sendKeys("Selenium WebDriver");

				Thread.sleep(3000);
				driver.close();

			}
		}

		driver.switchTo().window(parent);
		System.out.println("Parent window title is" + driver.getTitle());
	}

}
