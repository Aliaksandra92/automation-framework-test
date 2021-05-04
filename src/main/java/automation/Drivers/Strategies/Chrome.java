package automation.Drivers.Strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class Chrome implements DriverStrategy1 {
    public WebDriver setStrategy() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("--no-sandbox");

        return new ChromeDriver(options);
    }
}
