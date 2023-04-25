package UI_Tests;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;


public class CucumberStepDef {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        driver.get("https://en.wikipedia.org/wiki/Test_automation");
        driver.manage().window().setSize(new Dimension(1294, 1391));
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Given("I Want to go to a specific Section")
    public void I_Want_to_go_to_a_specific_Section() {
    }


    @When("I click the Section in the contents")
    public void I_click_the_Section_in_the_contents() {
        driver.findElement(TestAutomationPOM.TOCITEM1).click();
    }

    @Then("I expect the section to be visible")
    public void the_cocktail_shall_not_appear_in_the_database() {
        Assert.assertTrue(driver.findElement(TestAutomationPOM.Section1).isDisplayed());
    }
}