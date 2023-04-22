package practiceCRUDOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class JsonServer {
	@Test
	public void createDataByUsingPost()
	{
	 JSONObject data=new JSONObject();
	 data.put("name", "Krishna");
	 data.put("location", "Kphb");
	 data.put("lastname", "Yatam");
	
	String deatils[]= {"c++","selenium","Api"};
	data.put("courses", deatils);
	
	given()
		.contentType("Application/json")
		.body(data)
	.when()
		.post("http://localhost:3000/students")
	.then()
//	    .statusCode()
		.log().all();
	}
	@Test
	void updateDataPUT()
	{
		JSONObject data=new JSONObject();
		data.put("name", "KavyaSree");
		data.put("job", "automation tester");
		
		
		
		given()
		.contentType(ContentType.JSON)
		.body(data)
		.when()
		  .put("http://localhost:3000/students/6")
		  .then()
		  .log().body();
	}
	@Test
	void updateDataPatch()
	{
		JSONObject data=new JSONObject();
		data.put("name", "KavyaSree");
		data.put("location", "jdm");
		
		given()
		.contentType(ContentType.JSON)
		.body(data)
		.when()
		  .patch("http://localhost:3000/students/6")
		  .then()
		  .log().body();	
	}
	@Test
	void getData()
	{
		when()
		.get("http://localhost:3000/students")
		.then()
		.log().body();
	}
}
