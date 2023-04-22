package practiceCRUDOperation;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


public class PathQueryParameter {
	@Test
	public void pathAndQueryParamTest()
	
	{	
	given()
		.pathParam("pathParam","users")
		.queryParam("page",2)
		.queryParam("id",5)
	.when()
		.get("https://reqres.in/api/{pathParam}")
    .then()
       .statusCode(200)
      .log().all();
		  
	}

}
