package htm.index.parabank.com.parasoft.parabank.pages;

import org.openqa.selenium.By;
import htm.index.parabank.com.parasoft.parabank.utility.Utility;

public class RegisterPage extends Utility {
    By SigningupiseasyText = By.xpath("//h1[text()='Signing up is easy!']");
    By firstnameField = By.id("customer.firstName");
    By lastnameField = By.id("customer.lastName");
    By addressField = By.id("customer.address.street");
    By cityField = By.id("customer.address.city");
    By StateField = By.id("customer.address.state");
    By zipcodeField = By.id("customer.address.zipCode");
    By phoneField = By.id("customer.phoneNumber");
    By SSNfield = By.id("customer.ssn");
    By UsernameField = By.id("customer.username");
    By passwordfield = By.id("customer.password");
    By confirmpasswordField = By.id("repeatedPassword");
    By registerButton = By.xpath("//input[@value='Register']");
    By registerlink = By.xpath("//a[contains(text(),'Register')]");

    public void clickOnregisterlink() {
        clickOnElement(registerlink);
    }
    public void Usernamefield(String Username){
        sendTextToElement(UsernameField,Username);
    }
    public String getSigningupiseasyText(){
        return getTextFromElement(SigningupiseasyText);
    }

    public void addressField(String address) {
        sendTextToElement(addressField, address);
    }
        public void enterzipcodefield(String zipcode) {
        sendTextToElement(zipcodeField, zipcode);
    }
        public void enterStateField(String State) {
        sendTextToElement(StateField, State);
    }
        public void enterphonefield(String phone) {
        sendTextToElement(phoneField, phone);
    }
        public void enterSSNfield(String SSN){
            sendTextToElement(SSNfield, SSN);
        }
        public void entercityfield(String City){
            sendTextToElement(cityField, City);
        }

        public void enterpassword (String password){
            sendTextToElement(passwordfield, password);
        }
        public void enterconfirmPassword (String confirmPassword){
            sendTextToElement(confirmpasswordField, confirmPassword);
        }
        public void clickOnRegisterButton(){
            clickOnElement(registerButton);
        }
    public void FirstnameField(String firstname){
            sendTextToElement(firstnameField, firstname);
        }
        public void enterlastname(String lastname){
            sendTextToElement(lastnameField,lastname);
        }

    }
