package com.infobip.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.infobip.ApiException;
import com.infobip.model.*;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import static org.assertj.core.api.BDDAssertions.then;

public class CampaignApiTest extends ApiTest{

    @Test
    void shouldGetCampaignNetworkStatusesById() throws ApiException {
        String campaignId = "campaign-123";
        String givenResponse = "[\n" +
                "  {\n" +
                "    \"network\": \"net-1\",\n" +
                "    \"state\": \"ACTIVE\",\n" +
                "    \"messageClass\": \"test\"\n" +
                "  }\n" +
                "]";

        setUpSuccessGetRequest("/number-registration/1/campaigns/campaign-123/network-statuses", Map.of(), givenResponse);

        Consumer<List<GetCampaignNetworkStatusResponse>> assertions = (responses) -> {
            then(responses).hasSize(1);
            var response = responses.get(0);
            then(response.getNetwork()).isEqualTo("net-1");
            then(response.getState()).isEqualTo("ACTIVE");
        };

        CampaignApi api = new CampaignApi(getApiClient());
        var call = api.getCampaignNetworkStatuses(campaignId);
        testSuccessfulCall(call::execute, assertions);
    }

    @Test
    void shouldDeleteCampaignById() {
        String campaignId = "campaign-123";
        setUpNoResponseBodyDeleteRequest("/number-registration/1/campaigns/campaign-123", Map.of(), 200);

        CampaignApi api = new CampaignApi(getApiClient());
        var call = api.deleteCampaign(campaignId);

        // No response body to assert, just ensure no exception is thrown
        testSuccessfulCallWithNoBody(call::executeAsync, 200);
    }

//    @Test
//    void shouldSubmitCampaign() throws Exception {
//        String campaignId = "campaign-123";
//        String givenRequest = "{\n" +
//                "  \"field1\": \"value1\",\n" +
//                "  \"field2\": \"value2\"\n" +
//                "}";
//
//        setUpEmptyPostRequest("/number-registration/1/campaigns/campaign-123/register", Map.of(), "", 200);
//
//        RegisterCampaignRequest registerRequest = new ObjectMapper().readValue(givenRequest, RegisterCampaignRequest.class);
//
//        CampaignApi api = new CampaignApi(getApiClient());
//        var call = api.submitCampaign(campaignId, registerRequest);
//
//        // No response body to assert, just ensure no exception is thrown
//        testSuccessfulCallWithNoBody(call::execute, 200);
 //   }

    @Test
    void shouldGetCampaignById() throws ApiException {
        String campaignId = "campaign-123";
        String givenResponse = "{\n" +
                "  \"id\": \"campaign-123\",\n" +
                "  \"name\": \"Test Campaign\",\n" +
                "  \"referenceId\": \"test\"\n" +
                "}";

        setUpSuccessGetRequest("/number-registration/1/campaigns/campaign-123", Map.of(), givenResponse);

        Consumer<GetCampaignResponse> assertions = (response) -> {
            then(response.getId()).isEqualTo("campaign-123");
            then(response.getName()).isEqualTo("Test Campaign");
            then(response.getReferenceId()).isEqualTo("test");
        };

        CampaignApi api = new CampaignApi(getApiClient());
        var call = api.getCampaign(campaignId);
        testSuccessfulCall(call::execute, assertions);
    }

