package org.example.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import io.restassured.response.Response;

@Endpoint(url = "${base_url}/products?limit=${limit}", methodType = HttpMethodType.GET)
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetLimitedProductsMethod extends AbstractApiMethodV2 {

    public GetLimitedProductsMethod(String baseUrl, int limit) {
        replaceUrlPlaceholder("base_url", baseUrl);
        replaceUrlPlaceholder("limit", String.valueOf(limit));
    }

    @Override
    public Response callAPI() {
        return super.callAPI();
    }
}