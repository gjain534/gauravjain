package Tutorial2;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1 {

	public static void main(String[] args) {
		//specify the base URL in RestAssured
				RestAssured.baseURI = "https://www.google.com/";
			RequestSpecification httprequest =	RestAssured.given(); 
			Response resp = httprequest.request(Method.GET);
			System.out.println(resp.getStatusLine());
			System.out.println(resp.getStatusCode());


	}

}
