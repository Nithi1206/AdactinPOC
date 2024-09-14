package Pom;

import Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page extends BaseClass {
    WebDriver driver;

    public Login_Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='username']")
    private WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@id='login']")
    private WebElement login;

    public void enterCredentials(String uName, String pwd){
        userName.sendKeys(uName);
        password.sendKeys(pwd);
    }
    public void clickLoginBtn(){
        login.click();
    }
}
