package seleniumbasivs.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownSelectTag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\2317616\\eclipse-workspace\\CSDQEASD1234Selenium\\Browser\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("");
		driver.manage().window().maximize();
		
		//how select option from drop down using select class
		
		WebElement drpCountryEle = driver.findElement(By.xpath("//select[@id='input-country']"));
		Select drpcountry = new Select(drpCountryEle);
		
		//selecting an option from drop down
		drpcountry.deselectByVisibleText("Australia");
		drpcountry.deselectByValue("1"); //value means attribute of the element  use this if value attribute is available
		drpcountry.deselectByIndex(3); //count the all options means input
		
		drpcountry.selectByVisibleText("India");
		drpcountry.selectByValue("1");
		drpcountry.selectByIndex(1);
		
		//total options in drop down
		List<WebElement> options = drpcountry.getOptions();
		System.out.println("total number of options:"+options.size());
		
		//print options in console window
		for(int i=0;i<options.size();i++)
		{
          System.out.println("total number of options"+options.get(i).getText());
	
        }
		
		//using enhance loop
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
		

	}

}
