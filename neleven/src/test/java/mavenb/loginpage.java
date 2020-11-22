package mavenb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import mavena.base.basepage;

public class loginpage extends basepage {

    private static final By EMAIL_FIELD = By.cssSelector("#email");
    private static final By PASSWORD_FIELD = By.cssSelector("#password");
    private static final By LOGIN_BUTTON = By.cssSelector("#loginButton");

    public loginpage(WebDriver driver) {
        super(driver);
    }
    public loginpage clickEmailField(){
        clickElement(EMAIL_FIELD);

        return this;
    }

    public loginpage clickPasswordField(){
        clickElement(PASSWORD_FIELD);
        return this;
    }

    public mainpage clickLoginButton() {
        clickElement(LOGIN_BUTTON);
        return new mainpage(driver);
    }

    public loginpage password(String password){
        sendKeysToElement(PASSWORD_FIELD,password);
        return this;
    }

    public loginpage username(String username) throws InterruptedException {
        Thread.sleep(1000);
        sendKeysToElement(EMAIL_FIELD,username);
        return this;
    }


}