package seleniumWDBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchFirefoxDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
//C:\Users\DELL 5518(492574825)\Downloads\geckodriver-v0.32.0-win32//geckodriver.exe -can use this link also
		//firefox installer must be downloadeed
	}

}
