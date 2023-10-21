package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_WebDriverManagerTest {
    public static void main(String[] args) {


        //1.WebDriverManager is used to instantiate the drivers
        WebDriverManager.chromedriver().setup();

        //2.create the ChromeDriver
        WebDriver driver = new ChromeDriver();

        //3.Now that we have our driver ready to use, we can start automation
        driver.get("https://www.google.com/");
    }
}
