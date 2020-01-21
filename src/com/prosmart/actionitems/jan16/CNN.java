package com.prosmart.actionitems.jan16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CNN {

	public WebDriver driver;
	
	@BeforeTest
	public void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.cnn.com");
	}
	
	@Test
	public void Inputs()
	{
		List<WebElement>number_of_hiddenelements = driver.findElements(By.xpath("//input"));
		
		System.out.println(number_of_hiddenelements.size());
		// print total numbers of variables initiated in the application 
		for(int i = 0; i<number_of_hiddenelements.size();i++)
		
		{
			if (number_of_hiddenelements.get(i).getAttribute("type").trim().equalsIgnoreCase("hidden"))
				// verifies any empty text and ignores it
			{
				if(!(number_of_hiddenelements.get(i).getAttribute("value").trim().isEmpty()))
					// a function that prints all the other variables remaining no matter what value it retains
				{
					System.out.println("hidden elements text: " + i +". "+number_of_hiddenelements.get(i).getAttribute("value").trim());
				}
			}
		
		}
	}
	
	@AfterTest
	public void CloseBrowser()
	{
		driver.close();
	}
}
