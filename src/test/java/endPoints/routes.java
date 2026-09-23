package endPoints;

public class routes {

    public static String baseUrl = "https://automationexercise.com/api";

    //ProductsList
    public static String postProductListUrl = baseUrl +"/productsList";
    public static String getProductListUrl = baseUrl +"/productsList";

    //BrandsList
    public static String getBrandsListUrl = baseUrl +"/brandsList";
    public static String putBrandsListUrl = baseUrl +"/brandsList";

    //SearchProduct
    public static String postSearchProductUrl = baseUrl +"/searchProduct";

    //VerifyLogin
    public static String postVerifyLoginUrl = baseUrl +"/verifyLogin";
    public static String deleteVerifyLoginUrl = baseUrl +"/verifyLogin";

    //User Account
    public static String postCreateAccountUrl = baseUrl +"/createAccount";
    public static String getUserDetailByEmailUrl = baseUrl +"/getUserDetailByEmail";   //By Email
    public static String putUpdateAccountUrl = baseUrl +"/updateAccount";
    public static String deleteAccountUrl = baseUrl +"/deleteAccount";

}
