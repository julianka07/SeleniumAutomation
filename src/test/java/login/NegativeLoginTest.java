package login;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.Helper;

public class NegativeLoginTest extends BaseTest{

    @Test
    public void TC01_negative_login() throws InterruptedException {
        driver.findElement(By.name("username")).sendKeys("julia");
        driver.findElement(By.name("password")).sendKeys("Test1234");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(5000);
        if (driver.findElement(By.xpath("/html/body/app-root/div/scrm-message-ui/div/div/div"))
                .getText().contains("Login credentials")) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }
    }

    @Test(dataProvider = "users")
    public void TC02_negative_login_using_dataprovider(String username, String password) throws InterruptedException {
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(5000);
        if (driver.findElement(By.xpath("/html/body/app-root/div/scrm-message-ui/div/div/div"))
                .getText().contains("Login credentials")) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }
    }

    @Test(dataProvider = "users_from_csv")
    public void TC03_negative_login_csv(String username, String password) throws InterruptedException {
        System.out.println("Username: " + username + ".... Password: " + password);
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(5000);
        if (driver.findElement(By.xpath("/html/body/app-root/div/scrm-message-ui/div/div/div"))
                .getText().contains("Login credentials")) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }
    }


    @DataProvider(name= "users")
    public Object[][] negativeTestUsers(){
        return new Object[][]{
                {"test","test"},
                {"julia","2213"},
                {"1234","test@123"},
                {"test","test"},
                {"julia","2213"},
                {"1234","test@123"}
        };
    }

    @DataProvider(name="users_from_csv")
    public Object[][] negativeTestUsersFromCSV(){
        System.out.println("Reading into Data Provider");
        return Helper.readFileForDataProvider();
    }


}

