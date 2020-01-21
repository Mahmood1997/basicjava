package sJ11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.expedia.com/");

		driver.manage().window().maximize();
		Thread.sleep(100);

		driver.findElement(By.xpath("//*[@id='tab-hotel-tab-hp']")).click();
		Thread.sleep(100);


		String mon = "Feb 2020";
		String date = "20";
		driver.findElement(By.xpath("//*[@id='hotel-checkin-wrapper-hp-hotel']/label/span[2]/span"));
		WebElement nextButton = driver.findElement(By.xpath("//*[@id='hotel-checkin-wrapper-hp-hotel']/div/div/button[2]"));
		nextButton.click();
		nextButton.click();

		while(true)
		{
		String text = driver.findElement(By.xpath("//caption")).getText();
		// text = Mar 2020 but when i open the calander if i dont Mar 2020
		if(text.equals(mon)){
		break;
		}
		else
		{
		//driver.findElement(By.xpath()
		driver.findElement(By.xpath("//*[@id='hotel-checkin-wrapper-hp-hotel']/div/div/button[2]")).click();
		}

		List<WebElement> allCallDate = driver.findElements(By.xpath("//*[@id='hotel-checkin-wrapper-hp-hotel']/div/div/div[2]/table/tbody/tr/td/button"));

		for(WebElement elem:allCallDate)
			{
			String date_value = (elem.getText());
			String day[] = date_value.split("\n");
			
			if(day[1].equals(date));
			{
				elem.click();
				break;
			}
			}
		
		
		}




	}

		


}


