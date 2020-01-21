package sj18;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSQA\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//switching to a frame, (indexx is 0 which we set)
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.xpath("//div[@id= 'draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id= 'droppable']"));
		//commit the actions class to a new action and in the a parameters specify on what object the driver should be run
		//the driver is set into the parameters so this seperate actions cclass knows what to perform the action on
		
		Actions action = new Actions(driver);

		
		//first you press and hold the objct (drag oibject specified above
		//then you move it the other object(drop)
		//then you release and in the build of the function and make sure it is performed
		
		action.clickAndHold(drag).moveToElement(drop).release().build().perform();
		
		
		

	}

}
