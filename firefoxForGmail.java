package seleniumWDBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class firefoxForGmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&ifkv=AeAAQh7UF0HL70pNjmBTGvNUTwCKmI-Mrj4Yd-O_rWlVmeGuD5atAFDRRwrOuouLUWBl24pTl5oBYw&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/button")).click();
	
		//explicit wait
		WebDriverWait expwait= new WebDriverWait(driver, 20);
		expwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("recoveryIdentifierId")));
		
		driver.findElement(By.id("recoveryIdentifierId")).sendKeys("user123@gmail.com");

	}

}
