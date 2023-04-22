package gitPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {
	@Test(dataProvider = "phones")
	public void dataprovider(String phone,int price,String model)
	{
		
		System.out.println(phone+" "+price+" "+model);
		
	}
	@DataProvider(name = "phones")
	public Object[][] getdata()
	{
		Object[][] data=new Object[2][3];
		
		
		data[0][0]="Samusung";
		data[0][1]=15000;
		data[0][2]="s20";
		
		data[1][0] ="Iphone";
		data[1][1]=25000;
		data[1][2]="Ipro 14";
		
		return data;
	}

}
