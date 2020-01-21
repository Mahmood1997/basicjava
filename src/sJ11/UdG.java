package sJ11;

import org.openqa.selenium.WebDriver;

public class UdG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		googlesearch();
	}

	
	public static void googlesearch()
	{
		String projectPath = System.getProperty("user.dir");
		System.setProperty(WebDriver.chrome.driver, projectPath+"")
	}
}
