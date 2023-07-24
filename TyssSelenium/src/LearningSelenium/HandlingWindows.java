package LearningSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.shoppersstack.com/products_page/92");
		
		//To Get Address of current page
		String parent_address = driver.getWindowHandle();
		System.out.println(parent_address);
		Thread.sleep(1000);
		driver.findElement(By.id("compare")).click();
		
		//to get address of childAddress
		Set<String> child_address = driver.getWindowHandles();
		System.out.println(child_address);
		
		//validate whether it is Flipkart window then close all including parent
		for(int i=0;i<=child_address.size();i++) {
			
			driver.switchTo().window(parent_address);
			Thread.sleep(1000);
			driver.close();
		}
		//driver.close();
	}

}
