package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.BaseClass;

public class LoginPage extends BaseClass {
    public WebElement element = null;

    public static String email = "email";
    public static String password = "pass";
    public static String login = "login";
    public static String errorMessageClass = "//div[@class='_9ay5']";
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public WebElement userName() {
        element = getElementByName(email);
        return element;
    }
    public WebElement password() {
        element = getElementByName(password);
        return element;
    }
    public WebElement signIn() {
        element = getElementByName(login);
        return element;
    }
    public WebElement errorMessage() {
        element = getElementByXpath(errorMessageClass);
        return element;
    }
}
