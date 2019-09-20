package config;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.BeforeClass;

public class TestConfigGame {

    //public static ResponseSpecification responseSpec;
    public static RequestSpecification videoGame_RequestSpec;

    @BeforeClass
    public static void setup() {
        videoGame_RequestSpec = new RequestSpecBuilder().
                setBaseUri("http://localhost").
                setPort(8080).
                setBasePath("/app/").
                addHeader("Content-Type", "application/json").
                addHeader("Accept", "application/json").
                build();

        RestAssured.requestSpecification = videoGame_RequestSpec;

        RestAssured.proxy("localhost", 8888);


     //   /* Response Specifications */
     //   responseSpec = new ResponseSpecBuilder().
     //           expectStatusCode(200).
     //           build();
//
     //   RestAssured.responseSpecification = responseSpec;
    }
}
