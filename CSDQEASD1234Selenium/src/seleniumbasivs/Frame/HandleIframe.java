package seleniumbasivs.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleIframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\2317616\\eclipse-workspace\\CSDQEASD1234Selenium\\Browser\\msedgedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//1st frame
		
		driver.switchTo().frame("packageListFrame"); //name of the frame
		driver.findElement(By.xpath("//")).click();
		driver.switchTo().defaultContent();//go back from frame
		Thread.sleep(3000);
		
		//2nd frame
		
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//")).click();
		driver.switchTo().defaultContent();//go back from frame
		Thread.sleep(3000);
		
		//3rd frame
		
		driver.switchTo().frame("ClassFrame");
		driver.findElement(By.xpath("//")).click();
		
	}

}
