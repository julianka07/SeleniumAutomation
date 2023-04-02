package login;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utility.Helper;

public class BaseTest {
    String url= "https://suitecrm.theautomationtechies.com/public/index.php#/Login";
    WebDriver driver;

//    @BeforeTest
//    public void setupFirst() {
//        System.out.println("In BeforeTest");
//        driver = Helper.setupBrowser("CH");
//    }
    @AfterMethod
    public void closeAll() throws InterruptedException {
        System.out.println("In After Method");
        Helper.tearDown();
    }

    @BeforeMethod
    @Parameters({"browserCode"})
    public void openURL(@Optional String browserCode){
        System.out.println("Browser : " + browserCode);
        if(browserCode ==null){
            browserCode="FF";
        }
        driver = Helper.setupBrowser(browserCode);
        Helper.navigateToUrl(url, 500);
    }
}
