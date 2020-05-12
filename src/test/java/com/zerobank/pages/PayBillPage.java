package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBillPage extends BasePage {


    @FindBy(id = "sp_amount")
    public WebElement amountBox;
    @FindBy(id = "sp_date")
    public WebElement dateBox;
    @FindBy(id = "sp_description")
    public WebElement descriptionBox;

    public void setPayment(String amount,String dateInfo, String description){
        amountBox.sendKeys(amount);
        dateBox.sendKeys(dateInfo);
        descriptionBox.sendKeys(description);
        System.out.println("::: Enter make payments information ::: ");
        System.out.println("Enter amount :: " + amount);
        System.out.println("Enter date :: " + dateInfo);
        System.out.println("Enter description :: " + description);
    }

    @FindBy(id = "alert_content")
    public WebElement messageText;

    public String getMessage(){
        return  messageText.getText();
    }
}
