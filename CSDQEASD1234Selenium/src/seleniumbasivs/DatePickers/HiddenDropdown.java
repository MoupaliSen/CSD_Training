package seleniumbasivs.DatePickers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HiddenDropdown {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\2317616\\eclipse-workspace\\CSDQEASD1234Selenium\\Browser\\msedgedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//Drop-down
		
		driver.findElement(By.xpath("")).click(); //open the drop-down box
		
	    List<WebElement> options =driver.findElements(By.xpath("//div[@role='listbox'//span]"));
		
		for(WebElement option:options)
		{
			if(option.getText().equals("Finance Manager"))
			{
				option.click();
				break;
			}
		}
	}
	
	

}
