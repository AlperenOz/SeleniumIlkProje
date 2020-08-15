package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {
    public static void main(String[] args) {
        //chrome driver is added to the project
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\xx\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        //thats a webDriver object, chrome driver is now usable
        //this code opens up the driver but it would be empty
        WebDriver webDriver = new ChromeDriver();

        //reaches the url
        webDriver.get("https://wikipedia.org");
        webDriver.get("https://twitter.com");

        //quits the driver with all the webpages
        //webDriver.quit();

        //closes the (current) open webpage
        //webDriver.close();
    }
}
