package automation.Drivers.Strategies;

import org.openqa.selenium.*;
import org.openqa.selenium.phantomjs.*;
import org.openqa.selenium.remote.*;

public class PhantomJs implements DriverStrategy1 {
    public WebDriver setStrategy() {
       System.setProperty("phantomjs.binary.path", "src/main/phantomjs.exe");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
       desiredCapabilities.setJavascriptEnabled(true);

        return new PhantomJSDriver(desiredCapabilities);




    }
}
