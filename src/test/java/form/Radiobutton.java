package form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Radiobutton {
    public static void main(String[] args) throws InterruptedException {
    String url = "https://theautomationtechies.com/web-elements-for-ui-testing/";
    WebDriver driver = new ChromeDriver();
        driver.get(url);

        List<WebElement> allRadioButtons = driver.findElements(By.xpath("//input[@type='radio']"));
        for (WebElement radioButton : allRadioButtons) {
            radioButton.click();
        }
    }
}
