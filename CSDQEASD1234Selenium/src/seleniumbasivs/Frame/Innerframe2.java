package seleniumbasivs.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Innerframe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\2317616\\eclipse-workspace\\CSDQEASD1234Selenium\\Browser\\msedgedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult"); //switch to outer frame
		driver.switchTo().frame(0); //switch to inner iframe
		
		System.out.println("Text present inside the inner frame"+driver.findElement(By.xpath("//h1")));
		
		driver.switchTo().parentFrame();
		
		String text =driver.findElement(By.xpath("//")).getText();
		System.out.println("Text present in outer iframe"+text);
	}

}
