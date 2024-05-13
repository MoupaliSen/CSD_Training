package seleniumbasivs.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\2317616\\eclipse-workspace\\CSDQEASD1234Selenium\\Browser\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
			//open the app	
		driver.get("http://www.automationpractice.pl/index.php");
        driver.manage().window().maximize();
        
        //search box
        driver.findElement(By.id("search_query form-control ac_input")).sendKeys("T-Shirts");
        driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("abac@gmail.com");
        //search button
        driver.findElement(By.name("Submit-serch")).click();
        
        //link text
        driver.findElement(By.linkText("Printed chiffon dress")).click();
        
        driver.findElement(By.linkText("Forgotten password?")).click();
        
        //partial Link text
        driver.findElement(By.partialLinkText("Printed Chiffon")).click();
        //Home-slider
       List<WebElement> sliders= driver.findElements(By.className("homeslider-container"));
       
       //how many sliders available
       System.out.println("Number of sliders:" +sliders.size());
       
       //Total numbers of images on home page
       List<WebElement> images = driver.findElements(By.tagName("img"));
       System.out.println("Number of images:"+images.size());
        
        //Find total number of links
       List<WebElement> links = driver.findElements(By.tagName("a"));
       System.out.println("Number of links:"+links.size());
       
       driver.quit();
       

	}

}
