package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_ifElse {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\xx\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://amazon.com");
        //can declare var instead of String
        var AmaMainTitle = driver.getTitle();//books

        if(AmaMainTitle.toLowerCase().contains("books")){
            System.out.println("theres 'books' in the title: " + AmaMainTitle);
        }else System.out.println("theres no 'books' in the title: " + AmaMainTitle);

        driver.quit();

    }
}
