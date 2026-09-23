package tests;

import base.BaseTest;
import endPoints.LoginEndpoints;
import io.qameta.allure.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestData;

@Epic("Automation Exercise API")
@Feature("Login APIs")
public class LoginTests extends BaseTest {

    Response response;

    @Test(priority = 1)
    @Story("Valid Login")
    @Description("API 7: POST To Verify Login with valid details")
    @Severity(SeverityLevel.CRITICAL)
    public void testVerifyLoginWithValidDetails() {

        response = LoginEndpoints.verifyLoginWithValidDetails();
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 200, TestData.STATUS_CODE_NOT_CORRECT_MESSAGE);
        Assert.assertTrue(response.asString().contains(TestData.USER_EXISTS_MESSAGE),
                TestData.USER_EXISTS_FAILED_MESSAGE);
    }

    @Test(priority = 2)
    @Story("Login Without Email")
    @Description("API 8: POST To Verify Login without email parameter")
    @Severity(SeverityLevel.NORMAL)
    public void testVerifyLoginWithoutEmail() {

        response = LoginEndpoints.verifyLoginWithoutEmail();
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 200, TestData.STATUS_CODE_NOT_CORRECT_MESSAGE);
        Assert.assertTrue(response.asString().contains(TestData.EMAIL_OR_PASSWORD_MISSING_MESSAGE),
                TestData.MISSING_PARAM_FAILED_MESSAGE);
    }

    @Test(priority = 3)
    @Story("Invalid Login")
    @Description("API 10: POST To Verify Login with invalid details")
    @Severity(SeverityLevel.NORMAL)
    public void testVerifyLoginWithInvalidDetails() {

        response = LoginEndpoints.verifyLoginWithInvalidDetails();
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 200, TestData.STATUS_CODE_NOT_CORRECT_MESSAGE);
        Assert.assertTrue(response.asString().contains(TestData.USER_NOT_FOUND_MESSAGE),
                TestData.USER_NOT_FOUND_FAILED_MESSAGE);
    }

    @Test(priority = 4)
    @Story("Negative - Delete Login")
    @Description("API 9: DELETE To Verify Login (Method Not Supported)")
    @Severity(SeverityLevel.MINOR)
    public void testDeleteVerifyLogin() {

        response = LoginEndpoints.deleteVerifyLogin();
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 200, TestData.STATUS_CODE_NOT_CORRECT_MESSAGE);
        Assert.assertTrue(response.asString().contains(TestData.METHOD_NOT_SUPPORTED_MESSAGE),
                TestData.METHOD_NOT_SUPPORTED_FAILED);
    }
}