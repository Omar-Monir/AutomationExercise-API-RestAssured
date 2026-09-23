package endPoints;

import base.BaseTest;
import io.restassured.response.Response;
import utilities.TestData;

import static io.restassured.RestAssured.given;

public class ProductEndpoints extends BaseTest {

    public static Response getAllProducts(){

        return given()
                .spec(requestSpecification)
                .when()
                .get(routes.getProductListUrl);

    }

    public static Response searchProduct(){

        return given()
                .spec(requestSpecification)
                .contentType(TestData.FORM_CONTENT_TYPE)
                .formParam(TestData.SEARCH_PRODUCT_PARAM,TestData.SEARCH_PRODUCT)
                .when()
                .post(routes.postSearchProductUrl);

    }

    public static Response postToAllProductsList(){

        return given()
                .spec(requestSpecification)
                .when()
                .post(routes.postProductListUrl);

    }

    public static Response searchProductWithoutParameter() {

        return given()
                .spec(requestSpecification)
                .contentType(TestData.FORM_CONTENT_TYPE)
                .when()
                .post(routes.postSearchProductUrl);
    }

}
