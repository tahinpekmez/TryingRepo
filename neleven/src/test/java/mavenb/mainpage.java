package mavenb;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import mavena.base.basepage;

public class mainpage extends basepage {

	//private static final By KVKK_BUTTON = 
    private static final By LOGIN_BUTTON = By.cssSelector("a.btnSignIn");
    private static final By SEARCH_FIELD = By.cssSelector("#searchData");
    private static final By SEARCH_BUTTON = By.cssSelector(".searchBtn");
    private static final By CART_BUTTON = By.cssSelector(".myBasket");
    private static final By USER_NAME = By.cssSelector(".menuLink.user");

    public mainpage(WebDriver driver) {
        super(driver);
    }
    public loginpage clickLoginButton(){
        clickElement(LOGIN_BUTTON);
        return new loginpage(driver);
    }

    public mainpage clickSearchField(){
        clickElement(SEARCH_FIELD);
        return this;
    }
    public mainpage FillSearchBox(String FillSearchBox){
        sendKeysToElement(SEARCH_FIELD,FillSearchBox);
        return this;
    }
    public mainpage clickSearchButton(){
        clickElement(SEARCH_BUTTON);
        return this;
    }

    public mainpage clickCartButton(){
        clickElement(CART_BUTTON);
        return this;
    }

    public mainpage checkLogin(String username){
        String text = getElementText(USER_NAME);
        Assert.assertEquals(username, text);
        return this;
    }



}