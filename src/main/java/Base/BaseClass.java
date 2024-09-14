package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BaseClass {

    public static WebDriver driver;

    public static void launchBrowser(String browser){
        if(browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }else {
            throw new IllegalArgumentException("Browser is not found");
        }
    }
    public static void launchURL(String URL){
        driver.get(URL);
    }
    public static void maximizeWindow(){
        driver.manage().window().maximize();
    }
    public static void implicitWait(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    public boolean verifyURL(String url){
        String currenturl = driver.getCurrentUrl();
        boolean contains = currenturl.contains(url);
        return contains;
    }
    public static void quiteBrowser(){
        driver.quit();
    }
}
