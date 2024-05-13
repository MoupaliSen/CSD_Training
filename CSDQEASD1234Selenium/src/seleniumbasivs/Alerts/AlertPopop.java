package seleniumbasivs.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertPopop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\2317616\\eclipse-workspace\\CSDQEASD1234Selenium\\Browser\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebDriver mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("");
		driver.manage().window().maximize();
		String text =driver.findElement(By.xpath("//p[contains(text(),'congratulations!')]")).getText();
		if(text.contains("congratulations"))
		{
			System.out.println("successfull login");
		}
		else
		{
			System.out.println("failed login");
	
		}
		
		
	}

}
