package com.prosmart.actionitems.dec31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("currypot");
		WebElement search = driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input"));
		search.click();

	}

}
