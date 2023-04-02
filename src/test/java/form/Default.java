package form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utility.Helper.setupBrowser;
import static utility.Helper.tearDown;

public class Default {
    public static void main(String[] args) throws InterruptedException {
        String url="https://theautomationtechies.com/web-elements-for-ui-testing/";
        WebDriver driver = setupBrowser( "CH");

        List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println("Total form.Checkboxes: "+ checkboxes.size());
        for(WebElement checkbox : checkboxes){
            if(!checkbox.isSelected()){
             System.out.println("Value : " + checkbox.getAttribute("value"));
             checkbox.click();
            }
        }


        tearDown();


}}
