package seleniumbasivs.Package;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\2317616\\eclipse-workspace\\CSDQEASD1234Selenium\\Browser\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		System.out.println("title of the page"+driver.getTitle());
		System.out.println("Current URL"+driver.getCurrentUrl());
		System.out.println("current pageSource"+driver.getPageSource());
		
		String ps =driver.getPageSource();
		System.out.println(ps.contains(ps));
		System.out.println(ps.contains("html"));
		
		System.out.println(driver.getWindowHandle());
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("OrangeHRM,Inc")).click();
		
		Set<String> windowsids = driver.getWindowHandles();
		for(String winid:windowsids)
		{
			System.out.println(winid);
			
		}
		
		
		

		
	}

}
