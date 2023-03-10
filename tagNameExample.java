package seleniumWDBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagNameExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		List<WebElement> listofelements = driver.findElements(By.tagName("a"));
		System.out.println(listofelements.size());
		for (WebElement eachlink : listofelements) {// for each
			String strObj = eachlink.getText();
			System.out.println(strObj);

		}
	}

}
