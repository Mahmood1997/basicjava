package com.prosmart.actionitems.jan9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipKart {

	public static void main(String[] args) {
	
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Implicit wait is specifically commanded upon as implicitlywait

		driver.get("https://www.flipkart.com");
		//this function maximizes the application page as well as the navigate.back/forward/refresh 
		//to do it accordingly to the page
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		WebElement close = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		clickOn(driver, close, 1);

		WebElement sliders = driver.findElement(By.cssSelector("#container > div > div.t-0M7P._2doH3V > div._3e7xtJ > div > div:nth-child(1) > div > div:nth-child(1) > div > section._1MCcAi.D_NGuZ > div._1A0dov > div.gl5Kwg"));
		//this function is to move and set sliders
		Actions actions = new Actions(driver);

		actions.dragAndDropBy(sliders, 116, 385).release().build().perform();
		sliders.click();

	}

	public static void SendKeys (WebDriver driver, WebElement locators, int timeout, String value)
	// this is an explicit wait with the expected conditions has to have locators in its id 
	{
		
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(locators));
		locators.sendKeys(value);
		
	}

	public static void clickOn(WebDriver driver, WebElement elements, int timeout)
		
	{
		
		new WebDriverWait (driver, timeout).until(ExpectedConditions.elementToBeClickable(elements));
			elements.click();
	}

}
