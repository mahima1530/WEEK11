package com_parabank_sw_3;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://parabank.parasoft.com/parabank/index.htm ";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void test1() {


        WebElement usernameField = driver.findElement(By.xpath("//b[text()='Username']"));
        usernameField.sendKeys("madhvi");

        WebElement passwordField=driver.findElement(By.xpath("//b[text()='Password']"));
        passwordField.sendKeys("m@2331");

        WebElement loginButton=driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

        WebElement UsernameField = driver.findElement(By.xpath("//b[text()='Username']"));
        UsernameField.sendKeys("madhavi");

        WebElement PasswordField =driver.findElement(By.xpath("//b[text()='Password']"));
        PasswordField.sendKeys("madhv2331");

        WebElement loginbutton=driver.findElement(By.xpath("//input[@value='Log In']"));
        loginbutton.click();

        WebElement errorfield=driver.findElement(By.xpath("//p[text()='The username and password could not be verified.']"));
        errorfield.click();

        WebElement usernameeField = driver.findElement(By.xpath("//b[text()='Username']"));
        usernameeField.sendKeys("madhvi");

        WebElement passwordfield =driver.findElement(By.xpath("//b[text()='Password']"));
        passwordfield.sendKeys("m@2331");

        WebElement logoutbutton=driver.findElement(By.xpath("//a[text()='Log Out']"));
        logoutbutton.click();

        WebElement customerloginlink=driver.findElement(By.xpath("//h2[text()='Customer Login']"));
        customerloginlink.click();

    }
    @After
    public void tearDown() {
        CloseBrowser();
    }

}





