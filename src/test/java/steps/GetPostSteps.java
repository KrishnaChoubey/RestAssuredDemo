package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;



public class GetPostSteps {

@Given("I perform GET operation for {string}")
public void i_perform_get_operation_for(String url) throws Throwable{
	given().contentType(ContentType.JSON);
    
}


@Given("I perform GET for the post number {string}")
public void i_perform_get_for_the_post_number(String postNumber) throws Throwable{
	when().get(String.format("http://localhost:3000/posts/%s",postNumber)).
	then().body(s:"author", is(value :"Karthik KK"));
   
}

@Then("I should see the author name as {string}")
public void i_should_see_the_author_name_as(String string) {
  
}

}

