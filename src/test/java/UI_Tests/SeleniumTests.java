package UI_Tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.HashMap;
import java.util.Map;

public class SeleniumTests {
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
    @Test
    public void PageHeaderTest() {

        String getheadertext=driver.findElement(TestAutomationPOM.PageHeader).getText();
        Assert.assertEquals("Page Header is Incorrect","Test automation" ,getheadertext);
    }
    @Test
    public void PageSectionsTest() {
        String getSection1text=driver.findElement(TestAutomationPOM.Section1).getText();
        Assert.assertEquals("Page Section 1 is Incorrect","API testing" ,getSection1text);

        String getSection2text=driver.findElement(TestAutomationPOM.Section2).getText();
        Assert.assertEquals("Page Section 2 is Incorrect","Continuous testing" ,getSection2text);

        String getSection3text=driver.findElement(TestAutomationPOM.Section3).getText();
        Assert.assertEquals("Page Section 3 is Incorrect","Graphical User Interface (GUI) testing" ,getSection3text);
    }
    }
