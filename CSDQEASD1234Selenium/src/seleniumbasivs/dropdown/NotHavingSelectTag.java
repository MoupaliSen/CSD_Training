package seleniumbasivs.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class NotHavingSelectTag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\2317616\\eclipse-workspace\\CSDQEASD1234Selenium\\Browser\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("");
		driver.manage().window().maximize();
		
		//clicking on the drop down
		List<WebElement> options=driver.findElements(By.xpath("//button[contains(@class,'multiselect')]"));
		
		
		//total number of options
		System.out.println("total numberc of options "+options.size());
		
      //print all the options from drop down
		///using normal for loop
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		//select options from drop down
		for(int i=0;i<options.size();i++)
		{
			String option = options.get(i).getText();
			if(options.equals("java") || options.equals("python"))
			{
				options.get(i).click();
				break;
			}
		}
		//enhance for loop
		for(WebElement option:options)
		{
			String text = option.getText();
			if(text.equals("java")||text.equals("python"))
			{
				option.click();
				
			}
		}
		
	}

}
