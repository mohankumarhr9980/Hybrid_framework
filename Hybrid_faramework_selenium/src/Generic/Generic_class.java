package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_class implements Framework_constant
{
	public  WebDriver driver;
	@BeforeMethod
	public void openApp()
	{
		System.setProperty(chrome_key, chrome_value);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
	}
	@AfterMethod
	public void closeApp(ITestResult res)//fail 
	{
		if (ITestResult.FAILURE==res.getStatus()) 
		{
			Capture_screenshot.getscreenshot(driver);
		}
		driver.close();
	}

}
