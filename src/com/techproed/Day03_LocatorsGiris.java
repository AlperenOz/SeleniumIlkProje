package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day03_LocatorsGiris {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\xx\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //bu 3 sn bekle demek. bunun sebebi pc yavas oldugu icin verilen
        //komutlari zamaninda yetistiremedi. zaman verince yavas olsa da
        // komutlari yapmada problem yasamaz
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("http://a.testaddressbook.com");

        //lets find our first webelement!!
        //web sayfasinda bulacagimiz tum elemanlarin data type i WebElement
        //== pro-tip ==>> control click the class to go inside of it

        //here we find the sign in webelement by using its unique id
        WebElement signInLink = driver.findElement(By.id("sign-in"));

        //to click the specified element
        signInLink.click();


        WebElement eMailName = driver.findElement(By.id("session_email"));
        //senKeys() automatically click the element, so no need to call .click()
        eMailName.sendKeys("testtechproed@gmail.com");

        WebElement passwordFill = driver.findElement(By.id("session_password"));
        passwordFill.sendKeys("Test1234!");

        WebElement signInButton = driver.findElement(By.name("commit"));
        signInButton.click();

        //to check if sign in was successful
        //when sign in title becomes "Address Book" so check this
        String title = driver.getTitle();

        if(title.equals("Address Book")){
            System.out.println("Successful");
        }else System.out.println("Failed");

    }
}
