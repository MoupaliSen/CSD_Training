package seleniumbasivs.screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\2317616\\eclipse-workspace\\CSDQEASD1234Selenium\\Browser\\msedgedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//capture full page screenshot --selenium 3 &4
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File targetlocation = new File("C:\\Users\\2317616\\eclipse-workspace\\CSDQEASD1234Selenium\\Screenshots\\fullpage.png");
		
	    FileHandler.copy(src, targetlocation);
	    
	   
	    
	    //capture screenshot of specific area of webpage -- selenium 4
	    WebElement featureproducts =driver.findElement(By.xpath("//div[@class='specifi page xpath']"));
	    File src1 =featureproducts.getScreenshotAs(OutputType.FILE);
		File trg1 = new File("C:\\Users\\2317616\\eclipse-workspace\\CSDQEASD1234Selenium\\Screenshots\\featureproducts.png");
	    FileHandler.copy(src1, trg1);
		
	}

}
