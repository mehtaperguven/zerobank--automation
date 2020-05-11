package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtilities;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

public class LoginStepDefinitions {

    LoginPage loginPage=new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("Open login page");
        String URL = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(URL);
        loginPage.clickToSignButton();
    }

    @When("user login as authorized user")
    public void user_login_as_authorized_user() {
        System.out.println("Login with valid credentials");
        loginPage.login();

    }

    @Then("user should verify that  title is {string}")
    public void user_should_verify_that_title_is(String string) {
        System.out.println("Verify that Zero -Account Summary title is displayed");
        Assert.assertEquals(string,Driver.getDriver().getTitle());
    }

    @When("user enters invalid  username and password")
    public void user_enters_invalid_username_and_password(List<Map<String,String>> dataTable) {

        for(int i=0; i<4; i++) {
            Map<String, String> credentials = dataTable.get(i);
            loginPage.login(credentials.get("username"), credentials.get("password"));
            System.out.println(credentials.get("username") + " " + credentials.get("password"));
           // Assert.assertEquals(loginPage.getErrorText(), "Login and/or password are wrong.");

        }
    }


    @Then("user should verify that {string} message is displayed")
    public void user_should_verify_that_message_is_displayed(String string) {
    Assert.assertEquals(string,loginPage.getErrorText());
    }


}
