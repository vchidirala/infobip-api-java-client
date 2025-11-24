package com.infobip.api;

import static com.infobip.api.util.ResponseStatuses.*;
import static org.assertj.core.api.BDDAssertions.then;

import com.infobip.model.*;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.junit.jupiter.api.Test;

class NumbersConfigurationApiTest extends ApiTest {

    private static final String AVAILABLE_NUMBERS = "/numbers/1/numbers/available";
    private static final String NUMBERS = "/numbers/1/numbers";
    private static final String NUMBER_BY_ID = "/numbers/1/numbers/{numberId}";

    @Test
    void shouldSearchAvailableNumbers() {
        String givenPhoneNumber1 = "+12025551234";
        String givenPhoneNumber2 = "+12025555678";
        String givenCountryCode = "US";

        String givenResponse = String.format(
                "{\n" + "  \"numbers\": [\n"
                        + "    {\n"
                        + "      \"phoneNumber\": \"%s\",\n"
                        + "      \"countryCode\": \"%s\",\n"
                        + "      \"type\": \"MOBILE\",\n"
                        + "      \"capabilities\": {\n"
                        + "        \"sms\": true,\n"
                        + "        \"voice\": true,\n"
                        + "        \"mms\": false,\n"
                        + "        \"fax\": false\n"
                        + "      },\n"
                        + "      \"monthlyPrice\": \"1.50\",\n"
                        + "      \"setupPrice\": \"0.00\",\n"
                        + "      \"currency\": \"USD\"\n"
                        + "    },\n"
                        + "    {\n"
                        + "      \"phoneNumber\": \"%s\",\n"
                        + "      \"countryCode\": \"%s\",\n"
                        + "      \"type\": \"TOLL_FREE\",\n"
                        + "      \"capabilities\": {\n"
                        + "        \"sms\": true,\n"
                        + "        \"voice\": true,\n"
                        + "        \"mms\": true,\n"
                        + "        \"fax\": false\n"
                        + "      },\n"
                        + "      \"monthlyPrice\": \"2.00\",\n"
                        + "      \"setupPrice\": \"5.00\",\n"
                        + "      \"currency\": \"USD\"\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                givenPhoneNumber1, givenCountryCode, givenPhoneNumber2, givenCountryCode);

        setUpSuccessGetRequest(
                AVAILABLE_NUMBERS, Map.of("countryCode", givenCountryCode, "capability", "SMS"), givenResponse);

        NumbersConfigurationApi api = new NumbersConfigurationApi(getApiClient());

        Consumer<NumbersSearchResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getNumbers()).isNotNull();
            then(response.getNumbers()).hasSize(2);

            NumbersAvailableNumber number1 = response.getNumbers().get(0);
            then(number1.getPhoneNumber()).isEqualTo(givenPhoneNumber1);
            then(number1.getCountryCode()).isEqualTo(givenCountryCode);
            then(number1.getType()).isEqualTo(NumbersType.MOBILE);
            then(number1.getCapabilities()).isNotNull();
            then(number1.getCapabilities().getSms()).isTrue();
            then(number1.getCapabilities().getVoice()).isTrue();
            then(number1.getMonthlyPrice()).isEqualTo("1.50");
            then(number1.getCurrency()).isEqualTo("USD");

            NumbersAvailableNumber number2 = response.getNumbers().get(1);
            then(number2.getPhoneNumber()).isEqualTo(givenPhoneNumber2);
            then(number2.getType()).isEqualTo(NumbersType.TOLL_FREE);
            then(number2.getCapabilities().getMms()).isTrue();
        };

