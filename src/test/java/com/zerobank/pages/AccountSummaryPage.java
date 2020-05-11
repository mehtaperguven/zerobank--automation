package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountSummaryPage extends BasePage {

    @FindBy(xpath = "//h2[text()=\"Cash Accounts\"]")
    public WebElement cashAccountsTable;
    public String cashAccountsText(){
        return cashAccountsTable.getText();
    }

    @FindBy(xpath = "//h2[text()=\"Investment Accounts\"]")
    public WebElement investmentAccountsTable;

    public String investmentAccountsText(){
        return investmentAccountsTable.getText();
    }
    @FindBy(xpath = "//h2[text()=\"Credit Accounts\"]")
    public WebElement creditAccountsTable;
    public String creditAccountsText(){
        return creditAccountsTable.getText();
    }

    @FindBy(xpath = "//h2[text()=\"Loan Accounts\"]")
    public WebElement loanAccountsTable;

    public String loanAccountsText(){
        return loanAccountsTable.getText();
    }

    @FindBy(xpath = "(//div[@class=\"board-content\"]//thead//th[text()=\"Account\"])[3]")
    public WebElement accountColumn;
    public String accountColumnText(){
        return accountColumn.getText();
    }
    @FindBy(xpath = "//div[@class=\"board-content\"]//thead//th[text()=\"Credit Card\"]")
    public WebElement creditCardColumn;
    public String creditCardColumnText(){
        return creditCardColumn.getText();
    }

    @FindBy(xpath = "(//div[@class=\"board-content\"]//thead//th[text()=\"Balance\"])[3]")
    public WebElement balanceColumn;
    public String balanceColumnText(){
        return balanceColumn.getText();
    }
}
