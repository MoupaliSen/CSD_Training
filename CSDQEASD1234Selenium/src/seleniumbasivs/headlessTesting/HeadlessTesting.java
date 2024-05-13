package seleniumbasivs.headlessTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HeadlessTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Headless mode for chrome
		//Approach 1
//		ChromeOptions options = new ChromeOptions();
//		options.setHeadless(true);
//		
//		//open the browser
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver(options);
//		
		//Approach 2
//		ChromeOptions options = new ChromeOptions();
//		options.setHeadless(true);
//		WebDriver driver = WebDriverManager.chromedriver().capabilities(options).create();
		
		//Headless mode for Edge
		//Approach1
		EdgeOptions option = new EdgeOptions();
		option.setHeadless(true);
		
		WebDriver driver = new EdgeDriver(options);
		
		//Approach 2
		
		EdgeOptions options = new EdgeOptions();
		options.setHeadless(true);
		WebDriver driver1 = WebDriverManager.Edgedriver().capabilities(options).create();
		
		
		
		
		

	}

}
