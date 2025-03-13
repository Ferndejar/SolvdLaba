package org.example.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import io.restassured.response.Response;


@Endpoint(url = "${base_url}/products", methodType = HttpMethodType.POST)
@RequestTemplatePath(path = "api/fakestore/products/_post/rq.json")
@ResponseTemplatePath(path = "api/fakestore/products/_post/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class AddNewProductMethod extends AbstractApiMethodV2 {

    public AddNewProductMethod(String baseUrl) {
        replaceUrlPlaceholder("base_url", baseUrl);
        setHeaders("Content-Type=application/json");

        // Set template properties
        addProperty("title", "Test Product");
        addProperty("price", 13.5);
        addProperty("description", "Test description");
        addProperty("image", "https://via.placeholder.com/150");
        addProperty("category", "electronics");
    }
    @Override
    public Response callAPI() {
        return super.callAPI();
    }
}