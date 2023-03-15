package vTiger.OrganizationTestScript;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrganizationWithDDT {
	public static void main(String[] args) throws IOException {
		Random r=new Random();
		int random = r.nextInt();
		
		//Step1:Read Data from Extrnal Files
		/*Read Data From Property file*/
		FileInputStream fisP=new FileInputStream("src\\test\\resources\\CommonData.properties");
		Properties pObj=new Properties();
		pObj.load(fisP);
		String BROWSER = pObj.getProperty("browser");
		String URL = pObj.getProperty("url");
		String USERNAME = pObj.getProperty("username");
		String PASSWORD = pObj.getProperty("password");
		/*Read the data from Excel Sheet*/
		FileInputStream fisE=new FileInputStream("src\\test\\resources\\TestData.xlsx");
		Workbook book = WorkbookFactory.create(fisE);
		Sheet sh = book.getSheet("Organization");
		String ORGNAME= sh.getRow(7).getCell(3).getStringCellValue()+random;
		
		//Step2:Launch the Browser
	WebDriver driver=null;
	
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
		System.out.println("Invalid Browser name");
	}
	
		//Step3:Login to the Application
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get(URL);
	    driver.manage().window().maximize();
	    driver.findElement(By.name("user_name")).sendKeys(USERNAME);
	    driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
	    driver.findElement(By.id("submitButton")).click();
		//Step4:Navigate to the Organization
	    driver.findElement(By.linkText("Organizations")).click();
		//Step5:Click on Organization Look up Image
	    driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		//Step6:Provide data for mandatory filed and save
	    driver.findElement(By.name("accountname")).sendKeys(ORGNAME);
	    driver.findElement(By.name("button")).click();
		//Step7:Validate
	    String ORGHEADER = driver.findElement(By.className("dvHeaderText")).getText();
	    if(ORGHEADER.contains(ORGNAME))
	    {
	    	System.out.println("PASS");
	    }
	    else
	    {
	    	System.out.println("FAIL");
	    }
	}
}
