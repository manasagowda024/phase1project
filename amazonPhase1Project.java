package seleniumWDBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonPhase1Project {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		// to search text box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("lenovo mobiles");
		// search button
		driver.findElement(By.id("nav-search-submit-button")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//fetching the products in productlist
		List<WebElement> prodlist = driver.findElements(By.xpath("//span[@class= 'a-size-medium a-color-base a-text-normal']"));
		//fetching the  pricelist in pricelist1
		List<WebElement> pricelist1 = driver.findElements(By.xpath("//div[@class='sg-col sg-col-4-of-12 sg-col-8-of-16 sg-col-12-of-20 s-list-col-right']"+"//div[@class='sg-col sg-col-4-of-12 sg-col-4-of-16 sg-col-4-of-20']/div"));
		
//initialing an array pricelist of size "pricelist1" using general priceclass for all products
		String []pricelist= new String[pricelist1.size()];
		
		//looping for each common price class= number of products
		int i = 0;
		for (WebElement e : pricelist1) {
			System.out.println(prodlist.get(i).getText());
			try {
				pricelist[i] = e.findElement(By.className("a-price-whole")).getText();
				//fetching the price for that particular product
				
				//using try catch handling the exception if incase the price class "a-price-whole" of product is not present
				if (pricelist[i] != null) {
					System.out.println(pricelist[i]);
				}
			} catch (Exception e1) {
				pricelist[i] = null;
				System.out.println(pricelist[i]);
			}
			i++;

		}
		
		//this code is for handling the child window and parent window .and clicking each product to verify wheather the link is working or not
		for (WebElement e : prodlist) {
			String mainwindowhandle = driver.getWindowHandle();
			e.click();
			String str = e.getText();
			for (String childwindowhandle : driver.getWindowHandles()) {
				//if window handle is not main window handle then close it
				if (!childwindowhandle.equals(mainwindowhandle)) {
					driver.switchTo().window(childwindowhandle);
					String title = driver.getTitle();
					if (title.contains(str)) {
						System.out.println(str + "is working");
					} else {
						System.out.println(str + "is not working");
					}
					//close child windows
					driver.close();
				}

			}
			//switch back to main window
			driver.switchTo().window(mainwindowhandle);
		}
	}
}