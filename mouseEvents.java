package seleniumWDBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseEvents {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		Actions act = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
		act.moveToElement(we).build().perform();
////*[@id="nav-al-signin"]
		////*[@id="nav-al-your-account"]/a[1]/span
		driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/a[1]/span")).click();
	}

}
