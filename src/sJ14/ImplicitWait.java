package sJ14;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\driver\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();
		//implicit wait is always applied globally for all webelements
		//present in the script
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.fb.com/");
		WebElement FN = driver.findElement(By.name("firstname"));
		WebElement LN = driver.findElement(By.name("lastname"));
		WebElement fem = driver.findElement(By.id("u_0_9"));
		Click(driver, fem, 10);
		SendKeys(driver, FN, 10, "Ali");
		SendKeys(driver, LN, 10, "Shumon");
		
//		driver.findElement(By.name("email")).sendKeys("mdfhg@gmail.com");
//		driver.findElement(By.id("pass")).sendKeys("georgetown");
//		driver.findElement(By.name("firstname")).sendKeys("big");
//		driver.findElement(By.id("u_0_h")).sendKeys("Red");

	}
	
	public static void SendKeys(WebDriver driver, WebElement loc, int TO, String value)
	
	{//explicit wait doesnt have any command like implicit wait 
		//waits for particular elements or actions to take place.
		//(WebDriverWait) is used for explicit wait
		//it must have a condition****
		new WebDriverWait(driver, TO).until(ExpectedConditions.visibilityOf(loc));
		loc.sendKeys(value);
	}
	
	public static void Click(WebDriver driver, WebElement button, int TO)
	
	{
		new WebDriverWait(driver, TO).until(ExpectedConditions.elementToBeClickable(button));
		button.click();
	}
	
}
