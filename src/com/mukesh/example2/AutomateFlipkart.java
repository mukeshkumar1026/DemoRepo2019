package com.mukesh.example2;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomateFlipkart {

	public static WebDriver driver;
	// public static String driverPath = "C:\workspace\tools\selenium\";
	public static String sBookKey = "Selenium";
	private static final String sSearchBox = "fk-top-search-box";
	private static final String sSearchResult = "//li[contains(text(),'in')]//span";
	private static final String sBookName = "(//a[contains(.,'" + sBookKey + "')])[last()]";
	private static final String sAddToCart = "(//input[contains(@value,'Add to Cart')])[1]";
	private static final String sViewCartXPath = "(//a[contains(.,'view cart')])[1]";

	public static void initWebDriver(String URL) throws InterruptedException {

		// Setting up Chrome driver path.
		System.setProperty("webdriver.chrome.driver",
				"F:\\Mukesh\\Pen Driver\\Selenium\\chromedriver_win32\\chromedriver.exe");
		// Launching Chrome browser.
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
	}

	public static void main(String[] args) throws InterruptedException {

		initWebDriver("http://www.flipkart.com");

		flipkartLogin();

		driver.findElement(By.id(sSearchBox)).sendKeys(sBookKey);

		WebElement searchResult = getElement(By.xpath(sSearchResult));
		searchResult.click();

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(sBookName))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(sAddToCart))).click();

		getElement(By.xpath(sViewCartXPath)).click();
		getElement(By.cssSelector("form[id='view-cart-form'] button")).click();
		getElement(By.xpath("//input[@id='email' and @name='email']")).sendKeys("test@testmail.com");

		// pause for a second and close the browser.
		Thread.sleep(1000);
		endSession();
	}

	public static WebElement getElement(final By locator) {
		//FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
		//		.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

		/*WebElement element = wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver arg0) {
				return arg0.findElement(locator);
			}

		});
		
		*/
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(30, TimeUnit.SECONDS)
			       .pollingEvery(5, TimeUnit.SECONDS)
			       .ignoring(NoSuchElementException.class);

			WebElement element = wait.until(new Function<? super WebDriver, T>(){
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.id("element"));
			     }
			   });

		return element;
	}

	public static void flipkartLogin() {
		driver.findElement(By.linkText("Log In")).click();

		// TBD: Fill your username/password of flipkart.
		getElement(By.cssSelector("input[placeholder='Enter email/mobile']")).sendKeys("");
		getElement(By.cssSelector("input[placeholder='Enter password']")).sendKeys("");
		getElement(By.cssSelector("input[value='Login'][class='submit-btn login-btn btn']")).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TBD: Auto-generated catch block.
			e.printStackTrace();
		}
	}

	public static void endSession() {
		driver.close();
		driver.quit();
	}
}
