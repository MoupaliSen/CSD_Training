package seleniumbasivs.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoSuggestDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\2317616\\eclipse-workspace\\CSDQEASD1234Selenium\\Browser\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='q']")).sendKeys(args);
		
		Thread.sleep(3000);
		//total number of options
		List<WebElement> list =driver.findElements(By.xpath("//div[contains(@class,'wM74d')]//span"));

		System.out.println("Number of suggestions:"+list.size());
		
		//each and every value from suggestion
		//print in console window
		
		for(int i=0;i<list.size();i++)
		{
			String text = list.get(i).getText();
			
			if(text.equals("selenium"))
			{
				list.get(i).click();
				break;
			}
			
		}
		
	}

}