        var call = api.searchAvailableNumbers(givenCountryCode).capability("SMS");
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldPurchaseNumber() {
        String givenPhoneNumber = "+12025551234";
        String givenNumberId = "num-123456";
        String givenCountryCode = "US";
        String givenCallbackUrl = "https://example.com/callback";
        String givenApplicationId = "app-123";

        String expectedRequest = String.format(
                "{\n" + "  \"phoneNumber\": \"%s\",\n"
                        + "  \"configuration\": {\n"
                        + "    \"callbackUrl\": \"%s\",\n"
                        + "    \"applicationId\": \"%s\"\n"
                        + "  }\n"
                        + "}",
                givenPhoneNumber, givenCallbackUrl, givenApplicationId);

        String givenResponse = String.format(
                "{\n" + "  \"numberId\": \"%s\",\n"
                        + "  \"phoneNumber\": \"%s\",\n"
                        + "  \"countryCode\": \"%s\",\n"
                        + "  \"type\": \"MOBILE\",\n"
                        + "  \"status\": \"ACTIVE\",\n"
                        + "  \"capabilities\": {\n"
                        + "    \"sms\": true,\n"
                        + "    \"voice\": true,\n"
                        + "    \"mms\": false,\n"
                        + "    \"fax\": false\n"
                        + "  },\n"
                        + "  \"callbackUrl\": \"%s\",\n"
                        + "  \"applicationId\": \"%s\",\n"
                        + "  \"createdAt\": \"2024-11-24T10:30:00Z\",\n"
                        + "  \"updatedAt\": \"2024-11-24T10:30:00Z\"\n"
                        + "}",
                givenNumberId,
                givenPhoneNumber,
                givenCountryCode,
                givenCallbackUrl,
                givenApplicationId);

        setUpSuccessPostRequest(NUMBERS, expectedRequest, givenResponse);

        NumbersConfigurationApi api = new NumbersConfigurationApi(getApiClient());

        NumbersConfigurationRequest config = new NumbersConfigurationRequest()
                .callbackUrl(givenCallbackUrl)
                .applicationId(givenApplicationId);

        NumbersPurchaseRequest request =
                new NumbersPurchaseRequest().phoneNumber(givenPhoneNumber).configuration(config);

        Consumer<NumbersConfigurationResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getNumberId()).isEqualTo(givenNumberId);
            then(response.getPhoneNumber()).isEqualTo(givenPhoneNumber);
            then(response.getCountryCode()).isEqualTo(givenCountryCode);
            then(response.getType()).isEqualTo(NumbersType.MOBILE);
            then(response.getStatus()).isEqualTo(NumbersStatus.ACTIVE);
            then(response.getCallbackUrl()).isEqualTo(givenCallbackUrl);
            then(response.getApplicationId()).isEqualTo(givenApplicationId);
            then(response.getCapabilities()).isNotNull();
            then(response.getCreatedAt()).isNotNull();
        };

        var call = api.purchaseNumber(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetNumbers() {
        String givenNumberId1 = "num-123456";
        String givenPhoneNumber1 = "+12025551234";
        String givenNumberId2 = "num-789012";
        String givenPhoneNumber2 = "+12025555678";

        String givenResponse = String.format(
                "{\n" + "  \"results\": [\n"
                        + "    {\n"
                        + "      \"numberId\": \"%s\",\n"
                        + "      \"phoneNumber\": \"%s\",\n"
                        + "      \"countryCode\": \"US\",\n"
                        + "      \"type\": \"MOBILE\",\n"
                        + "      \"status\": \"ACTIVE\",\n"
                        + "      \"capabilities\": {\n"
                        + "        \"sms\": true,\n"
                        + "        \"voice\": true,\n"
                        + "        \"mms\": false,\n"
                        + "        \"fax\": false\n"
                        + "      },\n"
                        + "      \"createdAt\": \"2024-11-24T10:30:00Z\",\n"
                        + "      \"updatedAt\": \"2024-11-24T10:30:00Z\"\n"
                        + "    },\n"
                        + "    {\n"
                        + "      \"numberId\": \"%s\",\n"
                        + "      \"phoneNumber\": \"%s\",\n"
                        + "      \"countryCode\": \"US\",\n"
                        + "      \"type\": \"TOLL_FREE\",\n"
                        + "      \"status\": \"ACTIVE\",\n"
                        + "      \"capabilities\": {\n"
                        + "        \"sms\": true,\n"
                        + "        \"voice\": true,\n"
                        + "        \"mms\": true,\n"
                        + "        \"fax\": false\n"
                        + "      },\n"
                        + "      \"createdAt\": \"2024-11-24T10:30:00Z\",\n"
                        + "      \"updatedAt\": \"2024-11-24T10:30:00Z\"\n"
                        + "    }\n"
                        + "  ],\n"
                        + "  \"page\": 0,\n"
                        + "  \"pageSize\": 20,\n"
                        + "  \"totalResults\": 2\n"
                        + "}",
                givenNumberId1, givenPhoneNumber1, givenNumberId2, givenPhoneNumber2);

        setUpSuccessGetRequest(NUMBERS, Map.of("page", "0", "pageSize", "20"), givenResponse);

        NumbersConfigurationApi api = new NumbersConfigurationApi(getApiClient());

        Consumer<NumbersPageResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getResults()).isNotNull();
            then(response.getResults()).hasSize(2);
            then(response.getPage()).isEqualTo(0);
            then(response.getPageSize()).isEqualTo(20);
            then(response.getTotalResults()).isEqualTo(2);

            NumbersConfigurationResponse number1 = response.getResults().get(0);
            then(number1.getNumberId()).isEqualTo(givenNumberId1);
            then(number1.getPhoneNumber()).isEqualTo(givenPhoneNumber1);
            then(number1.getType()).isEqualTo(NumbersType.MOBILE);
            then(number1.getStatus()).isEqualTo(NumbersStatus.ACTIVE);

            NumbersConfigurationResponse number2 = response.getResults().get(1);
            then(number2.getNumberId()).isEqualTo(givenNumberId2);
            then(number2.getPhoneNumber()).isEqualTo(givenPhoneNumber2);
            then(number2.getType()).isEqualTo(NumbersType.TOLL_FREE);
        };

        var call = api.getNumbers().page(0).pageSize(20);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetNumberConfiguration() {
        String givenNumberId = "num-123456";
        String givenPhoneNumber = "+12025551234";
        String givenCallbackUrl = "https://example.com/callback";

        String givenResponse = String.format(
                "{\n" + "  \"numberId\": \"%s\",\n"
                        + "  \"phoneNumber\": \"%s\",\n"
                        + "  \"countryCode\": \"US\",\n"
                        + "  \"type\": \"MOBILE\",\n"
                        + "  \"status\": \"ACTIVE\",\n"
                        + "  \"capabilities\": {\n"
                        + "    \"sms\": true,\n"
                        + "    \"voice\": true,\n"
                        + "    \"mms\": false,\n"
                        + "    \"fax\": false\n"
                        + "  },\n"
                        + "  \"callbackUrl\": \"%s\",\n"
                        + "  \"createdAt\": \"2024-11-24T10:30:00Z\",\n"
                        + "  \"updatedAt\": \"2024-11-24T10:30:00Z\"\n"
                        + "}",
                givenNumberId, givenPhoneNumber, givenCallbackUrl);

        setUpSuccessGetRequest(NUMBER_BY_ID, Collections.emptyMap(), givenResponse, givenNumberId);

        NumbersConfigurationApi api = new NumbersConfigurationApi(getApiClient());

        Consumer<NumbersConfigurationResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getNumberId()).isEqualTo(givenNumberId);
            then(response.getPhoneNumber()).isEqualTo(givenPhoneNumber);
            then(response.getCountryCode()).isEqualTo("US");
            then(response.getType()).isEqualTo(NumbersType.MOBILE);
            then(response.getStatus()).isEqualTo(NumbersStatus.ACTIVE);
            then(response.getCallbackUrl()).isEqualTo(givenCallbackUrl);
            then(response.getCapabilities()).isNotNull();
            then(response.getCapabilities().getSms()).isTrue();
            then(response.getCapabilities().getVoice()).isTrue();
        };

        var call = api.getNumberConfiguration(givenNumberId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldUpdateNumberConfiguration() {
        String givenNumberId = "num-123456";
        String givenPhoneNumber = "+12025551234";
        String givenCallbackUrl = "https://example.com/new-callback";
        String givenApplicationId = "app-456";
        String givenLabel = "Customer Support Line";

        String expectedRequest = String.format(
                "{\n" + "  \"callbackUrl\": \"%s\",\n"
                        + "  \"applicationId\": \"%s\",\n"
                        + "  \"label\": \"%s\"\n"
                        + "}",
                givenCallbackUrl, givenApplicationId, givenLabel);

        String givenResponse = String.format(
                "{\n" + "  \"numberId\": \"%s\",\n"
                        + "  \"phoneNumber\": \"%s\",\n"
                        + "  \"countryCode\": \"US\",\n"
                        + "  \"type\": \"MOBILE\",\n"
                        + "  \"status\": \"ACTIVE\",\n"
                        + "  \"capabilities\": {\n"
                        + "    \"sms\": true,\n"
                        + "    \"voice\": true,\n"
                        + "    \"mms\": false,\n"
                        + "    \"fax\": false\n"
                        + "  },\n"
                        + "  \"callbackUrl\": \"%s\",\n"
                        + "  \"applicationId\": \"%s\",\n"
                        + "  \"label\": \"%s\",\n"
                        + "  \"createdAt\": \"2024-11-24T10:30:00Z\",\n"
                        + "  \"updatedAt\": \"2024-11-24T12:00:00Z\"\n"
                        + "}",
                givenNumberId,
                givenPhoneNumber,
                givenCallbackUrl,
                givenApplicationId,
                givenLabel);

        setUpSuccessPutRequest(NUMBER_BY_ID, expectedRequest, givenResponse, givenNumberId);

        NumbersConfigurationApi api = new NumbersConfigurationApi(getApiClient());

        NumbersConfigurationRequest request = new NumbersConfigurationRequest()
                .callbackUrl(givenCallbackUrl)
                .applicationId(givenApplicationId)
                .label(givenLabel);

        Consumer<NumbersConfigurationResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getNumberId()).isEqualTo(givenNumberId);
            then(response.getPhoneNumber()).isEqualTo(givenPhoneNumber);
            then(response.getCallbackUrl()).isEqualTo(givenCallbackUrl);
            then(response.getApplicationId()).isEqualTo(givenApplicationId);
            then(response.getLabel()).isEqualTo(givenLabel);
            then(response.getStatus()).isEqualTo(NumbersStatus.ACTIVE);
        };

        var call = api.updateNumberConfiguration(givenNumberId, request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldReleaseNumber() {
        String givenNumberId = "num-123456";

        setUpNoRequestBodyDeleteRequest(NUMBER_BY_ID, Collections.emptyMap(), "", 204, givenNumberId);

        NumbersConfigurationApi api = new NumbersConfigurationApi(getApiClient());

        Consumer<Void> assertions = (response) -> {
            then(response).isNull();
        };

        var call = api.releaseNumber(givenNumberId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldHandleNotFoundError() {
        String givenNumberId = "non-existent-id";

        String givenResponse = "{\n" + "  \"requestError\": {\n"
                + "    \"serviceException\": {\n"
                + "      \"messageId\": \"NOT_FOUND\",\n"
                + "      \"text\": \"Number not found\"\n"
                + "    }\n"
                + "  }\n"
                + "}";

        setUpGetRequest(NUMBER_BY_ID, Collections.emptyMap(), givenResponse, 404, givenNumberId);

        NumbersConfigurationApi api = new NumbersConfigurationApi(getApiClient());

        var call = api.getNumberConfiguration(givenNumberId);
        testClientException(call::execute);
        testClientExceptionAsync(call::executeAsync);
    }
}

