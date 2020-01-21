package com.prosmart.actionitems.jan16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	
	public WebDriver driver;
	
	@BeforeTest
	public void OpenBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test
	public void SignIn()
	{
		
		driver.findElement(By.xpath("//input[@type ='email']")).sendKeys("mdfhg@gmail.com");
		driver.findElement(By.xpath("//input[@type ='password']")).sendKeys("georgetown");
		System.out.println("Sign in successful");
	}
	
	@Test
	
	public void SignUp() throws InterruptedException
	{
		
		driver.findElement(By.name("firstname")).sendKeys("big");
		driver.findElement(By.id("u_0_h")).sendKeys("Red");
		driver.findElement(By.name("reg_email__")).sendKeys("fakeemail@gmail.com");
		driver.findElement(By.id("u_0_p")).sendKeys("killerred");
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByIndex(4);
		Thread.sleep(3000);
		Select day = new Select(driver.findElement(By.id("day")));
		Thread.sleep(3000);
		day.selectByIndex(10);
		Select year = new Select(driver.findElement(By.id("year")));
		
		year.selectByValue("2009");
		
		WebElement fem = driver.findElement(By.id("u_0_9"));
		fem.click();
		WebElement male = driver.findElement(By.id("u_0_a"));
		male.click();
		WebElement t = driver.findElement(By.id("u_0_b"));
		t.click();
		WebElement sub = driver.findElement(By.id("u_0_w"));
		sub.click();
		
	}
	
//	@Test
//	public void EnterDOB()
//	{
//		System.out.println("DOB verified");
//		
//	}
//	@Test
//	public void School()
//	{
//		System.out.println("School updated");
//	
//	}
//	@Test
//	public void ResultEmail()
//	{
//		System.out.println("Email sent");
//	}
//	@Test
//	public void Signout()
//	{
//		System.out.println("Successfully signed out");
//	}
	@AfterTest
	public void CloseBrowser()
	{
		driver.close();
		System.out.println("Browser closed");
	}
}
