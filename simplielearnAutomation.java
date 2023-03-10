package seleniumWDBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class simplielearnAutomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver ch= new ChromeDriver();
		ch.get("https://www.simplilearn.com/");
		ch.manage().window().maximize();
		
	}

}
