package mavenb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import mavena.base.basepage;


public class product extends basepage {

    public product(WebDriver driver) {
        super(driver);
    }

// .//div[@class='btnHolder']/a[@class='btn btnGrey btnAddBasket']']
    //private static final By ADD_TO_CART = By.cssSelector(".btn btnGrey btnAddBasket");
    private static final By ADD_TO_CART = By.xpath(".//div[@class='btnHolder']/a[@class='btn btnGrey btnAddBasket']");
    // .//div[@class='myBasketHolder processing']/a[@class='myBasket']
    //private static final By CART = By.cssSelector(".myBasket");
    //private static final By CART = By.xpath(".//div[@class='myBasketHolder processing']/a[@class='myBasket']");
    private static final By CART = By.xpath(".//div[@class='text']/a");

    public cartpage clickAddToCart(){
        clickElement(ADD_TO_CART);
        Wait(1);
        clickElement(CART);
        return new cartpage(driver);
    }
    public String Price() {
      Wait(1);
        String price = driver.findElement(By.xpath(".//div[@class='newPrice']/ins")).getText();
        return price;
    }
}