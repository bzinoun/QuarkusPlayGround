package ma.bzinoun;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {
    @Value("${hello.ar}")
    private String prefix;
    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/api/hello")
          .then()
             .statusCode(200)
             ;
    }
    // public void testHelloEndpointWithParam() {
    //     given()
    //       .when().get("/api/hello?name=yassine")
    //       .then()
    //          .statusCode(200)
    //          .body(is("Salam yassine"));
    // }

}

