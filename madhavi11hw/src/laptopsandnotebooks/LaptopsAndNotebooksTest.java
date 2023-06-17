package laptopsandnotebooks;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import test.Utility;

public class LaptopsAndNotebooksTest extends Utility {

    String baseUrl = "http://tutorialsninja.com/demo/index.php?";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
public void verifyProductsPriceDisplayHighToLowSuccessfully(){

    Actions actions = new Actions(driver);
    WebElement LaptopsandNotebooks = driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));
    WebElement showallLaptopsandNotebooks = driver.findElement(By.xpath("//a[text()='Show AllLaptops & Notebooks']"));
    WebElement shortby = driver.findElement(By.xpath("//0ption[selected='Price (High > Low)']"));
        actions.moveToElement(LaptopsandNotebooks).moveToElement(showallLaptopsandNotebooks).moveToElement(shortby).click().build().perform();
}
@Test
public void verifyThatUserPlaceOrderSuccessfully(){
    Actions actions = new Actions(driver);
    WebElement LaptopsandNotebooks = driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));
    WebElement showallLaptopsandNotebooks = driver.findElement(By.xpath("//a[text()='Show AllLaptops & Notebooks']"));
    WebElement shortby = driver.findElement(By.xpath("//0ption[selected='Price (High > Low)']"));
    WebElement macbook= driver.findElement(By.xpath("//a[text()='MacBook']"));
    WebElement addcart = driver.findElement(By.xpath("//button[text()='Add to Cart']"));
    WebElement shoppingcart = driver.findElement(By.xpath("//span[text()='Shopping Cart']"));
    WebElement changeqty = driver.findElement(By.xpath("//td[text()='Quantity']"));
    WebElement qty = driver.findElement(By.xpath("//input[@value=2]"));
    WebElement updatetab= driver.findElement(By.xpath("//button[text()='Update']"));
    WebElement checkout = driver.findElement(By.xpath("//a[text()='Checkout']"));
    WebElement checkoutguest = driver.findElement(By.xpath("//input[@value='guest']"));
    WebElement continuebutton= driver.findElement(By.xpath("//input[@value='Continue']"));
    WebElement filllup = driver.findElement(By.xpath("//div[@id='collapse-payment-address']"));
    WebElement continuetab = driver.findElement(By.xpath("//input[@value='Continue']"));
    WebElement comment= driver.findElement(By.xpath("//strong[text()='Add Comments About Your Order']"));
    WebElement termsandcondition = driver.findElement(By.xpath("//a[text()='Terms & Conditions']"));
    WebElement continuebutn = driver.findElement(By.xpath("//input[@value='Continue']"));
    WebElement alertmsg = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));

    actions.moveToElement(LaptopsandNotebooks).moveToElement(showallLaptopsandNotebooks).moveToElement(shortby).click().build().perform();
    actions.moveToElement(macbook).moveToElement(addcart).moveToElement(shoppingcart).click().build().perform();
    actions.moveToElement(changeqty).moveToElement(qty).moveToElement(updatetab).click().build().perform();
    actions.moveToElement(checkout).moveToElement(checkoutguest).moveToElement(continuebutton).click().build().perform();
    actions.moveToElement(filllup).moveToElement(continuetab).moveToElement(comment).click().build().perform();
    actions.moveToElement(termsandcondition).moveToElement(continuebutn).moveToElement(alertmsg).click().build().perform();

    }
    @After
    public void tearDown() {
        //closeBrowser();
    }
}
