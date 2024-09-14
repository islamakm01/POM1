package com.regression;

import org.testng.Assert;
import org.testng.annotations.Test;
import process.LoginProcess;

public class LoginTest extends SetUp {

    LoginProcess lp;
    LoginProcess lps;

    @Test
    public void correctUsernameAndPassword() {
        lp = new LoginProcess(driver);
        lps = new LoginProcess(driver);

        lp.loginWithValidUserName();
        Assert.assertEquals(lp.errorMessage(),lps.errorMessage());

    }
}
