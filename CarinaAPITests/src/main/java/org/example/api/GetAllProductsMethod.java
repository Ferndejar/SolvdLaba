package org.example.api;


import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import io.restassured.response.Response;

@Endpoint(url = "${base_url}/products", methodType = HttpMethodType.GET)
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetAllProductsMethod extends AbstractApiMethodV2 {

    public GetAllProductsMethod(String baseUrl) {
        replaceUrlPlaceholder("base_url", baseUrl);
    }

    @Override
    public Response callAPI() {
        return super.callAPI();
    }
}