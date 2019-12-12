package practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGFeatures {
	@Test
//	@Parameters({"browser"})
	public void login()
	{
		System.out.println("Browser");
		
		
	}
	
	@Test(dependsOnMethods="login")
	public void homepage()
	{
		System.out.println("Homepage test");
		
	}

}
