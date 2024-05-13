package seleniumbasivs.MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.intersactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\2317616\\eclipse-workspace\\CSDQEASD1234Selenium\\Browser\\msedgedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		WebElement f1 =driver.findElement(By.xpath("//input[]@id ='field'"));
		f1.clear();
		f1.sendKeys("welcome");
		
		WebElement button =driver.findElement(By.xpath("//button[normalize-space() ='copy Text']"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(button).perform();
		
  //how to capture the text from textbox
		//validation
		WebElement f2 =driver.findElement(By.xpath("//input[]@id ='field2'"));
		
		//String copiedtext = f2.getText(); //it will not work
		String copiedtext = f2.getAttribute("value");
		
		System.out.println("copied text is:"+copiedtext);
		
		if(copiedtext.equals("welcome"))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
			
		}

		
		
		

	}

}
