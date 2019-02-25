package restapi;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;

/**
 * The type Search api.
 */
public class SearchApi {

    /**
     * Constant SUCCESS.
     */
    private static final int SUCCESS = 200;

    /**
     * Constant API.
     */
    private static final String API = "/api";

    /**
     * Constant baseUrl. For the RestAssured.baseUrl.
     */
    private final transient String baseUrl;

    /**
     * Default constructor.
     */
    public SearchApi(final String baseUrl) {
        this.baseUrl = baseUrl;
    }


    /**
     * Method assert search restapi.
     */
    public SearchApi assertApiInformation() {
        given().get(baseUrl + API).then()
                .statusCode(SUCCESS)
                .body("title", equalTo("Recipe Puppy"))
                .body("version", equalTo(0.1f))
                .body("href", equalTo("http://www.recipepuppy.com/"))
                .body("results", hasSize(10));

        return this;
    }
}
