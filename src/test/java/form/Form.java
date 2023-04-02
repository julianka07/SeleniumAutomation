package form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

import static utility.Helper.setupBrowser;

public class Form {
    public static void main(String[] args) throws InterruptedException {
    String url="https://theautomationtechies.com/web-elements-for-ui-testing/";
    WebDriver driver = setupBrowser(url, 500, "CH");
    if (driver.findElement(By.id("text1")).isEnabled()==true){
        System.out.println("Text1");
        driver.findElement(By.id("text1")).sendKeys("Muxa");
    }

    driver.findElement(By.id("text2")).sendKeys("Kalensky");
    driver.findElement(By.id("text3")).sendKeys("Luba");
    driver.findElement(By.id("text4")).sendKeys("Sonia");
    Thread.sleep(3000);

//form.Checkboxes
    List<WebElement> allCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
    for(WebElement checkbox : allCheckBoxes){
        checkbox.click();
    }
    Thread.sleep(3000);

//        RadioButtons
    List<WebElement> allRadioButtons = driver.findElements(By.xpath("//input[@type='radio']"));
    for (WebElement radioButton : allRadioButtons) {
        radioButton.click();
    }
//        Upload File
    WebElement upload_file=driver.findElement(By.xpath("//*[@name=\"img\"]"));
    upload_file.sendKeys("/Users/juliakristy/Desktop/cake.jpeg");

//        Dropdown Menu (show options) cars
    Select ddList = new Select(driver.findElement(By.id("Carlist")));
    for(WebElement c: ddList.getOptions()){
        System.out.println(c.getText());
    }

    System.out.println(ddList.getOptions().size());
    ddList.selectByIndex(0);
    Thread.sleep(2000);
    ddList.selectByIndex(1);
    Thread.sleep(2000);
    ddList.selectByIndex(2);
    Thread.sleep(2000);
    ddList.selectByIndex(3);
    Thread.sleep(2000);
    ddList.selectByIndex(4);
    Thread.sleep(2000);
    ddList.selectByIndex(5);

    // Assert.assertEquals(ddm.size(), 6); Not Working

//Dropdown menu 2 (country)
    Select m = new Select(driver.findElement(By.name("FromLB")));
    for (WebElement l : m.getOptions()) {
        System.out.println(l.getText());
    }
    System.out.println(m.getOptions().size());
    m.selectByIndex(0);
    m.selectByIndex(1);
    m.selectByIndex(2);
    m.selectByIndex(3);
    m.selectByIndex(4);
    m.selectByIndex(5);
    m.selectByIndex(6);
    m.selectByIndex(7);
    m.selectByIndex(8);
    m.selectByIndex(9);


//        Confirmation popup button
    driver.findElement(By.xpath("//*[@id=\"post-body-4292417847084983089\"]/div/button[1]")).click();
    Thread.sleep(2000);

    driver.switchTo().alert().accept();

    WebElement confirmation1 = driver.findElement(By.xpath("//*[@id=\"demo\"]"));
    String confirmation2 = confirmation1.getText();
    String confirmation3 = "You pressed Cancel!";
    if(confirmation2.equalsIgnoreCase(confirmation3)){
        System.out.println("passed");
    }
    else{
        System.out.println("failed");
        Assert.fail();
    }
//        Alert Button
    driver.findElement(By.xpath("//*[@id=\"post-body-4292417847084983089\"]/div/input")).click();

    driver.switchTo().alert().accept();

    //Prompt Button

    driver.findElement(By.xpath("//*[@id=\"post-body-4292417847084983089\"]/div/button[2]")).click();

    driver.switchTo().alert().accept();

    //Use this if we want to press cancel
    //driver.switchTo( ).alert( ).dismiss();



//Submit Button
    driver.findElement(By.id("submitButton")).click();

//    WebElement readyBtn = driver.findElement(By.xpath("//*[@id=\"timeLeft\"]"));
//    String readyBtn2 = readyBtn.getText();
//
//    String readyBtn3 = "Ready!";
//    if(readyBtn2.equalsIgnoreCase(readyBtn3)){
//        System.out.println("passed");
//    }
//    else{
//        System.out.println("failed");
//        Assert.fail();
//    }
    driver.quit();

}
}
