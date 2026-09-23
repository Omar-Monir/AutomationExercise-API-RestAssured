package tests;

import base.BaseTest;
import endPoints.UserEndpoints;
import io.qameta.allure.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import payload.User;
import utilities.TestData;
import utilities.TestDataHelper;

@Epic("Automation Exercise API")
@Feature("User Account APIs")
public class UserTests extends BaseTest {

    String createdEmail = TestData.getUniqueEmail();
    User user = TestDataHelper.buildUser(createdEmail);
    User userUpdated = TestDataHelper.buildUpdatedUser(createdEmail);

    @Test(priority = 1)
    @Story("Create User")
    @Description("API 11: POST To Create/Register User Account")
    @Severity(SeverityLevel.CRITICAL)
    public void testCreateUser() {

        Response response = UserEndpoints.createUser(user);

        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(), 200, TestData.STATUS_CODE_NOT_CORRECT_MESSAGE);
        Assert.assertTrue(response.asString().contains(TestData.USER_CREATED_MESSAGE),
                TestData.USER_CREATED_FAILED_MESSAGE);
    }

    @Test(priority = 2, dependsOnMethods = "testCreateUser")
    @Story("Get User")
    @Description("API 14: GET user account detail by email")
    @Severity(SeverityLevel.NORMAL)
    public void testGetUserAccountDetailByEmail() {

        Response response = UserEndpoints.getUserByEmail(createdEmail);

        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(), 200, TestData.STATUS_CODE_NOT_CORRECT_MESSAGE);
        Assert.assertTrue(response.asString().contains(createdEmail),
                TestData.USER_EMAIL_NOT_FOUND_MESSAGE);
    }

    @Test(priority = 3, dependsOnMethods = "testCreateUser")
    @Story("Update User")
    @Description("API 13: PUT METHOD To Update User Account")
    @Severity(SeverityLevel.NORMAL)
    public void testUpdateUser() {

        Response response = UserEndpoints.updateUser(userUpdated);

        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(), 200, TestData.STATUS_CODE_NOT_CORRECT_MESSAGE);
        Assert.assertTrue(response.asString().contains(TestData.USER_UPDATED_MESSAGE),
                TestData.USER_NOT_UPDATED_MESSAGE);
    }

    @Test(priority = 4, dependsOnMethods = "testCreateUser")
    @Story("Delete User")
    @Description("API 12: DELETE METHOD To Delete User Account")
    @Severity(SeverityLevel.CRITICAL)
    public void testDeleteUserAccount() {

        Response response = UserEndpoints.deleteUser(createdEmail, TestData.PASSWORD);

        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(), 200, TestData.STATUS_CODE_NOT_CORRECT_MESSAGE);
        Assert.assertTrue(response.asString().contains(TestData.ACCOUNT_DELETED_MESSAGE),
                TestData.ACCOUNT_NOT_DELETED_MESSAGE);
    }
}