package authentication;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class BearerToken {

	@Test
	
	public void bearerToken()
	{
		baseURI = "https://api.github.com";
		
		JSONObject obj = new JSONObject();
		obj.put("name", "Sprint2BasicAuth");
		
		given().auth().oauth2("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")
		.body(obj).contentType(ContentType.JSON)
		.when().post("/user/repos")
		.then().log().all();
	}
}
