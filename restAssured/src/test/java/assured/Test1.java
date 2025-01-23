package assured;

import io.restassured.RestAssured;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
public class Test1 {

	public static void main(String[] args) {
		
RestAssured.baseURI="https://rahulshettyacademy.com";
given().queryParam("key", "qaclick123").header("Content-Type","application/json").body("{\r\n"
		+ "    \"status\": \"OK\",\r\n"
		+ "    \"place_id\": \"b6048b4525e06f1c9354623573b445f2\",\r\n"
		+ "    \"scope\": \"APP\",\r\n"
		+ "    \"reference\": \"561f867cf457d5c07cb275f81d3a92db561f867cf457d5c07cb275f81d3a92db\",\r\n"
		+ "    \"id\": \"561f867cf457d5c07cb275f81d3a92db\"\r\n"
		+ "}").when().post("/maps/api/place/add/json")
.then().log().all().assertThat().statusCode(200).body("scop", equalTo("APP"))
.header("server", "Apache/2.4.52 (Ubuntu)");

	}

	private static ResponseAwareMatcher<Response> equalTo(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
