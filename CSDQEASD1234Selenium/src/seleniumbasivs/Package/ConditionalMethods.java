package seleniumbasivs.Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\2317616\\eclipse-workspace\\CSDQEASD1234Selenium\\Browser\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.nopcommerce.com/en/demo");
		driver.manage().window().maximize();
        
		//isDisplayed()
		WebElement logo =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("display of logo"+logo.isDisplayed());
		
		boolean status =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println(status);
		
		//isEnaled()
		WebElement searchbox =driver.findElement(By.xpath("//input[@id='small-searchterms]"));
		System.out.println("Display Status"+searchbox.isDisplayed());
		System.out.println("Enable status"+searchbox.isEnabled());
		
		//isSelected()
		WebElement male_rd =driver.findElement(By.xpath("//input[@id='gender-male]"));
		WebElement female_rd =driver.findElement(By.xpath("//input[@id='gender-female]"));
         //Before selection
		System.out.println("Before selection ");
		System.out.println(male_rd.isSelected());//false
		System.out.println(female_rd.isSelected());//false
		
		//After selection
		System.out.println("After selection of male radio button");
		System.out.println(male_rd.isSelected());//true
		System.out.println(female_rd.isSelected());//false
		
		
		System.out.println("After selection of female radio button");
		System.out.println(male_rd.isSelected());//false
		System.out.println(female_rd.isSelected());//true
		

		
		


	}

}
