package HomeWorkCRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.Helper;

public class NegativeLogin {
    String url= "https://suitecrm.theautomationtechies.com/public/index.php#/Login";
    WebDriver driver;

    @BeforeClass
    public void setupFirst() {
        driver = Helper.setupBrowser("CH");
    }
    @AfterClass
    public void closeAll() throws InterruptedException {
        Helper.tearDown();
    }

    @Test
    public void testLogin() throws InterruptedException {
        driver.findElement(By.name("username")).sendKeys("julia");
        driver.findElement(By.name("password")).sendKeys("Test1234");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(10000);
        if (driver.findElement(By.xpath("/html/body/app-root/div/scrm-message-ui/div/div/div"))
                .getText().contains("Login credentials")) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }
    }}