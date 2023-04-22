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


public class AmazonLinksCheck {
	@Test
	public void amazonlinks() throws InterruptedException
	{
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		List<WebElement> el = driver.findElements(By.tagName("a"));
		Thread.sleep(30);
	
		for(WebElement ele:el)
		{
			String url = ele.getAttribute("href");
			 if (url != null && !url.isEmpty()) {
			        try {
			            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
			            connection.setRequestMethod("HEAD");
			            connection.connect();
			            int responseCode = connection.getResponseCode();
			            if (responseCode == 200) {
			                System.out.println(url + " is a valid link");
			            } else {
			                System.out.println(url + " is a broken link");
			            }
			        } catch (Exception e) {
			            System.out.println(url + " is a broken link");
			        }
		}
		}
		
		driver.close();
	}
	@Test
	public void amazonlinksverification() throws InterruptedException, IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://localhost:8888");
		driver.manage().window().maximize();
	
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		Thread.sleep(30);
		//Number of links
	System.out.println(links.size());
	
		for(WebElement link:links)
		{
			//Extracting indudial elements
			String url = link.getAttribute("href");
			//Creating object for URL
			URL URL=new URL(url);
			//create connection using url object link
			HttpURLConnection httpconn=(HttpURLConnection) URL.openConnection();
			
			httpconn.connect();
			
			int respcode = httpconn.getResponseCode();
			if(respcode>=400)
			{
				System.out.println(url+"---->"+" is a broken link");
			}
			else
			{
				System.out.println(url+"---->"+" is valid link");
			}
	    }
		driver.close();

	}
	}
