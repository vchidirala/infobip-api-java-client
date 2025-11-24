/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.infobip.ApiCallback;
import com.infobip.ApiClient;
import com.infobip.ApiException;
import com.infobip.Parameter;
import com.infobip.RequestDefinition;
import com.infobip.model.NumbersConfigurationRequest;
import com.infobip.model.NumbersConfigurationResponse;
import com.infobip.model.NumbersPageResponse;
import com.infobip.model.NumbersPurchaseRequest;
import com.infobip.model.NumbersSearchRequest;
import com.infobip.model.NumbersSearchResponse;
import java.util.Objects;

/**
 * Represents NumbersConfigurationApi API client.
 */
public class NumbersConfigurationApi {

    private final ApiClient apiClient;

    /**
     * Constructs a new instance of NumbersConfigurationApi.
     *
     * @param apiClient {@link ApiClient} instance to delegate calls to.
     */
    public NumbersConfigurationApi(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must not be null!");
    }

    private RequestDefinition searchAvailableNumbersDefinition(String countryCode, String type, String capability) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/numbers/1/numbers/available")
                .requiresAuthentication(true)
                .accept("application/json");

        if (countryCode != null) {
            builder.addQueryParameter(new Parameter("countryCode", countryCode));
        }
        if (type != null) {
            builder.addQueryParameter(new Parameter("type", type));
        }
        if (capability != null) {
            builder.addQueryParameter(new Parameter("capability", capability));
        }
        return builder.build();
    }

    /**
     * searchAvailableNumbers request builder class.
     */
    public class SearchAvailableNumbersRequest {
        private final String countryCode;
        private String type;
        private String capability;

        private SearchAvailableNumbersRequest(String countryCode) {
            this.countryCode = Objects.requireNonNull(countryCode, "The required parameter 'countryCode' is missing.");
        }

        /**
         * Sets type.
         *
         * @param type Type of number to search for. (optional)
         * @return SearchAvailableNumbersRequest
         */
        public SearchAvailableNumbersRequest type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets capability.
         *
         * @param capability Required capability of the number (e.g., SMS, VOICE). (optional)
         * @return SearchAvailableNumbersRequest
         */
        public SearchAvailableNumbersRequest capability(String capability) {
            this.capability = capability;
            return this;
        }

        /**
         * Executes the searchAvailableNumbers request.
         *
         * @return NumbersSearchResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumbersSearchResponse execute() throws ApiException {
            RequestDefinition searchAvailableNumbersDefinition =
                    searchAvailableNumbersDefinition(countryCode, type, capability);
            return apiClient.execute(
                    searchAvailableNumbersDefinition, new TypeReference<NumbersSearchResponse>() {}.getType());
        }

        /**
         * Executes the searchAvailableNumbers request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumbersSearchResponse> callback) {
            RequestDefinition searchAvailableNumbersDefinition =
                    searchAvailableNumbersDefinition(countryCode, type, capability);
            return apiClient.executeAsync(
                    searchAvailableNumbersDefinition,
                    new TypeReference<NumbersSearchResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Search available numbers.
     * <p>
     * Search for available phone numbers that can be purchased.
     *
     * @param countryCode ISO 3166-1 alpha-2 country code. (required)
     * @return SearchAvailableNumbersRequest
     */
    public SearchAvailableNumbersRequest searchAvailableNumbers(String countryCode) {
        return new SearchAvailableNumbersRequest(countryCode);
    }

    private RequestDefinition purchaseNumberDefinition(NumbersPurchaseRequest numbersPurchaseRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/numbers/1/numbers")
                .body(numbersPurchaseRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * purchaseNumber request builder class.
     */
    public class PurchaseNumberRequest {
        private final NumbersPurchaseRequest numbersPurchaseRequest;

        private PurchaseNumberRequest(NumbersPurchaseRequest numbersPurchaseRequest) {
            this.numbersPurchaseRequest =
                    Objects.requireNonNull(numbersPurchaseRequest, "The required parameter 'numbersPurchaseRequest' is missing.");
        }

        /**
         * Executes the purchaseNumber request.
         *
         * @return NumbersConfigurationResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumbersConfigurationResponse execute() throws ApiException {
            RequestDefinition purchaseNumberDefinition = purchaseNumberDefinition(numbersPurchaseRequest);
            return apiClient.execute(
                    purchaseNumberDefinition, new TypeReference<NumbersConfigurationResponse>() {}.getType());
        }

        /**
         * Executes the purchaseNumber request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumbersConfigurationResponse> callback) {
            RequestDefinition purchaseNumberDefinition = purchaseNumberDefinition(numbersPurchaseRequest);
            return apiClient.executeAsync(
                    purchaseNumberDefinition,
                    new TypeReference<NumbersConfigurationResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Purchase a phone number.
     * <p>
     * Purchase an available phone number and configure it.
     *
     * @param numbersPurchaseRequest  (required)
     * @return PurchaseNumberRequest
     */
    public PurchaseNumberRequest purchaseNumber(NumbersPurchaseRequest numbersPurchaseRequest) {
        return new PurchaseNumberRequest(numbersPurchaseRequest);
    }

    private RequestDefinition getNumbersDefinition(Integer page, Integer pageSize) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/numbers/1/numbers")
                .requiresAuthentication(true)
                .accept("application/json");

        if (page != null) {
            builder.addQueryParameter(new Parameter("page", page));
        }
        if (pageSize != null) {
            builder.addQueryParameter(new Parameter("pageSize", pageSize));
        }
        return builder.build();
    }

    /**
     * getNumbers request builder class.
     */
    public class GetNumbersRequest {
        private Integer page;
        private Integer pageSize;

        private GetNumbersRequest() {}

        /**
         * Sets page.
         *
         * @param page Page number. Default is 0. (optional)
         * @return GetNumbersRequest
         */
        public GetNumbersRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Sets pageSize.
         *
         * @param pageSize Number of results per page. Default is 20. (optional)
         * @return GetNumbersRequest
         */
        public GetNumbersRequest pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Executes the getNumbers request.
         *
         * @return NumbersPageResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumbersPageResponse execute() throws ApiException {
            RequestDefinition getNumbersDefinition = getNumbersDefinition(page, pageSize);
            return apiClient.execute(getNumbersDefinition, new TypeReference<NumbersPageResponse>() {}.getType());
        }

        /**
         * Executes the getNumbers request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumbersPageResponse> callback) {
            RequestDefinition getNumbersDefinition = getNumbersDefinition(page, pageSize);
            return apiClient.executeAsync(
                    getNumbersDefinition, new TypeReference<NumbersPageResponse>() {}.getType(), callback);
        }
    }

    /**
     * Get owned numbers.
     * <p>
     * Get a list of all owned phone numbers with their configurations.
     *
     * @return GetNumbersRequest
     */
    public GetNumbersRequest getNumbers() {
        return new GetNumbersRequest();
    }

    private RequestDefinition getNumberConfigurationDefinition(String numberId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/numbers/1/numbers/{numberId}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (numberId != null) {
            builder.addPathParameter(new Parameter("numberId", numberId));
        }
        return builder.build();
    }

    /**
     * getNumberConfiguration request builder class.
     */
    public class GetNumberConfigurationRequest {
        private final String numberId;

        private GetNumberConfigurationRequest(String numberId) {
            this.numberId = Objects.requireNonNull(numberId, "The required parameter 'numberId' is missing.");
        }

        /**
         * Executes the getNumberConfiguration request.
         *
         * @return NumbersConfigurationResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumbersConfigurationResponse execute() throws ApiException {
            RequestDefinition getNumberConfigurationDefinition = getNumberConfigurationDefinition(numberId);
            return apiClient.execute(
                    getNumberConfigurationDefinition,
                    new TypeReference<NumbersConfigurationResponse>() {}.getType());
        }

        /**
         * Executes the getNumberConfiguration request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumbersConfigurationResponse> callback) {
            RequestDefinition getNumberConfigurationDefinition = getNumberConfigurationDefinition(numberId);
            return apiClient.executeAsync(
                    getNumberConfigurationDefinition,
                    new TypeReference<NumbersConfigurationResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get number configuration.
     * <p>
     * Get the configuration details for a specific phone number.
     *
     * @param numberId Unique identifier of the number. (required)
     * @return GetNumberConfigurationRequest
     */
    public GetNumberConfigurationRequest getNumberConfiguration(String numberId) {
        return new GetNumberConfigurationRequest(numberId);
    }

    private RequestDefinition updateNumberConfigurationDefinition(
            String numberId, NumbersConfigurationRequest numbersConfigurationRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("PUT", "/numbers/1/numbers/{numberId}")
                .body(numbersConfigurationRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (numberId != null) {
            builder.addPathParameter(new Parameter("numberId", numberId));
        }
        return builder.build();
    }

    /**
     * updateNumberConfiguration request builder class.
     */
    public class UpdateNumberConfigurationRequest {
        private final String numberId;
        private final NumbersConfigurationRequest numbersConfigurationRequest;

        private UpdateNumberConfigurationRequest(
                String numberId, NumbersConfigurationRequest numbersConfigurationRequest) {
            this.numberId = Objects.requireNonNull(numberId, "The required parameter 'numberId' is missing.");
            this.numbersConfigurationRequest = Objects.requireNonNull(
                    numbersConfigurationRequest, "The required parameter 'numbersConfigurationRequest' is missing.");
        }

        /**
         * Executes the updateNumberConfiguration request.
         *
         * @return NumbersConfigurationResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumbersConfigurationResponse execute() throws ApiException {
            RequestDefinition updateNumberConfigurationDefinition =
                    updateNumberConfigurationDefinition(numberId, numbersConfigurationRequest);
            return apiClient.execute(
                    updateNumberConfigurationDefinition,
                    new TypeReference<NumbersConfigurationResponse>() {}.getType());
        }

        /**
         * Executes the updateNumberConfiguration request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumbersConfigurationResponse> callback) {
            RequestDefinition updateNumberConfigurationDefinition =
                    updateNumberConfigurationDefinition(numberId, numbersConfigurationRequest);
            return apiClient.executeAsync(
                    updateNumberConfigurationDefinition,
                    new TypeReference<NumbersConfigurationResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Update number configuration.
     * <p>
     * Update the configuration for a phone number.
     *
     * @param numberId Unique identifier of the number. (required)
     * @param numbersConfigurationRequest  (required)
     * @return UpdateNumberConfigurationRequest
     */
    public UpdateNumberConfigurationRequest updateNumberConfiguration(
            String numberId, NumbersConfigurationRequest numbersConfigurationRequest) {
        return new UpdateNumberConfigurationRequest(numberId, numbersConfigurationRequest);
    }

    private RequestDefinition releaseNumberDefinition(String numberId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("DELETE", "/numbers/1/numbers/{numberId}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (numberId != null) {
            builder.addPathParameter(new Parameter("numberId", numberId));
        }
        return builder.build();
    }

    /**
     * releaseNumber request builder class.
     */
    public class ReleaseNumberRequest {
        private final String numberId;

        private ReleaseNumberRequest(String numberId) {
            this.numberId = Objects.requireNonNull(numberId, "The required parameter 'numberId' is missing.");
        }

        /**
         * Executes the releaseNumber request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition releaseNumberDefinition = releaseNumberDefinition(numberId);
            apiClient.execute(releaseNumberDefinition);
        }

        /**
         * Executes the releaseNumber request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition releaseNumberDefinition = releaseNumberDefinition(numberId);
            return apiClient.executeAsync(releaseNumberDefinition, callback);
        }
    }

    /**
     * Release a phone number.
     * <p>
     * Release (delete) a phone number from your account.
     *
     * @param numberId Unique identifier of the number. (required)
     * @return ReleaseNumberRequest
     */
    public ReleaseNumberRequest releaseNumber(String numberId) {
        return new ReleaseNumberRequest(numberId);
    }
}

