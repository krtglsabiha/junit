package com.myfirstproject;
import com.myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
public class Day09_RobotClass extends TestBase {
    @Test
    public void fileUploadTest() throws AWTException {
        driver.get("https://testpages.herokuapp.com/styled/file-upload-test.html ");
        String pathOfFlower = System.getProperty("user.home") + "\\Desktop\\flower.jpeg";//mac
//        String pathOfFlower = System.getProperty("user.home") + "\\Desktop\\flower.jpeg";//windows
        System.out.println(pathOfFlower);
//        ROBOT CLASS
        StringSelection ss= new StringSelection(pathOfFlower);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
        Robot robot = new Robot();
//        pressing control V
        robot.keyPress(KeyEvent.VK_CONTROL);
        waitFor(3);
        robot.keyPress(KeyEvent.VK_V);
        waitFor(3);
//        release
        robot.keyRelease(KeyEvent.VK_CONTROL);
        waitFor(3);
        robot.keyRelease(KeyEvent.VK_V);
        waitFor(3);
//        click enter
        robot.keyPress(KeyEvent.VK_ENTER);
        waitFor(3);
//        release enter
        robot.keyRelease(KeyEvent.VK_ENTER);
        waitFor(3);
//       file upload is done. then click upload button and do assertion
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        waitFor(3);
//        Then verify the ‘You uploaded a file. This is the result.’  Message displayed
        Assertions.assertEquals(
                "flower.jpeg" ,
                driver.findElement(By.id("uploadedfilename")).getText(),
                "File upload is not successful : Actual file name is not text.txt"
        );
//       Alternatively
        Assertions.assertEquals(
                "You uploaded a file. This is the result.",
                driver.findElement(By.xpath("//div[@class='explanation']//p")).getText(),
                "Upload is failed!!!"
        );
    }
    public static void uploadFilePath(String filePath){
        try{
            waitFor(3);
            StringSelection stringSelection = new StringSelection(filePath);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);
            Robot robot = new Robot();
            //pressing ctrl+v
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            waitFor(3);
            //releasing ctrl+v
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);
            waitFor(3);
            System.out.println("PASSED");
            //pressing enter
            waitFor(3);
            robot.keyPress(KeyEvent.VK_ENTER);
            //releasing enter
            robot.keyRelease(KeyEvent.VK_ENTER);
            waitFor(3);
            System.out.println("ENTER");
        }catch (Exception e){
        }
    }
    @Test
    public void fileUploadTestRobot() throws AWTException {
//        driver.get("https://demoqa.com/upload-download");
        driver.get("https://www.grammarly.com/plagiarism-checker");
//        driver.findElement(By.xpath("//*[@id='uploadfile_0']"));
        driver.findElement(By.xpath("//div[@id='sectionGrammarCheck_4VB8kepvT7ciShVSz6rHX']//span[@class='iconWrapper_PbRSndwM']")).click();
//        String pathOfFlower = System.getProperty("user.home") + "\\Desktop\\hello.docx";//mac
//        String pathOfFlower = System.getProperty("user.home") + "\\Desktop\\hello.docx";//windows
//        uploadFilePath(pathOfFlower);
        uploadFile("C:\\Users\\icuvo\\Desktop\\hello.docx");
    }
}