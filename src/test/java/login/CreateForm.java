package login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class CreateForm extends BaseTest{
    @Test
    public void CreateFormAccount() throws InterruptedException {

        driver.navigate().to("https://suitecrm.theautomationtechies.com/public/index.php#/home");

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        Thread.sleep(5000);

//        driver.findElement(By.xpath("/html/body/app-root/div/scrm-login-ui/div/form/div[2]/div/div[1]/input")).sendKeys("julia");
//        driver.findElement(By.name("password")).sendKeys("Test123");
//        driver.findElement(By.id("login-button")).click();
//        Thread.sleep(10000);
//        driver.switchTo().frame(0);
//
//        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("/html/body/app-root/div/scrm-navbar-ui/scrm-base-navbar/div/nav/div[1]/ul/li[1]/scrm-menu-item/scrm-base-menu-item/span/scrm-menu-item-link/scrm-base-menu-item-link/a")).click();
        driver.findElement(By.xpath("/html/body/app-root/div/scrm-navbar-ui/scrm-base-navbar/div/nav/div[1]/ul/li[1]/scrm-menu-item/scrm-base-menu-item/div/div[1]/scrm-menu-item-link/scrm-base-menu-item-link/a")).click();
        Thread.sleep(4000);

        driver.findElement(By.xpath("(//input[contains(@type,'text')])[2]")).sendKeys("Anna");
        driver.findElement(By.xpath("(//input[contains(@type,'text')])[4]")).sendKeys("www.google.com");

        driver.findElement(By.xpath("(//button[contains(@type,'button')])[4]")).click();
        driver.findElement(By.xpath("(//input[contains(@type,'text')])[6]")).sendKeys("hello@gmail.com");
        driver.findElement(By.xpath("(//input[contains(@type,'text')])[7]")).sendKeys("20 Millennium drive");
        driver.findElement(By.xpath("(//input[contains(@type,'text')])[8]")).sendKeys("K4G6G5");
        driver.findElement(By.xpath("(//input[contains(@type,'text')])[9]")).sendKeys("Toronto");
        driver.findElement(By.xpath("(//input[contains(@type,'text')])[10]")).sendKeys("ON");
        driver.findElement(By.xpath("(//input[contains(@type,'text')])[11]")).sendKeys("Canada");
        driver.findElement(By.xpath("//textarea[contains(@rows,'6')]")).sendKeys("Hello World");
        driver.findElement(By.xpath("(//input[contains(@type,'text')])[3]")).sendKeys("4164453423");
        driver.findElement(By.xpath("(//input[contains(@type,'text')])[5]")).sendKeys("4562345678");
        driver.findElement(By.xpath("(//input[contains(@type,'text')])[12]")).sendKeys("20 Millennium drive");
        driver.findElement(By.xpath("(//input[contains(@type,'text')])[13]")).sendKeys("K4G6G5");
        driver.findElement(By.xpath("(//input[contains(@type,'text')])[14]")).sendKeys("Toronto");
        driver.findElement(By.xpath("(//input[contains(@type,'text')])[15]")).sendKeys("ON");
        driver.findElement(By.xpath("(//input[contains(@type,'text')])[16]")).sendKeys("Canada");
        Thread.sleep(4000);
        js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
        driver.findElement(By.xpath("(//button[contains(@type,'button')])[2]")).click();

        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        driver.findElement(By.xpath("//*[@id=\"collapseShowSubPanels\"]/div/div[4]/scrm-grid-widget/div/div[3]/div/div")).click();


    }
}

