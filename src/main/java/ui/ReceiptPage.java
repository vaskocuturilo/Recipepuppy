package ui;

import org.openqa.selenium.WebDriver;

/**
 * The type Receipt page.
 */
public class ReceiptPage extends PageObject {


    /**
     * Instantiates a new Receipt page.
     *
     * @param webDriver the web driver
     */
    public ReceiptPage(final WebDriver webDriver) {
        super(webDriver);
    }

    /**
     * Method getTitlePage.
     *
     * @return title page.
     */
    public String getTitlePage() {
        return getDriver().getTitle();
    }
}

