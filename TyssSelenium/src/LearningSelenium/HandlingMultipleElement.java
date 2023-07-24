package LearningSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElement {

	public static void main(String[] args) 
	{
		// Browser Set up
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//navigate to the url
		driver.get("https://demowebshop.tricentis.com/");
		
		//Finding the radio buttons
		List<WebElement> allradiobtn = driver.findElements(By.xpath("//input[@type='radio']"));
		
		for(int i=0;i<allradiobtn.size();i++)
		{
			allradiobtn.get(i).click();
		}
		driver.close();
		
		
		System.out.println("Handled Multilple Elements");
	}

}
