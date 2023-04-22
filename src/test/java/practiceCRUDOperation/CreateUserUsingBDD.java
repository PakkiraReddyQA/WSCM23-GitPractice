package practiceCRUDOperation;

import static io.restassured.RestAssured.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateUserUsingBDD {
	@Test
	public void creteUser() throws FileNotFoundException 
	{
		
baseURI="https://reqres.in";
//set the pre requisites
FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\CreateUserUsingReqress.json");
//pre condtion
given().body(fis).contentType(ContentType.JSON).post("/api/users").then().assertThat().statusCode(201).log().all();
		                                  //Action             //validation
		
	}

}
