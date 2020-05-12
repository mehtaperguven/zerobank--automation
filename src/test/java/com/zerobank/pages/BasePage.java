package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtilities;
import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, 25);


//https://github.com/Birnigar/zerobank-automation/blob/master/src/test/resources/features/login.feature
    public BasePage() {
        PageFactory.initElements(driver, this);
    }

    public void navigateTo(String string){
        WebElement module=driver.findElement(By.xpath("//a[text()='"+string+"']"));
        module.click();
        BrowserUtilities.wait(4);

    }

    public String verifyPageTitle(String moduleName){
        navigateTo(moduleName);
        return  Driver.getDriver().getTitle();
    }

}
