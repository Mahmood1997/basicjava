package sJ11;

//import junit.framework.Test;

//import org.junit.Before;
import org.apache.log4j.Priority;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
//pre condition annotations
		@BeforeTest()
		
		public void OpenBrowser()
		{
			System.out.println("Browser Opened");
		}
		//all annotations needs a result thus the parenthesis 
		@Test (priority=2)
		
		public void FirstRegister()
		{
			System.out.println("User should register on account"); 
		}//method name should directly correlate to the function of the method 
		
		 @Test(priority=3, description="Mandatory", enabled= false, testName = "Smoke")
		
		public void SignIn ()
		{
			System.out.println("Login Successful");
		}
	
@Test(priority= 1)
		
		public void PrepareEmail()
		{
			System.out.println("Create Email");
		}

@Test(priority= 0)

	public void Signout()
	{
		System.out.println("Sign out Successful");
	}

@AfterTest//post conditional annotation basically what reiterates the end function of the method

	public void CloseBrowser()
	{
		System.out.println("Browser Closed");
	}

	
		
		
		
}
