package config;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.BeforeClass;

public class TestConfigFootball {
    public static RequestSpecification football_RequestSpec;


    @BeforeClass
    public static void setup() {


        football_RequestSpec = new RequestSpecBuilder().
                setBaseUri("http://api.football-data.org").
                setBasePath("/v2/").
                addHeader("X-Auth-Token", "a68e0f8e69d04e9eafdc9a014b8714f8").
                addHeader("X-Response-Control", "minified").
                build();

        RestAssured.requestSpecification = football_RequestSpec;

        RestAssured.proxy("http://api.football-data.org", 8888);


    }
}
