package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_LocatorLinkedText {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\xx\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //bu kod sunu diyor >> bir sayfanin acilmasini 5 sn ye kadar bekleyebilrsin
        //yani bunu cop paste le asagilara tekrar tekrar yazmanin manasi yok
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://a.testaddressbook.com");

        //linkText
        //type exactly what the link says
        WebElement signInButton = driver.findElement(By.linkText("Sign in"));
        signInButton.click();

        //partialLinkText
        //didnt even write "Home", part of the link is enough
        //we can even only write "H",bc theres no other link that contains "H"
        WebElement homeLink = driver.findElement(By.partialLinkText("H"));
        homeLink.click();

    }
}
