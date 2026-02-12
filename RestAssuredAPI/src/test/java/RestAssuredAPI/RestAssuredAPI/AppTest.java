package RestAssuredAPI.RestAssuredAPI;



import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


//import static org.junit.jupiter.api.Assertions.assertTrue;

//import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
	@Test
    public void validate() {
		//Response response = RestAssured.get("https://thetestingworldapi.com/api/studentsDetails/300000");
		Response response = RestAssured.get("http://reqres.in/api/users?page=2");
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getHeaders());
		System.out.println(response.getHeader("Cache-Control"));
		System.out.println("-----------------");
		System.out.println(response.asString());
	
	}
	
	
}
