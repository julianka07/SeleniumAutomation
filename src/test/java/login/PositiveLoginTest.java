package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utility.Helper;

public class PositiveLoginTest extends BaseTest{
    @Test
    public void TC01_positive_login() throws InterruptedException {
        driver.findElement(By.name("username")).sendKeys("julia");
        driver.findElement(By.name("password")).sendKeys("Test123");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(20000);
        driver.switchTo().frame(0);
        if(driver.findElement(By.xpath("//a[@class='dropdown-toggle']"))
                .getText().toLowerCase().contains("actions")){
            System.out.println("passed");
        }
        else{
            System.out.println("failed");
        }
        driver.navigate().to("https://suitecrm.theautomationtechies.com/public/logout");
        System.out.println(driver.findElement(By.name("username")).isDisplayed());
    }
}

