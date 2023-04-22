package gopiProject;


    import java.time.Duration;

    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import io.github.bonigarcia.wdm.WebDriverManager;
public class Base_Class {

		public PropertyFile pobj=new PropertyFile();
//		WebDriverUtility w=new WebDriverUtility();
//		ExcelUtility e=new ExcelUtility();
		
		public WebDriver driver=null;
		
		@BeforeSuite(groups = {"smoke","Regression"})
		public void Launch_Database()
		{
			System.out.println("Database launch Successfully..!!!");
			
		}
		//@Parameters("browser")
		@BeforeClass(groups = {"smoke","Regression"})
		public void Launch_Browser(/*String Browser*/) throws Exception
		{
		    String BROWSER=pobj.readDataFromPropertyfile("browser");
		    String URL = pobj.readDataFromPropertyfile("url");
		    
			if(BROWSER.equalsIgnoreCase("Chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				System.out.println("Chromedriver launch Successfully..!!!");
			}
			else if(BROWSER.equalsIgnoreCase("Edge"))
				
			{
				WebDriverManager.edgedriver().setup();
			    driver=new EdgeDriver();
				System.out.println("Edgedriver launch Successfully..!!!");
			}
			driver.get(URL);
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		
		@BeforeMethod(groups = {"smoke","Regression"})
		public void Login() throws Exception
		{
			String USERNAME =pobj.readDataFromPropertyfile("username");
			String PASSWORD = ("Password");
			BackPackElements f= new BackPackElements(driver);
			f.login(USERNAME,PASSWORD);
			
		}
		
		@AfterMethod(groups = {"smoke","Regression"})
		public void Logout()
		{
			BackPackElements fp=new BackPackElements(driver);
			fp.logOut();
		}
		@AfterClass(groups = {"smoke","Regression"})
		public void Close_Browser()
		{
			driver.close();
		}
		
	    @AfterSuite(groups = {"smoke","Regression"})
		public void Close_Database()
		{
			System.out.println("Database close Successfully....!!!");
		}
	    
		
	 } 

