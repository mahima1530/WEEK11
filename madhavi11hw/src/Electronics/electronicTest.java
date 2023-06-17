package Electronics;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class electronicTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/ ";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void test1() {

        //Mouse Hover on “Electronics”Tab
        //Mouse Hover on “Cell phones” and click
        //Verify the text “Cell phones”
        Actions actions = new Actions(driver);
        WebElement electronic = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[2]/a"));
        actions.moveToElement(electronic).click().build().perform();

        WebElement cellphone = driver.findElement(By.xpath("//a[text()='Cell phones ']"));
        actions.moveToElement(cellphone).click().build().perform();
    }
    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully(){
        Actions actions = new Actions(driver);
        // Mouse Hover on “Electronics”Tab
        // Mouse Hover on “Cell phones” and click
        // Verify the text “Cell phones”
        // Click on List View Tab
        // Click on product name “Nokia Lumia 1020” link
        // Verify the text “Nokia Lumia 1020”
        // Verify the price “$349.00”
        // Change quantity to 2
        // Click on “ADD TO CART” tab
        WebElement electronic = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[2]/a"));
        WebElement cellphone = driver.findElement(By.xpath("//a[text()='Cell phones ']"));
        WebElement list = driver.findElement(By.xpath("//a[text()='List']"));
        WebElement product = driver.findElement(By.xpath("//a[text()='Nokia Lumia 1020']"));
        WebElement price= driver.findElement(By.xpath("//div[@class='prices']/span"));
        WebElement qty = driver.findElement(By.xpath(""));
        WebElement addcart = driver.findElement(By.xpath("//button[text()='Add to cart']"));
        actions.moveToElement(electronic).moveToElement(cellphone).moveToElement(list).click().build().perform();
        actions.moveToElement(product).moveToElement(price).moveToElement(qty).moveToElement(addcart).click().build().perform();
        // Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        //Verify the message "Shopping cart"
        //Verify the quantity is 2
        //Verify the Total $698.00
        // click on checkbox “I agree with the terms of service”
        // Click on checkout
      // Verify the Text “Welcome, Please Sign In!”
        WebElement shoppingcart = driver.findElement(By.xpath("//div[@class='header-links']/ul/li[4]/a/span"));
        WebElement qtyy = driver.findElement(By.xpath("//div[@class='header-links']/ul/li[4]/a/span[2]"));
        WebElement updatingl = driver.findElement(By.xpath("//button[text()='Update shopping cart']"));
        WebElement total = driver.findElement(By.xpath("//td[@class='cart-total-left']/label"));
        WebElement checkboxmsg = driver.findElement(By.xpath("//input[@id='termsofservice']"));
        WebElement checkout = driver.findElement(By.xpath("//button[text()=' Checkout ']"));
        actions.moveToElement(shoppingcart).moveToElement(qty).moveToElement(updatingl).click().build().perform();
        actions.moveToElement(total).moveToElement(checkboxmsg).moveToElement(checkout).click().build().perform();
        //Verify the text “Register”
        //Fill the mandatory fields
        //Click on “REGISTER” Button
        //Verify the message “Your registration completed”
        // Click on “CONTINUE” tab
        // Verify the text “Shopping cart”
        //click on checkbox “I agree with the terms of service”
        // Click on “CHECKOUT”
        // Fill the Mandatory fields
        //Click on “CONTINUE”
        WebElement mastercard = driver.findElement(By.xpath("//select[@id='CreditCardType']"));
        WebElement fillupp = driver.findElement(By.xpath("//div[@class='title']/strong"));
        WebElement continuebtn = driver.findElement(By.xpath("//a[text()='Continue']"));
        WebElement payment = driver.findElement(By.xpath("//li[@class='payment-method']"));
        WebElement shipping= driver.findElement(By.xpath("//li[@class='shipping-method']"));
        WebElement totall = driver.findElement(By.xpath("//td[@class='cart-total-left']/label"));
        WebElement confirm = driver.findElement(By.xpath("//button[text()='Confirm']"));
        WebElement thankyou = driver.findElement(By.xpath("//h1[text()='Thank you']"));
        WebElement successfully = driver.findElement(By.xpath("//div[@class='title']/strong"));
        WebElement continuetb = driver.findElement(By.xpath("//button[text()='Continue']"));
        actions.moveToElement(mastercard).moveToElement(fillupp).moveToElement(continuebtn).click().build().perform();
        actions.moveToElement(payment).moveToElement(shipping).moveToElement(totall).click().build().perform();
        actions.moveToElement(confirm).moveToElement(thankyou).moveToElement(successfully).moveToElement(continuetb).click().build().perform();

    }
    @After
    public void tearDown() {
        //closeBrowser();
    }
}
