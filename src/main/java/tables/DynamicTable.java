package tables;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class DynamicTable 
{

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		
		WebElement email = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		email.sendKeys("2k22aids46@kiot.ac.in");
		
		WebElement pass = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		pass.sendKeys("sriram123@");
		
		driver.findElement(By.xpath("//button[@id=\"submit\"]")).click();
		
		
		
		List<WebElement> col_datas = driver.findElements(By.xpath("//table[@id=\"myTable\"]//th"));
		
		int col = col_datas.size();
		
		List<WebElement> row_datas =  driver.findElements(By.xpath("//table[@id=\"myTable\"]//tr"));
		
		int row = row_datas.size();
		
		WebElement data ;
		
		for(int i = 1 ; i<=row ; i++)
		{
			for (int j = 1 ; j<=col ; j++)
			{
				if (i==1)
				{
					data = driver.findElement(By.xpath("//table[@id=\"myTable\"]//thead/tr/th["+j+"]"));
					System.out.print(data.getText()+" ");
				}
				
				else
				{
					data = driver.findElement(By.xpath("//table[@id=\"myTable\"]//tbody//tr["+(i-1)+"]/td["+j+"]"));
					System.out.print(data.getText()+" ");
				}
			}
			System.out.println();
		}
}
}