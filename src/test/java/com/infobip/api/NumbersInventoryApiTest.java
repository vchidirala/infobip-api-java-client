package com.infobip.api;

import static org.assertj.core.api.BDDAssertions.then;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.infobip.ApiException;
import com.infobip.model.*;
import com.infobip.model.Number;
import java.util.Map;
import java.util.function.Consumer;
import org.junit.jupiter.api.Test;

public class NumbersInventoryApiTest extends ApiTest {

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

        NumbersInventoryApi api = new NumbersInventoryApi(getApiClient());
        var call = api.orderNumber(request);
        testSuccessfulCall(call::execute, assertions);
    }

    @Test
    void shouldGetNumberOrderStatus() throws ApiException {
        String orderId = "12345";
        String givenResponse =
                "{\"basicDetails\":{\"orderId\":\"123\",\"type\":\"234\"},\"billingDetails\":{\"setupFee\":100.00,\"monthlyFee\":200.00},\"additionalData\":{\"state\":\"test\"}}\n";
        setUpSuccessGetRequest("/numbers/2/purchase-order/12345/status", Map.of(), givenResponse);

        Consumer<GetNumberPurchaseOrderStatusResponse> assertions = (response) -> {
            then(response.getBasicDetails().getOrderId()).isEqualTo("123");
            then(response.getBasicDetails().getType()).isEqualTo("234");
            then(response.getBillingDetails().getSetupFee()).isEqualTo(100.00);
            then(response.getBillingDetails().getMonthlyFee()).isEqualTo(200.00);
            then(response.getAdditionalData().getState()).isEqualTo("test");
        };

        NumbersInventoryApi api = new NumbersInventoryApi(getApiClient());
        var call = api.getNumberOrderStatus(orderId);
        testSuccessfulCall(call::execute, assertions);
    }

    @Test
    void shouldOldNumbers() throws ApiException, JsonProcessingException {
        String givenRequest = "{\"numberKey\":\"+1234567890\",\"number\":\"123\"}";
        String givenResponse = "{\"number\":\"+1234567890\",\"country\":\"US\"}";

        setUpSuccessPostRequest("/numbers/1/numbers", givenRequest, givenResponse);

        Consumer<Number> assertions = (response) -> {
            then(response.getNumber()).isEqualTo("+1234567890");
            then(response.getCountry()).isEqualTo("US");
        };

        ObjectMapper objectMapper = new ObjectMapper();
        OldPurchaseNumberRequest request = objectMapper.readValue(givenRequest, OldPurchaseNumberRequest.class);

        NumbersInventoryApi api = new NumbersInventoryApi(getApiClient());
        var call = api.oldNumbers(request);
        testSuccessfulCall(call::execute, assertions);
    }

    @Test
    void shouldListPurchasedNumbers() throws ApiException {
        String givenResponse =
                "{\"numberCount\":2,\"numbers\":[{\"applicationId\":\"234567890\",\"country\":\"US\"},{\"applicationId\":\"987654321\",\"country\":\"CA\"}]}";
        setUpSuccessGetRequest("/numbers/1/numbers", Map.of("page", "1", "limit", "10"), givenResponse);

        Consumer<GetPurchasedNumbersResponse> assertions = (response) -> {
            then(response.getNumbers().get(0).getApplicationId()).isEqualTo("234567890");
            then(response.getNumbers().get(1).getApplicationId()).isEqualTo("987654321");
            then(response.getNumbers().get(0).getCountry()).isEqualTo("US");
            then(response.getNumbers().get(1).getCountry()).isEqualTo("CA");
            then(response.getNumberCount()).isEqualTo(2);
        };
        NumbersInventoryApi api = new NumbersInventoryApi(getApiClient());
        var call = api.listPurchasedNumbers(null, 1, 10);
        testSuccessfulCall(call::execute, assertions);
    }

    @Test
    void shouldGetAvailableNumbers() throws ApiException {
        String givenResponse =
                "{\"numbers\":[{\"number\":\"+1234567890\",\"country\":\"US\"},{\"number\":\"+1987654321\",\"country\":\"CA\"}]}";
        setUpSuccessGetRequest("/numbers/1/numbers/available", Map.of(), givenResponse);

        Consumer<GetAvailableNumbersResponse> assertions = (response) -> {
            then(response.getNumbers().get(0).getNumber()).isEqualTo("+1234567890");
            then(response.getNumbers().get(1).getNumber()).isEqualTo("+1987654321");
            then(response.getNumbers().get(0).getCountry()).isEqualTo("US");
            then(response.getNumbers().get(1).getCountry()).isEqualTo("CA");
        };
        NumbersInventoryApi api = new NumbersInventoryApi(getApiClient());
        var call = api.getAvailableNumber(new GetAvailableNumbersRequest());
        testSuccessfulCall(call::execute, assertions);
    }

    @Test
    void shouldGetOneNumber() throws ApiException {
        String numberKey = "1234567890";
        String givenResponse = "{\"number\":\"+1234567890\",\"country\":\"US\"}";
        setUpSuccessGetRequest("/numbers/1/numbers/" + numberKey, Map.of(), givenResponse);

        Consumer<Number> assertions = (response) -> {
            then(response.getNumber()).isEqualTo("+1234567890");
            then(response.getCountry()).isEqualTo("US");
        };
        NumbersInventoryApi api = new NumbersInventoryApi(getApiClient());
        var call = api.getOneNumber(numberKey);
        testSuccessfulCall(call::execute, assertions);
    }
}
