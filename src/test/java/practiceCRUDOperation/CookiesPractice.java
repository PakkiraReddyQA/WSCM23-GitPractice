package practiceCRUDOperation;
import static io.restassured.RestAssured.*;

import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

import io.restassured.http.Headers;
import io.restassured.response.Response;



public class CookiesPractice {
	@Test
	public void cookiesTest()
	{
		given()
		   
		.when()
		.get("https://www.google.com/")
		 
		 .then()
		     .cookie("AEC","ARSKqsIphaugP0G177yEehHDoUW4Wxmf9DqgZYgX1O4DWqu5qBIff6_h7Es")
		     .log().all();
	}
	@Test
	public void getcookie()
	{
		Response res = given()
		
	.when()
		.get("https://www.google.com/");
		
		String cookie_value = res.getCookie("AEC");
	
		System.out.println(cookie_value);
		
	}
	@Test
	public void getAllCookiesInfo()
	{
		Response res = given()
		
	.when()
		.get("https://www.google.com/");
		
		Map<String, String> cookies_values = res.getCookies();
		
		for(String k:cookies_values.keySet())
		{
			String cookie_value = res.getCookie(k);
			System.out.println(k+"----------->"+cookie_value);
		}
	}
	@Test
	public void hedersValidation()
	{
	when()
		.get("https://www.google.com/")
	.then()
		.header("Server", "gws")
		.and()
		.header("Content-Type", "text/html; charset=ISO-8859-1")
		.and()
		.header("Content-Encoding", "gzip")
		.log().headers()
		.log().cookies()
		.log().getClass();	
	}
		
	@Test
	void getHeadrs()
	{
	  Response res = when()
		 .get("https://www.google.com/");
		 String hederValue = res.getHeader("Content-Type");
		 System.out.println(hederValue);
		 Headers headerValues = res.getHeaders();
		 System.out.println(headerValues);
	}
	@Test
	public void cookiesPracice()
	{
		Response re = when()
		.get("https://www.google.com/");
		
		String cookieValue = re.getCookie("AEC");
		System.out.println(cookieValue);
		Map<String, String> cookieValues = re.getCookies();
		Set<String> keys = cookieValues.keySet();
		System.out.println(cookieValues);
	}
	@Test
	void studentsApi()
	{
		when()
		.get(" http://localhost:3000/students")
		.then()
		.log().all()
		.statusCode(200);
	}

}
