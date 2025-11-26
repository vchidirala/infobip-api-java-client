package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

public class GetCampaignResponse {
    private String id;
    private String referenceId;
    private String applicationId;
    private String entityId;
    private String name;
    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;
    private String stage;
    private String brandId;
    private String programSummary;
    private String confirmationMessage;
    private List<String> exampleMessages;
    private String helpMessage;
    private String stopMessage;
    private List<String> messageTypes;
    private String termsAndConditionsUrl;
    private OptIns optIns;
    private BrandPreview brandPreview;
    private CampaignFeedback campaignFeedback;
    private boolean ageGated;
    private String customerCarePhone;
    private boolean lowVolume;
    private Object useCase;
    private List<String> useCases;
    private boolean directLending;
    private boolean embeddedLink;
    private boolean embeddedPhone;
    private String customerCareEmail;
    private List<String> numberKeys;
    private List<NumberPreview> numberPreviews;
    private String type;

    /**
     * Sets id.
     * <p>
     * Field description:
     * The unique identifier of the campaign.
     *
     * @param id
     * @return This {@link GetCampaignResponse} instance.
     */
    public GetCampaignResponse id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * The unique identifier of the campaign.
     *
     * @return id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * The unique identifier of the campaign.
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Returns referenceId.
     * <p>
     * Field description:
     * The reference identifier of the campaign.
     *
     * @return referenceId
     */
    @JsonProperty("referenceId")
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Sets referenceId.
     * <p>
     * Field description:
     * The reference identifier of the campaign.
     *
     * @param referenceId
     */
    @JsonProperty("referenceId")
    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * Returns applicationId.
     * <p>
     * Field description:
     * The application identifier associated with the campaign.
     *
     * @return applicationId
     */
    @JsonProperty("applicationId")
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * The application identifier associated with the campaign.
     *
     * @param applicationId
     */
    @JsonProperty("applicationId")
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Returns entityId.
     * <p>
     * Field description:
     * The entity identifier of the campaign.
     *
     * @return entityId
     */
    @JsonProperty("entityId")
    public String getEntityId() {
        return entityId;
    }

    /**
     * Sets entityId.
     * <p>
     * Field description:
     * The entity identifier of the campaign.
     *
     * @param entityId
     */
    @JsonProperty("entityId")
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * The name of the campaign.
     *
     * @return name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * The name of the campaign.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns createdDate.
     * <p>
     * Field description:
     * The creation date of the campaign.
     *
     * @return createdDate
     */
    @JsonProperty("createdDate")
    public OffsetDateTime getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets createdDate.
     * <p>
     * Field description:
     * The creation date of the campaign.
     *
     * @param createdDate
     */
    @JsonProperty("createdDate")
    public void setCreatedDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Returns lastModifiedDate.
     * <p>
     * Field description:
     * The last modification date of the campaign.
     *
     * @return lastModifiedDate
     */
    @JsonProperty("lastModifiedDate")
    public OffsetDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets lastModifiedDate.
     * <p>
     * Field description:
     * The last modification date of the campaign.
     *
     * @param lastModifiedDate
     */
    @JsonProperty("lastModifiedDate")
    public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * Returns stage.
     * <p>
     * Field description:
     * The stage of the campaign.
     *
     * @return stage
     */
    @JsonProperty("stage")
    public String getStage() {
        return stage;
    }

    /**
     * Sets stage.
     * <p>
     * Field description:
     * The stage of the campaign.
     *
     * @param stage
     */
    @JsonProperty("stage")
    public void setStage(String stage) {
        this.stage = stage;
    }

    /**
     * Returns brandId.
     * <p>
     * Field description:
     * The brand identifier.
     *
     * @return brandId
     */
    @JsonProperty("brandId")
    public String getBrandId() {
        return brandId;
    }

