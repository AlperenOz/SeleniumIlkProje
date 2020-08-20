package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearchTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\xx\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("city bike");
        searchBox.submit();

        WebElement numOfResults = driver.findElement(By.id("result-stats"));
        System.out.println(numOfResults.getText());

        WebElement shoppingLink = driver.findElement(By.partialLinkText("Shopping"));
        shoppingLink.click();





    }
}
