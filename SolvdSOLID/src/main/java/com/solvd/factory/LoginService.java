package com.solvd.factory;

public class LoginService {

    //Facade
    //DRY don't repeat yourself
    public void login() {
        LoginPageBase loginPageBase = LoginFactory.createLoginPage();
        loginPageBase.fillEmail();
        loginPageBase.fillPassword();
        loginPageBase.checkChecbox();
        loginPageBase.clickLoginBtn();
    }
}
