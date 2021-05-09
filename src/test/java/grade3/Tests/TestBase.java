package grade3.Tests;

import utilities.ConfigurationReader;
import utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;
    protected Actions actions;
    protected WebDriverWait wait;
    protected String url;


    @BeforeMethod
    public void setUpMethod(){
        url = ConfigurationReader.get("url");
        //if it is not null, choose env based on value
        driver = Driver.get();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        actions = new Actions(driver);
        wait = new WebDriverWait(driver,10);
        driver.get(url);

    }


    @AfterMethod
    public void afterMethod() throws InterruptedException {
        //close driver
        Thread.sleep(2000);
        Driver.closeDriver();

    }



}
