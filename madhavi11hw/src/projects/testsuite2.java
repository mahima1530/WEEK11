package projects;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.Utility;

public class testsuite2 extends Utility {
    String baseUrl = "http://the-internet.herokuapp.com/login ";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void test1() {
        //Classname
        WebElement loginlink = driver.findElement(By.className("ico-login"));
        loginlink.click();


        //Id
        WebElement usernameField = driver.findElement(By.xpath("//input[@id='username']"));
        usernameField.sendKeys("tomsmith");

        //Name
        WebElement passwordField=driver.findElement(By.xpath("//input[@id='password']"));
        //driver.findElement(By.name("Password"));
        passwordField.sendKeys("SuperSecretPassword!");

        //linkTest
        WebElement loginButton=driver.findElement(By.xpath("//i[text()=' Login'] "));
        loginButton.click();


        WebElement usernamefield = driver.findElement(By.xpath("//input[@id='username']"));
        usernamefield.sendKeys("tomsmithl");

        //Name
        WebElement passwordfield=driver.findElement(By.xpath("//input[@id='password']"));
        //driver.findElement(By.name("Password"));
        passwordfield.sendKeys("SuperSecretPassword!");
        //login error
        WebElement loginerror = driver.findElement(By.xpath("//input[@class='flash error']"));
        loginerror.click();

        WebElement Usernamefield = driver.findElement(By.xpath("//input[@id='username']"));
        Usernamefield.sendKeys("tomsmithl");

        //Name
        WebElement Passwordfield=driver.findElement(By.xpath("//input[@id='password']"));
        //driver.findElement(By.name("Password"));
        Passwordfield.sendKeys("SuperSecretPassword!");
        //login error
        WebElement Loginerror = driver.findElement(By.linkText("//input[@id='flash-messages']div/a"));
        Loginerror.click();


    }
    @After
    public void tearDown() {
        CloseBrowser();
    }

}








