package hellocucumber;

import hellocucumber.baseEntities.BaseGUIStep;
import hellocucumber.baseEntities.support.MyWebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class StepDefinitions extends BaseGUIStep {
    Logger logger = LoggerFactory.getLogger(StepDefinitions.class);

    public StepDefinitions(MyWebDriver webDriver) {
        super(webDriver);
    }

    @Given("browser is started")
    public void startBrowser() {
    }

    @When("login page is opened")
    public void loginPageIsOpened() {
        webDriver.get("https://aqa06onl07.testrail.io/");
    }

    @Then("username field is displayed")
    public void usernameFieldIsDisplayed() {
        Assert.assertTrue(webDriver.findElement(By.id("name")).isDisplayed());
    }
}
