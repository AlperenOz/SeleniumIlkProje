package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day05_Xpath01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\xx\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement signInBox = driver.findElement(By.xpath("//input[@type='email']"));
        signInBox.sendKeys("testtechproed@gmail.com");

        WebElement passwordBox = driver.findElement(By.xpath("//input[@data-test='password']"));
        passwordBox.sendKeys("Test1234!");

        WebElement signInButton = driver.findElement(By.xpath("//input[@name='commit']"));
        signInButton.click();

    }
}
