package seleniumbasivs.Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\2317616\\eclipse-workspace\\CSDQEASD1234Selenium\\Browser\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriver mywait = new WebDriverWait(driver,TimeUnit.);
		driver.get("");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='click for JSConfirm']")).click();
		
		driver.switchTo().alert().accept();
		
		Alert alertwindow =driver.switchTo().alert();
		//alertwindow = mywait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alertwindow.getText());
		
		alertwindow.accept(); //this will close alert window using "ok" button
		alertwindow.dismiss();//this will close window with using "cancel" button
		
		//alert with input box
		driver.findElement(By.xpath("//button[normalize-space()='click for JS Prompt']"));
		//Alert alertwindoww = driver.switchTo().alert();
		//System.out.println(alertwindow.getText());
		alertwindow.sendKeys("Welcome");
		alertwindow.accept();
		
		//validation
		String act_text =driver.findElement(By.xpath("//p[@id='result']"));
		String exp_text ="you entered:welcome";
		if(act_text.equals(exp_text))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");

		}
		alertwindow.dismiss();
		
		//alert with no elements
		Alert alertwindowww = driver.switchTo().alert();
		
		
		
		
		
	}

}
