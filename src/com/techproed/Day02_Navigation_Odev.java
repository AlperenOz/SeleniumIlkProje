package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_Navigation_Odev {
    public static void main(String[] args) {
        /*
        google a git
        youtube a git
        google back le geri don
        youtube a forward la ulas
        youtube u refresh
         */
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\xx\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        met(driver);
    }
    static void met(WebDriver i){
        i.get("http://google.com");
        i.navigate().to("http://youtube.com");
        i.navigate().back();
        i.navigate().forward();
        i.navigate().refresh();
        i.close();
    }
}
