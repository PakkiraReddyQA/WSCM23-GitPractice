package gopiProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
	
	
	public String readDataFromPropertyfile(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\backPack.properties");
		Properties po=new Properties();
		po.load(fis);
		return po.getProperty(key);
	}

}
