package Pom;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;

public class Confirmation_Class {

    WebDriver driver;
    TakesScreenshot ts;

    public Confirmation_Class(WebDriver driver){
        this.driver = driver;
        ts = (TakesScreenshot) driver;
        PageFactory.initElements(driver, this);
    }

    public void screenShot() throws IOException, InterruptedException {
        Thread.sleep(5000);
        File src = ts.getScreenshotAs(OutputType.FILE);
        File des = new File("C:\\Users\\hp\\IdeaProjects\\Adactin_Automation\\target\\pages.png");
        FileUtils.copyFile(src,des);
    }
}
