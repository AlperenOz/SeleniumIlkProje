package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_cssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\xx\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://a.testaddressbook.com/sign_in");

        //we used class here, thats why its ".classvalue"
        WebElement eMailBoxClass = driver.findElement(By.cssSelector(".form-control"));

        //we used id here, thats why its "#idvalue"
        WebElement eMailBoxId = driver.findElement(By.cssSelector("#session_email"));
        eMailBoxClass.sendKeys("testtechproed@gmail.com");

        WebElement passwordBoxId = driver.findElement(By.cssSelector("#session_password"));
        passwordBoxId.sendKeys("Test1234!");
        passwordBoxId.submit();









    }
}
