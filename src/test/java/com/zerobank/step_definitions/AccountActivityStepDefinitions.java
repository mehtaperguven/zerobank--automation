package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

public class AccountActivityStepDefinitions {

    AccountActivityPage accountActivityPage=new AccountActivityPage();

    @Then("user navigates to account activity page")
    public void user_navigates_to_account_activity_page() {
        accountActivityPage.navigateTo("Account Activity");
    }


    @When("user verify dropdown default option is {string}")
    public void user_verify_dropdown_default_option_is(String string) {

        Assert.assertEquals(string,accountActivityPage.accountDropDefaultText());
    }
    @Then("user verify dropdown menu has following data")
    public void user_verify_dropdown_menu_has_following_data(List<String> dataTable) {

        List<String> accountList=accountActivityPage.accountDropAllTexts();

        Assert.assertEquals(accountList,dataTable);
    }
    @Then("transactions table should have following data")
    public void transactions_table_should_have_following_data(List<String> dataTable) {
    List<String> tableColumns=Arrays.asList(
                                            accountActivityPage.getDateColumnText(),
                                            accountActivityPage.getDescriptionColumnText(),
                                            accountActivityPage.getDepositColumnText(),
                                            accountActivityPage.getWithDrawColumnText());
    Assert.assertEquals(tableColumns,dataTable);
        System.out.println(tableColumns+"\n"+dataTable);

    }




}