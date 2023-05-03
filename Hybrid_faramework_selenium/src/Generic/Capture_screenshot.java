package Generic;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Capture_screenshot
{
	public static void getscreenshot(WebDriver driver)
	{
		try
		{
			String path="./screenshot/";
			Date d= new Date();
			String d1 = d.toString();
			String d2 = d1.replace(":","-");
			TakesScreenshot tss=(TakesScreenshot)driver;
			File srs = tss.getScreenshotAs(OutputType.FILE);
			File dst=new File(path+d2+".png");
			FileHandler.copy(srs, dst);
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}

	}
}
