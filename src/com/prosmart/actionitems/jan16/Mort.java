package com.prosmart.actionitems.jan16;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mort {
	
	public WebDriver driver;
	
	@BeforeTest
	
	public void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.mortgagecalculator.org/");
	}
	
	@Test(priority= 0)
	public void Rates() 
	{
		driver.findElement(By.xpath("//input[@id= 'homeval']")).sendKeys("3464746");
		driver.findElement(By.id("downpayment")).sendKeys("65786");
		WebElement per = driver.findElement(By.cssSelector("#calc > form > section > section.content-area > div > div > div.calculation-container > div > div > div.cal-content > div.cal-left-box > div.calcu-block > div:nth-child(2) > span > label:nth-child(2) > input[type=radio]"));
		per.click();
		
		WebElement mon = driver.findElement(By.cssSelector("#calc > form > section > section.content-area > div > div > div.calculation-container > div > div > div.cal-content > div.cal-left-box > div.calcu-block > div:nth-child(2) > span > label:nth-child(1) > input[type=radio]"));
		//mon.click();
		WebElement pp = driver.findElement(By.name("param[principal]"));
		pp.clear();
		pp.sendKeys("34535");
		driver.findElement(By.id("intrstsrate")).sendKeys("2");
		WebElement rateB = driver.findElement(By.name("ratebutton"));
		//rateB.click();
	}
		
	@Test(priority= 1)
	public void Compare()
	{
		driver.findElement(By.id("loanterm")).sendKeys("34");
		Select startmonth = new Select(driver.findElement(By.name("param[start_month]")));
		startmonth.selectByValue("6");
		driver.findElement(By.name("param[start_year]")).sendKeys("2020");
		driver.findElement(By.name("param[property_tax]")).sendKeys("3200");
		driver.findElement(By.name("param[pmi]")).sendKeys("0.2");
		driver.findElement(By.name("param[hoi]")).sendKeys("2000");
		driver.findElement(By.name("param[hoa]")).sendKeys("37");
		Select lType = new Select (driver.findElement(By.name("param[milserve]")));
		lType.selectByValue("3");
		WebElement Comp = driver.findElement(By.name("loantypebutton"));
		//Comp.click();
	
		
	}
	
	@Test(priority= 2)
	public void Calculate()
	{
		Select br = new Select(driver.findElement(By.cssSelector("#calc > form > section > section.content-area > div > div > div.calculation-container > div > div > div.cal-content > div.cal-left-box > div.calcu-block > div:nth-child(16) > select")));
		br.selectByValue("1");
		Select cr = new Select (driver.findElement(By.xpath("/html/body/section/div/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[1]/div[1]/div[17]/select")));
		cr.selectByValue("3");
		WebElement calc = driver.findElement(By.name("cal"));
		//calc.click();
	}
	
	@Test(priority= 3)
	public void Result() throws InterruptedException
	{
		WebElement lk = driver.findElement(By.cssSelector("#calc > form > section > section.content-area > div > div > div.calculation-container > div > div > div.cal-content > div.cal-left-box > div.output-param > a"));
		lk.click();
		//application was slowly loading so i put a thread.sleep so the the script would wait until the page finishes loading
		Thread.sleep(2000);
		WebElement pf = driver.findElement(By.cssSelector("#calc > form > section > section.content-area > div > div > div.calculation-container > div > div > div.cal-content > div.cal-left-box > p:nth-child(4) > input"));
		//pf.click();
		WebElement stc = driver.findElement(By.xpath("//*[@id='share_button']"));
		stc.click();
	}
	@Test(priority= 4)
	public void Amortization()
	{
		
		WebElement cb1 = driver.findElement(By.name("param[draw_charts]"));
		cb1.click();
		WebElement cb2 = driver.findElement(By.name("param[show_m_vs_w]"));
		cb2.click();
		WebElement cb3 = driver.findElement(By.name("param[show_annual]"));
		cb3.click();
		WebElement cb4 = driver.findElement(By.name("param[show_monthly]"));
		cb4.click();
		WebElement cb5 = driver.findElement(By.name("param[hide_ads]"));
		cb5.click();
	}
	
	
	@AfterTest
	public void CloseBrowser()
	{
		driver.close();
	}

}
