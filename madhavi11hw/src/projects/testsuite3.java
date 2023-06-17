package projects;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.Utility;

public class testsuite3 extends Utility {
    String baseUrl = "https://www.saucedemo.com/ ";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void test1() {
        //Classname
        WebElement loginlink = driver.findElement(By.className("login_logo"));
        loginlink.click();


        //Id
        WebElement usernameField = driver.findElement(By.xpath("//input[@id='user-name']"));
        usernameField.sendKeys("standard_user");

        //Name
        WebElement passwordField = driver.findElement(By.xpath("//input[@class='login_password']"));
        //driver.findElement(By.name("Password"));
        passwordField.sendKeys("secret_sauce");

        //linkTest
        WebElement loginButton = driver.findElement(By.xpath("//input[text()='login-button']"));
        loginButton.click();

        //xpath----//tagname[@attribute='value']
        driver.findElement(By.xpath("//input[@class='header_secondary_container']div[7]/a")).sendKeys("backpack");
        //xpath----//tagname[@attribute='value']
        driver.findElement(By.xpath("//input[@class='header_container']div[8]/a")).sendKeys("bike light");
        //xpath----//tagname[@attribute='value']
        driver.findElement(By.xpath("//input[@class='header_container']div[10]/a")).sendKeys("t-shirt");
        //xpath----//tagname[@attribute='value']
        driver.findElement(By.xpath("//input[@class='header_container']div[12]")).sendKeys("jacket");
        //xpath----//tagname[@attribute='value']
        driver.findElement(By.xpath("//input[@class='header_container']div[13]")).sendKeys("sauce lab onesie");
        //xpath----//tagname[@attribute='value']
        driver.findElement(By.xpath("//input[@class='header_container']div[14]")).sendKeys("red t-shirt");


    }

    @After
    public void tearDown() {
        CloseBrowser();
    }
}



