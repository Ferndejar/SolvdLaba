
package org.example.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import io.restassured.response.Response;
import org.apache.http.message.BasicHeader;

@Endpoint(url = "${base_url}/products/${id}", methodType = HttpMethodType.DELETE)
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class DeleteProductMethod extends AbstractApiMethodV2 {

    public DeleteProductMethod(String baseUrl, int productId) {
        replaceUrlPlaceholder("base_url", baseUrl);
        replaceUrlPlaceholder("id", String.valueOf(productId));
    }

    @Override
    public Response callAPI() {
        return super.callAPI();
    }
}