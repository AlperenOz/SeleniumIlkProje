package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\xx\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.navigate().to("http://amazon.com");

        //gets the title of and assigns it to title object
        String title = driver.getTitle();
        //gets the url of the current url and assigns it to url object
        String url = driver.getCurrentUrl();

        System.out.println(title);
        System.out.println(url);

        driver.quit();
    }
}
