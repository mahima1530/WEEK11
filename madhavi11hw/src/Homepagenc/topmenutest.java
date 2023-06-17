package Homepagenc;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import test.Utility;

import java.util.List;

public class topmenutest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void test1() {

        WebElement dropDown = driver.findElement(By.name("menu"));
        Select select = new Select(dropDown);

        List<WebElement> allOptions = select.getOptions();
        int sizeOfAllOptions = allOptions.size();
        System.out.println(sizeOfAllOptions);

        for (WebElement nameOfmenu : allOptions) {
            if (nameOfmenu.getText().equalsIgnoreCase("option")) {
                System.out.println(nameOfmenu.getText());

            }

        }
    } }