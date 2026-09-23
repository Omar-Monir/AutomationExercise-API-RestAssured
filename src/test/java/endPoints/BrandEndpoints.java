package endPoints;

import base.BaseTest;
import io.restassured.response.Response;
import utilities.TestData;

import static io.restassured.RestAssured.given;

public class BrandEndpoints extends BaseTest {

    public static Response getBrands(){

        return given()
                .spec(requestSpecification)
                .when()
                .get(routes.getBrandsListUrl);
    }

    public static Response putToAllBrandsList(){

        return given()
                .spec(requestSpecification)
                .contentType(TestData.FORM_CONTENT_TYPE)
                .formParam(TestData.BRANDS_PARAM,TestData.BRANDS)
                .when()
                .put(routes.putBrandsListUrl);
    }

}
