package Pom;

import Base.BaseClass;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Search_Hotel extends BaseClass {
    WebDriver driver;

    public Search_Hotel(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@id='location']")
    private WebElement selectLoc;

    @FindBy(xpath = "//select[@id='hotels']")
    private WebElement selectHotel;

    @FindBy(xpath = "//select[@id='room_type']")
    private WebElement selectRoomType;

    @FindBy(xpath = "//select[@id='room_nos']")
    private WebElement selectNoOfRooms;

    @FindBy(xpath = "//input[@id='datepick_in']")
    private WebElement checkInDate;

    @FindBy(xpath = "//input[@id='datepick_out']")
    private WebElement checkOutDate;

    @FindBy(xpath = "//select[@id='adult_room']")
    private WebElement adultRoom;

    @FindBy(xpath = "//select[@id='child_room']")
    private WebElement childRoom;

    @FindBy(xpath = "//input[@id='Submit']")
    private WebElement searchBtn;

    public boolean verifyURL(String url){
        String currentURL = driver.getCurrentUrl();
        boolean containsUrl = currentURL.contains(url);
        return containsUrl;
    }

    public void selLocation(){
        Select s = new Select(selectLoc);
        s.selectByVisibleText("London");
    }
    public void selHotel(){
        Select s = new Select(selectHotel);
        s.selectByVisibleText("Hotel Hervey");
    }
    public void selRoomType(){
        Select s = new Select(selectRoomType);
        s.selectByVisibleText("Deluxe");
    }
    public void selNoOfRooms(){
        Select s =new Select(selectNoOfRooms);
        s.selectByValue("2");
    }
    public void selCheckInDate(String dates){
        checkInDate.sendKeys(dates);
    }
    public void selCheckOutDate(String date1){
        checkOutDate.sendKeys(date1);
    }
    public void selAdultRoom(){
        Select s = new Select(adultRoom);
        s.selectByValue("2");
    }
    public void selChildRoom(){
        Select s =new Select(childRoom);
        s.selectByValue("2");
    }
    public void clickSearchBtn(){
        searchBtn.click();
    }

}
