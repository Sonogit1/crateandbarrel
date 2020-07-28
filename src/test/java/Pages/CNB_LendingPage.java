package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CNB_LendingPage {

    public CNB_LendingPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "header-account-signed-out-text")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@class='button button-primary button-md button-full-width']")
    public WebElement createAnAccount;

    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "phone")
    public WebElement phone;

    @FindBy(id = "email")
    public WebElement email;


    @FindBy(id = "StrongPassword")
    public WebElement password;

    @FindBy(xpath= "//button[@class='button button-primary button-md create-account-button']")
    public WebElement createButton;








}
