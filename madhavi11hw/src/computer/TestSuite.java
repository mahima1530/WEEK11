package computer;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestSuite extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/ ";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void test1() {
        Actions actions = new Actions(driver);
        // Click on Computer Menu.
        WebElement computermenu = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li/a"));
        actions.moveToElement(computermenu).click().build().perform();

        //Click on Desktop
        WebElement Desktop = driver.findElement(By.xpath("//ul[@class='sublist first-level']/li/a"));
        actions.moveToElement(Desktop).click().build().perform();

        // Select Sort By position "Name: Z to A"
        WebElement name = driver.findElement(By.xpath("//option[text()='Name: Z to A']"));
        actions.moveToElement(name).click().build().perform();
        // Verify the Product will arrange in Descending order.

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() {
        Actions actions = new Actions(driver);
        // Click on Computer Menu.
        WebElement computermenu = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li/a"));
        actions.moveToElement(computermenu).click().build().perform();
        //Click on Desktop
        WebElement Desktop = driver.findElement(By.xpath("//ul[@class='sublist first-level']/li/a"));
        actions.moveToElement(Desktop).click().build().perform();
        // Select Sort By position "Name: Z to A"
        WebElement sortby = driver.findElement(By.xpath("//span[text()='Sort by']"));
        WebElement name = driver.findElement(By.xpath("//select[@id='products-orderby']"));
        actions.moveToElement(sortby).moveToElement(name).click().build().perform();
        // Verify the Product will arrange in Descending order.
        // Click on "Add To Cart"
        // Verify the Text "Build your own computer"
        WebElement add = driver.findElement(By.xpath("//button[text()='Add to cart']"));
        actions.moveToElement(add).click().build().perform();
        WebElement intel = driver.findElement(By.xpath("//div[@class='attributes']/dl/dd/select"));
        WebElement gb = driver.findElement(By.xpath("//select[@id='product_attribute_2']"));
        WebElement hdd = driver.findElement(By.xpath("//input[@id='product_attribute_3_7']"));
        WebElement os = driver.findElement(By.xpath("//ul[@class='option-list']/li[2]/label"));
        actions.moveToElement(intel).moveToElement(gb).moveToElement(hdd).moveToElement(os).click().build().perform();
        //Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        //Select "8GB [+$60.00]" using Select class.
        //Select HDD radio "400 GB [+$100.00]"
        // Select OS radio "Vista Premium [+$60.00]"
        WebElement checkbox = driver.findElement(By.xpath("//input[@id='product_attribute_5_10']"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@id='product_attribute_5_12']"));
        WebElement addcart = driver.findElement(By.xpath("//button[@id='add-to-cart-button-1']"));
        WebElement msg = driver.findElement(By.xpath("//div[@class='bar-notification success']"));
        actions.moveToElement(checkbox).moveToElement(checkbox2).moveToElement(addcart).moveToElement(msg).click().build().perform();
        // After that close the bar clicking on the cross button.
        // Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        // Verify the message "Shopping cart"
        //Change the Qty to "2" and Click on "Update shopping cart"
        // Verify the Total"$2,950.00"
        //click on checkbox “I agree with the terms of service”
        //Click on “CHECKOUT”
        WebElement shoppingcart = driver.findElement(By.xpath("//div[@class='header-links']/ul/li[4]/a/span"));
        WebElement qty = driver.findElement(By.xpath("//input[@id='itemquantity11219']"));
        WebElement updatingl = driver.findElement(By.xpath("//button[@class='button-2 update-cart-button']"));
        WebElement total = driver.findElement(By.xpath("//th[text()='Total']"));
        WebElement checkboxmsg = driver.findElement(By.xpath("//lable[text()='termsofservice']"));
        WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
        actions.moveToElement(shoppingcart).moveToElement(qty).moveToElement(updatingl).click().build().perform();
        actions.moveToElement(total).moveToElement(checkboxmsg).moveToElement(checkout).click().build().perform();
        // Verify the Text “Welcome, Please Sign In!”
        //Click on “CHECKOUT AS GUEST”Tab
        // Fill the all mandatory field
        // Click on “CONTINUE”
        //Click on Radio Button “Next Day Air($0.00)”
        // Click on “CONTINUE”
        WebElement guestcheckout = driver.findElement(By.xpath("//button[@class='button-1 checkout-as-guest-button']"));
        WebElement fillup = driver.findElement(By.xpath("//div[@class='result]"));
        WebElement continuebutton = driver.findElement(By.xpath("//a[text()='Continue']"));
        WebElement button = driver.findElement(By.xpath("//div[@class='Next Day Air']"));
        WebElement continuetab = driver.findElement(By.xpath("//a[text()='Continue']"));
        WebElement creditcard = driver.findElement(By.xpath("//input[@id='paymentmethod_1']"));
        actions.moveToElement(guestcheckout).moveToElement(fillup).moveToElement(continuebutton).click().build().perform();
        actions.moveToElement(button).moveToElement(continuetab).moveToElement(creditcard).click().build().perform();
       //Select “Master card” From Select credit card dropdown
       //Fill all the details
      // Click on “CONTINUE”
     // Verify “Payment Method” is “Credit Card”
      // Verify “Shipping Method” is “Next Day Air”
      //  Verify Total is “$2,950.00”
       // Click on “CONFIRM”
       // Verify the Text “Thank You”
        // Verify the message “Your order has been successfully processed!”
      // Click on “CONTINUE”
       // Verify the text “Welcome to our store”
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