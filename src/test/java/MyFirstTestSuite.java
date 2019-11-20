import config.TestConfigFootball;
import org.junit.Test;

import static config.EndPoint.GET_COMPETITIONS;
import static io.restassured.RestAssured.given;

public class MyFirstTestSuite extends TestConfigFootball {

    @Test
    public void myFirstTest() {
        given().
                when().spec(football_RequestSpec).get("355/leagueTable").
                then().log().
                all().statusCode(404);
    }
    
    @Test
    public void getAllCompetitionsInfo() {
        given().
                when().spec(football_RequestSpec).get(GET_COMPETITIONS).
                then().log().
                all().statusCode(200);
    }
    @Test
    public void getManUntInfo() {
        given().
                when().spec(football_RequestSpec).get(GET_COMPETITIONS+"/2021").
                then().log().status()
                .statusCode(200);
    }
}
