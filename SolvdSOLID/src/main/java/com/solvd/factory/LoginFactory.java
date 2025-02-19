package com.solvd.factory;


import java.util.ResourceBundle;

public class LoginFactory {

    static ResourceBundle resourceBundle = ResourceBundle.getBundle("conf");
    static String type = resourceBundle.getString("type");

    public static LoginPageBase createLoginPage() {
        if (type.equals("android")) {
            return new AndroidLoginPage();
        } else if (type.equals("ios")) {
            return new IOSLoginPage();
        }
        return null;
    }
}
