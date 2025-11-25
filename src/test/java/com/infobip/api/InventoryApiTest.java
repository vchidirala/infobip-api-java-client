package com.infobip.api;

import static org.assertj.core.api.BDDAssertions.then;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.infobip.ApiException;
import com.infobip.model.*;
import java.util.Map;
import java.util.function.Consumer;
import org.junit.jupiter.api.Test;

public class InventoryApiTest extends ApiTest {

    @Test
    void shouldOrderNumber() throws ApiException, JsonProcessingException {
        String givenRequest =
                "{\"state\":\"CA\",\"npa\":\"123\",\"nxx\":\"456\",\"type\":\"local\",\"applicationId\":\"app-1\",\"entityId\":\"entity-1\",\"quantity\":10}";
        String givenResponse = "{\"orderId\":\"12345\"}";

        setUpSuccessPostRequest("/numbers/2/purchase-order", givenRequest, givenResponse);

        Consumer<NumberPurchaseOrderResponse> assertions = (response) -> {
            then(response.getOrderId()).isEqualTo("12345");
        };
        ObjectMapper objectMapper = new ObjectMapper();
        NumberPurchaseOrderRequest request = objectMapper.readValue(givenRequest, NumberPurchaseOrderRequest.class);

        InventoryApi api = new InventoryApi(getApiClient());
        var call = api.orderNumber(request);
        testSuccessfulCall(call::execute, assertions);
    }

    @Test
    void shouldGetNumberOrderStatus() throws ApiException, JsonProcessingException {
        String orderId = "12345";
        String givenResponse =
                "[{\"basicDetails\":{\"orderId\":\"123\",\"type\":\"234\"},\"billingDetails\":{\"setupFee\":\100.0,\"monthlyFee\":\"200.0\"},\"additionalData\":{\"state\":\"test\"}}]";
        setUpSuccessGetRequest("/numbers/2/purchase-order/[" + orderId + "]/status", Map.of(), givenResponse);

        Consumer<GetNumberPurchaseOrderStatusResponse> assertions = (response) -> {
            then(response.getBasicDetails().getOrderId()).isEqualTo("123");
            then(response.getBasicDetails().getType()).isEqualTo("234");
            then(response.getBillingDetails().getSetupFee()).isEqualTo(100.0);
            then(response.getBillingDetails().getMonthlyFee()).isEqualTo("200.0");
            then(response.getAdditionalData().getState()).isEqualTo("test");
        };

        InventoryApi api = new InventoryApi(getApiClient());
        var call = api.getNumberOrderStatus(orderId);
        testSuccessfulCall(call::execute, assertions);
    }
}
