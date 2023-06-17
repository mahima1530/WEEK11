package com_parabank_sw_3;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Register extends BaseTest {
    String baseUrl = "https://parabank.parasoft.com/parabank/index.htm ";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void test1() {

        WebElement registerLink = driver.findElement(By.className("//a[text()='Register']"));
        registerLink.click();


        WebElement firstnameField = driver.findElement(By.xpath("//b[text()='First Name:']"));
        firstnameField.sendKeys("madhvi");


        WebElement lastnamefield = driver.findElement(By.xpath("//b[text()='Last Name:']"));
        lastnamefield.sendKeys("patel");


        WebElement addressfield = driver.findElement(By.xpath("//b[text()='Address:']"));
        addressfield.sendKeys("17carmelite");


        WebElement cityfield = driver.findElement(By.xpath("//b[text()='City:']"));
        cityfield.sendKeys("harrow");

        WebElement statefield = driver.findElement(By.xpath("//b[text()='State:']"));
        statefield.sendKeys("london");

        WebElement codefield = driver.findElement(By.xpath("//b[text()='Zip Code:']"));
        codefield.sendKeys("ha35nl");

        WebElement phonefield = driver.findElement(By.xpath("//b[text()='Phone #:']"));
        phonefield.sendKeys("7405471955");

        WebElement ssnfield = driver.findElement(By.xpath("//b[text()='SSN:']"));
        ssnfield.sendKeys("342");


        WebElement usernameField = driver.findElement(By.xpath("//b[text()='Username:']"));
        usernameField.sendKeys("madhvi");

        WebElement passwordField = driver.findElement(By.xpath("//b[text()='Password:']"));
        passwordField.sendKeys("m@2331");

        WebElement confirmfield = driver.findElement(By.xpath("//b[text()='Confirm:']"));
        confirmfield.sendKeys("m@2331");

        WebElement registerButtonn = driver.findElement(By.xpath("//input[@value='Register']"));
        registerButtonn.click();

        WebElement successfullymsgfield = driver.findElement(By.xpath("//p[text()='Your account was created successfully. You are now logged in.']"));
        successfullymsgfield.sendKeys("successfull massage");

    }
    @After
    public void tearDown() {
        CloseBrowser();
    }

}