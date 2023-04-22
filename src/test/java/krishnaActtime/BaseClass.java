package krishnaActtime;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public Propertys pUtil = new Propertys();
	public ExcelUtility eUtil = new ExcelUtility();
	public WebDriver driver=null;
	@BeforeSuite
	public void bsConfig()
	{
		System.out.println("=============Data Base connected Succeefully=======");
	}
	@BeforeClass
	public void LanchBrowser() throws IOException
	{	
		String BROWSER = pUtil.readDataFromPropertyFile("browser");
		String Url = pUtil.readDataFromPropertyFile("url");
		if(BROWSER.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("Invalid browser");
		}
		
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
	}
		
	@BeforeMethod
	public void loginToApp() throws IOException
	{
	
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		ActTimeElement act = new ActTimeElement(driver);
		act.lgoinActiTime(USERNAME,PASSWORD);
		
	}
	
	@AfterMethod
	public void logOutApp()
	{
		ActTimeElement act = new ActTimeElement(driver);
		act.LogOutApp();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
		
	}
	@AfterSuite
	public void asConfig()
	{
		System.out.println("============data base connection closed===========");
	}

}

