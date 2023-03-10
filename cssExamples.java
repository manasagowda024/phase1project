package seleniumWDBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssExamples {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();

		//tagname[attribute='value']
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("manumanasa");
		
		//tagname.classvalue
		//driver.findElement(By.cssSelector("input._aa4b _add6 _ac4d")).sendKeys("password123");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("password123");
		
		
		driver.findElement(By.cssSelector("button[class='_acan _aiit _acap _aijb _acas _aj1-']")).click();
		
		//tagname#id_value
		//tagname[attribute='value']
		//tagname.classvalue
	}

}
