package sJ14;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navi2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();//to maximize the screen 
		Thread.sleep(2000);
		//list:array WebElement: sets the elements into an array or group of them,
		//brown is the object assigned to the array
		//assign it to finding elements by their tag names
		List<WebElement> number_of_hiddenelements= driver.findElements(By.tagName("input"));
		//tag name types: input, type, a. All the elements fall in that input layer
		
		System.out.println(number_of_hiddenelements.size());
		
		for (int i=0; i< number_of_hiddenelements.size() ;i++)
		{//getAttribute to get the attributes on a larger scale
			if(number_of_hiddenelements.get(i).getAttribute("type").trim().equalsIgnoreCase("hidden"));
			{//2nd if checks the empty text
				if(!(number_of_hiddenelements.get(i).getAttribute("value").trim().isEmpty()));
				{//prints all the elements
					System.out.println("Hidden Element text= " +i+" "+number_of_hiddenelements.get(i).getAttribute("value").trim());
				}
			}
			
		}

	}

}
