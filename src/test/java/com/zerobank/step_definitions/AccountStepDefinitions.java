package com.zerobank.step_definitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.LoginPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class AccountStepDefinitions {

    LoginPage loginPage=new LoginPage();
    AccountSummaryPage accountSummaryPage=new AccountSummaryPage();



    @Then("Account summary page should have following account types")
    public void account_summary_page_should_have_following_account_types(List<String> dataTable) {

        List<String> accountTypes= Arrays.asList(accountSummaryPage.cashAccountsText(),
                                                 accountSummaryPage.investmentAccountsText(),
                                                 accountSummaryPage.creditAccountsText(),
                                                 accountSummaryPage.loanAccountsText());
        for(int i=0; i<4; i++) {

            Assert.assertEquals(accountTypes.get(i), dataTable.get(i));
            System.out.println(accountTypes.get(i)+"  "+dataTable.get(i));

        }
    }
    //<E>, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V>

    @Then("Credit Accounts should have following columns")
    public void credit_Accounts_should_have_following_columns(List<String> dataTable) {
    List<String> creditAccountColumns=Arrays.asList(accountSummaryPage.accountColumnText(),
                                                    accountSummaryPage.creditCardColumnText(),
                                                    accountSummaryPage.balanceColumnText());
    for (int i=0; i<3;i++){
        Assert.assertEquals(creditAccountColumns.get(i),dataTable.get(i));
        System.out.println(creditAccountColumns.get(i)+"  "+dataTable.get(i));
    }

    }

}
