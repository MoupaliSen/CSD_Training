package seleniumbasivs.SleepStatement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SleepStatement {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\2317616\\eclipse-workspace\\CSDQEASD1234Selenium\\Browser\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		Thread.sleep(4000);	

	}

}
