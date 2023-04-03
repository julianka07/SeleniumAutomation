package form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utility.Helper.setupBrowser;
import static utility.Helper.tearDown;

public class AlertBox {
    public static void main(String[] args) throws InterruptedException {
        String url="https://theautomationtechies.com/web-elements-for-ui-testing/";
        WebDriver driver = setupBrowser("CH");
        try{
            //Alert Button
            driver.findElement(By.xpath("//*[@id=\"post-body-4292417847084983089\"]/div/input")).click();
            driver.switchTo().alert().accept();
            Thread.sleep(2000);
            //Prompt Button
            driver.findElement(By.xpath("//*[@id=\"post-body-4292417847084983089\"]/div/button[2]")).click();
            Thread.sleep(2000);
            driver.switchTo().alert().accept();
            driver.findElement(By.xpath("//*[@id=\"post-body-4292417847084983089\"]/div/button[2]")).click();
            Thread.sleep(2000);

            //            Use this if we want to press cancel
            driver.switchTo( ).alert( ).dismiss();
            driver.findElement(By.xpath("//*[@id=\"post-body-4292417847084983089\"]/div/button[2]")).click();
            Thread.sleep(2000);

            //            Use this if we want to press cancel
            driver.switchTo( ).alert( ).sendKeys("Julia");
            Thread.sleep(2000);
            driver.switchTo( ).alert( ).dismiss();

        }
        catch (Exception e){
        System.out.println("Exception : " + e.getMessage());
        e.printStackTrace();
    }
        finally {
            tearDown();
        }
    }

}
