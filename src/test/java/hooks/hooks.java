package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {

	public static WebDriver driver;
	@Before
	
	public void init(){
		try{
			System.setProperty("webdriver.chrome.driver", ".\\lib\\chromedriver.exe");	
			driver = new ChromeDriver();
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
	@After
	public void end(){
		driver.quit();
	}
}