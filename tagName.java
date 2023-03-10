package seleniumWDBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tagName {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https:demo.guru99.com/test/newtours/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		String[] linktext= new String[links.size()];
		
		int i=0;
		for(WebElement e:links) { //linktext[0]= home,linktext[1]= flights
		linktext[i]=e.getText();
		i++;
			}
		
		for(String t:linktext) {
			driver.findElement(By.linkText(t)).click();
			String at = driver.getTitle();
			if (at.equals("Under Construction:Mercury Tours")) {
				System.out.println(t+ "is working");
			}else {
				System.out.println(t+ "is not working");
			}
			driver.navigate().back();
		}
	}

}
