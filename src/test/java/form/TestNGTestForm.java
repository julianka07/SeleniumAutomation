package form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import java.util.List;

import static utility.Helper.tearDown;
import static utility.Helper.setupBrowser;
/*
The test flow
Open the appplication (@BeforeClass)
Login(@BeforeClass)
Test Section 1(@Test)
Test Section 2(@Test)
Logout(@AfterClass)
Close Broswer(@After Class)

 */
public class TestNGTestForm {
    String url="https://theautomationtechies.com/web-elements-for-ui-testing/";
    WebDriver driver = null;
//    @BeforeClass
//    public void beforeClass(){
//        driver = setupBrowser(url, 1500, "CH");
//    }
    @BeforeMethod
    public void beforeMethod(){
        driver = setupBrowser("CH");
    }
    //Test Method
    @Test
    public void testTextBoxes(){
        if (driver.findElement(By.id("text1")).isEnabled()==true){
            System.out.println("Text1");
            driver.findElement(By.id("text1")).sendKeys("Muxa");
        }

        driver.findElement(By.id("text2")).sendKeys("Kalensky");
        driver.findElement(By.id("text3")).sendKeys("Luba");
        driver.findElement(By.id("text4")).sendKeys("Sonia");
    }
    //Test Method
    @Test
    public void testCheckBoxes(){
        List<WebElement> allCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for(WebElement checkbox : allCheckBoxes){
            checkbox.click();
        }
    }
    @AfterMethod
    public void afterMethod() throws InterruptedException {
        tearDown();
    }
//    @AfterClass
//    public void afterClass() throws InterruptedException {
//        closeBrowser();
//    }
}
