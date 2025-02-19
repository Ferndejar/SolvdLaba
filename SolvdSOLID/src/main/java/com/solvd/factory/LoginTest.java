package com.solvd.factory;

import com.beust.ah.A;
import org.testng.annotations.Test;

public class LoginTest {

    LoginService loginService = new LoginService();

    @Test
    public void login() {
       loginService.login();
    }

    @Test
    public void createWorkout() {
        loginService.login();
        //any logic to create workout
    }

    @Test
    public void sentReport() {
        loginService.login();
        //any logic to send repotr
    }

}
