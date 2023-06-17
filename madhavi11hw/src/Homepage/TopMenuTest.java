package Homepage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import test.Utility;

/*1. create class "TopMenuTest"
1.1 create method with name "selectMenu" it has one parameter name "menu" of type
string
1.2 This method should click on the menu whatever name is passed as parameter.
Write the following Test:
1. verifyUserShouldNavigateToDesktopsPageSuccessfully()
1.1 Mouse hover on “Desktops” Tab and click
1.2 call selectMenu method and pass the menu = “Show All Desktops”
1.3 Verify the text ‘Desktops’
2. verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully()
2.1 Mouse hover on “Laptops & Notebooks” Tab and click
2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
2.3 Verify the text ‘Laptops & Notebooks’
3. verifyUserShouldNavigateToComponentsPageSuccessfully()
3.1 Mouse hover on “Components” Tab and click
3.2 call selectMenu method and pass the menu = “Show All Components”
3.3 Verify the text ‘Components’

 */
public class TopMenuTest extends Utility {// declare mouseover action test in this class
    String baseUrl = "http://tutorialsninja.com/demo/index.php?";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        Actions actions = new Actions(driver);
        WebElement Desktop = driver.findElement(By.xpath("//a[text()='Desktops']"));
        WebElement showalldesktops = driver.findElement(By.xpath("//a[text()='Show AllDesktops']"));
        actions.moveToElement(Desktop).moveToElement(showalldesktops).click().build().perform();
    }

    @Test
    public void verifyUserShouldNavigateToLaptopsandNotebooksPageSuccessfully() {

        Actions actions = new Actions(driver);
        WebElement LaptopsandNotebooks = driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));
        WebElement showallLaptopsandNotebooks = driver.findElement(By.xpath("//a[text()='Show AllLaptops & Notebooks']"));
        actions.moveToElement(LaptopsandNotebooks).moveToElement(showallLaptopsandNotebooks).click().build().perform();
    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        Actions actions = new Actions(driver);
        WebElement navigatetocomponent = driver.findElement(By.xpath("//a[text()='Components']"));
        WebElement showallLcomponent = driver.findElement(By.xpath("//a[text()='Show AllComponents']"));
        actions.moveToElement(navigatetocomponent).moveToElement(showallLcomponent).click().build().perform();

    }

    @After
    public void tearDown() {
        //closeBrowser();
    }

}