    /**
     * Sets brandId.
     * <p>
     * Field description:
     * The brand identifier.
     *
     * @param brandId
     */
    @JsonProperty("brandId")
    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    /**
     * Returns programSummary.
     * <p>
     * Field description:
     * The program summary.
     *
     * @return programSummary
     */
    @JsonProperty("programSummary")
    public String getProgramSummary() {
        return programSummary;
    }

    /**
     * Sets programSummary.
     * <p>
     * Field description:
     * The program summary.
     *
     * @param programSummary
     */
    @JsonProperty("programSummary")
    public void setProgramSummary(String programSummary) {
        this.programSummary = programSummary;
    }

    /**
     * Returns confirmationMessage.
     * <p>
     * Field description:
     * The confirmation message.
     *
     * @return confirmationMessage
     */
    @JsonProperty("confirmationMessage")
    public String getConfirmationMessage() {
        return confirmationMessage;
    }

    /**
     * Sets confirmationMessage.
     * <p>
     * Field description:
     * The confirmation message.
     *
     * @param confirmationMessage
     */
    @JsonProperty("confirmationMessage")
    public void setConfirmationMessage(String confirmationMessage) {
        this.confirmationMessage = confirmationMessage;
    }

    /**
     * Returns exampleMessages.
     * <p>
     * Field description:
     * Example messages for the campaign.
     *
     * @return exampleMessages
     */
    @JsonProperty("exampleMessages")
    public List<String> getExampleMessages() {
        return exampleMessages;
    }

    /**
     * Sets exampleMessages.
     * <p>
     * Field description:
     * Example messages for the campaign.
     *
     * @param exampleMessages
     */
    @JsonProperty("exampleMessages")
    public void setExampleMessages(List<String> exampleMessages) {
        this.exampleMessages = exampleMessages;
    }

    /**
     * Returns helpMessage.
     * <p>
     * Field description:
     * The help message.
     *
     * @return helpMessage
     */
    @JsonProperty("helpMessage")
    public String getHelpMessage() {
        return helpMessage;
    }

    /**
     * Sets helpMessage.
     * <p>
     * Field description:
     * The help message.
     *
     * @param helpMessage
     */
    @JsonProperty("helpMessage")
    public void setHelpMessage(String helpMessage) {
        this.helpMessage = helpMessage;
    }

    /**
     * Returns stopMessage.
     * <p>
     * Field description:
     * The stop message.
     *
     * @return stopMessage
     */
    @JsonProperty("stopMessage")
    public String getStopMessage() {
        return stopMessage;
    }

    /**
     * Sets stopMessage.
     * <p>
     * Field description:
     * The stop message.
     *
     * @param stopMessage
     */
    @JsonProperty("stopMessage")
    public void setStopMessage(String stopMessage) {
        this.stopMessage = stopMessage;
    }

    /**
     * Returns messageTypes.
     * <p>
     * Field description:
     * The message types.
     *
     * @return messageTypes
     */
    @JsonProperty("messageTypes")
    public List<String> getMessageTypes() {
        return messageTypes;
    }

    /**
     * Sets messageTypes.
     * <p>
     * Field description:
     * The message types.
     *
     * @param messageTypes
     */
    @JsonProperty("messageTypes")
    public void setMessageTypes(List<String> messageTypes) {
        this.messageTypes = messageTypes;
    }

    /**
     * Returns termsAndConditionsUrl.
     * <p>
     * Field description:
     * The terms and conditions URL.
     *
     * @return termsAndConditionsUrl
     */
    @JsonProperty("termsAndConditionsUrl")
    public String getTermsAndConditionsUrl() {
        return termsAndConditionsUrl;
    }

    /**
     * Sets termsAndConditionsUrl.
     * <p>
     * Field description:
     * The terms and conditions URL.
     *
     * @param termsAndConditionsUrl
     */
    @JsonProperty("termsAndConditionsUrl")
    public void setTermsAndConditionsUrl(String termsAndConditionsUrl) {
        this.termsAndConditionsUrl = termsAndConditionsUrl;
    }

