package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_LocatorsGiris {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\xx\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://a.testaddressbook.com");

        WebElement signInLink = driver.findElement(By.id("sign-in"));
        signInLink.click();

        WebElement emailBox = driver.findElement(By.className("form-control"));
        emailBox.sendKeys("testtechproed@gmail.com");

        WebElement passwordBox = driver.findElement(By.id("session_password"));
        passwordBox.sendKeys("Test1234!");

        WebElement signInButton = driver.findElement(By.name("commit"));
        signInButton.click();

    }
}
