package Exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks {

	public static void main(String[] args)
	{
		// Browser Set up
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		//navigate to the url
		driver.get("https://www.easemytrip.com/");
		
		//Get All the links
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		
		//Print Count of links
		int count=alllinks.size();
		System.out.println("Count is: "+count);
		
		//Print all Text of the Links
		for(int i=0;i<count;i++) {
			String text = alllinks.get(i).getText();
			System.out.println(text);
		}
		
		driver.quit();
		
		

	}

}
