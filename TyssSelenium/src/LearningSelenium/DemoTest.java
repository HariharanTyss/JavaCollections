package LearningSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoTest {

	public static void main(String[] args) throws InterruptedException 
	{
		//Set the 
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		
		ChromeOptions option =new ChromeOptions();
		//option.addArguments("--headless");
		option.addArguments("--disable-notifications");
		option.addArguments("--start-maximized");
		
		WebDriver driver=new ChromeDriver(option);
		//WebDriver driver1=new FirefoxDriver();
		
		
		driver.get("https://www.easemytrip.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		//driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		System.out.println(driver.getTitle());
		driver.quit();
		
		

	}

}
