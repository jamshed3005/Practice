package practice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;


public class Window_handle {
	
WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jamshed Khan\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/popup.php");
	}
	
			
	
	@Test
	public void halfebayregistrationpage() throws InterruptedException, IOException
	{
		
		driver.findElement(By.linkText("Click Here")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		String current_windows= driver.getWindowHandle();
		
		Set<String> window_handles=driver.getWindowHandles();
		Iterator it=window_handles.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
			
				driver.switchTo().window((String)it.next());
				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("jamshed");
				
				Actions ac= new Actions(driver);
				ac.contextClick(driver.findElement(By.name("btnLogin"))).build().perform();
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments	[0].style.border='3px solid green';", driver.findElement(By.name("btnLogin")));
				driver.findElement(By.name("btnLogin")).click();
				
				TakesScreenshot scrshot=(TakesScreenshot)driver; 
				File srcfile=scrshot.getScreenshotAs(OutputType.FILE);
				
				File destfile=new File("C:\\Users\\Jamshed Khan\\Desktop\\screen1.jpg");
				
				FileUtils.copyFile(srcfile,destfile);
				
				Thread.sleep(2);
				driver.close();
				
		
		}
		
		driver.switchTo().window(current_windows);
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
