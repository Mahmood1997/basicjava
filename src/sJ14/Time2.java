package sJ14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Time2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.timeanddate.com/worldclock/?continent=namerica");
		//WebElement shirt = driver.findElement(by.)
		driver.manage().window().maximize();
		
	//	WebElement tables = driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody"));
		//get the rows
		List<WebElement> time = driver.findElements(By.tagName("tr"));
		//increment rows
		for(int i=0; i<time.size(); i++)
		{
	//finding the city tagname or for the columns(for 1st for statament)
			List<WebElement> city = time.get(i).findElements(By.tagName("td"));
			//will go through every single row and column grab their values  
			for (int j=0; j<city.size(); j++)
			{
				System.out.println(city.get(j).getText());
			}
			System.out.println();
		}
		System.out.println();
	}

}
