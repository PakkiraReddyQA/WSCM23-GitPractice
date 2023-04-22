package practiceCRUDOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class SwaggerApis {
	@Test
	public void createUserWithArry()
	{
		JSONObject jobj=new JSONObject();
		String userArry[]= {"2","Pakkira","Yatam","Reddy","pakkirareddy@gmail.com","reddy@123","9618456544","200"};
		jobj.put("id", userArry);
		jobj.put("username", userArry);
		jobj.put("firstName", userArry);
		jobj.put("lastName", userArry);
		jobj.put("email", userArry);
		jobj.put("password", userArry);
		jobj.put("phone", userArry);
		jobj.put("userStatus", userArry);
		
		baseURI="https://petstore.swagger.io/v2/";
		given()
		.contentType(ContentType.JSON)
		.when()
		.post("user/createWithArray")
		.then().statusCode(200).assertThat().log().all();
	}

}
