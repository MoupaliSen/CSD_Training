package seleniumbasivs.DatePickers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\2317616\\eclipse-workspace\\CSDQEASD1234Selenium\\Browser\\msedgedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("15/10/2023");//mm/dd/yyyy
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();//will open the date picker
		
		String year ="2023";
		String month ="March";
		String date ="25";
		
		//select month & year
		while(true)
		{
			String  mon = driver.findElement(By.xpath("//span[@class='ui-datepicker-month'")).getText();
			String  yr = driver.findElement(By.xpath("//span[@class='ui-datepicker-year'")).getText();
			
			if(mon.equals(month) && yr.equals(year))
			{
				break;
			}
			
			//driver.findElement(By.xpath("//span[@class='icon']")).click(); //future date for next button
			driver.findElement(By.xpath("//span[@class='icon']")).click(); //past date for previous button

			
			}
		
		List<WebElement> allDates =driver.findElements(By.xpath("//table=[@class='ui-datepicker-calender']//td"));
		
		//using for each loop for date 
		
		for(WebElement dt:allDates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
		
		//using normal for loop for date
		
		for(int i=0;i<allDates.size();i++)
		{
			if(allDates.get(i).getText().equals(date))
			{
				allDates.get(i).click();
				break;
			}
		}
		
	}

}
