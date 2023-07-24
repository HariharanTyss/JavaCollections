package LearningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlinhgMouseAction2 {

	public static void main(String[] args) 
	{
		//Browser Set ups
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		//navigate to url
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");


		//find the elemnt to mouse hover and store it in container
		WebElement element = driver.findElement(By.partialLinkText("COMPUTERS"));

		//Create the Object for Actions class
		Actions ac=new Actions(driver);

		//Performing Mouse Action
		ac.moveToElement(element).perform();

	}

}
