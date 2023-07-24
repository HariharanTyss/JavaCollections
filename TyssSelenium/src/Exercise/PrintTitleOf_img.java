package Exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTitleOf_img {

	public static void main(String[] args)
	{
		// Browser Set up
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		//navigate to the url
		driver.get("https://demowebshop.tricentis.com/");
		
		List<WebElement> ele = driver.findElements(By.xpath("//img[@alt]"));
		
		for (int i = 0; i < ele.size(); i++) {
			 WebElement text = ele.get(i);
			System.out.println("Title "+i+":"+text.getAttribute("alt"));
		}
		driver.quit();
	}

}
