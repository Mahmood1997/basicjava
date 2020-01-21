package sJ14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jetclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://jet.com/");
		//WebElement shirt = driver.findElement(by.)
		driver.manage().window().maximize();
		
	//	WebElement tables = driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody"));
		//get the rows
		List<WebElement> pic = driver.findElements(By.tagName("img"));
		//increment rows
		for(int i=0; i<pic.size(); i++)
		{
			System.out.println(pic.size());
			System.out.println(pic.get(i).getAttribute("src"));
		}

	}

}
