package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day04_Findelements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\xx\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://a.testaddressbook.com");

        //first, find all the elements with "a" tagName
        //so we need a List for that, List of WebElements
        List<WebElement> listWE = driver.findElements(By.tagName("a"));

        //to print the list
        for (WebElement w: listWE) {
            System.out.println(w.getText());
        }

        /*
        == NOTE ==
        you cant println(listWE) like usual, it gives something different
        bc elements of the list is WebElements they cant be printed like that
        use getText()
         */





    }
}
