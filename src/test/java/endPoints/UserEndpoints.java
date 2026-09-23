package endPoints;

import base.BaseTest;
import io.restassured.response.Response;
import payload.User;
import utilities.TestData;

import static io.restassured.RestAssured.given;

public class UserEndpoints extends BaseTest {

    public static Response createUser(User userPayload) {

        return given()
                .spec(requestSpecification)
                .contentType(TestData.FORM_CONTENT_TYPE)
                .formParam(TestData.NAME_PARAM, userPayload.getName())
                .formParam(TestData.EMAIL_PARAM, userPayload.getEmail())
                .formParam(TestData.PASSWORD_PARAM, userPayload.getPassword())
                .formParam(TestData.TITLE_PARAM, userPayload.getTitle())
                .formParam(TestData.BIRTH_DATE_PARAM, userPayload.getBirth_date())
                .formParam(TestData.BIRTH_MONTH_PARAM, userPayload.getBirth_month())
                .formParam(TestData.BIRTH_YEAR_PARAM, userPayload.getBirth_year())
                .formParam(TestData.FIRSTNAME_PARAM, userPayload.getFirstname())
                .formParam(TestData.LASTNAME_PARAM, userPayload.getLastname())
                .formParam(TestData.COMPANY_PARAM, userPayload.getCompany())
                .formParam(TestData.ADDRESS1_PARAM, userPayload.getAddress1())
                .formParam(TestData.ADDRESS2_PARAM, userPayload.getAddress2())
                .formParam(TestData.COUNTRY_PARAM, userPayload.getCountry())
                .formParam(TestData.ZIPCODE_PARAM, userPayload.getZipcode())
                .formParam(TestData.STATE_PARAM, userPayload.getState())
                .formParam(TestData.CITY_PARAM, userPayload.getCity())
                .formParam(TestData.MOBILE_NUMBER_PARAM, userPayload.getMobile_number())
                .when()
                .post(routes.postCreateAccountUrl);
    }

    public static Response getUserByEmail(String email) {

        return given()
                .spec(requestSpecification)
                .queryParam(TestData.EMAIL_PARAM, email)
                .when()
                .get(routes.getUserDetailByEmailUrl);
    }

    public static Response updateUser(User userPayload) {

        return given()
                .spec(requestSpecification)
                .contentType(TestData.FORM_CONTENT_TYPE)
                .formParam(TestData.NAME_PARAM, userPayload.getName())
                .formParam(TestData.EMAIL_PARAM, userPayload.getEmail())
                .formParam(TestData.PASSWORD_PARAM, userPayload.getPassword())
                .formParam(TestData.TITLE_PARAM, userPayload.getTitle())
                .formParam(TestData.BIRTH_DATE_PARAM, userPayload.getBirth_date())
                .formParam(TestData.BIRTH_MONTH_PARAM, userPayload.getBirth_month())
                .formParam(TestData.BIRTH_YEAR_PARAM, userPayload.getBirth_year())
                .formParam(TestData.FIRSTNAME_PARAM, userPayload.getFirstname())
                .formParam(TestData.LASTNAME_PARAM, userPayload.getLastname())
                .formParam(TestData.COMPANY_PARAM, userPayload.getCompany())
                .formParam(TestData.ADDRESS1_PARAM, userPayload.getAddress1())
                .formParam(TestData.ADDRESS2_PARAM, userPayload.getAddress2())
                .formParam(TestData.COUNTRY_PARAM, userPayload.getCountry())
                .formParam(TestData.ZIPCODE_PARAM, userPayload.getZipcode())
                .formParam(TestData.STATE_PARAM, userPayload.getState())
                .formParam(TestData.CITY_PARAM, userPayload.getCity())
                .formParam(TestData.MOBILE_NUMBER_PARAM, userPayload.getMobile_number())
                .when()
                .put(routes.putUpdateAccountUrl);
    }

    public static Response deleteUser(String email, String password) {

        return given()
                .spec(requestSpecification)
                .contentType(TestData.FORM_CONTENT_TYPE)
                .formParam(TestData.EMAIL_PARAM, email)
                .formParam(TestData.PASSWORD_PARAM, password)
                .when()
                .delete(routes.deleteAccountUrl);
    }
}