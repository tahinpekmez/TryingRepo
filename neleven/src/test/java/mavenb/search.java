package mavenb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import mavena.base.basepage;

import java.util.Random;

public class search extends basepage {
    public search(WebDriver driver) {
        super(driver);
    }

   // public static final By listProduct = By.xpath(".//div[@class='pagination']/a[2]");

   /* List <WebElement> List=driver.findElements(NavigationBar);
    ArrayList<String> Link = new ArrayList<String>();
        for (WebElement i : List) {
            Link.add(i.getAttribute("href"));
        }
       */

         public search clickNavigationBar( int a) {
             //Thread.sleep(1000);
             // Object o = Link.get(1);
             //System.out.println(Link.get(1));
             //clickElement();
             //Thread.sleep(1000);
           WebElement element =  driver.findElement(By.xpath(".//div[@class='pagination']/a["+a+"]"));
           System.out.println(element);
           Actions  builder = new Actions(driver);
           builder.moveToElement(element);
           builder.moveToElement(element).click().perform();
             //clickElement(listProduct);
             return this;
         }
         public search clickProduct(){

             int listProduct = driver.findElements(By.xpath(".//li[@class='column']/div/div[@class='pro']/a")).size();
             int i = new Random().nextInt(listProduct);
             WebElement element = driver.findElement(By.xpath(".//li[@class='column']["+i+"]/div/div[@class='pro']/a"));
             Actions  builder = new Actions(driver);
             builder.moveToElement(element);
             builder.moveToElement(element).click().perform();
             return this;
         }
    //List<WebElement> countProduct = driver.findElements(listProduct);
    //WebElement count = countProduct.get(Random())
    //int countProduct = driver.findElement(listProduct).getSize();
    //String link = countProduct.get(new Random().nextInt());
    // Random i = new Random().nextLong(countProduct)
    //istsProduct= driver.findElement(By.xpath(".//li[@class='column']["+i+"]/div/div[@class='pro']/a")).click();
     }

/*
.//li[@class='column']/div/div[@class='pro']/a   2.sayfadaki tüm ürünleri göndürüyor
        .//li[@class='column']["i"]/div/div[@class='pro']/a
li > div >div > a */