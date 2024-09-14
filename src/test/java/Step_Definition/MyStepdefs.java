package Step_Definition;

import Base.BaseClass;
import Pom.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.io.IOException;

public class MyStepdefs extends BaseClass {

    Login_Page loginPage;
    Search_Hotel searchHotel;
    Select_Hotel selectHotel;
    Book_Hotel bookHotel;
    Confirmation_Class confirmationClass;



    @Given("Launch {string} and url {string}")
    public void launchAndUrl(String brows, String link) {
        BaseClass.launchBrowser(brows);
        BaseClass.maximizeWindow();
        BaseClass.launchURL(link);
        BaseClass.implicitWait();
        loginPage = new Login_Page(driver);
        searchHotel = new Search_Hotel(driver);
        selectHotel = new Select_Hotel(driver);
        bookHotel = new Book_Hotel(driver);
        confirmationClass = new Confirmation_Class(driver);
    }

    @When("User login website by enters username as {string} and password as {string}")
    public void userLoginWebsiteByEntersUsernameAsAndPasswordAs(String user, String paswd) {
        loginPage.enterCredentials(user, paswd);
        loginPage.clickLoginBtn();
    }

    @Then("User lands on search hotel page and verifies the URL contains {string} text")
    public void userLandsOnSearchHotelPageAndVerifiesTheURLContainsText(String text) {
        Assert.assertTrue(verifyURL(text));
    }

    @When("User selects london in location")
    public void userSelectsLondonInLocation() {
        searchHotel.selLocation();
    }

    @And("User selects Hotel Sunshine")
    public void userSelectsHotelSunshine() {
        searchHotel.selHotel();
    }

    @And("User selcts Super Delux room type")
    public void userSelctsSuperDeluxRoomType() {
        searchHotel.selRoomType();
    }

    @And("User selects two number of rooms")
    public void userSelectsTwoNumberOfRooms() {
        searchHotel.selNoOfRooms();
    }

    @And("User adds check in date {string}")
    public void userAddsCheckInDate(String inDate) {
        searchHotel.selCheckInDate(inDate);
    }

    @And("User adds check out date {string}")
    public void userAddsCheckOutDate(String outDate) {
        searchHotel.selCheckOutDate(outDate);
    }

    @And("User selects two adults")
    public void userSelectsTwoAdults() {
        searchHotel.selAdultRoom();
    }

    @And("User selects two children")
    public void userSelectsTwoChildren() {
        searchHotel.selChildRoom();
    }

    @And("User clicks on search button")
    public void userClicksOnSearchButton() {
        searchHotel.clickSearchBtn();
    }

    @Then("User lands on select hotel page and verifies the URL contains {string} text")
    public void userLandsOnSelectHotelPageAndVerifiesTheURLContainsText(String text1) {
        Assert.assertTrue(verifyURL(text1));
    }

    @When("User selects radio button")
    public void userSelectsRadioButton() {
        selectHotel.clickRadBtn();
    }

    @When("User clicks on continue button")
    public void userClicksOnContinueButton() {
        selectHotel.clickContinueBtn();
    }

    @Then("User lands on book hotel page and verifies the URL contains {string} text")
    public void userLandsOnBookHotelPageAndVerifiesTheURLContainsText(String text2) {
        Assert.assertTrue(verifyURL(text2));
    }

    @And("User enters first name as {string}")
    public void userEntersFirstNameAs(String fName) {
        bookHotel.addFirstName(fName);
    }

    @And("User enters last name as {string}")
    public void userEntersLastNameAs(String lName) {
        bookHotel.addLastName(lName);
    }

    @And("User enters billing address as {string}")
    public void userEntersBillingAddressAs(String address) {
        bookHotel.addAddress(address);
    }

    @And("User enters credit card number {string}")
    public void userEntersCreditCardNumber(String cNumber) {
        bookHotel.addCardNumber(cNumber);
    }

    @And("User selects Visa credit card")
    public void userSelectsVisaCreditCard() {
        bookHotel.selCardType();
    }

    @And("User selects month and year in expiry date")
    public void userSelectsMonthAndYearInExpiryDate() {
        bookHotel.selExpMonth();
        bookHotel.selExpYear();
    }

    @And("User enters CVV number {string}")
    public void userEntersCVVNumber(String cvv) {
        bookHotel.selCVV(cvv);
    }

    @And("User click on book now button")
    public void userClickOnBookNowButton() {
        bookHotel.clickBookBtn();
    }

    @Given("User takes screenshot of the booking confrimation page")
    public void userTakesScreenshotOfTheBookingConfrimationPage() throws IOException, InterruptedException {
        confirmationClass.screenShot();
    }

    @Then("User quits the browser")
    public void userQuitsTheBrowser() {
        quiteBrowser();
    }

}
