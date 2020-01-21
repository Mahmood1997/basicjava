package sj18;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SctollBottom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.com/");
		//driver.manage().window().maximize();
		
//		JavascriptExecutor j2 = (JavascriptExecutor)driver;
//		j2.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//		
		String name = driver.getTitle();
		System.out.println(name);
	}

}
