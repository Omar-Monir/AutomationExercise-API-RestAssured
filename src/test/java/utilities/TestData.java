package utilities;

public class TestData {

    // User Data
    public static final String EMAIL = "Software.Tester123123@test.com";
    public static final String NAME = "Software Tester";
    public static final String PASSWORD = "Test@1234";
    public static final String TITLE = "Mr";
    public static final String BIRTH_DATE = "15";
    public static final String BIRTH_MONTH = "5";
    public static final String BIRTH_YEAR = "1998";
    public static final String FIRST_NAME = "Software";
    public static final String LAST_NAME = "Tester";
    public static final String COMPANY = "Testing Company";
    public static final String ADDRESS1 = "Street 1";
    public static final String ADDRESS2 = "Street 2";
    public static final String COUNTRY = "Canada";
    public static final String ZIPCODE = "12345";
    public static final String STATE = "Ontario";
    public static final String CITY = "Toronto";
    public static final String MOBILE_NUMBER = "01012345678";

    // Form / Query Parameter Names
    public static final String NAME_PARAM = "name";
    public static final String EMAIL_PARAM = "email";
    public static final String PASSWORD_PARAM = "password";
    public static final String TITLE_PARAM = "title";
    public static final String BIRTH_DATE_PARAM = "birth_date";
    public static final String BIRTH_MONTH_PARAM = "birth_month";
    public static final String BIRTH_YEAR_PARAM = "birth_year";
    public static final String FIRSTNAME_PARAM = "firstname";
    public static final String LASTNAME_PARAM = "lastname";
    public static final String COMPANY_PARAM = "company";
    public static final String ADDRESS1_PARAM = "address1";
    public static final String ADDRESS2_PARAM = "address2";
    public static final String COUNTRY_PARAM = "country";
    public static final String ZIPCODE_PARAM = "zipcode";
    public static final String STATE_PARAM = "state";
    public static final String CITY_PARAM = "city";
    public static final String MOBILE_NUMBER_PARAM = "mobile_number";
    public static final String SEARCH_PRODUCT_PARAM = "search_product";
    public static final String BRANDS_PARAM = "products";

    //Login Data
    public static final String VALID_EMAIL = "Software.Tester123123@test.com";
    public static final String VALID_PASSWORD = "Test@1234";
    public static final String INVALID_EMAIL = "invalid.user@test.com";
    public static final String INVALID_PASSWORD = "WrongPassword123";

    //Assertion Messages
    public static final String USER_CREATED_MESSAGE = "User created!";
    public static final String USER_UPDATED_MESSAGE = "User updated!";
    public static final String ACCOUNT_DELETED_MESSAGE = "Account deleted!";
    public static final String REJECT_TO_PUT_TO_BRANDS_LIST = "This request method is not supported.";
    public static final String PRODUCT = "products";
    public static final String BRANDS = "brands";
    public static final String USER_EXISTS_MESSAGE = "User exists!";
    public static final String USER_NOT_FOUND_MESSAGE = "User not found!";
    public static final String EMAIL_OR_PASSWORD_MISSING_MESSAGE
            = "Bad request, email or password parameter is missing in POST request.";
    public static final String METHOD_NOT_SUPPORTED_MESSAGE = "This request method is not supported.";
    public static final String SEARCH_PRODUCT_MISSING_MESSAGE = "Bad request, search_product parameter is missing in POST request.";

    //Assertion Failed Messages
    public static final String USER_CREATED_FAILED_MESSAGE = "USER NOT CREATED";
    public static final String USER_NOT_UPDATED_MESSAGE = "USER NOT UPDATED";
    public static final String ACCOUNT_NOT_DELETED_MESSAGE = " ACCOUNT NOT DELETED";
    public static final String STATUS_CODE_NOT_CORRECT_MESSAGE = "STATUS CODE NOT CORRECT";
    public static final String USER_EMAIL_NOT_FOUND_MESSAGE = "USER EMAIL NOT FOUND";
    public static final String PRODUCT_LIST_NOT_APPEARED = "PRODUCT LIST NOT APPEARED";
    public static final String SEARCHED_PRODUCTS_NOT_FOUND = "SEARCHED PRODUCTS NOT FOUND";
    public static final String BRANDS_LIST_NOT_APPEARED = "BRANDS LIST NOT APPEARED";
    public static final String ACCEPTED_TO_PUT_TO_BRANDS_LIST = "ADDED A NEW BRAND TO BRANDS LIST";
    public static final String USER_EXISTS_FAILED_MESSAGE = "USER DOES NOT EXIST";
    public static final String USER_NOT_FOUND_FAILED_MESSAGE = "USER FOUND BUT SHOULD NOT";
    public static final String MISSING_PARAM_FAILED_MESSAGE = "MISSING PARAMETER MESSAGE NOT FOUND";
    public static final String METHOD_NOT_SUPPORTED_FAILED = "METHOD NOT SUPPORTED MESSAGE NOT FOUND";
    public static final String SEARCH_PRODUCT_MISSING_FAILED = "SEARCH PRODUCT MISSING MESSAGE NOT FOUND";

    //Others
    public static final long TIME_TO_RESPONSES = 5000;
    public static final String SEARCH_PRODUCT = "top";
    public static final String FORM_CONTENT_TYPE = "application/x-www-form-urlencoded";

    // Dynamic Email
    public static String getUniqueEmail() {
        return "Software.Tester" + System.currentTimeMillis() + "@test.com";
    }

}