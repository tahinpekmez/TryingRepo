package mavenb;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import mavena.base.basepage;

public class cartpage extends basepage {
    //private static final By PRICE = By.cssSelector(".priceArea");
   // private static final By INCREMENT = By.cssSelector(".spinnerUp spinnerArrow");
    private static final By INCREMENT = By.xpath(" .//div[@class='spinnerFieldContainer']/span[@class='spinnerUp spinnerArrow']");
    //private static final By PIACE = By.cssSelector(".quantity");
   // private static final By PIACE = By.xpath(".//div[@class='spinnerField ']/input");
   // private static final By DELETE = By.xpath(".//span[@class='removeProd svgIcon svgIcon_trash']");
   // private static final By EMPTY = By.cssSelector(".title");
    //private static final By EMPTY = By.xpath(".//div[@class='cartEmptyText']/h2");


    public cartpage(WebDriver driver) {
        super(driver);
    }
    public cartpage checkPrice(String value){
        String PRICE = driver.findElement(By.xpath(".//div[@class='priceArea']")).getText();
        Assert.assertEquals(PRICE, value);
        return this;
    }
    public cartpage IncrementProductCount(){
        Wait(1);
        clickElement(INCREMENT);
    return this;
    }
    public cartpage checkProductCount(int a) {
        String PIACE = driver.findElement(By.xpath(".//div[@class='spinnerField ']/input")).getAttribute("value");
        int artim= Integer.parseInt(String.valueOf(PIACE));
                //getAttribute("value");
        Assert.assertEquals(artim, a);
        return this;
    }

    public cartpage clickDeleteButton(){
        Wait(1);
        WebElement DELETE = driver.findElement(By.xpath(".//span[@class='removeProd svgIcon svgIcon_trash']"));
        //By.xpath(".//span[@class='removeProd svgIcon svgIcon_trash']");
            Actions builder = new Actions(driver);
            builder.moveToElement((WebElement) DELETE);
            builder.moveToElement((WebElement) DELETE).click().perform();
        return this;
    }

    public cartpage checkIfCartEmpty(String b){
        Wait(1);
        String EMPTY = driver.findElement(By.xpath(".//h2[@class='title']")).getText();
        Assert.assertEquals(EMPTY, b);
        return this;
            }
}