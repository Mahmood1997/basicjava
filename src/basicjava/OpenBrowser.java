package basicjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\driver\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.fb.com/");
		driver.findElement(By.xpath("//input[@type ='email']")).sendKeys("mdfhg@gmail.com");
		driver.findElement(By.xpath("//input[@type ='password']")).sendKeys("georgetown");
		driver.findElement(By.name("firstname")).sendKeys("big");
		driver.findElement(By.id("u_0_h")).sendKeys("Red");
		driver.findElement(By.name("reg_email__")).sendKeys("fakeemail@gmail.com");
		driver.findElement(By.id("u_0_p")).sendKeys("killerred");
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByIndex(4);
		Thread.sleep(3000);
		Select day = new Select(driver.findElement(By.id("day")));
		Thread.sleep(3000);
		day.selectByIndex(10);
		Select year = new Select(driver.findElement(By.id("year")));
		Thread.sleep(3000);
		year.selectByValue("2009");
		Thread.sleep(3000);
		WebElement fem = driver.findElement(By.id("u_0_9"));
		fem.click();
		WebElement male = driver.findElement(By.id("u_0_a"));
		male.click();
		WebElement t = driver.findElement(By.id("u_0_b"));
		t.click();
		WebElement sub = driver.findElement(By.id("u_0_w"));
		sub.click();
		
	}
	//*[@id="u_0_w"]

}
