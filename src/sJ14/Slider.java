package sJ14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.platerate.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		WebElement sliders = driver.findElement(By.cssSelector("#form-search-basic > div.menuItemDiv.row.yesMarginY > div > div:nth-child(3) > input"));
		//actions class allows you to imitate keyboard and mouse features through your script
		Actions actions = new Actions(driver);
		
actions.clickAndHold(sliders).moveByOffset(200, 400).release().perform();
		sliders.click();
	}

}
