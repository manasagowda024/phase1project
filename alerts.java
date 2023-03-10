package seleniumWDBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
//driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
//driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
driver.switchTo().alert().sendKeys("selenium class");
driver.switchTo().alert().accept();

		//driver.switchTo().alert().accept();



	}

}
