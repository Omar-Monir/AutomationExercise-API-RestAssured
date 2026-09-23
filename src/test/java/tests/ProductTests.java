package tests;

import base.BaseTest;
import endPoints.ProductEndpoints;
import io.qameta.allure.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestData;

@Epic("Automation Exercise API")
@Feature("Product APIs")
public class ProductTests extends BaseTest {

    Response response;

    @Test(priority = 1)
    @Story("Get Products")
    @Description("API 1: Get All Products List")
    @Severity(SeverityLevel.CRITICAL)
    public void testGetAllProductsList() {

        response = ProductEndpoints.getAllProducts();
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 200, TestData.STATUS_CODE_NOT_CORRECT_MESSAGE);
        Assert.assertTrue(response.asString().contains(TestData.PRODUCT),
                TestData.PRODUCT_LIST_NOT_APPEARED);
    }

    @Test(priority = 2)
    @Story("Search Product")
    @Description("API 5: POST To Search Product")
    @Severity(SeverityLevel.NORMAL)
    public void testSearchProduct() {

        response = ProductEndpoints.searchProduct();
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 200, TestData.STATUS_CODE_NOT_CORRECT_MESSAGE);
        Assert.assertTrue(response.asString().contains(TestData.PRODUCT),
                TestData.SEARCHED_PRODUCTS_NOT_FOUND);
    }

    @Test(priority = 3)
    @Story("Negative - Post Products")
    @Description("API 2: POST To All Products List (Method Not Supported)")
    @Severity(SeverityLevel.MINOR)
    public void testPostToAllProductsList() {

        response = ProductEndpoints.postToAllProductsList();
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 200, TestData.STATUS_CODE_NOT_CORRECT_MESSAGE);
        Assert.assertTrue(response.asString().contains(TestData.METHOD_NOT_SUPPORTED_MESSAGE),
                TestData.METHOD_NOT_SUPPORTED_FAILED);
    }

    @Test(priority = 4)
    @Story("Negative - Search Without Parameter")
    @Description("API 6: POST To Search Product without search_product parameter")
    @Severity(SeverityLevel.MINOR)
    public void testSearchProductWithoutParameter() {

        response = ProductEndpoints.searchProductWithoutParameter();
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 200, TestData.STATUS_CODE_NOT_CORRECT_MESSAGE);
        Assert.assertTrue(response.asString().contains(TestData.SEARCH_PRODUCT_MISSING_MESSAGE),
                TestData.SEARCH_PRODUCT_MISSING_FAILED);
    }
}