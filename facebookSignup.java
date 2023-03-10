package seleniumWDBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookSignup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.linkText("Create New Account")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.name("firstname")).sendKeys("manu");
		driver.findElement(By.name("lastname")).sendKeys("gowda");
		driver.findElement(By.name("reg_email__")).sendKeys("manugowda@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("manugowda@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("password@123");
		//dropdowns
		WebElement day= driver.findElement(By.id("day"));
		Select s = new Select(day);
		Thread.sleep(1000);
		s.selectByVisibleText("27");
		
		WebElement month= driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		Thread.sleep(1000);
		s1.selectByVisibleText("Apr");
		
		WebElement year= driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		Thread.sleep(1000);
		s2.selectByVisibleText("1996");
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.name("websubmit")).click();
	}

}
