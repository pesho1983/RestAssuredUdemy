import config.TestConfigGame;
import org.junit.Test;

import static config.EndPoint.GAMES;
import static io.restassured.RestAssured.given;
public class VideoGameDbTestSuite extends TestConfigGame {

    @Test
    public void getAllGames() {
        given().
                when().spec(videoGame_RequestSpec).get(GAMES).
                then().log().
                all();
    }


    @Test
    public void createNewGameJson() {

        String gameJson = "{\n" +
                "    \"id\": 33,\n" +
                "    \"name\": \"Grand Theft Auto IV\",\n" +
                "    \"releaseDate\": \"2001-04-24\",\n" +
                "    \"reviewScore\": 91,\n" +
                "    \"category\": \"Driving\",\n" +
                "    \"rating\": \"Mature\"\n" +
                "  }";

        given().
                body(gameJson).
                when().post(GAMES).
                then().statusCode(200);
    }

  // @Test
  // public void createNewGame() {
//
  //     Game game = new Game("44","ProSkater","2002-09-05T14:37:36.887Z", "8", "Sport", "Good");
//
  //     given().
  //             body(game).
  //     when().spec(videoGame_RequestSpec).post(GAMES).
  //     then();
  // }



}
