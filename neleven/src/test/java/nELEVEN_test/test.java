package nELEVEN_test;

import mavena.base.basetest;
import mavena.base.basepage;
import mavenb.cartpage;
import mavenb.mainpage;
import mavenb.product;
import mavenb.search;
import org.junit.Test;

public class test extends basetest {
    private basepage basePage;
    private String value = "";

    @Override
    public void setUp() throws Exception {
        super.setUp();
        basePage = new basepage(driver);
    }

    @Test
    public void denemeTest() throws InterruptedException {
        new mainpage(driver)
                .clickLoginButton().username("enter your e-mail").password("enter your password").clickLoginButton()
                .checkLogin("user")
                .FillSearchBox("Samsung")
                .clickSearchButton();


        new search(driver)
                .clickNavigationBar(5)

                .clickProduct();
        value = new product(driver).Price();

        new product(driver).clickAddToCart().checkPrice(value);

        new cartpage(driver)
                .IncrementProductCount().checkProductCount(2).clickDeleteButton()
                .checkIfCartEmpty("Sepetiniz Boş");
    }
}
