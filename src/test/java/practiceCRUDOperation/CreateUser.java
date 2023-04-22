package practiceCRUDOperation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateUser {
	
	
	JSONObject jobj=new JSONObject();
	
	
	@Test
	public void CreateUserTest()
	{
		

		//Step1:Create PreRequist
		jobj.put("name", "pakkira");
		jobj.put("job", "Automation testEngineer");
	    //Step2:send the Request
		RequestSpecification req = RestAssured.given();
		req.body(jobj);
		req.contentType(ContentType.JSON);
		Response resp = req.post("https://reqres.in/api/users");
		//validations
//		resp.prettyPeek();
//		resp.prettyPrint();
//		resp.then().log().all();
		resp.then().assertThat().statusCode(201).log().all();	
	   }
       @Test
       public void getSingleUser()
      {
	RequestSpecification req = RestAssured.given();
	req.body(jobj);
	req.contentType(ContentType.JSON);
	Response resp = req.get("https://reqres.in/api/users/2");
	resp.then().assertThat().statusCode(200).log().all();
     }
       @Test
       public void updateUserDetails()
       {
    	   jobj.put("name", "pakkiraReddy");
    	   jobj.put("job", "Automation Lead");
    	   
    	   RequestSpecification req = RestAssured.given();
    	   req.body(jobj);
    	   req.contentType(ContentType.JSON);
    	  Response resp = req.put("https://reqres.in/api/users/2");
    	 resp.prettyPeek();
       }
       @Test
       public void createUser()
       {
    	   baseURI="https://reqres.in/api";
    	 when().get("/users/2").then().assertThat().statusCode(200).log().all();  
       }
       @Test
       public void listOfUser()
       {
    	   
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("Provide End point");
    	   String endPoint = sc.next();
    	   baseURI="https://reqres.in/api";
    	   when().get(endPoint).then().assertThat().statusCode(200).log().all();
    	   sc.close();
       }
       @Test
       public void createUserpost()
       {
   
    	   jobj.put("name", "PakkiraReddy");
    	   jobj.put("job","Automation Tester");
    	   baseURI="https://reqres.in/api";
    	   given()
    	   .body(jobj)
    	   .contentType(ContentType.JSON)
    	   
    	   .when()
    	   .post("/users").then().assertThat().log().all();
       }
       @Test
       public void updateUser()
       {
    	  jobj.put("name", "PakkiraReddy");
    	  jobj.put("job","ApiTester");
    	  
    	  baseURI="https://reqres.in/api";
   	   given()
   	   .body(jobj)
   	   .contentType(ContentType.JSON)
   	   
   	   .when()
   	   .post("/users").then().assertThat().log().all();
    	  
       }
    }
