package seleniumbasivs.keyboardActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

public class TabAndWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\2317616\\eclipse-workspace\\CSDQEASD1234Selenium\\Browser\\msedgedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.manage().window().maximize();
		
		//switch to new window in selenium 4
		
		driver.switchTo().newWindow(WindowType.TAB); //opens new tab
		driver.switchTo().newWindow(WindowType.WINDOW); //opens new window

		
		
		driver.get("website url");
		
		
		

	}

}
