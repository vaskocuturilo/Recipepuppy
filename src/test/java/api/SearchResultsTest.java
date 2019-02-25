package api;

import org.testng.annotations.Test;

public class SearchResultsTest {

    @Test(description = "Get result from recipepuppy.com/api")
    public void testGetPuppyResults(){
        SearchApi searchApi = new SearchApi("http://www.recipepuppy.com");
        searchApi.assertPuppyApiInformation();
    }

    @Test(description = "Get result from jsonplaceholder.typicode.com")
    public void testGetHolderResults(){
        SearchApi searchApi = new SearchApi("https://jsonplaceholder.typicode.com");
        searchApi.assertHolderApiInformation(1);
    }

}
