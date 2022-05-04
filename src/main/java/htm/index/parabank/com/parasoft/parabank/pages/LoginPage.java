package htm.index.parabank.com.parasoft.parabank.pages;


import org.openqa.selenium.By;
import htm.index.parabank.com.parasoft.parabank.utility.Utility;

public class LoginPage extends Utility {

    By usernameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.cssSelector("[value='Log In']");
    By AccountsOverviewText = By.xpath("//h1[contains(text(),'Accounts Overview')]");
    By invalidusernameField = By.name("username");
    By invalidpasswordField = By.name("password");
    By invalidloginButtonField = By.cssSelector("[value='Log In']");
    By errorMessage = By.xpath("//p[starts-with(text(),'An internal error')]");
    By LogOutLink= By.xpath("//a[starts-with(text(),'Log Out')]");
    By CustomerLoginText = By.xpath("//h2[contains(text(),'Customer Login')]");



    public void invalidpasswordfield(String invalidpassword) {
        sendTextToElement(invalidpasswordField,invalidpassword );
    }
    public void enterusernamefield(String Username) {
        sendTextToElement(usernameField, Username);
    }
        public void enterinvalidusernamefield(String invalidUsername) {
        sendTextToElement(invalidusernameField, invalidUsername);
    }
        public String getCustomerLoginText(){
        return getTextFromElement(CustomerLoginText);

    }
    public String getAccountsOverviewText() {
        return getTextFromElement(AccountsOverviewText);
    }
        public void invalidloginButtonField(String invalidloginButton){
        sendTextToElement(invalidloginButtonField, invalidloginButton);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }
public void clickOnLogOutlink(){
        clickOnElement(LogOutLink);
}
    public String geterrorMessage(){
        return getTextFromElement(errorMessage);
    }

}
