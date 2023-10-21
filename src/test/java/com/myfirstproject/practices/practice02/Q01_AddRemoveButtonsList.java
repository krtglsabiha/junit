package com.myfirstproject.practices.practice02;

import com.myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Q01_AddRemoveButtonsList extends TestBase {
        /*
    Given
        Go to http://the-internet.herokuapp.com/add_remove_elements/
    When
        Click on the "Add Element" button 100 times
    And
        Click on the "Delete" button 20 times
    Then
        Assert that 20 buttons were deleted.
      */

    @Test
    public void test() {

//        Go to http://the-internet.herokuapp.com/add_remove_elements/
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");

//        Click on the "Add Element" button 100 times
        for (int i = 0; i < 100; i++) {
            driver.findElement(By.xpath("//button[.='Add Element']")).click();
        }

//        Click on the "Delete" button 20 times
        List<WebElement> deleteButtons = driver.findElements(By.xpath("//button[.='Delete']"));//[deleteButton, deleteButton, ...]
        System.out.println("Number of delete buttons before clicking delete buttons: " + deleteButtons.size());//100
        for (int i = 0; i < 20; i++) {
            deleteButtons.get(i).click();
        }

//        Assert that 20 buttons were deleted.
        List<WebElement> deleteButtonsAfterDelete = driver.findElements(By.xpath("//button[.='Delete']"));//[deleteButton, deleteButton, ...]
        int numOfDeleteButtonsAfterDelete = deleteButtonsAfterDelete.size();
        System.out.println("Number of delete buttons after clicking delete buttons: " + numOfDeleteButtonsAfterDelete);//80

        assertEquals(deleteButtons.size() - 20, numOfDeleteButtonsAfterDelete);

    }


}