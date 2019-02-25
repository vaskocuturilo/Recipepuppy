package api;

import org.testng.annotations.Test;
import restapi.SearchApi;

public class SearchResultsTest {

    @Test(description = "Get result from recipepuppy.com/api")
    public void getResult(){
        SearchApi searchApi = new SearchApi("http://www.recipepuppy.com");
        searchApi.assertApiInformation();
    }
}
