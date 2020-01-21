package com.prosmart.actionitems.jan16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//everythiing is basically the same format except for the url
		//format is https://(username):(password)@(rest of the url)
		//no www.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		WebElement PMS = driver.findElement(By.xpath("//div [@class ='example']"));
		System.out.println(PMS);


	}

}
