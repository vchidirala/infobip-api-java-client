package com.infobip.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.infobip.*;
import com.infobip.model.*;
import com.infobip.model.Number;
import java.util.List;
import java.util.Objects;
import okhttp3.Call;

/**
 * Represents InventoryApi API client.
 */
public class NumbersInventoryApi {

    private final ApiClient apiClient;

    /**
     * Constructs a new instance of InventoryApi.
     *
     * @param apiClient {@link ApiClient} instance to delegate calls to.
     */
    public NumbersInventoryApi(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must not be null!");
    }

    private RequestDefinition orderNumberDefinition(NumberPurchaseOrderRequest numberPurchaseOrderRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/numbers/2/purchase-order")
                .body(numberPurchaseOrderRequest)
                .accept("application/json")
                .requiresAuthentication(true)
                .contentType("application/json");

        return builder.build();
    }

    /**
     * OrderNumber request builder class.
     */
    public class OrderNumberRequest {

        private final NumberPurchaseOrderRequest numberPurchaseOrderRequest;

        private OrderNumberRequest(NumberPurchaseOrderRequest numberPurchaseOrderRequest) {
            this.numberPurchaseOrderRequest = Objects.requireNonNull(
                    numberPurchaseOrderRequest, "The required parameter 'numberPurchaseOrderRequest' is missing.");
        }

