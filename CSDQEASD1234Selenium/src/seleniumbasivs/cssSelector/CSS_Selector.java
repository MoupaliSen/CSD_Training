package seleniumbasivs.cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CSS_Selector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\2317616\\eclipse-workspace\\CSDQEASD1234Selenium\\Browser\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.nopcommerce.com/en/demo");
		driver.manage().window().maximize();
		
		//tag id [by using "#" operator]
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("MacBook");
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("MacBook");
		
		
		//tag class [by using "." operator]
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("MacBook");
		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("MacBook");
		
		driver.findElement(By.cssSelector("div._6lux")).click();

		
		//tag attribute[by using "input[name="q"]" operator]
		driver.findElement(By.cssSelector("input[name='q]")).sendKeys("MacBook");
		driver.findElement(By.cssSelector("[name='q]")).sendKeys("MacBook");
		
        //tag class attribute[by using "input.search-box-text[name ="q"]" operator]
		driver.findElement(By.cssSelector("input.search-box-text[name ="q"]")).sendKeys("MacBook");
	
		
		

	}
	
	
	

}
