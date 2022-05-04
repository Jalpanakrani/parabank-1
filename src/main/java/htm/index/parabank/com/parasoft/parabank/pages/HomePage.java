package htm.index.parabank.com.parasoft.parabank.pages;


import org.openqa.selenium.By;
import htm.index.parabank.com.parasoft.parabank.utility.Utility;

public class HomePage extends Utility {

    By registerlink = By.xpath("//a[contains(text(),'Register')]");

    public void clickOnregisterLink(){
      clickOnElement(registerlink);
    }

}
