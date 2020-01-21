package sJ14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VAUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		
		//String currentTitle = driver.getCurrentURL();
		String currentTitle = driver.getTitle();//title is the info displayed on the tab
		
		System.out.println(currentTitle.contains("Facebook"));
		
		
	
		if(currentTitle.contains("Facebook"))
		{
			System.out.println("Validation 1: Passed - Title is working");
		}
		else
		{
			System.out.println("Validation 2: Failed - Title is not working");
		}
	}
}
