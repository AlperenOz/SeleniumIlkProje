package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day06_Facebook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\xx\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://facebook.com");

        /*
        1)
        e mail box ina techproed@gmail.com
         */
        WebElement emailBox = driver.findElement(By.xpath("//input[@type='text']"));
        emailBox.sendKeys("techproed@gmail.com");

        //password a Test1234
        WebElement passwordBox = driver.findElement(By.cssSelector("#pass"));
        passwordBox.sendKeys("Test1234");

        //lets find log in button
        WebElement logInButton = driver.findElement(By.xpath("//button"));
        logInButton.click();

        //https://www.facebook.com/login/
        //eger buraya girdiysek enter is failed

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        String logInURLCheck = driver.getCurrentUrl();
        System.out.println(logInURLCheck);

        //contains dememizin sebebi bazen url in sonuna extra code lar eklenebiliyor
        //bu yuzden .equals() demek yerine contains() dedik

        if (logInURLCheck.contains("facebook.com/login/")){
            System.out.println("log in failed successfully");
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();


    }
}
