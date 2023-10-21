package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.myfirstproject.utilities.TestBase.waitForVisibility;

public class FirstSeleniumClass {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
//        driver.findElement(By.className("close")).click();
//        String tab = driver.findElement(By.xpath("//a[.='Hakkımızda']")).getText();
//        System.out.println("tab = " + tab);
//        driver.findElement(By.xpath("//a[.='Hakkımızda']")).click();
//        Thread.sleep(2000);
//        driver.quit();

// This line no needed when using WebDriverManager
/*        //System.setProperty("webdriver.chrome.driver","drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");*/


    }

//
//    //   ACCEPT COOKIES
//    public void acceptCookiesSwedish(){
//        WebElement acceptButton =  driver.findElement(By.xpath("//div[contains(.,'cookies')]//button[contains(.,'Godkänn alla')]"));
//        waitForVisibility(acceptButton, 5);
//        acceptButton.click();
//    }
//
//    public void acceptCookiesEnglish(){
//        WebElement acceptButton =  driver.findElement(By.xpath("//div[contains(.,'cookies')]//button[contains(.,'Accept all')]"));
//        waitForVisibility(acceptButton, 5);
//        acceptButton.click();
//    }


}
