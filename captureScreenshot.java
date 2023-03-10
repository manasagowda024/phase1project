package seleniumWDBasics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class captureScreenshot {
	WebDriver driver;//global variable
	@Test
	public  void openBrowser() throws IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		captureScreenshot();
		

	}
//need to download poi bin files
	//capturescreenshot
	private void captureScreenshot() throws IOException {
		java.io.File ss= (java.io.File) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ss,new java.io.File( "E://fileupload//capture//testscreenshot.jpg"));
		
		
	}

}
