package LearningSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown 
{

	public static void main(String[] args) throws InterruptedException {
		// Browser Set up
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		//navigate to the url
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");




		//find the dropdown and Store in container
		WebElement drpdwn = driver.findElement(By.id("dropdown-class-example"));

		//To generate UnexpectedTagnameException
		//WebElement drpdwn = driver.findElement(By.id("autocomplete"));


		//Create object for select Class
		Select sel=new Select(drpdwn);


		//To check Whether its a Multiple Select or not
		boolean result = sel.isMultiple();
		if (result) {
			System.out.println("Multiple Select");
		}
		else {
			System.out.println("Not a Multiple Select");
		}
		//Select by Index
		sel.selectByIndex(0);

		//Too generate UnsupportedOperationException
		//		Thread.sleep(3000);
		//		sel.deselectByIndex(0);

		Thread.sleep(1000);
		sel.selectByValue("option2");
		Thread.sleep(1000);
		sel.selectByVisibleText("Option3");
		Thread.sleep(1000);

		//Get and Store all option 
		List<WebElement> alloption = sel.getOptions();

		//To Print all options 
		for (int i = 0; i < alloption.size(); i++) {
			alloption.get(i).click();
			Thread.sleep(1000);
			String text = alloption.get(i).getText();
			System.out.println(text);
		}
		driver.quit();
	}
}
