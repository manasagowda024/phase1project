package seleniumWDBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownsExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.manage().window().maximize();

		WebElement de=driver.findElement(By.id("dropdown"));
		 Select s= new Select(de);
		 s.selectByValue("2");
		 
		 
	}

}
