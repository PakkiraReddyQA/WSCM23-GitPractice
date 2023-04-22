package verificationLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyingLinks {
	@Test
	public void verifyLinks() throws IOException
	{
//		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://localhost:8888");
		//Find Links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		//Number of links present in Web Application
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++)
		{
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			
			try
			{
			URL link=new URL(url);
			
			HttpURLConnection httpconn=(HttpURLConnection) link.openConnection();
			httpconn.connect();
			
		//capture the Response code
			
			int respcode = httpconn.getResponseCode();
			
			if(respcode>=400)
			{
				System.out.println(url+"--->"+" is a broken link");
			}
			else
			{
				System.out.println(url+"--->"+" is valid link ");
			}
			}
			catch(Exception e)
			{
				System.out.println(url+"--->"+" is a broken link");

			}
		}
	}
}
