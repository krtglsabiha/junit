package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_VerifyTitleTest {
    public static void main(String[] args) {

//   WebDriverManager.chromedriver().setup(); no need to use this anymore
//
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//maximize window

 //        Navigate to amazon homepage
        driver.get("https://www.amazon.com/");
//        Verify if page title contains “Amazon”
        String actualTitle=driver.getTitle();//returns the page title as String
        if (actualTitle.contains("Amazon")){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILS");
            System.out.println("ACTUAL TITLE : " + actualTitle+ " does not contain expected title : Amazon");
        }
        driver.quit();//quit browser


}
}
