package seleniumWDBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementLocatorsLinkden {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		driver.manage().window().maximize();

		// element locator id 
		//WebElement username= driver.findElement(By.id("session_key"));
		//username.sendKeys("manu@gmail.com")
		driver.findElement(By.id("session_key")).sendKeys("manasa@gmail.com");
		
		//element locator name
		driver.findElement(By.name("session_password")).sendKeys("password12");
		
		//element locator classname
		driver.findElement(By.className("sign-in-form__submit-button")).click();
		
		// element locator linktest
		//driver.findElement(By.linkText("Forgot password?")).click();
		
		//element locator partial linktext
		driver.findElement(By.partialLinkText("Forgot")).click();
	}

}
