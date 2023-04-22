package practiceCRUDOperation;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

public class Deserialization {
	@Test
	public void getEmployeede() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper op=new ObjectMapper();
		
		EmployeeDetails emp = op.readValue(new File(".\\src\\test\\resources\\Serilization.json"), EmployeeDetails.class);
		System.out.println(emp.getEmpID());
//		emp.setEmpID("qsp123");
		
		
	}

}
