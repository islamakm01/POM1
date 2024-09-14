package process;

import PageObject.LoginPage;
import org.openqa.selenium.WebDriver;
import utility.BaseClass;

public class LoginProcess extends BaseClass {
    LoginPage lp;
    public LoginProcess(WebDriver driver) {
        super(driver);
    }
    public void loginWithValidUserName() {
        lp = new LoginPage(driver);

        lp.userName().sendKeys("fd@gmail.com");
        lp.password().sendKeys("3432423");
        lp.signIn().click();
    }
    public void loginWithInValidUserName() {
        lp = new LoginPage(driver);

        lp.userName().sendKeys("fdsds@gmail.com");
        lp.password().sendKeys("dsaas3423");
        lp.signIn().click();
    }
    public String errorMessage() {
        return "The email you entered isn’t connected to an account. ";
    }

}
