package acttime_Scripts;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



public class CreateNewCustomerTest extends BaseClass {
	
	
@Test
public void createNewCustomerTest() throws IOException
{
	//Actually Script Starts from Here 
	//Read the CustomerName and Description from ExcelSheet
	ExcelFileUtility eobj=new ExcelFileUtility();
	String customerName = eobj.readdatafromExcel("CustomerDeatils", 3, 0);
	String description = eobj.readdatafromExcel("CustomerDeatils", 3, 1);
	//Create New customer by providing credntials
	ActitimeElements ac=new ActitimeElements(driver);
	ac.createCustomer(customerName,description);
	System.out.println(customerName+" "+description);
	
}
}
