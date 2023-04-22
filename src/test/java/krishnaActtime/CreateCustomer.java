package krishnaActtime;

import java.io.IOException;

import org.testng.annotations.Test;

public class CreateCustomer extends BaseClass {
	@Test
	public void createTest() throws IOException
	{
	
		String CustomerName = eUtil.readdatafromExcel("CustomerDeatils", 1, 0);
		String Description = eUtil.readdatafromExcel("CustomerDeatils", 1, 1);
		
	ActTimeElement act = new ActTimeElement(driver);
	act.createCustomer(CustomerName, Description);
}
}
