package form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {
    @Test
    public static void main(String[] args) throws InterruptedException {
        String url = "https://suitecrm.theautomationtechies.com/public/index.php#/Login";
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(5000);

        driver.findElement(By.xpath("/html/body/app-root/div/scrm-login-ui/div/form/div[2]/div/div[1]/input")).sendKeys("julia");
        driver.findElement(By.name("password")).sendKeys("Test123");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(10000);


//      Actions actions = new Actions(driver);
//        WebElement menuOption = driver.findElement(By.xpath("/html/body/app-root/div/scrm-navbar-ui/scrm-base-navbar/div/nav/div[1]/ul/li[2]/scrm-menu-item/scrm-base-menu-item/span/scrm-menu-item-link/scrm-base-menu-item-link/a"));
//        actions.moveToElement(menuOption).perform();

        WebElement mainMenu = driver.findElement(By.xpath("//a[@class='top-nav-link nav-link-nongrouped dropdown-toggle ng-star-inserted'][contains(.,'Quotes')]"));

//Creating object of an Actions class
        Actions action = new Actions(driver);


//Performing the mouse hover action on the target element.
        action.moveToElement(mainMenu);

        // Locating the element from Sub Menu
        WebElement subMenu = driver.findElement(By.xpath("//a[@class='ng-star-inserted top-nav-link nav-link-nongrouped dropdown-toggle'][contains(.,'Quotes')]"));

//To mouseover on sub menu
        action.moveToElement(subMenu);

//build()- used to compile all the actions into a single step
        action.click().build().perform();

    }}

/*
1. What is Agile and Scrum methodologies?


Plan:
1. form.MouseHover
2.DataDriven
3. GitHub
 */

