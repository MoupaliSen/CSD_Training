package seleniumbasivs.javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollingJavaScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\2317616\\eclipse-workspace\\CSDQEASD1234Selenium\\Browser\\msedgedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//Vertical scroll down
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//scroll-down page by pixel
		js.executeScript("window.scrollBy(0,300)", "");
		System.out.println(js.executeScript("return window.pageYOffeset", ""));
		
		
		//scroll-down the page till the element is present
		WebElement flag =driver.findElement(By.xpath("//img[@alt='Flag ofIndia']"));
		js.executeScript("arguments[0].scrollIntoView();", flag);
		System.out.println(js.executeScript("return window.pageYOffset;"));
				
		//scroll down till end of the document
		js.executeScript("window.scrollBy(0,document.body.scrollHeight");
		System.out.println(js.executeScript("return window.pageYOffset;"));

		//Thread.sleep(3000);
		
		//go back to initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		
		//horizontal scrolldown pageYOffset is changed to pageXOffset
		js.executeScript("window.scrollBy(300,0)", "");
		System.out.println(js.executeScript("return window.pageXOffeset", ""));
		
		
		

	}

}
