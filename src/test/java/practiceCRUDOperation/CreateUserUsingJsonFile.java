package practiceCRUDOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateUserUsingJsonFile {
	@Test
	public void createUser() throws FileNotFoundException
	{
		//Create pre Requisites
      FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\CreateUserUsingReqress.json");
	
      //Send The request
		RequestSpecification req = RestAssured.given();
		req.body(fis);
		req.contentType(ContentType.JSON);
		
		//validation
		Response resp = req.post("https://reqres.in/api/users");
		resp.prettyPeek();
//		System.out.println(resp);
	}
}