    /**
     * Returns optIns.
     * <p>
     * Field description:
     * The opt-ins for the campaign.
     *
     * @return optIns
     */
    @JsonProperty("optIns")
    public OptIns getOptIns() {
        return optIns;
    }

    /**
     * Sets optIns.
     * <p>
     * Field description:
     * The opt-ins for the campaign.
     *
     * @param optIns
     */
    @JsonProperty("optIns")
    public void setOptIns(OptIns optIns) {
        this.optIns = optIns;
    }

    /**
     * Returns brandPreview.
     * <p>
     * Field description:
     * The brand preview.
     *
     * @return brandPreview
     */
    @JsonProperty("brandPreview")
    public BrandPreview getBrandPreview() {
        return brandPreview;
    }

    /**
     * Sets brandPreview.
     * <p>
     * Field description:
     * The brand preview.
     *
     * @param brandPreview
     */
    @JsonProperty("brandPreview")
    public void setBrandPreview(BrandPreview brandPreview) {
        this.brandPreview = brandPreview;
    }

    /**
     * Returns campaignFeedback.
     * <p>
     * Field description:
     * The campaign feedback.
     *
     * @return campaignFeedback
     */
    @JsonProperty("campaignFeedback")
    public CampaignFeedback getCampaignFeedback() {
        return campaignFeedback;
    }

    /**
     * Sets campaignFeedback.
     * <p>
     * Field description:
     * The campaign feedback.
     *
     * @param campaignFeedback
     */
    @JsonProperty("campaignFeedback")
    public void setCampaignFeedback(CampaignFeedback campaignFeedback) {
        this.campaignFeedback = campaignFeedback;
    }

    /**
     * Returns ageGated.
     * <p>
     * Field description:
     * Whether the campaign is age gated.
     *
     * @return ageGated
     */
    @JsonProperty("ageGated")
    public boolean isAgeGated() {
        return ageGated;
    }

    /**
     * Sets ageGated.
     * <p>
     * Field description:
     * Whether the campaign is age gated.
     *
     * @param ageGated
     */
    @JsonProperty("ageGated")
    public void setAgeGated(boolean ageGated) {
        this.ageGated = ageGated;
    }

    /**
     * Returns customerCarePhone.
     * <p>
     * Field description:
     * The customer care phone number.
     *
     * @return customerCarePhone
     */
    @JsonProperty("customerCarePhone")
    public String getCustomerCarePhone() {
        return customerCarePhone;
    }

    /**
     * Sets customerCarePhone.
     * <p>
     * Field description:
     * The customer care phone number.
     *
     * @param customerCarePhone
     */
    @JsonProperty("customerCarePhone")
    public void setCustomerCarePhone(String customerCarePhone) {
        this.customerCarePhone = customerCarePhone;
    }

    /**
     * Returns lowVolume.
     * <p>
     * Field description:
     * Whether the campaign is low volume.
     *
     * @return lowVolume
     */
    @JsonProperty("lowVolume")
    public boolean isLowVolume() {
        return lowVolume;
    }

    /**
     * Sets lowVolume.
     * <p>
     * Field description:
     * Whether the campaign is low volume.
     *
     * @param lowVolume
     */
    @JsonProperty("lowVolume")
    public void setLowVolume(boolean lowVolume) {
        this.lowVolume = lowVolume;
    }

    /**
     * Returns useCase.
     * <p>
     * Field description:
     * The use case object.
     *
     * @return useCase
     */
    @JsonProperty("useCase")
    public Object getUseCase() {
        return useCase;
    }

    /**
     * Sets useCase.
     * <p>
     * Field description:
     * The use case object.
     *
     * @param useCase
     */
    @JsonProperty("useCase")
    public void setUseCase(Object useCase) {
        this.useCase = useCase;
    }

    /**
     * Returns useCases.
     * <p>
     * Field description:
     * The list of use cases.
     *
     * @return useCases
     */
    @JsonProperty("useCases")
    public List<String> getUseCases() {
        return useCases;
    }

