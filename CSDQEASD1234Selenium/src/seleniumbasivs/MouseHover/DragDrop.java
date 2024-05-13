package seleniumbasivs.MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\2317616\\eclipse-workspace\\CSDQEASD1234Selenium\\Browser\\msedgedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		//capture source and target element -->rome to italy
		
		WebElement rome =driver.findElement(By.xpath("//div[@calss='']"));
		WebElement italy =driver.findElement(By.xpath("//div[@calss='']"));
		
		act.dragAndDrop(rome, italy).perform();
		
		//capture source and target element -->washinton to usa
		WebElement washinton =driver.findElement(By.xpath("//div[@calss='']"));
		WebElement usa =driver.findElement(By.xpath("//div[@calss='']"));
		
		act.dragAndDrop(washinton, usa).perform();
		
		
		
		



		

	}

}
