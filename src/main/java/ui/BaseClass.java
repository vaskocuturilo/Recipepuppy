package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

/**
 * Class Base.
 */
public class BaseClass {

    /**
     * ThreadLocal.
     */
    private final ThreadLocal<WebDriver> threadLocal = new ThreadLocal<>();

    /**
     * driver.
     */
    private WebDriver driver;

    /**
     * Constant DELAY_TIME.
     */
    private static final int DELAY_TIME = 10;


    /**
     * getter.
     *
     * @return return driver.
     */
    public WebDriver getDriver() {
        return driver;
    }

    /**
     * Method start.
     *
     * @throws Exception exception.
     */
    @BeforeClass
    public void start() {
        if (threadLocal.get() != null) {
            driver = threadLocal.get();
            return;
        }
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("http://www.recipepuppy.com");
        driver.manage().timeouts().implicitlyWait(DELAY_TIME, TimeUnit.SECONDS);
        threadLocal.set(driver);
    }


    /**
     * Method stop.
     */
    @AfterClass
    public void stop() {
        if (driver != null) {
            driver.quit();
        }
    }

}
