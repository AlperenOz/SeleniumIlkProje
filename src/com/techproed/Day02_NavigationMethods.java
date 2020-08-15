package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\xx\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //.manage().window().maximize >> maximizes the page
        driver.manage().window().maximize();

        driver.get("https://google.com");

        //navigate().to() does the same job as get()
        driver.navigate().to("http://amazon.com");

        //navigate().back() >> go back one page
        driver.navigate().back();

        //navigate().forward() >> go forward one page
        driver.navigate().forward();

        //navigate().refresh() >> refresh the page
        driver.navigate().refresh();


    }
}
