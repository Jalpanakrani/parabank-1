package htm.index.parabank.com.parasoft.parabank.testsuite;

import htm.index.parabank.com.parasoft.parabank.pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import htm.index.parabank.com.parasoft.parabank.pages.HomePage;
import htm.index.parabank.com.parasoft.parabank.pages.LoginPage;
import htm.index.parabank.com.parasoft.parabank.testbase.TestBase;

public class LoginPageTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        loginPage.enterusernamefield("abha");
        loginPage.clickOnLoginButton();
        loginPage.enterPassword("12345");
        String expectedMessage = "Account Overview";
        String actualMessage = loginPage.getAccountsOverviewText();
       Assert.assertEquals(actualMessage,expectedMessage,"Login page not displayed");
    }
    @Test
public void verifyTheErrorMessage(){
        loginPage.enterinvalidusernamefield("abcd");
        loginPage.invalidpasswordfield("54321");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage = "The username and password could not be verified.";
        String actualErrorMessage = loginPage.geterrorMessage();
        Assert.assertEquals( expectedErrorMessage, actualErrorMessage,"Error message not displayed");
    }
    @Test
    public void userShouldLogOutSuccessfully(){
        loginPage.enterusernamefield("abha");
        loginPage.clickOnLoginButton();
        loginPage.clickOnLogOutlink();
        loginPage.enterPassword("12345");
        String expectedMessage = "Customer Login";
        String actualMessage = loginPage.getCustomerLoginText();
        Assert.assertEquals(actualMessage,expectedMessage,"Login page not displayed");
    }

    }
