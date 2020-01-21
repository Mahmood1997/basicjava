package com.prosmart.actionitems.jan9;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cnn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cnn.com");
		//puts in an implicit wait first parameter is amount of 
		//time waited and the unit is for the type of time measurement being done (seconds)
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

		//find by the input element set a java util list and set the parameters as 
		//webelement by java
		//variable initiated to the list of elements found by the input tagnames listed in the application
		List<WebElement>number_of_hiddenelements = driver.findElements(By.tagName("input"));

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

}
