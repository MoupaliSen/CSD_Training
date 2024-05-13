package seleniumbasivs.BrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\2317616\\eclipse-workspace\\CSDQEASD1234Selenium\\Browser\\msedgedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of link"+links.size());
		
		//int broken_link=0;
		for(WebElement link:links)
		{
			String hrefAtValue =link.getAttribute("href");
			System.out.println(hrefAtValue);
			
			//pre-requisite of checking broken-link
			
			if(hrefAtValue==null||hrefAtValue.isEmpty())
			{
				System.out.println("href attribute value is empty");
				continue;
				
			}
			
			//link is broken or not
			URL linkurl = new URL(hrefAtValue); //convert string --> url format
			
			//send request to server --open ,connect
			URLConnection connection = (HttpURLConnection)linkurl.openConnection();
			connection.connect();
			
			if(connection.getResponseCode()>=400)
			{
				System.out.println(link.getText()+"    "+"======Broken link");
				broken_link++;
			}
			else
			{
				System.out.println(link.getText()+"     "+"======Not Broken link");
	
			}
			
			System.out.println("total number of broken links"+broken_link);
		}
	}

}
