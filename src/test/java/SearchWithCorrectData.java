import base.BaseClass;
import base.LandingPage;
import base.ReceiptPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SearchWithCorrectData extends BaseClass {

    @Test(description = "Smoke UI Test")
    public void getResults() {
        LandingPage landingPage = new LandingPage(getDriver());
        assertTrue(landingPage.isInit());
        ReceiptPage receiptPage = landingPage.submit();
        assertEquals("An Ingredient based Recipe Search Engine - Recipe Puppy", receiptPage.getTitlePage());
        landingPage.doSearch("salsa");

    }
}
