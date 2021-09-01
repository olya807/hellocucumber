package hellocucumber.baseEntities.support;

import org.openqa.selenium.support.events.EventFiringWebDriver;
import services.BrowsersService;

public class MyWebDriver extends EventFiringWebDriver {
    public MyWebDriver() {
        super(new BrowsersService().getDriver());
    }
}
