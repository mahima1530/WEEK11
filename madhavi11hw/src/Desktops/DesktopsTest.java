package Desktops;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import test.Utility;

public class DesktopsTest extends Utility {
    String baseUrl = "http://tutorialsninja.com/demo/index.php?";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {
        Actions actions = new Actions(driver);
        WebElement Desktop = driver.findElement(By.xpath("//a[text()='Desktops']"));
        WebElement showalldesktops = driver.findElement(By.xpath("//a[text()='Show AllDesktops']"));
        WebElement nameztoa = driver.findElement(By.xpath("//0ption[selected='Name (Z - A)']"));
        actions.moveToElement(Desktop).moveToElement(showalldesktops).
                moveToElement(nameztoa).click().build().perform();
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully(){
        Actions actions = new Actions(driver);
        WebElement Desktop = driver.findElement(By.xpath("//a[text()='Desktops']"));
        WebElement showalldesktops = driver.findElement(By.xpath("//a[text()='Show AllDesktops']"));
        WebElement nameztoa = driver.findElement(By.xpath("//0ption[selected='Name (Z - A)']"));
        WebElement product = driver.findElement(By.xpath("//a[text()='HP LP3065']"));
        WebElement deliverydate = driver.findElement(By.xpath("//input[@id='input-option225']"));
        WebElement qty = driver.findElement(By.xpath("//input[@id='input-quantity']"));
        WebElement addbutton = driver.findElement(By.xpath("//button[[@type, 'button'] and [text()='Add to Cart']]"));
        WebElement shoppingcart = driver.findElement(By.xpath(""));
        actions.moveToElement(Desktop).moveToElement(showalldesktops).
                moveToElement(nameztoa).click().build().perform();
        actions.moveToElement(product).moveToElement(deliverydate).
                moveToElement(qty).click().build().perform();
        actions.moveToElement(addbutton).moveToElement(shoppingcart).click().build().perform();

    }
    @After
    public void tearDown() {
        //closeBrowser();
    }
}