package automation.Drivers.Strategies;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

public class Firefox implements DriverStrategy1 {
    public WebDriver setStrategy() {
    System.setProperty("webdriver.gecko.driver", "src/main/recouces/geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    return driver;
    }
}
