package seleniumbasivs.MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\2317616\\eclipse-workspace\\CSDQEASD1234Selenium\\Browser\\msedgedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//Min_slider

		//source(x,y) and destination(x,y)
		
		Actions act = new Actions(driver);
		
		WebElement min_silder =driver.findElement(By.xpath("//span[1]"));
		
		System.out.println("Current location :"+min_silder.getLocation());   //((59,259) (x,y)
		
		act.dragAndDropBy(min_silder, 100, 259).perform();
		
		System.out.println("After moving slider location :"+min_silder.getLocation());   //((79,259) (x,y)

		//Max_Slider
		
		WebElement max_slider = driver.findElement(By.xpath("//span[2]"));
		
		System.out.println("Current location :"+max_slider.getLocation());   //((796,250) (x,y)
		
		act.dragAndDropBy(max_slider, -100, 250).perform();
		
		System.out.println("After moving slider location :"+max_slider.getLocation());   //((59,259) (x,y)

		
	}

}
