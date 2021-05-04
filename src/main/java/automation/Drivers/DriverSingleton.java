package automation.Drivers;

import automation.Drivers.Strategies.DriverStrategy1;
import automation.Drivers.Strategies.DriverStrategy1Implementor;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class  DriverSingleton {
    private static DriverSingleton instance = null;
    private static WebDriver driver;

    private DriverSingleton(String driver) { instantiate(driver); }

    public WebDriver instantiate (String strategy){
    DriverStrategy1 driverStrategy1 = DriverStrategy1Implementor.chooseStrategy(strategy);
    driver = driverStrategy1.setStrategy();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.manage().window().maximize();

    return driver;

    }
    public static DriverSingleton getInstance(String driver){
        if(instance == null){
            instance = new DriverSingleton(driver);
        }

        return instance;
    }

    public static void closeObjectInstance(){
        instance = null;
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}

