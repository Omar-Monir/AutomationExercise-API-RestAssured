package tests;

import base.BaseTest;
import endPoints.BrandEndpoints;
import io.qameta.allure.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestData;

@Epic("Automation Exercise API")
@Feature("Brand APIs")
public class BrandTests extends BaseTest {

    Response response;

    @Test(priority = 1)
    @Story("Get Brands")
    @Description("API 3: Get All Brands List")
    @Severity(SeverityLevel.NORMAL)
    public void testGetBrands() {

        response = BrandEndpoints.getBrands();
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 200, TestData.STATUS_CODE_NOT_CORRECT_MESSAGE);
        Assert.assertTrue(response.asString().contains(TestData.BRANDS),
                TestData.BRANDS_LIST_NOT_APPEARED);
    }

    @Test(priority = 2)
    @Story("Negative - Put Brands")
    @Description("API 4: PUT To All Brands List (Method Not Supported)")
    @Severity(SeverityLevel.MINOR)
    public void testPutToBrandsList() {

        response = BrandEndpoints.putToAllBrandsList();
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 200, TestData.STATUS_CODE_NOT_CORRECT_MESSAGE);
        Assert.assertTrue(response.asString().contains(TestData.REJECT_TO_PUT_TO_BRANDS_LIST),
                TestData.ACCEPTED_TO_PUT_TO_BRANDS_LIST);
    }
}