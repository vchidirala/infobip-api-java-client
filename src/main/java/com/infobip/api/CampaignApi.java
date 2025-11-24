package com.infobip.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.infobip.*;
import com.infobip.model.*;
import java.util.List;
import java.util.Objects;
import okhttp3.Call;

/**
 * Represents CampaignApi API client.
 */
public class CampaignApi {

    private final ApiClient apiClient;

    /**
     * Constructs a new instance of CampaignApi.
     *
     * @param apiClient {@link ApiClient} instance to delegate calls to.
     */
    public CampaignApi(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must not be null!");
    }

    private RequestDefinition getCampaignNetworkStatusDefinition(String campaignId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "GET", "/number-registration/1/campaigns/{campaignId}/network-statuses")
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");
        if (campaignId != null) {
            builder.addPathParameter(new Parameter("campaignId", campaignId));
        }
        return builder.build();
    }

    /**
     * GetCampaignNetworkStatus request builder class.
     */
    public class GetCampaignNetworkStatusRequest {

        private final String campaignId;

        private GetCampaignNetworkStatusRequest(String campaignId) {
            this.campaignId = Objects.requireNonNull(campaignId, "The required parameter 'campaignId' is missing.");
        }

        /**
         * Executes the GetCampaignNetworkStatus request
         *
         * @return List<GetCampaignNetworkStatusResponse>
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public List<GetCampaignNetworkStatusResponse> execute() throws ApiException {
            RequestDefinition getCampaignNetworkStatusDefinition = getCampaignNetworkStatusDefinition(campaignId);
            return apiClient.execute(
                    getCampaignNetworkStatusDefinition,
                    new TypeReference<List<GetCampaignNetworkStatusResponse>>() {}.getType());
        }

        /**
         * Executes the GetCampaignNetworkStatus request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link Call} associated with the API request.
         */
        public Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition createBrandsDefinition = getCampaignNetworkStatusDefinition(campaignId);
            return apiClient.executeAsync(
                    createBrandsDefinition,
                    new TypeReference<List<GetCampaignNetworkStatusResponse>>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get CampaignNetworkStatus.
     * <p>
     * Get CampaignNetworkStatus.
     *
     * @param campaignId (required)
     * @return GetCampaignNetworkStatusRequest
     */
    public CampaignApi.GetCampaignNetworkStatusRequest getCampaignNetworkStatuses(String campaignId)
            throws ApiException {
        return new CampaignApi.GetCampaignNetworkStatusRequest(campaignId);
    }

    private RequestDefinition getCampaignDefinition(String campaignId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "GET", "/number-registration/1/campaigns/{campaignId}")
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");
        if (campaignId != null) {
            builder.addPathParameter(new Parameter("campaignId", campaignId));
        }
        return builder.build();
    }

    /**
     * getCampaign request builder class.
     */
    public class GetCampaignRequest {

        private final String campaignId;

        private GetCampaignRequest(String campaignId) {
            this.campaignId = Objects.requireNonNull(campaignId, "The required parameter 'campaignId' is missing.");
        }

        /**
         * Executes the GetCampaignRequest request
         *
         * @return GetCampaignResponse
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public GetCampaignResponse execute() throws ApiException {
            RequestDefinition getCampaignDefinition = getCampaignDefinition(campaignId);
            return apiClient.execute(getCampaignDefinition, new TypeReference<GetCampaignResponse>() {}.getType());
        }

        /**
         * Executes the GetCampaignRequest request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link Call} associated with the API request.
         */
        public Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition createBrandsDefinition = getCampaignNetworkStatusDefinition(campaignId);
            return apiClient.executeAsync(
                    createBrandsDefinition, new TypeReference<GetCampaignResponse>() {}.getType(), callback);
        }
    }

    /**
     * Get Campaign.
     * <p>
     * Get Campaign.
     *
     * @param campaignId (required)
     * @return GetCampaignRequest
     */
    public CampaignApi.GetCampaignRequest getCampaign(String campaignId) throws ApiException {
        return new CampaignApi.GetCampaignRequest(campaignId);
    }

    private RequestDefinition createCampaignDefinition(CreateCampaignRequest createCampaignRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/number-registration/1/campaigns")
                .body(createCampaignRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * CreateCampaign request builder class.
     */
    public class CreateCampaignRequestBuilder {

        private final CreateCampaignRequest request;

        private CreateCampaignRequestBuilder(CreateCampaignRequest request) {
            this.request =
                    Objects.requireNonNull(request, "The required parameter 'CreateCampaignRequest' is missing.");
        }

        /**
         * Executes the CreateCampaign request
         *
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CreateCampaignResponse execute() throws ApiException {
            RequestDefinition createCampaignDefinition = createCampaignDefinition(request);
            return apiClient.execute(
                    createCampaignDefinition, new TypeReference<CreateCampaignResponse>() {}.getType());
        }

        /**
         * Executes the CreateCampaign request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link Call} associated with the API request.
         */
        public Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition createCampaignDefinition = createCampaignDefinition(request);
            return apiClient.executeAsync(
                    createCampaignDefinition, new TypeReference<CreateCampaignResponse>() {}.getType(), callback);
        }
    }

    /**
     * create Campaign.
     * <p>
     * vet Brand.
     *
     * @param createCampaignRequest (required)
     * @return CreateCampaignRequestBuilder
     */
    public CampaignApi.CreateCampaignRequestBuilder createCampaign(CreateCampaignRequest createCampaignRequest) {
        return new CampaignApi.CreateCampaignRequestBuilder(createCampaignRequest);
    }

    private RequestDefinition addNumbersDefinition(AddNumbersRequest addNumbersRequest, String campaignId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/number-registration/1/campaigns/{campaignId}/add-numbers")
                .body(addNumbersRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");
        if (campaignId != null) {
            builder.addPathParameter(new Parameter("campaignId", campaignId));
        }

        return builder.build();
    }

    /**
     * AddNumbers request builder class.
     */
    public class AddNumbersRequestBuilder {

        private final AddNumbersRequest request;
        private final String campaignId;

        private AddNumbersRequestBuilder(AddNumbersRequest request, String campaignId) {
            this.request = Objects.requireNonNull(request, "The required parameter 'AddNumbersRequest' is missing.");
            this.campaignId = Objects.requireNonNull(campaignId, "The required parameter 'campaignId' is missing.");
        }

        /**
         * Executes the AddNumbers request
         *
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition addNumbersDefinition = addNumbersDefinition(request, campaignId);
            apiClient.execute(addNumbersDefinition);
        }

        /**
         * Executes the AddNumbers request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link Call} associated with the API request.
         */
        public Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition addNumbersDefinition = addNumbersDefinition(request, campaignId);
            return apiClient.executeAsync(addNumbersDefinition, callback);
        }
    }

    /**
     * add Numbers.
     * <p>
     * add Numbers.
     *
     * @param addNumbersRequest (required)
     * @param campaignId (required)
     * @return AddNumbersRequestBuilder
     */
    public CampaignApi.AddNumbersRequestBuilder addNumbers(AddNumbersRequest addNumbersRequest, String campaignId)
            throws ApiException {
        return new CampaignApi.AddNumbersRequestBuilder(addNumbersRequest, campaignId);
    }

    private RequestDefinition removeNumbersDefinition(RemoveNumbersRequest removeNumbersRequest, String campaignId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/number-registration/1/campaigns/{campaignId}/remove-numbers")
                .body(removeNumbersRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (campaignId != null) {
            builder.addPathParameter(new Parameter("campaignId", campaignId));
        }
        return builder.build();
    }

    /**
     * RemoveNumbers request builder class.
     */
    public class RemoveNumbersRequestBuilder {

        private final RemoveNumbersRequest request;
        private final String campaignId;

        private RemoveNumbersRequestBuilder(RemoveNumbersRequest request, String campaignId) {
            this.request = Objects.requireNonNull(request, "The required parameter 'RemoveNumbersRequest' is missing.");
            this.campaignId = Objects.requireNonNull(campaignId, "The required parameter 'campaignId' is missing.");
        }

        /**
         * Executes the RemoveNumbers request
         *
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition removeNumbersDefinition = removeNumbersDefinition(request, campaignId);
            apiClient.execute(removeNumbersDefinition);
        }

        /**
         * Executes the RemoveNumbers request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link Call} associated with the API request.
         */
        public Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition removeNumbersDefinition = removeNumbersDefinition(request, campaignId);
            return apiClient.executeAsync(removeNumbersDefinition, callback);
        }
    }

    /**
     * remove Numbers.
     * <p>
     * remove Numbers.
     *
     * @param removeNumbersRequest (required)
     * @return RemoveNumbersRequestBuilder
     */
    public CampaignApi.RemoveNumbersRequestBuilder removeNumbersRequest(
            RemoveNumbersRequest removeNumbersRequest, String campaignId) {
        return new CampaignApi.RemoveNumbersRequestBuilder(removeNumbersRequest, campaignId);
    }

    private RequestDefinition deregisterCampaignDefinition(String campaignId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/number-registration/1/campaigns/{campaignId}/deregister")
                .requiresAuthentication(true)
                .contentType("application/json");
        if (campaignId != null) {
            builder.addPathParameter(new Parameter("campaignId", campaignId));
        }
        return builder.build();
    }

    /**
     * DeregisterCampaign request builder class.
     */
    public class DeregisterCampaignRequest {

        private final String campaignId;

        private DeregisterCampaignRequest(String campaignId) {
            this.campaignId = Objects.requireNonNull(campaignId, "The required parameter 'campaignId' is missing.");
        }

        /**
         * Executes the DeregisterCampaign request
         *
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition deregisterCampaignDefinition = deregisterCampaignDefinition(campaignId);
            apiClient.execute(deregisterCampaignDefinition);
        }

        /**
         * Executes the DeregisterCampaign request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link Call} associated with the API request.
         */
        public Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition deregisterCampaignDefinition = deregisterCampaignDefinition(campaignId);
            return apiClient.executeAsync(deregisterCampaignDefinition, callback);
        }
    }

    /**
     * Deregister Campaign.
     * <p>
     * Deregister Campaign.
     *
     * @param campaignId (required)
     * @return DeregisterCampaignRequest
     */
    public CampaignApi.DeregisterCampaignRequest deregisterCampaign(String campaignId) {
        return new CampaignApi.DeregisterCampaignRequest(campaignId);
    }

    private RequestDefinition submitCampaignDefinition(
            String campaignId, RegisterCampaignRequest registerCampaignRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/number-registration/1/campaigns/{campaignId}/register")
                .accept("application/json")
                .body(registerCampaignRequest)
                .requiresAuthentication(true)
                .contentType("application/json");
        if (campaignId != null) {
            builder.addPathParameter(new Parameter("campaignId", campaignId));
        }
        return builder.build();
    }

    /**
     * SubmitCampaign request builder class.
     */
    public class SubmitCampaignRequest {

        private final String campaignId;
        private final RegisterCampaignRequest registerCampaignRequest;

        private SubmitCampaignRequest(String campaignId, RegisterCampaignRequest registerCampaignRequest) {
            this.campaignId = Objects.requireNonNull(campaignId, "The required parameter 'campaignId' is missing.");
            this.registerCampaignRequest = Objects.requireNonNull(
                    registerCampaignRequest, "The required parameter 'RegisterCampaignRequest' is missing.");
        }

        /**
         * Executes the SubmitCampaign request
         *
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition submitCampaignDefinition = submitCampaignDefinition(campaignId, registerCampaignRequest);
            apiClient.execute(submitCampaignDefinition);
        }

        /**
         * Executes the SubmitCampaign request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link Call} associated with the API request.
         */
        public Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition submitCampaignDefinition = submitCampaignDefinition(campaignId, registerCampaignRequest);
            return apiClient.executeAsync(submitCampaignDefinition, callback);
        }
    }

    /**
     * Submit Campaign.
     * <p>
     * Submit Campaign.
     *
     * @param campaignId              (required)
     * @param registerCampaignRequest (required)
     * @return SubmitCampaignRequest
     */
    public CampaignApi.SubmitCampaignRequest submitCampaign(
            String campaignId, RegisterCampaignRequest registerCampaignRequest) {
        return new CampaignApi.SubmitCampaignRequest(campaignId, registerCampaignRequest);
    }

    private RequestDefinition deleteCampaignDefinition(String campaignId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "DELETE", "/number-registration/1/campaigns/{campaignId}")
                .requiresAuthentication(true)
                .contentType("application/json");
        if (campaignId != null) {
            builder.addPathParameter(new Parameter("campaignId", campaignId));
        }
        return builder.build();
    }

    /**
     * DeleteCampaign request builder class.
     */
    public class DeleteCampaignRequest {

        private final String campaignId;

        private DeleteCampaignRequest(String campaignId) {
            this.campaignId = Objects.requireNonNull(campaignId, "The required parameter 'campaignId' is missing.");
        }

        /**
         * Executes the DeleteCampaign request
         *
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition deleteCampaignDefinition = deleteCampaignDefinition(campaignId);
            apiClient.execute(deleteCampaignDefinition);
        }

        /**
         * Executes the DeleteCampaign request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link Call} associated with the API request.
         */
        public Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition deleteCampaignDefinition = deleteCampaignDefinition(campaignId);
            return apiClient.executeAsync(deleteCampaignDefinition, callback);
        }
    }

    /**
     * Delete Campaign.
     * <p>
     * Delete Campaign.
     *
     * @param campaignId (required)
     * @return DeleteCampaignRequest
     */
    public CampaignApi.DeleteCampaignRequest deleteCampaign(String campaignId) {
        return new CampaignApi.DeleteCampaignRequest(campaignId);
    }
}
