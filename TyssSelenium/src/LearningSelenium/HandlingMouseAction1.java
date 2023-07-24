package LearningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseAction1
{

	public static void main(String[] args) throws InterruptedException 
	{
		//Browser Set ups
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		//navigate to url
		driver.get("https://demowebshop.tricentis.com/");


		//find the elemnt to mouse hover and store it in container
		WebElement element = driver.findElement(By.partialLinkText("COMPUTERS"));

		//Create the Object for Actions class
		Actions ac=new Actions(driver);

		//Performing Mouse Action
		ac.moveToElement(element).perform();

		Thread.sleep(3000);
		//Mouse hovering to hidden element and clicking
		ac.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]"))).click().perform();

		
		//quit the Browser
		driver.quit();
		
		System.out.println("Mouse Action are Automated");
	}
}
