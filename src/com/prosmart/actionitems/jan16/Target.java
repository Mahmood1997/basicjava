package com.prosmart.actionitems.jan16;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Target {
	
	public WebDriver driver;
	
	@BeforeTest
	public void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		// Implicit wait is always applied on as a global scope
		// implicit wait is initiated for 10 and the unit is seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.target.com");
	}

		public static void SendKeys(WebDriver driver, WebElement locators, int timeout, String value)
		// Explicit wait does not have an impending command unlike implicit wait
		// the explicit wait has to have a condition thus its condition based
		{
			new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(locators));
			locators.sendKeys(value);
		}

		public static void clickOn(WebDriver driver, WebElement elements, int timeout)
		
		{
		//2nd explicit wait
			new WebDriverWait (driver, timeout).until(ExpectedConditions.elementToBeClickable(elements));
			elements.click();
		}
	
	@Test
	public void Find()
	{
		WebElement Find = driver.findElement(By.name("searchTerm"));
		SendKeys(driver, Find, 1, "TV");
		//sets sendkeys function and parameters for the first explicit wait
		WebElement Search = driver.findElement(By.xpath("//*[@id='headerMain']/div[1]/form/button[2]"));
		clickOn(driver, Search, 1);
	}
	
	@AfterTest
	public void CloseBrowser()
	{
		driver.close();
	}
	
}
