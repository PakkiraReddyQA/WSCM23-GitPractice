package acttime_Scripts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver=null;
	public PropertiesFile pobj=new PropertiesFile();
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		
		String URL = pobj.getproperties("url");
		String BROWSER = pobj.getproperties("browser");
	
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("Invalid browser found");
		}
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(URL);
		//Login To the Application
		
		
	}
	@BeforeMethod
	public void loginApp() throws IOException
	{
		String USERNAME = pobj.getproperties("username");
		String PASSWORD = pobj.getproperties("password");
		ActitimeElements ac=new ActitimeElements(driver);
		ac.lgoinActiTime(USERNAME, PASSWORD);
		
	}
	@AfterMethod
	public void logOutApp()
	{
	ActitimeElements ac=new ActitimeElements(driver);
    ac.LogOutApp();
	}
	

}
