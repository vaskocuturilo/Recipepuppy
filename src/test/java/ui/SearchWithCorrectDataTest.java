package ui;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SearchWithCorrectDataTest extends BaseClass {

    @Test(description = "Navigate to Main page > Search Data")
    public void testGetResults() {
        LandingPage landingPage = new LandingPage(getDriver());
        assertTrue(landingPage.isInit());
        ReceiptPage receiptPage = landingPage.submit();
        assertEquals("An Ingredient based Recipe Search Engine - Recipe Puppy", receiptPage.getTitlePage());
        landingPage.doSearch("test");
        landingPage.checkThatPageIsCompletelyLoaded();
        assertTrue(landingPage.doResult().contains("America's Test Kitchen Hot Sour Soup"));
    }
}
