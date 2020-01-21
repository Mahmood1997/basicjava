package sJ14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dummysite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://automationpractice.com/index.php?id_category=5&controller=category");
		//WebElement shirt = driver.findElement(by.)
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		WebElement sliders = driver.findElement(By.xpath("//*[@id='ul_layered_price_0']/div"));
		//actions class allows you to imitate keyboard and mouse features through your script
		Actions actions = new Actions(driver);
		
actions.clickAndHold(sliders).moveByOffset(206, 1141).release().perform();
		sliders.click();
		driver.close();
	}

}
