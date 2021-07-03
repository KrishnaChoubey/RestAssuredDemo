package steps;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.*;

public class BDDStyledMethod {
	
	public static void simpleGETPost(String postNumber)
	{
		given().contentType(ContentType.JSON).
		when().get(String.format("http://localhost:3000/posts/%s", postNumber)).
		then().body(s:"author", is (value: "Karthik KK"));
		
	}
}
