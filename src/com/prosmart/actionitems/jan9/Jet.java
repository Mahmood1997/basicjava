package com.prosmart.actionitems.jan9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jet.com/");

		//get the rows tagname
		List<WebElement> images = driver.findElements(By.tagName("img"));
		//for loop initializes the variable i to the integer 0 and creates a 
		//sequential order to increase by the increment of 1
		System.out.println("Total # of images: "+images.size());
		for (int i = 0; i < images.size(); i++)
		{//prints out the src value for each images in consecutive order due to the for loop
			
			System.out.println(i+": ");
			System.out.println(images.get(i).getAttribute("src"));

		}//prints out the number of images on the application
		


	}

}
