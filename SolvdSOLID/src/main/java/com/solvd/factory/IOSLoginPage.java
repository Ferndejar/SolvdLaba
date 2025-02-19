package com.solvd.factory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IOSLoginPage extends LoginPageBase{

    @FindBy(id = "ios-email")
    private WebElement emailInputField;

    @FindBy(id = "pass")
    private WebElement passInputField;

    @FindBy(id = "login-button")
    private WebElement loginBtn;

    public void fillEmail() {
        emailInputField.sendKeys("isnytko@solvd.com");
    }

    public void fillPassword() {
        passInputField.sendKeys("isnytko@solvd.com");
    }

    public void clickLoginBtn() {
        loginBtn.click();
    }

    @Override
    public void checkChecbox() {

    }
}
