package seleniumWDBasics;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class linkdenWaitExamples {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Forgot password?")).click();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		//explicit wait
		WebDriverWait expwait= new WebDriverWait(driver, 20);
		expwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		
		//fluent wait		
		@SuppressWarnings("deprication")
		Wait fluwait= new FluentWait(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(5,TimeUnit.SECONDS ).ignoring(NoSuchElementException.class);
		fluwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		
		
		driver.findElement(By.id("username")).sendKeys("user123.gmail.com");
		driver.close();//close the current instance
		driver.quit();//close the browser
	}

}
