package seleniumWDBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonIphoneMobilePhone {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone13");
driver.findElement(By.id("nav-search-submit-button")).click();

//driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
//driver.findElement(By.xpath("//input[@class='a-button-input attach-dss-atc']")).click();
//driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
driver.get("https://www.amazon.in/Apple-iPhone-13-128GB-Midnight/dp/B09G9HD6PD/ref=sr_1_1_sspa?keywords=iphone%2B13&qid=1673860944&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1");
driver.findElement(By.id("add-to-cart-button")).click();
	}

}
