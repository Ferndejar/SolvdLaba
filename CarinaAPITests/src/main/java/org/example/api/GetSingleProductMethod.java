package org.example.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import io.restassured.response.Response;

@Endpoint(url = "${base_url}/products/${id}", methodType = HttpMethodType.GET)
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetSingleProductMethod extends AbstractApiMethodV2 {

    public GetSingleProductMethod(String baseUrl, int productId) {
        replaceUrlPlaceholder("base_url", baseUrl);
        replaceUrlPlaceholder("id", String.valueOf(productId));
    }
    @Override
    public Response callAPI() {
        return super.callAPI();
    }
}