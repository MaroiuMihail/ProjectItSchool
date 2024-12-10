package sharedData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class EmagSharedData {

    private WebDriver driver;

    @BeforeMethod
    public void setUpBrowser() {
        driver = new EdgeDriver();
        driver.get("https://www.emag.ro/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    public WebDriver getDriver() {
        return driver;
    }

//    @AfterMethod
//    public void clearBrowser() {
//        driver.quit();
//    }
}
