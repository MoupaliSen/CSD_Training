package seleniumbasivs.webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

public class pagination_dynamic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\2317616\\eclipse-workspace\\CSDQEASD1234Selenium\\Browser\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//Total no pages in a website
		String text = driver.findElement(By.xpath("//div[@class ='col-sm-6 text-end']")).getText();
		
		int total_pages = Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		
		System.out.println("Total no of pages"+total_pages);
		
		for(int p=1;p<=total_pages;p++)
		{
			if(total_pages>1) {
			WebElement active_page = driver.findElement(By.xpath("//ul[@class ='pagination]//li//*[text() ="+p+")]"));
			System.out.println("Active Page"+active_page.getText());
			active_page.click();
			Thread.sleep(2000);
			}
			
			int ro_Of_rows = driver.findElements(By.xpath("//table[@class ='table table-bordered table-hover']//tbody//tr")).size();
			System.out.println("Total no of rows in active pages"+ro_Of_rows);
			
			for(int r=1;r<ro_Of_rows;r++)
			{
			   String customername = .args.xpath.getText();
			   String email = .args.xpath..args.getText();
			   String status =.args XPath.getText();
			   
			   System.out.println(customerName +" "+customerEmail+" "+status);
			   
			}
		}
		
		

	}

}
