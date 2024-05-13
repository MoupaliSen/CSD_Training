package seleniumbasivs.javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JavascripExcecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.edge.driver","C:\\Users\\2317616\\eclipse-workspace\\CSDQEASD1234Selenium\\Browser\\msedgedriver.exe");
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new EdgeDriver();
				
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				//driver.manage().window().maximize();
				
				driver.switchTo().frame(0);
				
				JavascriptExecutor js = (JavascriptExecutor)driver;
				
				
				//firstname
				WebElement inputbox = driver.findElement(By.id("result_textfield-1"));
				js.executeScript("arguments[0].SetAttribute('value','john')", inputbox);
				
				//radio button
				
				WebElement male_rd =driver.findElement(By.id("result_radiobuttob"));
				//male_rd.click(); //throw ClickInterruptException
				js.executeScript("arguments[0].click()", male_rd);
				
				//checkboxes
				WebElement checkbox =driver.findElement(By.id("resultxpath"));
				js.executeScript("arguments[0].click()",checkbox );
				
				//submitbutton
				WebElement button =driver.findElement(By.id("submit"));
				js.executeScript("argument[0].click()", button);

				
				
				

	}

}