        /**
         * Executes the orderNumber request
         *
         * @return NumberPurchaseOrderResponse
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumberPurchaseOrderResponse execute() throws ApiException {
            RequestDefinition orderNumberDefinition = orderNumberDefinition(numberPurchaseOrderRequest);
            return apiClient.execute(
                    orderNumberDefinition, new TypeReference<NumberPurchaseOrderResponse>() {}.getType());
        }

        /**
         * Executes the orderNumber request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link Call} associated with the API request.
         */
        public Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition orderNumberDefinition = orderNumberDefinition(numberPurchaseOrderRequest);
            return apiClient.executeAsync(
                    orderNumberDefinition, new TypeReference<NumberPurchaseOrderResponse>() {}.getType(), callback);
        }
    }

    /**
     * order Number.
     * <p>
     * order Number.
     *
     * @param numberPurchaseOrderRequest (required)
     * @return OrderNumberRequest
     */
    public OrderNumberRequest orderNumber(NumberPurchaseOrderRequest numberPurchaseOrderRequest) throws ApiException {
        return new OrderNumberRequest(numberPurchaseOrderRequest);
    }

    private RequestDefinition getNumberOrderStatusDefinition(String orderId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "GET", "/numbers/2/purchase-order/{orderId}/status")
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");
        if (orderId != null) {
            builder.addPathParameter(new Parameter("orderId", orderId));
        }
        return builder.build();
    }

    /**
     * GetNumberOrderStatus request builder class.
     */
    public class GetNumberOrderStatusRequest {

        private final String orderId;

        private GetNumberOrderStatusRequest(String orderId) {
            this.orderId = Objects.requireNonNull(orderId, "The required parameter 'orderId' is missing.");
        }

        /**
         * Executes the getNumberOrderStatus request
         *
         * @return GetNumberPurchaseOrderStatusResponse
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public GetNumberPurchaseOrderStatusResponse execute() throws ApiException {
            RequestDefinition getNumberOrderStatusDefinition = getNumberOrderStatusDefinition(orderId);
            return apiClient.execute(
                    getNumberOrderStatusDefinition,
                    new TypeReference<GetNumberPurchaseOrderStatusResponse>() {}.getType());
        }

        /**
         * Executes the getNumberOrderStatus request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link Call} associated with the API request.
         */
        public Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition getNumberOrderStatusDefinition = getNumberOrderStatusDefinition(orderId);
            return apiClient.executeAsync(
                    getNumberOrderStatusDefinition,
                    new TypeReference<GetNumberPurchaseOrderStatusResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * get NumberOrder Status.
     * <p>
     * get NumberOrder Status.
     *
     * @param orderId (required)
     * @return GetNumberOrderStatusRequest
     */
    public GetNumberOrderStatusRequest getNumberOrderStatus(String orderId) throws ApiException {
        return new GetNumberOrderStatusRequest(orderId);
    }

    private RequestDefinition oldNumbersDefinition(OldPurchaseNumberRequest oldPurchaseNumberRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/numbers/1/numbers")
                .body(oldPurchaseNumberRequest)
                .accept("application/json")
                .requiresAuthentication(true)
                .contentType("application/json");
        return builder.build();
    }

    /**
     * OldNumbers request builder class.
     */
    public class OldNumbersRequest {

        private final OldPurchaseNumberRequest oldPurchaseNumberRequest;

        private OldNumbersRequest(OldPurchaseNumberRequest oldPurchaseNumberRequest) {
            this.oldPurchaseNumberRequest = Objects.requireNonNull(
                    oldPurchaseNumberRequest, "The required parameter 'oldPurchaseNumberRequest' is missing.");
        }

        /**
         * Executes the OldNumbersRequest request
         *
         * @return Number
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public Number execute() throws ApiException {
            RequestDefinition oldNumbersDefinition = oldNumbersDefinition(oldPurchaseNumberRequest);
            return apiClient.execute(oldNumbersDefinition, new TypeReference<Number>() {}.getType());
        }

        /**
         * Executes the getNumberOrderStatus request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link Call} associated with the API request.
         */
        public Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition oldNumbersDefinition = oldNumbersDefinition(oldPurchaseNumberRequest);
            return apiClient.executeAsync(oldNumbersDefinition, new TypeReference<Number>() {}.getType(), callback);
        }
    }

    /**
     * Old Numbers.
     * <p>
     * Old Numbers.
     *
     * @param oldPurchaseNumberRequest (required)
     * @return OldNumbersRequest
     */
    public OldNumbersRequest oldNumbers(OldPurchaseNumberRequest oldPurchaseNumberRequest) throws ApiException {
        return new OldNumbersRequest(oldPurchaseNumberRequest);
    }

    private RequestDefinition listPurchasedNumbersDefinition(List<String> countries, int page, int limit) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/numbers/1/numbers")
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");
        if (countries != null && !countries.isEmpty()) {
            builder.addQueryParameter(new Parameter("countries", countries));
        }
        builder.addQueryParameter(new Parameter("page", page));
        builder.addQueryParameter(new Parameter("limit", limit));
        return builder.build();
    }

    /**
     * ListPurchasedNumbers request builder class.
     */
    public class ListPurchasedNumbersRequest {

        private final List<String> countries;
        private final int page;
        private final int limit;

        private ListPurchasedNumbersRequest(List<String> countries, int page, int limit) {
            this.countries = countries;
            this.page = page;
            this.limit = limit;
        }

        /**
         * Executes the listPurchasedNumbers request
         *
         * @return GetPurchasedNumbersResponse
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public GetPurchasedNumbersResponse execute() throws ApiException {
            RequestDefinition def = listPurchasedNumbersDefinition(countries, page, limit);
            return apiClient.execute(def, new TypeReference<GetPurchasedNumbersResponse>() {}.getType());
        }

        /**
         * Executes the listPurchasedNumbers request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link Call} associated with the API request.
         */
        public Call executeAsync(ApiCallback<GetPurchasedNumbersResponse> callback) {
            RequestDefinition def = listPurchasedNumbersDefinition(countries, page, limit);
            return apiClient.executeAsync(def, new TypeReference<GetPurchasedNumbersResponse>() {}.getType(), callback);
        }
    }

    /**
     * listPurchasedNumbers.
     *
     * @param countries (optional)
     * @param page (required)
     * @param limit (required)
     * @return ListPurchasedNumbersRequest
     */
    public ListPurchasedNumbersRequest listPurchasedNumbers(List<String> countries, int page, int limit)
            throws ApiException {
        return new ListPurchasedNumbersRequest(countries, page, limit);
    }

    private RequestDefinition getOneNumberDefinition(String numberKey) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/numbers/1/numbers/{numberKey}")
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");
        if (numberKey != null) {
            builder.addPathParameter(new Parameter("numberKey", numberKey));
        }
        return builder.build();
    }

    /**
     * GetOneNumber request builder class.
     */
    public class GetOneNumberRequest {

        private final String numberKey;

        private GetOneNumberRequest(String numberKey) {
            this.numberKey = Objects.requireNonNull(numberKey, "The required parameter 'numberKey' is missing.");
        }

        /**
         * Executes the GetOneNumber request
         *
         * @return Number
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public Number execute() throws ApiException {
            RequestDefinition getOneNumberDefinition = getOneNumberDefinition(numberKey);
            return apiClient.execute(getOneNumberDefinition, new TypeReference<Number>() {}.getType());
        }

        /**
         * Executes the GetOneNumber request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link Call} associated with the API request.
         */
        public Call executeAsync(ApiCallback<GetPurchasedNumbersResponse> callback) {
            RequestDefinition getOneNumberDefinition = getOneNumberDefinition(numberKey);
            return apiClient.executeAsync(getOneNumberDefinition, new TypeReference<Number>() {}.getType(), callback);
        }
    }

    /**
     * GetOneNumber.
     *
     * @param numberKey (required)
     * @return GetOneNumberRequest
     */
    public GetOneNumberRequest getOneNumber(String numberKey) throws ApiException {
        return new GetOneNumberRequest(numberKey);
    }

    private RequestDefinition getAvailableNumberDefinition(GetAvailableNumbersRequest request) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/numbers/1/numbers/available")
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * getAvailableNumber request builder class.
     */
    public class GetAvailableNumberRequestBuilder {

        private final GetAvailableNumbersRequest request;

        private GetAvailableNumberRequestBuilder(GetAvailableNumbersRequest request) {
            this.request =
                    Objects.requireNonNull(request, "The required parameter 'GetAvailableNumbersRequest' is missing.");
        }

        /**
         * Executes the GetAvailableNumberRequestBuilder request
         *
         * @return GetAvailableNumbersResponse
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public GetAvailableNumbersResponse execute() throws ApiException {
            RequestDefinition getOneNumberDefinition = getAvailableNumberDefinition(request);
            return apiClient.execute(
                    getOneNumberDefinition, new TypeReference<GetAvailableNumbersResponse>() {}.getType());
        }

        /**
         * Executes the GetAvailableNumberRequestBuilder request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link Call} associated with the API request.
         */
        public Call executeAsync(ApiCallback<GetPurchasedNumbersResponse> callback) {
            RequestDefinition getOneNumberDefinition = getAvailableNumberDefinition(request);
            return apiClient.executeAsync(
                    getOneNumberDefinition, new TypeReference<GetAvailableNumbersResponse>() {}.getType(), callback);
        }
    }

    /**
     * GetAvailableNumber.
     *
     * @param request (required)
     * @return GetAvailableNumberRequestBuilder
     */
    public GetAvailableNumberRequestBuilder getAvailableNumber(GetAvailableNumbersRequest request) {
        return new GetAvailableNumberRequestBuilder(request);
    }
}
