package Step_Definitions;

import Pages.CNB_LendingPage;
import Utilities.Config;
import Utilities.Driver;
import cucumber.api.java.en.When;

public class CNB_StepDefs {
    CNB_LendingPage cnb_lendingPage = new CNB_LendingPage();


    @When("User in homepage")
    public void user_in_homepage() {
        Driver.getDriver().get(Config.getProperty("mainURL"));
    }

    @When("User click login button")
    public void user_click_login_button() {
        cnb_lendingPage.loginButton.click();

    }

    @When("User should be able to click create an account button")
    public void user_should_be_able_to_click_create_an_account_button() {
        cnb_lendingPage.createAnAccount.click();
    }

    @When("User select {string} from the option")
    public void user_select_from_the_option(String string) {
        cnb_lendingPage.firstName.sendKeys("ABCDEF");
        cnb_lendingPage.lastName.sendKeys("GHIJK");
        cnb_lendingPage.phone.sendKeys("22420515");
        cnb_lendingPage.email.sendKeys("cnh@gmail.com");
        cnb_lendingPage.password.sendKeys("cnhsono123");
        cnb_lendingPage.createButton.click();
    }

    @When("User click create button")
    public void user_click_create_button() {
        cnb_lendingPage.createButton.click();

    }


}
