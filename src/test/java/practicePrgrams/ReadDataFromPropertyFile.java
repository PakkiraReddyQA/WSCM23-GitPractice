package practicePrgrams;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadDataFromPropertyFile {
	@Test
	public void readDataFromProperty() throws IOException
	{
		FileInputStream fis=new FileInputStream("src\\test\\resources\\CommonData.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String URL = pobj.getProperty("url");
		String BROWSER = pobj.getProperty("browser");
		String USERNAME = pobj.getProperty("username");
		String PASSWORD = pobj.getProperty("password");
		System.out.println(URL+"\n"+BROWSER+"\n"+USERNAME+"\n"+PASSWORD);
	}
}
