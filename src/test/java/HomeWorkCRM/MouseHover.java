package HomeWorkCRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.Helper;

public class MouseHover {
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
        driver.findElement(By.name("password")).sendKeys("Test123");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
        driver.findElements(By.xpath("//a[@href='#/contacts']"));

//        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
//        Actions actions = new Actions(driver);
//        WebElement menuOption = driver.findElement(By.xpath("/html/body/app-root/div/scrm-navbar-ui/scrm-base-navbar/div/nav/div[1]/ul/li[2]/scrm-menu-item/scrm-base-menu-item/span/scrm-menu-item-link/scrm-base-menu-item-link/a"));
//        actions.moveToElement(menuOption).perform();

}}
