package automation.Drivers.Strategies;

import automation.Utils.Constants;

public class DriverStrategy1Implementor {

    public static DriverStrategy1 chooseStrategy(String strategy){
        switch (strategy) {
            case Constants.CHROME:
                return new Chrome();

            case Constants.PHANTOMJS:
                return new PhantomJs();

            case Constants.FIREFOX:
                return new Firefox();

            default:
                return null;
        }


    }
}