        @Test
        void shouldCreateCampaign() throws Exception {

            String givenRequest = "{\n" +
                    "  \"referenceId\": \"Example Campaign\",\n" +
                    "  \"type\": \"PROMOTIONAL\",\n" +
                    "  \"applicationId\": \"app-123\",\n" +
                    "  \"entityId\": \"entity-456\",\n" +
                    "  \"name\": \"Spring Sale\",\n" +
                    "  \"numberKeys\": [\"key1\", \"key2\"],\n" +
                    "  \"brandId\": \"brand-789\",\n" +
                    "  \"confirmationMessage\": \"Thank you for joining!\",\n" +
                    "  \"customerCarePhone\": \"+1234567890\",\n" +
                    "  \"customerCareEmail\": \"support@example.com\",\n" +
                    "  \"exampleMessages\": [\"Welcome!\", \"Enjoy our offers.\"],\n" +
                    "  \"helpMessage\": \"Reply HELP for info.\",\n" +
                    "  \"lowVolume\": true,\n" +
                    "  \"messageTypes\": [\"SMS\", \"MMS\"],\n" +
                    "  \"programSummary\": \"Seasonal promotion.\",\n" +
                    "  \"stopMessage\": \"Reply STOP to unsubscribe.\",\n" +
                    "  \"termsAndConditionsUrl\": \"https://example.com/terms\",\n" +
                    "  \"useCases\": [\"marketing\", \"alerts\"],\n" +
                    "  \"ageGated\": false,\n" +
                    "  \"directLending\": false,\n" +
                    "  \"embeddedLink\": true,\n" +
                    "  \"embeddedPhone\": false,\n" +
                    "  \"externalCampaignId\": \"ext-001\"\n" +
                    "}";
            String givenResponse = "{\n" +
                    "  \"id\": \"campaign-001\",\n" +
                    "  \"referenceId\": \"ref-123\",\n" +
                    "  \"applicationId\": \"app-456\",\n" +
                    "  \"entityId\": \"entity-789\",\n" +
                    "  \"name\": \"Test Campaign\",\n" +
                    "  \"createdDate\": \"2023-01-01T12:00:00Z\",\n" +
                    "  \"lastModifiedDate\": \"2023-01-02T12:00:00Z\",\n" +
                    "  \"stage\": \"ACTIVE\",\n" +
                    "  \"externalCampaignId\": \"ext-001\",\n" +
                    "  \"brandId\": \"brand-123\",\n" +
                    "  \"programSummary\": \"Summary\",\n" +
                    "  \"customerCareEmail\": \"support@example.com\",\n" +
                    "  \"confirmationMessage\": \"Confirmed!\",\n" +
                    "  \"exampleMessages\": [\"Example 1\", \"Example 2\"],\n" +
                    "  \"helpMessage\": \"Help info\",\n" +
                    "  \"stopMessage\": \"Stop info\",\n" +
                    "  \"messageTypes\": [\"SMS\", \"MMS\"],\n" +
                    "  \"termsAndConditionsUrl\": \"http://example.com/terms\",\n" +
                    "  \"optIns\": null,\n" +
                    "  \"brandPreview\": null,\n" +
                    "  \"customerCarePhone\": \"+1234567890\",\n" +
                    "  \"lowVolume\": false,\n" +
                    "  \"useCase\": null,\n" +
                    "  \"useCases\": [\"MARKETING\"],\n" +
                    "  \"numberKeys\": [\"key1\", \"key2\"],\n" +
                    "  \"numberPreviews\": null,\n" +
                    "  \"ageGated\": false,\n" +
                    "  \"directLending\": false,\n" +
                    "  \"embeddedLink\": false,\n" +
                    "  \"embeddedPhone\": false,\n" +
                    "  \"type\": \"STANDARD\",\n" +
                    "  \"campaignFeedback\": null\n" +
                    "}";

            setUpPostRequest("/number-registration/1/campaigns", givenRequest, givenResponse, 200);

            Consumer<CreateCampaignResponse> assertions = (campaignResponse) -> {
                then(campaignResponse.getId()).isEqualTo("campaign-001");
                then(campaignResponse.getReferenceId()).isEqualTo("ref-123");
                then(campaignResponse.getApplicationId()).isEqualTo("app-456");
                then(campaignResponse.getEntityId()).isEqualTo("entity-789");
                then(campaignResponse.getName()).isEqualTo("Test Campaign");
                then(campaignResponse.getStage()).isEqualTo("ACTIVE");
                then(campaignResponse.getExternalCampaignId()).isEqualTo("ext-001");
                then(campaignResponse.getBrandId()).isEqualTo("brand-123");
                then(campaignResponse.getProgramSummary()).isEqualTo("Summary");
                then(campaignResponse.getCustomerCareEmail()).isEqualTo("support@example.com");
                then(campaignResponse.getConfirmationMessage()).isEqualTo("Confirmed!");
                then(campaignResponse.getExampleMessages()).containsExactly("Example 1", "Example 2");
                then(campaignResponse.getHelpMessage()).isEqualTo("Help info");
                then(campaignResponse.getStopMessage()).isEqualTo("Stop info");
                then(campaignResponse.getMessageTypes()).containsExactly("SMS", "MMS");
                then(campaignResponse.getTermsAndConditionsUrl()).isEqualTo("http://example.com/terms");
                then(campaignResponse.getOptIns()).isNull();
                then(campaignResponse.getBrandPreview()).isNull();
                then(campaignResponse.getCustomerCarePhone()).isEqualTo("+1234567890");
                then(campaignResponse.getUseCase()).isNull();
                then(campaignResponse.getUseCases()).containsExactly("MARKETING");
                then(campaignResponse.getNumberKeys()).containsExactly("key1", "key2");
                then(campaignResponse.getNumberPreviews()).isNull();
                then(campaignResponse.getType()).isEqualTo("STANDARD");
                then(campaignResponse.getCampaignFeedback()).isNull();
            };

            ObjectMapper objectMapper = new ObjectMapper();
            CreateCampaignRequest campaignRequest = objectMapper.readValue(givenRequest, CreateCampaignRequest.class);

            CampaignApi api = new CampaignApi(getApiClient());
            var call = api.createCampaign(campaignRequest);

            testSuccessfulCall(call::execute, assertions);
        }

    @Test
    void shouldAddNumbersToCampaign() throws Exception {
String campaignId = "campaign-123";
        String givenRequest = "{\n" +
                "  \"numbers\": [\"campaign-123\"],\n" +
                "  \"numberKeys\": [\"+1234567890\", \"+1987654321\"]\n" +
                "}";

        // No response body expected for addNumbers
        setUpPostRequest("/number-registration/1/campaigns/campaign-123/add-numbers", givenRequest, "", 200);

        ObjectMapper objectMapper = new ObjectMapper();
        AddNumbersRequest addNumbersRequest = objectMapper.readValue(givenRequest, AddNumbersRequest.class);

        CampaignApi api = new CampaignApi(getApiClient());
        var call = api.addNumbers(addNumbersRequest, campaignId);

        // No response body to assert, just ensure no exception is thrown
        testSuccessfulCallWithNoBody(call::executeAsync, 200);
    }
}
