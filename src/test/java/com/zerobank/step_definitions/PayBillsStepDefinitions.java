package com.zerobank.step_definitions;

import com.zerobank.pages.PayBillPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class PayBillsStepDefinitions {
    PayBillPage payBillPage=new PayBillPage();

    @Then("user navigates to {string} page")
    public void user_navigates_to_page(String pageName) {
        payBillPage.navigateTo(pageName);
    }
    @Then("user verifies that page is {string} and title is {string}")
    public void user_verifies_that_page_is_and_title_is(String moduleName, String title) {
        String pageTitle=payBillPage.verifyPageTitle(moduleName);
        System.out.println(pageTitle);
        System.out.println(title);
        Assert.assertEquals(pageTitle,title);
    }
}
