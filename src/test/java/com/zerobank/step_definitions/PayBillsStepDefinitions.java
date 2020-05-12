package com.zerobank.step_definitions;

import com.zerobank.pages.PayBillPage;
import com.zerobank.utilities.BrowserUtilities;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class PayBillsStepDefinitions {
    PayBillPage payBillPage=new PayBillPage();

    @When("user verifies that {string} is the page  and title is {string}")
    public void user_verifies_that_is_the_page_and_title_is(String moduleName, String title) {
        payBillPage.navigateTo(moduleName);
        String pageTitle=payBillPage.verifyPageTitle(moduleName);
        System.out.println(pageTitle);
        System.out.println(title);
        Assert.assertEquals(pageTitle,title);
    }


    @Then("user enters  amount , date and description information")
    public void user_enters_amount_date_and_description_information(List<Map<String,String>> dataTable) {
        Map<String,String> paymentInfo=dataTable.get(0);
        payBillPage.setPayment(paymentInfo.get("amount"),paymentInfo.get("date"),paymentInfo.get("description"));
        BrowserUtilities.wait(4);
        payBillPage.clickToPayButton();
        BrowserUtilities.wait(3);
    }

    @Then("user should verify that following {string} message is displayed")
    public void user_should_verify_that_following_message_is_displayed(String string) {
        Assert.assertEquals(payBillPage.getMessage(),string);
    }


}
