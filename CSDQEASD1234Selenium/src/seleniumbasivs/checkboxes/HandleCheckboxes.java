package seleniumbasivs.checkboxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\2317616\\eclipse-workspace\\CSDQEASD1234Selenium\\Browser\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("");
		driver.manage().window().maximize();
		
		
        //select specific check box by using "xpath"
		driver.findElement(By.xpath("//input[@id ='monday']")).click();
		
		//total number of check boxes
       List<WebElement> checkboxes =driver.findElements(By.xpath("//input[@class ='form-check-input' and @type ='checkbox']"));
       System.out.println("total number of checkboxes"+checkboxes.size());
       
       

		//multiple check boxes or select all checkboxes
       for(int i=0;i<checkboxes.size();i++)
       {
    	   checkboxes.get(i).click();
    	   
       }
		
		//enhance for loop
       for(WebElement checkbox:checkboxes)
       {
    	  checkbox.click() ;
    	  
       }
       // select last 2 check boxes or 3 check boxes
       //if total =7 select last 2 check boxes
       //then 7-2=5 is the first index
       
       //total number of check boxes -how many check boxes to be selected = startign index
       for(int i=5;i<checkboxes.size();i++)
       {
    	   checkboxes.get(i).click();
       }
		
		//first 2 check boxes select
       for(int i=0;i<2;i++)
       {
    	   if(i<2) {
    	   checkboxes.get(i).click();
    	   }
       }
       
		//unchecked check boxes or clear check boxes
       //using normal for-loop
       for(int i=0;i<2;i++)
       {
    	   if(i<2) {
    	   checkboxes.get(i).click();
    	   }
       }
       
       Thread.sleep(4000);
       
       for(int i=0;i<checkboxes.size();i++)
       {
    	   if(checkboxes.get(i).isSelected())
    	   {
    	   checkboxes.get(i).click();
    	   }

       }
       
       //using for -each loop
       for(WebElement checkbox:checkboxes())
       {
    	   if(checkbox.isSelected())
    	   {
    		   checkbox.click();
    	   }
       }
       
       
	}

}
