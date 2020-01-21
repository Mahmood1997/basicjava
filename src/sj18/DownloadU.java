package sj18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("textbox")).sendKeys("Javasel");
		driver.findElement(By.id("CreateTxt")).click();
		driver.findElement(By.id("link-to-download")).click();
		
		
		//driver.findElement(By.id("pdfbox")).sendKeys("Testing sel");
		//driver.findElement(By.id("createPdf")).click();
		
		WebElement downB = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[1]/a"));
		//downB.click();

	}

}
