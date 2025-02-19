package com.solvd.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AndroidLoginPage extends LoginPageBase{

    @FindBy(id = "email")
    private WebElement emailInputField;

    @FindBy(id = "password")
    private WebElement passInputField;

    @FindBy(id = "login")
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
