package seleniumWDBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathExamples {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		driver.manage().window().maximize();

//xpath element locator
		//absolute and relative xpath
		
		//absolute xpath
		driver.findElement(By.xpath("//html/body/main/section[1]/div/div/form/div[2]/div[1]/input")).sendKeys("manumanasa");
		driver.findElement(By.xpath("//html/body/main/section[1]/div/div/form/div[2]/div[2]/input")).sendKeys("password123");
		
		//absolute xpath
		driver.findElement(By.xpath("//button[@class='sign-in-form__submit-button']")).click();
		// //*[@id="main-content"]/section[1]/div/div/form/button
		driver.findElement(By.xpath("//a[@class='nav__button-tertiary btn-md btn-tertiary']")).click();
		// //a[@class='nav__button-tertiary btn-md btn-tertiary']
		//  //html/body/nav/div/a[1]
	}

}
