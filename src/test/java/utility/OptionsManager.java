package utility;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class OptionsManager {
    //Get Chrome Options
    public static ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-popup-blocking");
        //options.addArguments("--incognito");
        return options;
    }
    //Get Firefox Options
    public static FirefoxOptions getFirefoxOptions () {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("--headless");
        firefoxOptions.addArguments("--incognito");
        firefoxOptions.addArguments("--ignore-errors");
        return firefoxOptions;
    }
}