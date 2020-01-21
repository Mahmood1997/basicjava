package sJ11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.expedia.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='tab-hotel-tab-hp']/span[2]")).click();
		String mon = "Mar 2020";
		String date = "20";
		driver.findElement(By.xpath("//*[@id='hotel-checkin-hp-hotel']")).click();
		
		while(true)
			
		{
			
		
		String text = driver.findElement(By.xpath("//caption")).getText(); 
		//*[@id="hotel-checkin-wrapper-hp-hotel"]/label/span[2]
		//if text.
		{
			
		}
		}
	}

}
