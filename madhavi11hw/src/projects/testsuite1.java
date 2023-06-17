package projects;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.Utility;

public class testsuite1 extends Utility {
    String baseUrl = " https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void test1() {

        //Classname
        WebElement loginLink = driver.findElement(By.className("ico-login"));
        loginLink.click();

        //Id
        WebElement usernameField = driver.findElement(By.xpath("//input[@id='Username']"));
        usernameField.sendKeys("Admin");

        //Name
        WebElement passwordField=driver.findElement(By.xpath("//input[@id='Password']"));
        //driver.findElement(By.name("Password"));
        passwordField.sendKeys("admin123");

        //linkTest
        WebElement loginButton=driver.findElement(By.xpath("//a[text()='Log in']"));
        loginButton.click();
    }
    @After
    public void tearDown() {
        CloseBrowser();
    }

}






