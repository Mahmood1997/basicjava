package sJ14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Time {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.timeanddate.com/worldclock/?continent=namerica");
		//WebElement shirt = driver.findElement(by.)
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		List<WebElement> time = driver.findElements(By.tagName("tr"));
		List<WebElement> city = driver.findElements(By.tagName("td"));
		
		System.out.println(city.size());
		//tag name types: input, type, a. All the elements fall in that input layer
		System.out.println(time.size());
//		for (int x=1; x< city.size(); x++)
//		{
//			//System.out.println(city.get(x));
//			if(city.get(x).getAttribute("a").trim().contains("$0"))
//			{
//				System.out.println(city.get(x));
//				
//			}
//		}
//		for (int i=1; i< time.size() ;i++)
//		{//getAttribute to get the attributes on a larger scale
//			if(time.get(i).getAttribute("id").trim().contains("p"));
//			{//2nd if checks the empty text
//				if(!(time.get(i).getAttribute("class").trim().contains("i")));
//				{//prints all the elements
//					System.out.println("Hidden Element text= " +i+" "+time.get(i).getAttribute("td").trim());
//				}
//			}
//			
//		}

	}

}
