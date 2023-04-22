package practiceCRUDOperation;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

public class Serialization {
	@Test
	public void serializTest() throws JsonGenerationException, JsonMappingException, IOException
	{
		EmployeeDetails ed=new EmployeeDetails("pakkira", "pakkira@gmail.com", 961845, "pakki@123");	
	ObjectMapper op=new ObjectMapper();
	op.writeValue(new File(".\\src\\test\\resources\\Serilization.json"), ed);
	}

}
