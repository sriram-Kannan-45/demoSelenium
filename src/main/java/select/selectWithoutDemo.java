package select;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class selectWithoutDemo {

	public static void main(String[] args) throws InterruptedException 
	
	{
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/select.xhtml");
		
		WebElement ser = driver.findElement(By.xpath("//input[@id=\"j_idt87:auto"
				+ "-complete_input\"]"));
		ser.sendKeys("Selenium WebDriver");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		List<WebElement> options = wait.until(ExpectedConditions.
				visibilityOfAllElementsLocatedBy
				(By.xpath("//*[@id=\"j_idt87:auto-complete_panel\"]/ul")));
		
		for(WebElement ob : options)
		{
			for (WebElement ob1 : ob.findElements(By.tagName("li"))) 
			
			{
				if (ob1.getText().equals("AWS") || ob1.getText().equals
						("Selenium WebDriver") || ob1.getText().equals("Appium"))
				{
					ob1.click();
					
				}
				
				
			}
		}
		
		
	}

}
