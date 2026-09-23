package utilities;

import payload.User;

public class TestDataHelper {

    public static User buildUser(String email) {

        User user = new User();
        user.setName(TestData.NAME);
        user.setEmail(email);
        user.setPassword(TestData.PASSWORD);
        user.setTitle(TestData.TITLE);
        user.setBirth_date(TestData.BIRTH_DATE);
        user.setBirth_month(TestData.BIRTH_MONTH);
        user.setBirth_year(TestData.BIRTH_YEAR);
        user.setFirstname(TestData.FIRST_NAME);
        user.setLastname(TestData.LAST_NAME);
        user.setCompany(TestData.COMPANY);
        user.setAddress1(TestData.ADDRESS1);
        user.setAddress2(TestData.ADDRESS2);
        user.setCountry(TestData.COUNTRY);
        user.setZipcode(TestData.ZIPCODE);
        user.setState(TestData.STATE);
        user.setCity(TestData.CITY);
        user.setMobile_number(TestData.MOBILE_NUMBER);

        return user;
    }

    public static User buildUpdatedUser(String email) {

        User user = buildUser(email);
        user.setName("Updated Name");
        user.setCity("Updated City");
        user.setCompany("Updated Company");

        return user;
    }

}