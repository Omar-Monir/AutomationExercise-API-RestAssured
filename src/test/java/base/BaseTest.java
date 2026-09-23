package base;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;
import utilities.TestData;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class BaseTest {

    protected static RequestSpecification requestSpecification;
    protected static ResponseSpecification responseSpecification;

    @BeforeClass
    public void setUp(){

        requestSpecification = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .log().all();

        responseSpecification = RestAssured.expect()
                .contentType(ContentType.JSON)
                .time(lessThan(TestData.TIME_TO_RESPONSES));
    }

}
