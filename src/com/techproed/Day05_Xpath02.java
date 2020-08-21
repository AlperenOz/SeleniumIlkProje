package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_Xpath02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\xx\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://a.testaddressbook.com");

        //theres only one element with "h1" tagName
        WebElement text = driver.findElement(By.tagName("h1"));
        System.out.println(text.getText());

        //bc it has no attributes, tagName will be enough
        WebElement text2 = driver.findElement(By.xpath("//h1"));
        System.out.println(text2.getText());







    }
}
