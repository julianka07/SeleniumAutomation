package form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static utility.Helper.setupBrowser;
import static utility.Helper.tearDown;

public class Checkboxes {
    /*
    1. Implement Exception Handling using try-catch-finally (done)
    2. Print the values of all form.Checkboxes (done)
    3. Print out all values for Vehicles (done)
    4. Check only checkbox that relates to boat(done)
    5. Check all the form.Checkboxes which are not checked by default
     */
    public static void main(String[] args) throws InterruptedException {
        String url="https://theautomationtechies.com/web-elements-for-ui-testing/";
        WebDriver driver = setupBrowser(url, 1000, "CH");
//      Print the Value for All form.Checkboxes

        List<WebElement> allCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for(WebElement checkBox : allCheckBoxes) {
            System.out.println("Value : " + checkBox.getAttribute("value"));
//            System.out.println("ID : " + checkBox.getAttribute("id"));
//            System.out.println("Name : " + checkBox.getAttribute("name"));
        }
        for (WebElement checkBox : allCheckBoxes) {
            checkBox.click();
            Assert.assertEquals(allCheckBoxes.size(), 8);
        }
//        Check only checkboxes that relates to vehicles

        try {
            System.out.println(driver.findElement(By.id("myTitle")).getText());
            allCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
            for (WebElement checkbox : allCheckBoxes) {
                //checkbox.click();
                if(checkbox.getAttribute("name").contains("vehicle") && !checkbox.isSelected()){
                    System.out.println("Selected Checkbox: " + checkbox.getAttribute("value"));
                    checkbox.click();
                }
            }
//            checkbox related to boat
            for (WebElement checkbox : allCheckBoxes) {
                //checkbox.click();
                if(checkbox.getAttribute("name").contains("boat") && !checkbox.isSelected()){
                    checkbox.click();
                }
            }

        }

        catch(Exception ch){
            System.out.println("Exception: "+ ch.getMessage());
            ch.printStackTrace();
        }
        finally {
            tearDown();
        }



}}
