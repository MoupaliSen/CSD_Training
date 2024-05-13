package seleniumbasivs.MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\2317616\\eclipse-workspace\\CSDQEASD1234Selenium\\Browser\\msedgedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement button =driver.findElement(By.xpath("//span[]"));
		Actions act = new Actions(driver);
		
		//right click
		act.contextClick(button).perform();
		
		driver.findElement(By.xpath("//span[normalize-space()='copy']")).click();  //copy
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		
		
		
	}

}
