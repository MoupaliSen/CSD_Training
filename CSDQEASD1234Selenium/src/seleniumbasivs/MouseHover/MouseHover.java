package seleniumbasivs.MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\2317616\\eclipse-workspace\\CSDQEASD1234Selenium\\Browser\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement desktops = driver.findElement(By.xpath("//a[normalize-space() ='Desktops']"));
		WebElement mac = driver.findElement(By.xpath("//a[normalize-space() ='Mac (1)']"));
		
		Actions act = new Actions(driver);
		
		//Mouse hover 
		
		act.moveToElement(desktops).moveToElement(mac).click().build().perform(); //creating action then perform
		
		act.moveToElement(desktops).moveToElement(mac).click().perform(); // perform action
		
		
		
		
	}

}
