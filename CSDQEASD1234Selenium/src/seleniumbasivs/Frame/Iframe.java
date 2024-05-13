package seleniumbasivs.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver","C:\\Users\\2317616\\eclipse-workspace\\CSDQEASD1234Selenium\\Browser\\msedgedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//")).click();  
		
		WebElement outer =driver.findElement(By.xpath("//")); //outer iframe
		driver.switchTo().frame(outer);
		
		WebElement inner = driver.findElement(By.xpath("//"));
		driver.switchTo().frame(inner);
		
		driver.findElement(By.xpath("//inputbox")).sendKeys("Welcome");
		

	}

}
