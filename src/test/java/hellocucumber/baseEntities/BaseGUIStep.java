package hellocucumber.baseEntities;

import hellocucumber.baseEntities.support.MyWebDriver;
import io.cucumber.plugin.event.Event;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class BaseGUIStep {
    public final EventFiringWebDriver webDriver;

    public BaseGUIStep(MyWebDriver webDriver) {
        this.webDriver = webDriver;
    }
}
