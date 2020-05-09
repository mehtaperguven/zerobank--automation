package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtilities;
import com.zerobank.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id="signin_button")
    public WebElement signButton;

    @FindBy(id = "user_login")
    public WebElement userLogin;

    @FindBy(id = "user_password")
    public WebElement userPassword;

    @FindBy(css = "[value=\"Sign in\"]")
    public WebElement signInButton;

    @FindBy(css = "[tabindex=\"5\"]")
    public WebElement forgetPasswordButton;

    @FindBy(css = "[class=\"alert alert-error\"]")
    public WebElement errorMessage;

    public String getErrorText(){
        return errorMessage.getText();
    }


    public void clickToSignButton(){
        signButton.click();
    }

    public void login(String username, String password) {
        //clickToSignButton();
        userLogin.sendKeys(username);
        userPassword.sendKeys(password, Keys.ENTER);
        BrowserUtilities.waitForPageToLoad(15);
        BrowserUtilities.wait(4);

    }


    public void login() {
     // clickToSignButton();
      userLogin.sendKeys(ConfigurationReader.getProperty("username"));
      userPassword.sendKeys(ConfigurationReader.getProperty("password"), Keys.ENTER);
      BrowserUtilities.waitForPageToLoad(15);
      BrowserUtilities.wait(4);
    }



}
