package practicePrgrams;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {
	@Test(dataProvider = "getData1")
	public void dataproviderTest(String phone,int price,String model)
	{
		System.out.println(phone+" "+price+" "+model);
		
	}
	@DataProvider(name="phone")
	public Object[][] getData()
	{
		Object[][] data=new Object[2][3];
		
		data[0][0]="samsung";
		data[0][1]=15000;
		data[0][2]="su234";
		
		data[1][0]="i phone";
		data[1][1]=25000;
		data[1][2]="i45";
		
		return data;
	
	}
	@DataProvider(name="accesiors")
	public Object[][] getData1()
	{
		Object[][] data=new Object[2][3];
		
		data[0][0]="samsung";
		data[0][1]=15000;
		data[0][2]="su234";
		
		data[1][0]="i phone";
		data[1][1]=25000;
		data[1][2]="i45";
		
		return data;
	
	}

}
