package api;

import api.schema.Todos;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
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
     * Constant TODOS.
     */
    private static final String TODOS = "/todos/";

    /**
     * Constant baseUrl. For the RestAssured.baseUrl.
     */
    private final transient String baseUrl;

    /**
     * Default constructor.
     *
     * @param baseUrl base url.
     */
    public SearchApi(final String baseUrl) {
        this.baseUrl = baseUrl;
    }


    /**
     * Method assert Puppy Api Information.
     *
     * @return this.
     */
    public SearchApi assertPuppyApiInformation() {
        given().get(baseUrl + API).then()
                .statusCode(SUCCESS).assertThat()
                .body("title", equalTo("Recipe Puppy"))
                .body("version", equalTo(0.1f))
                .body("href", equalTo("http://www.recipepuppy.com/"))
                .body("results", hasSize(10));

        return this;
    }

    /**
     * Method assert Holder Api Information.
     *
     * @param getId value of id.
     * @return this.
     */
    public SearchApi assertHolderApiInformation(final int getId) {
        final Todos todos = when().get(baseUrl + TODOS + getId).then().extract().response().as(Todos.class);

        assertThat(todos.getId(), equalTo(getId));
        assertThat(todos.getTitle(), equalTo("delectus aut autem"));
        assertThat(todos.getUserId(), equalTo(getId));
        assertThat(todos.isCompleted(), equalTo(false));

        return this;
    }
}
