package vijay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassBasics {
	public static void main(String[] args) throws InterruptedException {
		// Browser Set up
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/jewelry?orderby=5&pagesize=12");
		
		//step 1--->identify the drop down
		WebElement dropDown = driver.findElement(By.id("products-orderby"));
		
		//step 2--->create an object for select class and pass DD ref
		Select sel=new Select(dropDown);
		
		//step 3-->use the non static methods
		
		System.out.println(sel.isMultiple());
		
		
		Thread.sleep(4000);
		//driver.quit();
	}

}
