package form;

import org.openqa.selenium.*;

import static utility.Helper.setupBrowser;
import static utility.Helper.tearDown;

//try catch - done
//helper class - Next class
//Separate Functionalities - done
//Scroll on page - done
public class Promtbuttons {
    public static void main(String[] args) throws InterruptedException {
        String url="https://theautomationtechies.com/web-elements-for-ui-testing/";
        WebDriver driver = setupBrowser("CH");
        try{
            //    Confirmation popup button
            driver.findElement(By.xpath("//*[@id=\"post-body-4292417847084983089\"]/div/button[1]")).click();
            Thread.sleep(2000);
            driver.switchTo().alert().accept();
            WebElement textConfirmation = driver.findElement(By.xpath("//*[@id=\"demo\"]"));
            String confirmation2 = textConfirmation.getText();
            if(confirmation2.toLowerCase().contains("ok")){
                System.out.println("passed");
            }
            else{
                System.out.println("failed");
            }
            driver.findElement(By.xpath("//*[@id=\"post-body-4292417847084983089\"]/div/button[1]")).click();
            Thread.sleep(2000);
            driver.switchTo().alert().dismiss();
            textConfirmation = driver.findElement(By.xpath("//*[@id=\"demo\"]"));
            confirmation2 = textConfirmation.getText();
            if(confirmation2.toLowerCase().contains("cancel")){
                System.out.println("passed");
            }
            else{
                System.out.println("failed");
                //Assert.fail();
            }

        }
        catch (Exception e){
            System.out.println("Exception : " + e.getMessage());
            e.printStackTrace();
        }
        finally {
            tearDown();
        }
}}
