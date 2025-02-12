package cribeiro.experiments;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class TriviaResourceTest {
    @Test
    void testGetTriviaEndpoint() {
        given()
          .when().get("/trivia")
          .then()
             .statusCode(200);
    }

}