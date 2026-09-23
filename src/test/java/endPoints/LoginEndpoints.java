package endPoints;

import base.BaseTest;
import io.restassured.response.Response;
import utilities.TestData;

import static io.restassured.RestAssured.given;

public class LoginEndpoints extends BaseTest {

    public static Response verifyLoginWithValidDetails(){

        return given()
                .spec(requestSpecification)
                .contentType(TestData.FORM_CONTENT_TYPE)
                .formParam(TestData.EMAIL_PARAM, TestData.VALID_EMAIL)
                .formParam(TestData.PASSWORD_PARAM, TestData.VALID_PASSWORD)
                .when()
                .post(routes.postVerifyLoginUrl);

   }

    public static Response verifyLoginWithoutEmail(){

        return given()
                .spec(requestSpecification)
                .contentType(TestData.FORM_CONTENT_TYPE)
                .formParam(TestData.PASSWORD_PARAM, TestData.VALID_PASSWORD)
                .when()
                .post(routes.postVerifyLoginUrl);

    }

    public static Response verifyLoginWithInvalidDetails(){

        return given()
                .spec(requestSpecification)
                .contentType(TestData.FORM_CONTENT_TYPE)
                .formParam(TestData.EMAIL_PARAM, TestData.INVALID_EMAIL)
                .formParam(TestData.PASSWORD_PARAM, TestData.INVALID_PASSWORD)
                .when()
                .post(routes.postVerifyLoginUrl);

    }

    public static Response deleteVerifyLogin() {

        return given()
                .spec(requestSpecification)
                .when()
                .delete(routes.deleteVerifyLoginUrl);
    }

}