    /**
     * Sets useCases.
     * <p>
     * Field description:
     * The list of use cases.
     *
     * @param useCases
     */
    @JsonProperty("useCases")
    public void setUseCases(List<String> useCases) {
        this.useCases = useCases;
    }

    /**
     * Returns directLending.
     * <p>
     * Field description:
     * Whether direct lending is enabled.
     *
     * @return directLending
     */
    @JsonProperty("directLending")
    public boolean isDirectLending() {
        return directLending;
    }

    /**
     * Sets directLending.
     * <p>
     * Field description:
     * Whether direct lending is enabled.
     *
     * @param directLending
     */
    @JsonProperty("directLending")
    public void setDirectLending(boolean directLending) {
        this.directLending = directLending;
    }

    /**
     * Returns embeddedLink.
     * <p>
     * Field description:
     * Whether embedded link is enabled.
     *
     * @return embeddedLink
     */
    @JsonProperty("embeddedLink")
    public boolean isEmbeddedLink() {
        return embeddedLink;
    }

    /**
     * Sets embeddedLink.
     * <p>
     * Field description:
     * Whether embedded link is enabled.
     *
     * @param embeddedLink
     */
    @JsonProperty("embeddedLink")
    public void setEmbeddedLink(boolean embeddedLink) {
        this.embeddedLink = embeddedLink;
    }

    /**
     * Returns embeddedPhone.
     * <p>
     * Field description:
     * Whether embedded phone is enabled.
     *
     * @return embeddedPhone
     */
    @JsonProperty("embeddedPhone")
    public boolean isEmbeddedPhone() {
        return embeddedPhone;
    }

    /**
     * Sets embeddedPhone.
     * <p>
     * Field description:
     * Whether embedded phone is enabled.
     *
     * @param embeddedPhone
     */
    @JsonProperty("embeddedPhone")
    public void setEmbeddedPhone(boolean embeddedPhone) {
        this.embeddedPhone = embeddedPhone;
    }

    /**
     * Returns customerCareEmail.
     * <p>
     * Field description:
     * The customer care email.
     *
     * @return customerCareEmail
     */
    @JsonProperty("customerCareEmail")
    public String getCustomerCareEmail() {
        return customerCareEmail;
    }

    /**
     * Sets customerCareEmail.
     * <p>
     * Field description:
     * The customer care email.
     *
     * @param customerCareEmail
     */
    @JsonProperty("customerCareEmail")
    public void setCustomerCareEmail(String customerCareEmail) {
        this.customerCareEmail = customerCareEmail;
    }

    /**
     * Returns numberKeys.
     * <p>
     * Field description:
     * The number keys.
     *
     * @return numberKeys
     */
    @JsonProperty("numberKeys")
    public List<String> getNumberKeys() {
        return numberKeys;
    }

    /**
     * Sets numberKeys.
     * <p>
     * Field description:
     * The number keys.
     *
     * @param numberKeys
     */
    @JsonProperty("numberKeys")
    public void setNumberKeys(List<String> numberKeys) {
        this.numberKeys = numberKeys;
    }

    /**
     * Returns numberPreviews.
     * <p>
     * Field description:
     * The number previews.
     *
     * @return numberPreviews
     */
    @JsonProperty("numberPreviews")
    public List<NumberPreview> getNumberPreviews() {
        return numberPreviews;
    }

    /**
     * Sets numberPreviews.
     * <p>
     * Field description:
     * The number previews.
     *
     * @param numberPreviews
     */
    @JsonProperty("numberPreviews")
    public void setNumberPreviews(List<NumberPreview> numberPreviews) {
        this.numberPreviews = numberPreviews;
    }

    /**
     * Returns type.
     * <p>
     * Field description:
     * The type of the campaign.
     *
     * @return type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     * <p>
     * Field description:
     * The type of the campaign.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }
}
