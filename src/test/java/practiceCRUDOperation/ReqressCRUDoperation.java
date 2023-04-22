package practiceCRUDOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class ReqressCRUDoperation {
	
	JSONObject jobj=new JSONObject();
	int id;
	@Test(priority = 1)
	public void getUser()
	{
		baseURI="https://reqres.in/";
		when()
		 .get("api/users/2")
		.then()
		  .statusCode(200)
		  .log().all();
		System.out.println("Get request succefully");
	}
	@Test(priority = 2)
	public void createUser()
	{
		baseURI="https://reqres.in/";
		jobj.put("name", "pakkiraaReddy");
		jobj.put("job", "Student");
		
		id=given()
		.contentType(ContentType.JSON)
		.body(jobj)

		.when()
		.post("api/users").jsonPath().getInt("id");
		System.out.println("User created succefully");
	}
	@Test(priority = 3,dependsOnMethods = "createUser")
	public void updateUser()
	{
		baseURI="https://reqres.in/";
		jobj.put("name", "pakkira");
		jobj.put("job", "Student");
		
		given()
		.contentType(ContentType.JSON)
		.body(jobj)
		
		.when()
		.put("api/users/"+id)
		
		.then()
		.statusCode(200).log().all();
		System.out.println("User Updated Succefully");
	}
	@Test(priority = 4)
	public void deleteUser()
	{
		baseURI="https://reqres.in/";
		when()
		.delete("api/users"+id)
		.then()
		.statusCode(204).log().all();
		System.out.println("User Deleted Succefully");
	}
}
