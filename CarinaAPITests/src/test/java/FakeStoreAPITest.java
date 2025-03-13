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

        System.out.println("Request Body:\n" + api.getRequestBody());

        Response response = api.callAPI();

        System.out.println("Update Response:\n" + response.asPrettyString());

        Assert.assertEquals(response.getStatusCode(), 200, "Update failed");
    }



    @Test
    public void testGetAllProducts() {
        String baseUrl = "https://fakestoreapi.com";

        GetAllProductsMethod api = new GetAllProductsMethod(baseUrl);
        Response response = api.callAPI();

        Assert.assertEquals(response.getStatusCode(), 200, "Status code mismatch!");

        List<Object> products = response.jsonPath().getList("$");
        Assert.assertFalse(products.isEmpty(), "Products list is empty!");
    }

    @Test
    public void testGetSingleProduct() {
        String baseUrl = "https://fakestoreapi.com";
        int productId = 1;

        GetSingleProductMethod api = new GetSingleProductMethod(baseUrl, productId);
        Response response = api.callAPI();

        Assert.assertEquals(response.getStatusCode(), 200, "Status code mismatch!");

        int actualProductId = response.jsonPath().getInt("id");
        Assert.assertEquals(actualProductId, productId,
                "Expected product ID " + productId + ", got " + actualProductId);
    }

    @Test

    public void testGetLimitedProducts() {
        String baseUrl = "https://fakestoreapi.com";
        int limit = 5;

        try {
            GetLimitedProductsMethod api = new GetLimitedProductsMethod(baseUrl, limit);
            Response response = api.callAPI();

            Assert.assertNotNull(response, "API response is null!");

            Assert.assertEquals(response.getStatusCode(), 200);

            int actualProductCount = response.jsonPath().getList("$").size();
            Assert.assertEquals(actualProductCount, limit);
        } catch (Exception e) {
            Assert.fail("API call failed: " + e.getMessage(), e);
        }
    }
}
