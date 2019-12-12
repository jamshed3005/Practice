package practice;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNG {
	
	WebDriver driver;
	
	@BeforeSuite
	public void browsersetup()
	{
		System.out.println("Before Suite");
		
	}
	@BeforeTest
	public void login()
	{
		System.out.println("Before Test");
	}
	
	
	@BeforeClass
	public void launchbrowser()
	{
		System.out.println("Before Class");
	}
	
	
	@BeforeMethod
	public void enterURL()
	{
		
		System.out.println("i am in before Method");
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jamshed Khan\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
//		driver=new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//		driver.get("Https://www.google.com");
//		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	}
	
	@Test
	public void test1()
	{
		
		System.out.println("test1");
		
//		JavascriptExecutor js=(JavascriptExecutor) driver;
////		WebElement element= driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/input"));
////		js.executeScript("argument[0].style.border='3px solid green'",element);
////		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/input")).click();
////		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/input")).sendKeys("jamshed");
////		
//		String title= driver.getTitle();
////		driver.findElement(By.id("fakebox-text")).sendKeys(Keys.ENTER);
//		
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		String title2= driver.getTitle();
//		
//		Assert.assertEquals(title, title2);
//		System.out.println("Test Succesfull");
		
		
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test2");
	}
	
	@Test
	public void test3()
	{
		System.out.println("Test3");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After Method");
	}
	@AfterClass
	public void Afterclass()
	{
		System.out.println("AfterClass");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("After Test");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
	}

}
