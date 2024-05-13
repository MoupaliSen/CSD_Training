package seleniumbasivs.MouseHover;

//import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsVsAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\2317616\\eclipse-workspace\\CSDQEASD1234Selenium\\Browser\\msedgedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		WebElement button =driver.findElement(By.xpath("//span[]"));

		Actions act = new Actions(driver);
		//act.contextClick(button).build().perform();
		
		
		Action myaction = act.contextClick(button).build(); //creating action and storing it in variable
		myaction.perform();//completing action
		
		
		
		//act.contextClick(button).perform();
		

	}

}
