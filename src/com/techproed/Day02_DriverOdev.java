package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverOdev {
    /*
    driver i maximize et
    google a git
    title i ekrana yazdir
    youtube a git
    title i ve url ini ekrana yazdir
    google geri gel , url i al print et
    driver dan cik
     */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\xx\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        met(driver);

    }

    static void met(WebDriver driver){
        driver.manage().window().maximize();
        driver.get("http://google.com");

        String gtitle = driver.getTitle();
        System.out.println(gtitle);

        driver.navigate().to("http://youtube.com");

        String ytitle = driver.getTitle();
        String yurl = driver.getCurrentUrl();
        System.out.println(ytitle + "\n" + yurl);

        driver.navigate().back();

        String lasturl = driver.getCurrentUrl();
        System.out.println(lasturl);

        driver.quit();
    }

}
