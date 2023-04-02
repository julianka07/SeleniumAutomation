package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Helper {
    static WebDriver driver= null;

    public static WebDriver setupBrowser(String browserCode) {
        ChromeOptions chromeOptions =new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--ignore-errors");
        FirefoxOptions firefoxOptions =new FirefoxOptions();
        firefoxOptions.addArguments("--headless");
        firefoxOptions.addArguments("--incognito");
        firefoxOptions.addArguments("--ignore-errors");

        switch(browserCode) {
            case "CH":
                driver = new ChromeDriver(chromeOptions);
                break;
            case "FF":
                driver = new FirefoxDriver(firefoxOptions);
                break;
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));

        return driver;
    }
    public static WebDriver setupBrowser(String url, int scrollBy, String browserCode) {
        return driver;
    }

    public static void navigateToUrl(String url, int scrollBy){
        driver.get(url);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("window.scrollBy(0,"+scrollBy +")","");
    }
    public static void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    public static Object[][] readFileForDataProvider(){
        String url = "./data/users.csv";
        List<String[]> input = new ArrayList<>();
        try {
            Path path = Paths.get(url);
            List<String> lines = Files.readAllLines(path);
            for(String line: lines){
                if(line.startsWith("#")==false){
                    String[] temp = line.split(",");
                    input.add(temp);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String[][] data = new String[input.size()][0];
        return input.toArray(data);

    }
}
