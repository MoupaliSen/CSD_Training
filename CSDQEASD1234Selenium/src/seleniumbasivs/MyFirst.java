package seleniumbasivs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MyFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\2317616\\eclipse-workspace\\CSDQEASD1234Selenium\\Browser\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//driver.manage().timeouts().implicitlyWait(Duartion.ofSeconds(10));
	System.out.println("title of web page"+ driver.getTitle());
	}

}

