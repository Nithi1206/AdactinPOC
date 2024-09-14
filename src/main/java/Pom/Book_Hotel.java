package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Book_Hotel {
    WebDriver driver;

    public Book_Hotel(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='first_name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='last_name']")
    private WebElement lastName;

    @FindBy(xpath = "//textarea[@id='address']")
    private WebElement addressField;

    @FindBy(xpath = "//input[@id='cc_num']")
    private WebElement cardNumber;

    @FindBy(xpath = "//select[@id='cc_type']")
    private WebElement cardType;

    @FindBy(xpath = "//select[@id='cc_exp_month']")
    private WebElement expMonth;

    @FindBy(xpath = "//select[@id='cc_exp_year']")
    private WebElement expYear;

    @FindBy(xpath = "//input[@id='cc_cvv']")
    private WebElement cvv;

    @FindBy(xpath = "//input[@id='book_now']")
    private WebElement bookBtn;

    public void addFirstName(String name1){
        firstName.sendKeys(name1);
    }
    public void addLastName(String name2){
        lastName.sendKeys(name2);
    }
    public void addAddress(String address){
        addressField.sendKeys(address);
    }
    public void addCardNumber(String num){
        cardNumber.sendKeys(num);
    }
    public void selCardType(){
        Select s = new Select(cardType);
        s.selectByVisibleText("VISA");
    }
    public void selExpMonth(){
        Select s = new Select(expMonth);
        s.selectByVisibleText("May");
    }
    public void selExpYear(){
        Select s = new Select(expYear);
        s.selectByVisibleText("2025");
    }
    public void selCVV(String num){
        cvv.sendKeys(num);
    }
    public void clickBookBtn(){
        bookBtn.click();
    }


}
