package com.mukesh.example1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class AlertDemo {

	public static void main(String[] args) throws NoAlertPresentException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Mukesh\\Pen Driver\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Alert Message handling

		driver.get("https://www.testandquiz.com/selenium/testing.html");

		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.switchTo().frame(0);
		Actions action = new Actions(driver);

		action.clickAndHold(driver.findElement(By.id("sourceImage")))
				.moveToElement(driver.findElement(By.id("targetDiv"))).release().build().perform();

//		WebElement Source=driver.findElement(By.id("sourceImage"));
//		
//		WebElement Target=driver.findElement(By.id("targetDiv"));
//		
//		Actions action=new Actions(driver);
//		
//		action.dragAndDrop(Source, Target).build().perform();

//		Actions action=new Actions(driver);
//		
//		WebElement drag=driver.findElement(By.id("sourceImage"));
//		action.dragAndDropBy(drag, 150, 400).build().perform();

		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// WebDriverWait wait=new WebDriverWait(driver, 20);

//		Wait wait = new FluentWait(WebDriver reference)
//				.withTimeout(timeout, SECONDS)
//				.pollingEvery(timeout, SECONDS)
//				.ignoring(Exception.class);

//		WebElement webDropDown = driver.findElement(By.id("day"));
//				Select dropDown = new Select(webDropDown);
//
//				dropDown.selectByIndex(10);
//				dropDown.selectByValue("day");
//				dropDown.selectByVisibleText("31");

//		WebElement webDropDown = driver.findElement(By.id("testingDropdown"));
//		Select dropDown = new Select(webDropDown);
//
//		dropDown.selectByIndex(3);
//		dropDown.selectByValue("Database");
//		dropDown.selectByVisibleText("Database Testing");

		// driver.manage().window().setPosition(new Point(-2000, 0));
		// driver.manage().window().setPosition(new Point(600, 500));

		// Dimension d = new Dimension(300, 300);

		// Whatever dimension user want, that could be given as argument.

		// driver.manage().window().setSize(d);

		// driver.findElement(By.name("cusid")).sendKeys("53920");
		// driver.findElement(By.name("submit")).submit();

		// Switching to Alert
		// Alert alert = driver.switchTo().alert();

		// Capturing alert message.
		// String alertMessage = driver.switchTo().alert().getText();

		// Displaying alert message
		// System.out.println(alertMessage);
		// Thread.sleep(5000);

		// Accepting alert
		// alert.accept();
	}

}
