import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import groovy.util.logging.Log;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.example.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;
import java.util.List;


public class FakeStoreAPITest implements IAbstractTest {
    static {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }
    private static int createdProductId = -1;
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());


    @Test

    public void testVerifyProductInCart() {
        String baseUrl = "https://fakestoreapi.com";
        int cartId = 1;
        int productId = 2;

        VerifyProductInCartMethod api = new VerifyProductInCartMethod(baseUrl, cartId);
        boolean productExists = api.isProductInCart(productId);

        Assert.assertTrue(productExists,
                "Product " + productId + " not found in cart " + cartId);
    }

    @Test
    public void testAddNewProduct() {
          /*  AddNewProductMethod api = new AddNewProductMethod("https://fakestoreapi.com");

            // Execute API call
            Response response = api.callAPI();

            // Get raw JSON response as string
            String jsonResponse = response.asString();
            Assert.assertNotNull(jsonResponse, "Response body is empty");

            // Parse with RestAssured's JsonPath
            JsonPath jsonPath = new JsonPath(jsonResponse);
            int productId = jsonPath.getInt("id");

            Assert.assertTrue(productId > 0, "Invalid product ID in response");
            System.out.println("Created Product ID: " + productId);*/
        AddNewProductMethod api = new AddNewProductMethod("https://fakestoreapi.com");
        Response response = api.callAPI();

        Assert.assertEquals(response.getStatusCode(), 200);
        createdProductId = response.jsonPath().getInt("id");
        Assert.assertTrue(createdProductId > 0, "Invalid product ID");
    }

    @Test(dependsOnMethods = "testAddNewProduct")

    public void testDeleteProduct() {

        System.out.println("Deleting product ID: " + createdProductId);
        Assert.assertTrue(createdProductId > 0, "No product to delete!");

        DeleteProductMethod api = new DeleteProductMethod("https://fakestoreapi.com", createdProductId);
        Response response = api.callAPI();
        Assert.assertEquals(response.getStatusCode(), 200, "Deletion failed!");

    }

    @Test(dependsOnMethods = "testAddNewProduct")
    public void testUpdateProduct() {
        UpdateProductMethod api = new UpdateProductMethod("https://fakestoreapi.com", createdProductId);

        // Log the request before sending
        System.out.println("Request Body:\n" + api.getRequestBody());

        Response response = api.callAPI();

        // Log the response
        System.out.println("Update Response:\n" + response.asPrettyString());

        Assert.assertEquals(response.getStatusCode(), 200, "Update failed");
    }



    @Test
    public void testGetAllProducts() {
        String baseUrl = "https://fakestoreapi.com";

        GetAllProductsMethod api = new GetAllProductsMethod(baseUrl);
        Response response = api.callAPI();

        // Validate status code
        Assert.assertEquals(response.getStatusCode(), 200, "Status code mismatch!");

        // Validate non-empty response
        List<Object> products = response.jsonPath().getList("$");
        Assert.assertFalse(products.isEmpty(), "Products list is empty!");
    }

    @Test
    public void testGetSingleProduct() {
        String baseUrl = "https://fakestoreapi.com";
        int productId = 1;

        GetSingleProductMethod api = new GetSingleProductMethod(baseUrl, productId);
        Response response = api.callAPI();

        // Validate status code
        Assert.assertEquals(response.getStatusCode(), 200, "Status code mismatch!");

        // Validate product ID match
        int actualProductId = response.jsonPath().getInt("id");
        Assert.assertEquals(actualProductId, productId,
                "Expected product ID " + productId + ", got " + actualProductId);
    }







  /*  @Test
    public void testDeleteProduct() {
        String baseUrl = "https://fakestoreapi.com";

        // Step 1: Create a product
        AddNewProductMethod createApi = new AddNewProductMethod(baseUrl);
        Response createResponse = createApi.callAPI();
        System.out.println("Create Response:\n" + createResponse.asPrettyString());

        // Validate creation
        Assert.assertEquals(createResponse.getStatusCode(), 201, "Product creation failed!");
        int newProductId = createResponse.jsonPath().getInt("id");
        Assert.assertTrue(newProductId > 0, "Invalid product ID in create response!");

        // Step 2: Delete the product
        DeleteProductMethod deleteApi = new DeleteProductMethod(baseUrl, newProductId);
        Response deleteResponse = deleteApi.callAPI();
        System.out.println("Delete Response:\n" + deleteResponse.asPrettyString());

        // Validate deletion response format
        Assert.assertEquals(deleteResponse.getStatusCode(), 200, "Deletion failed!");
        Assert.assertTrue(
                deleteResponse.getContentType().contains("application/json"),
                "Response is not JSON!"
        );

        // Validate ID (only if response contains JSON)
        int deletedId = deleteResponse.jsonPath().getInt("id");
        Assert.assertEquals(deletedId, newProductId, "Deleted wrong product!");
    }*/
    @Test

    public void testGetLimitedProducts() {
        String baseUrl = "https://fakestoreapi.com";
        int limit = 5;

        try {
            GetLimitedProductsMethod api = new GetLimitedProductsMethod(baseUrl, limit);
            Response response = api.callAPI(); // Directly use the return value

            Assert.assertNotNull(response, "API response is null!");

            // Validate status code
            Assert.assertEquals(response.getStatusCode(), 200);

            // Validate product count
            int actualProductCount = response.jsonPath().getList("$").size();
            Assert.assertEquals(actualProductCount, limit);
        } catch (Exception e) {
            Assert.fail("API call failed: " + e.getMessage(), e);
        }


        // Validate status code

    }
}
