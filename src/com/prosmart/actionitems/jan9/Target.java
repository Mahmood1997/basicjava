package com.prosmart.actionitems.jan9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Implicit wait is always applied on as a global scope
		// implicit wait is initiated for 10 and the unit is seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.target.com");
		//gets the parameters and sets it into the url.
		//initiates variable find to the in the application identified with the name searchterm 
		WebElement Find = driver.findElement(By.name("searchTerm"));
		SendKeys(driver, Find, 1, "TV");
		//sets sendkeys function and parameters for the first explicit wait
		WebElement Search = driver.findElement(By.xpath("//*[@id='headerMain']/div[1]/form/button[2]"));
		clickOn(driver, Search, 1);
		//sets the clickon function and initiates the parameters for the explicit wait
		}

		public static void SendKeys (WebDriver driver, WebElement locators, int timeout, String value)
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

}
