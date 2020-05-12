package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class AccountActivityPage extends BasePage {

    @FindBy(xpath = "//a[text()=\"Account Activity\"]")
    public WebElement accountActivityModule;

    @FindBy(id = "aa_accountId")
    public WebElement accountDropDown;

    public String accountDropDefaultText(){
        Select select=new Select(accountDropDown);
        String str= select.getFirstSelectedOption().getText();
        System.out.println(str);
        return str;
    }

    public List<String> accountDropAllTexts(){
        Select select=new Select(accountDropDown);
        List<WebElement> list= select.getOptions();

        List<String> dropDownAllTexts=new ArrayList<>();
        for (WebElement each:list){
            dropDownAllTexts.add(each.getText());
            //System.out.println(each.getText());
        }
        System.out.println(dropDownAllTexts);
        return dropDownAllTexts;
    }

    @FindBy(xpath = "//div[starts-with(@id,\"all_transactions_\")]//thead//th[text()=\"Date\"]")
    public WebElement dateColumn;
    public String getDateColumnText(){
        return dateColumn.getText();
    }

    @FindBy(xpath = "//div[starts-with(@id,\"all_transactions_\")]//thead//th[text()=\"Description\"]")
    public WebElement descriptionColumn;
    public String getDescriptionColumnText(){
        return descriptionColumn.getText();
    }

    @FindBy(xpath = "//div[starts-with(@id,\"all_transactions_\")]//thead//th[text()=\"Deposit\"]")
    public WebElement depositColumn;
    public String getDepositColumnText(){
        return depositColumn.getText();
    }
    @FindBy(xpath = "//div[starts-with(@id,\"all_transactions_\")]//thead//th[text()=\"Withdrawal\"]")
    public WebElement withdrawColumn;
    public String getWithDrawColumnText(){
        return withdrawColumn.getText();
    }

}
