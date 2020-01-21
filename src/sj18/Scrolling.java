package sj18;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.djcity.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//1-pixel
		
	//	js.executeScript("window.scrollBy(0,1000)",""); 
		
		//2-using element
		WebElement social = driver.findElement(By.xpath("//*[@id='jp_interface_10']/div/div[1]/h2"));
		js.executeScript("arguments[0].scrollIntoView()",social);
	}

}
