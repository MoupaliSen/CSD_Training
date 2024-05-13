package seleniumbasivs.MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LocationOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\2317616\\eclipse-workspace\\CSDQEASD1234Selenium\\Browser\\msedgedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.manage().window().maximize();
		
		
		//location of the element is changing by the size of the webpage
		WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));
		
		driver.manage().window().maximize();
		System.out.println("After maximizing window"+logo.getLocation()); //(660,185)
		
		driver.manage().window().minimize();
		System.out.println("After minimizing window"+logo.getLocation()); //(240,167)

		
		driver.manage().window().fullscreen();
		
		System.out.println("After full screen window"+logo.getLocation()); //(660,250)
		
		Point p = new Point(100,100);
		driver.manage().window().setPosition(p);
		
		System.out.println("After setting window 100 * 100"+logo.getLocation()); //(660,250)

		
		p = new Point(50,50);
		driver.manage().window().setPosition(p);
		
		System.out.println("After setting window 50 * 50"+logo.getLocation()); //(660,250)
		

	}

}
