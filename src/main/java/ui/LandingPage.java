package ui;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.AssertJUnit.assertEquals;

/**
 * The type Landing page.
 */
public class LandingPage extends PageObject {

    /**
     * Find By main logo.
     */
    @FindBy(css = "div.headerhome img")
    private WebElement mainLogo;

    /**
     * Find By search button.
     */
    @FindBy(css = "input[value='Search']")
    private WebElement searchButton;

    /**
     * Find By search field.
     */
    @FindBy(css = "input[id='addIng']")
    private WebElement searchField;

    /**
     * Find By result.
     */
    @FindBy(css = "div.result.firstresult > h3 > a")
    private WebElement result;

    /**
     * Instantiates a new Landing page.
     *
     * @param webDriver the web driver
     */
    public LandingPage(final WebDriver webDriver) {
        super(webDriver);
    }


    /**
     * Method is Init.
     *
     * @return Return displayed search button.
     */
    public boolean isInit() {

        return mainLogo.isDisplayed();
    }

    /**
     * Submit method.
     *
     * @return driver.
     */
    public ReceiptPage submit() {
        return new ReceiptPage(getDriver());
    }


    /**
     * Method doSearch.
     *
     * @param textValue text of value.
     * @return driver.
     */
    public LandingPage doSearch(final String textValue) {
        this.searchField.clear();
        this.searchField.sendKeys(textValue);
        this.searchButton.click();
        return this;
    }


    /**
     * Method doResult.
     *
     * @return text.
     */
    public String doResult() {

        return result.getText();
    }

    /**
     * Method checkThatPageIsCompletelyLoaded.
     *
     * @return this.
     */
    public LandingPage checkThatPageIsCompletelyLoaded() {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) getDriver();
        assertEquals("complete", javascriptExecutor.executeScript("return document.readyState"));
        return this;
    }

}
