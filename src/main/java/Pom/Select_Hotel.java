package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
    WebDriver driver;

    public Select_Hotel(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='radiobutton_0']")
    private WebElement radBtn;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueBtn;

//    public boolean verifyURL(String url){
//        String currenturl = driver.getCurrentUrl();
//        boolean contains = currenturl.contains(url);
//        return contains;
//    }
    public void clickRadBtn(){
        radBtn.click();
    }
    public void clickContinueBtn(){
        continueBtn.click();
    }
}
