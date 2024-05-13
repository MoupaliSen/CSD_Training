package seleniumbasivs.Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\2317616\\eclipse-workspace\\CSDQEASD1234Selenium\\Browser\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.nopcommerce.com/en/demo");
		driver.manage().window().maximize();
        Thread.sleep(5000);
		//driver.close();
        driver.findElement(By.linkText("OrangeHRM,Inc")).click();
        
        Thread.sleep(5300);
        driver.quit();
        
        
        

		

	}

}
