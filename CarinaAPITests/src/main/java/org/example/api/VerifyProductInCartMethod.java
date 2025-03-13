package org.example.api;

import com.jayway.jsonpath.JsonPath;
import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import io.restassured.response.Response;

@Endpoint(url = "${base_url}/carts/${cartId}", methodType = HttpMethodType.GET)
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class VerifyProductInCartMethod extends AbstractApiMethodV2 {

    public VerifyProductInCartMethod(String baseUrl, int cartId) {
        replaceUrlPlaceholder("base_url", baseUrl);
        replaceUrlPlaceholder("cartId", String.valueOf(cartId));
    }

    public boolean isProductInCart(int productId) {
        Response response = callAPI();
        String jsonResponse = response.getBody().asString();
        return JsonPath.parse(jsonResponse)
                .read("$.products[?(@.productId == " + productId + ")]") != null;
    }

    @Override
    public Response callAPI() {
        return super.callAPI();
    }
}