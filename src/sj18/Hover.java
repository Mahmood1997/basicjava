package sj18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mortgagecalculator.org/");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		// this one does not use release 
		//following the flow of the actions of the object is key to coding the actions it should perform
		action.moveToElement(driver.findElement(By.xpath("/html/body/section/section/div/div/nav/ul/li[1]/a"))).build().perform();
		driver.findElement(By.xpath("/html/body/section/section/div/div/nav/ul/li[1]/ul/li[4]/a")).click();
		System.out.println(driver.getTitle());
		
	}

}
