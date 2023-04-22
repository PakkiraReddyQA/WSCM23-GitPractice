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

public class VerifyLinks {
	@Test
	public void verification() throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://localhost:8888");
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			WebElement element= links.get(i);
			String url = element.getAttribute("href");
			try
			{
			URL URL=new URL(url);
			HttpURLConnection httpconn=(HttpURLConnection) URL.openConnection();
			httpconn.connect();
			int responseCode = httpconn.getResponseCode();
			if(responseCode>=400)
			{
				System.out.println(url+"--->"+" is broken link");
			}
			else
			{
				System.out.println(url+"--->"+" is not broken");
			}
			}
			catch(Exception e)
			{
				System.out.println(url+"--->"+" is broken link");
			}
		}
	}
}
