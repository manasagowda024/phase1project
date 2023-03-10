package seleniumWDBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonProject {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		// to search text box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("lenovo mobiles");
		// search button
		driver.findElement(By.id("nav-search-submit-button")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// product list
		List<WebElement> prodlist1 = driver
				.findElements(By.xpath("//span[@class= 'a-size-medium a-color-base a-text-normal']"));
		// price list
		// List<WebElement> pricelist1=
		// driver.findElements(By.xpath("//span[@class='a-price-whole']"));

		String[] prodlist = new String[prodlist1.size()];
		int i = 0;
		for (WebElement eachprice : prodlist1) {
			prodlist[i] = eachprice.getText();
			i++;
		}
		for (String product : prodlist) {
			driver.findElement(By.linkText(product)).click();
			System.out.println("product" + product);
			try {
				String price = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
				System.out.println("price" + price);
				System.out.println("URL is valid");
			} catch (Exception e) {
				System.out.println("price:Null");
				System.out.println("URL is valid");
			} finally {
				driver.navigate().back();
			}

		}
	}

}
