package HomeWorkCRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import utility.Helper;

public class CRMtest {
    String url= "https://suitecrm.theautomationtechies.com/public/index.php#/Login";
    WebDriver driver;

    @BeforeTest
    public void setupFirst() {
        driver = Helper.setupBrowser(url, 100, "CH");
    }
    @AfterTest
    public void closeAll() throws InterruptedException {
        Helper.tearDown();
    }

    @Test
    public void TC01_positive_login() throws InterruptedException {
        driver.findElement(By.name("username")).sendKeys("julia");
        driver.findElement(By.name("password")).sendKeys("Test123");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(10000);
        driver.switchTo().frame(0);
        if(driver.findElement(By.xpath("//a[@class='dropdown-toggle']"))
                .getText().toLowerCase().contains("actions")){
            System.out.println("passed");
        }
        else{
            System.out.println("failed");
        }
//        driver.switchTo().defaultContent();
//        driver.findElement(By.xpath("//span[contains(.,'Julia')]")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//scrm-logout-ui[contains(.,'Logout')]")).click();
//
//        System.out.println(driver.findElement(By.name("username")).isDisplayed());

//        driver.switchTo().defaultContent();
//        driver.findElement(By.xpath("/html/body/app-root/div/scrm-navbar-ui/scrm-base-navbar/div/nav/div[1]/ul/li[1]/scrm-menu-item/scrm-base-menu-item/span/scrm-menu-item-link/scrm-base-menu-item-link/a")).click();
//        Thread.sleep(4000);
//        driver.findElement(By.xpath("/html/body/app-root/div/scrm-navbar-ui/scrm-base-navbar/div/nav/div[1]/ul/li[1]/scrm-menu-item/scrm-base-menu-item/div/div[1]/scrm-menu-item-link/scrm-base-menu-item-link/a")).click();
//        Thread.sleep(4000);
//
//
//
//        driver.findElement(By.xpath("//input[contains(@class,'form-control form-control-sm ng-pristine ng-invalid is-invalid ng-touched')]")).sendKeys("Anna");
//        driver.findElement(By.xpath("//*[@id=\"ngb-nav-12-panel\"]/div/scrm-field-layout/form/div[2]/div[1]/div[2]/div[1]/scrm-field/scrm-dynamic-field/scrm-varchar-edit/input")).sendKeys("www.google.com");
//        driver.findElement(By.xpath("//*[@id=\"ngb-nav-12-panel\"]/div/scrm-field-layout/form/div[3]/div[1]/div[2]/div[1]/scrm-field/scrm-line-items-field/div/div[2]")).sendKeys("anna@gmail.com");

        driver.navigate().to("https://suitecrm.theautomationtechies.com/public/logout");
        System.out.println(driver.findElement(By.name("username")).isDisplayed());
    }

    @Test
    public void TC02_negative_login() throws InterruptedException {
        driver.findElement(By.name("username")).sendKeys("julia");
        driver.findElement(By.name("password")).sendKeys("Test1234");
        driver.findElement(By.id("login-button")).click();
        //Thread.sleep(10000);
        if (driver.findElement(By.xpath("/html/body/app-root/div/scrm-message-ui/div/div/div"))
                .getText().contains("Login credentials")) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }
    }

}

