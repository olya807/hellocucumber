package hellocucumber.baseEntities.hooks;

import hellocucumber.baseEntities.support.MyWebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class WebDriverHooks {
    private final EventFiringWebDriver webDriver;

    public WebDriverHooks(MyWebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @After
    public void finish(Scenario scenario) {
        webDriver.close();
    }
}
