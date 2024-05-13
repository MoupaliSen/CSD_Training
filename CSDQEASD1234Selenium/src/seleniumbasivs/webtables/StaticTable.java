package seleniumbasivs.webtables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class StaticTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\2317616\\eclipse-workspace\\CSDQEASD1234Selenium\\Browser\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
		//find total number of rows
		
		//Approach 1
		int rows1 =driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); //Preferred always
		System.out.println("number of rows"+rows1);
		
		//Approach 2
		int rows2 =driver.findElements(By.tagName("tr")).size();//Preferred only one single table
		
		
		//find total number of columns
		
		//Approach 1

		int coumns1 =driver.findElements(By.xpath("//table[@name='BookTable']//th")).size(); //Preferred always

		//Approach 2
		int columns2 =driver.findElements(By.tagName("th")).size();//Preferred only one single table

		//Read Specific row and column
		String rows_column =driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText(); //Preferred always
		System.out.println(rows_column);
		
		//Read data from all the rows and columns
		System.out.println("Book Name"+"    "+"Author"+"     "+"Subject" +"  "+"Price");
		for(int r=2;r<rows1;r++) //it row will start from 1 then it will give no such element exception thats why it will start from r=2
		{
			for(int c=1;c<=coumns1;c++)
			{
				String value =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText(); //Preferred always
				System.out.println(value+"    ");
			}
		}
		System.out.println(); // it will give tabular format
		
		//Print book names whose author is Amrit
		for(int r=2;r<rows;r++)
		{
			String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			if(author.equals("Amrit"))
			{
				String bookname =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(author +" "+bookname);
			}
		}
		//Sum of prices of all the books
		int sum =0;
		for(int r=2;r<=rows;r++)
		{
			String price =driver.findElement(By.xpath("//table[@name ='BookTable']//tr["+r+"]/td[4]")).getText();
			sum = sum +Integer.parseInt(price);
			System.out.println("Total price of Books"+sum);
			
		}
		
		
	}

}
