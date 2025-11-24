package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

public class CreateCampaignResponse {
    private String id;
    private String referenceId;
    private String applicationId;
    private String entityId;
    private String name;
    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;
    private String stage;
    private String externalCampaignId;
    private String brandId;
    private String programSummary;
    private String customerCareEmail;
    private String confirmationMessage;
    private java.util.List<String> exampleMessages;
    private String helpMessage;
    private String stopMessage;
    private java.util.List<String> messageTypes;
    private String termsAndConditionsUrl;
    private OptIns optIns;
    private BrandPreview brandPreview;
    private String customerCarePhone;
    private boolean lowVolume;
    private Object useCase;
    private java.util.List<String> useCases;
    private java.util.List<String> numberKeys;
    private java.util.List<NumberPreview> numberPreviews;
    private boolean ageGated;
    private boolean directLending;
    private boolean embeddedLink;
    private boolean embeddedPhone;
    private String type;
    private CampaignFeedback campaignFeedback;

    /**
     * Sets id.
     * Field description: Unique campaign identifier.
     * @param id
     * @return This {@link CreateCampaignResponse} instance.
     */
    public CreateCampaignResponse id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * Field description: Unique campaign identifier.
     * @return id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     * Field description: Unique campaign identifier.
     * @param id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets referenceId.
     * Field description: Reference identifier.
     * @param referenceId
     * @return This {@link CreateCampaignResponse} instance.
     */
    public CreateCampaignResponse referenceId(String referenceId) {
        this.referenceId = referenceId;
        return this;
    }

    /**
     * Returns referenceId.
     * Field description: Reference identifier.
     * @return referenceId
     */
    @JsonProperty("referenceId")
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Sets referenceId.
     * Field description: Reference identifier.
     * @param referenceId
     */
    @JsonProperty("referenceId")
    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    // Repeat similar pattern for all other fields...

    /**
     * Sets confirmationMessage.
     * Field description: Confirmation message.
     * @param confirmationMessage
     * @return This {@link CreateCampaignResponse} instance.
     */
    public CreateCampaignResponse confirmationMessage(String confirmationMessage) {
        this.confirmationMessage = confirmationMessage;
        return this;
    }

    /**
     * Returns confirmationMessage.
     * Field description: Confirmation message.
     * @return confirmationMessage
     */
    @JsonProperty("confirmationMessage")
    public String getConfirmationMessage() {
        return confirmationMessage;
    }

    /**
     * Sets confirmationMessage.
     * Field description: Confirmation message.
     * @param confirmationMessage
     */
    @JsonProperty("confirmationMessage")
    public void setConfirmationMessage(String confirmationMessage) {
        this.confirmationMessage = confirmationMessage;
    }
}
