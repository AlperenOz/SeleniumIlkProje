package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleURLTest {
    /*
    youtube a git
    title "video" kelimesini iceriyor mu check
    driver kapat
     */


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\xx\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        met(driver);
    }

    static void met(WebDriver driver){
        driver.get("http://youtube.com");
        if(driver.getTitle().contains("video")){
            System.out.println("title da 'video' var");
        }else{
            System.out.println("title da 'video' yok");
        }
        driver.quit();
    }
}
