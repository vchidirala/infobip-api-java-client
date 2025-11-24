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

    /**
     * Sets applicationId.
     * Field description: Application identifier.
     * @param applicationId
     * @return This {@link CreateCampaignResponse} instance.
     */
    public CreateCampaignResponse applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns applicationId.
     * Field description: Application identifier.
     * @return applicationId
     */
    @JsonProperty("applicationId")
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets applicationId.
     * Field description: Application identifier.
     * @param applicationId
     */
    @JsonProperty("applicationId")
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Sets entityId.
     * Field description: Entity identifier.
     * @param entityId
     * @return This {@link CreateCampaignResponse} instance.
     */
    public CreateCampaignResponse entityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Returns entityId.
     * Field description: Entity identifier.
     * @return entityId
     */
    @JsonProperty("entityId")
    public String getEntityId() {
        return entityId;
    }

    /**
     * Sets entityId.
     * Field description: Entity identifier.
     * @param entityId
     */
    @JsonProperty("entityId")
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * Sets name.
     * Field description: Campaign name.
     * @param name
     * @return This {@link CreateCampaignResponse} instance.
     */
    public CreateCampaignResponse name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * Field description: Campaign name.
     * @return name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     * Field description: Campaign name.
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets createdDate.
     * Field description: Creation date.
     * @param createdDate
     * @return This {@link CreateCampaignResponse} instance.
     */
    public CreateCampaignResponse createdDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * Returns createdDate.
     * Field description: Creation date.
     * @return createdDate
     */
    @JsonProperty("createdDate")
    public OffsetDateTime getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets createdDate.
     * Field description: Creation date.
     * @param createdDate
     */
    @JsonProperty("createdDate")
    public void setCreatedDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Sets lastModifiedDate.
     * Field description: Last modification date.
     * @param lastModifiedDate
     * @return This {@link CreateCampaignResponse} instance.
     */
    public CreateCampaignResponse lastModifiedDate(OffsetDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * Returns lastModifiedDate.
     * Field description: Last modification date.
     * @return lastModifiedDate
     */
    @JsonProperty("lastModifiedDate")
    public OffsetDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets lastModifiedDate.
     * Field description: Last modification date.
     * @param lastModifiedDate
     */
    @JsonProperty("lastModifiedDate")
    public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * Sets stage.
     * Field description: Campaign stage.
     * @param stage
     * @return This {@link CreateCampaignResponse} instance.
     */
    public CreateCampaignResponse stage(String stage) {
        this.stage = stage;
        return this;
    }

    /**
     * Returns stage.
     * Field description: Campaign stage.
     * @return stage
     */
    @JsonProperty("stage")
    public String getStage() {
        return stage;
    }

    /**
     * Sets stage.
     * Field description: Campaign stage.
     * @param stage
     */
    @JsonProperty("stage")
    public void setStage(String stage) {
        this.stage = stage;
    }

    /**
     * Sets externalCampaignId.
     * Field description: External campaign identifier.
     * @param externalCampaignId
     * @return This {@link CreateCampaignResponse} instance.
     */
    public CreateCampaignResponse externalCampaignId(String externalCampaignId) {
        this.externalCampaignId = externalCampaignId;
        return this;
    }

    /**
     * Returns externalCampaignId.
     * Field description: External campaign identifier.
     * @return externalCampaignId
     */
    @JsonProperty("externalCampaignId")
    public String getExternalCampaignId() {
        return externalCampaignId;
    }

    /**
     * Sets externalCampaignId.
     * Field description: External campaign identifier.
     * @param externalCampaignId
     */
    @JsonProperty("externalCampaignId")
    public void setExternalCampaignId(String externalCampaignId) {
        this.externalCampaignId = externalCampaignId;
    }

    /**
     * Sets brandId.
     * Field description: Brand identifier.
     * @param brandId
     * @return This {@link CreateCampaignResponse} instance.
     */
    public CreateCampaignResponse brandId(String brandId) {
        this.brandId = brandId;
        return this;
    }

    /**
     * Returns brandId.
     * Field description: Brand identifier.
     * @return brandId
     */
    @JsonProperty("brandId")
    public String getBrandId() {
        return brandId;
    }

    /**
     * Sets brandId.
     * Field description: Brand identifier.
     * @param brandId
     */
    @JsonProperty("brandId")
    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    /**
     * Sets programSummary.
     * Field description: Program summary.
     * @param programSummary
     * @return This {@link CreateCampaignResponse} instance.
     */
    public CreateCampaignResponse programSummary(String programSummary) {
        this.programSummary = programSummary;
        return this;
    }

    /**
     * Returns programSummary.
     * Field description: Program summary.
     * @return programSummary
     */
    @JsonProperty("programSummary")
    public String getProgramSummary() {
        return programSummary;
    }

    /**
     * Sets programSummary.
     * Field description: Program summary.
     * @param programSummary
     */
    @JsonProperty("programSummary")
    public void setProgramSummary(String programSummary) {
        this.programSummary = programSummary;
    }

    /**
     * Sets customerCareEmail.
     * Field description: Customer care email.
     * @param customerCareEmail
     * @return This {@link CreateCampaignResponse} instance.
     */
    public CreateCampaignResponse customerCareEmail(String customerCareEmail) {
        this.customerCareEmail = customerCareEmail;
        return this;
    }

    /**
     * Returns customerCareEmail.
     * Field description: Customer care email.
     * @return customerCareEmail
     */
    @JsonProperty("customerCareEmail")
    public String getCustomerCareEmail() {
        return customerCareEmail;
    }

    /**
     * Sets customerCareEmail.
     * Field description: Customer care email.
     * @param customerCareEmail
     */
    @JsonProperty("customerCareEmail")
    public void setCustomerCareEmail(String customerCareEmail) {
        this.customerCareEmail = customerCareEmail;
    }

    /**
     * Sets exampleMessages.
     * Field description: Example messages.
     * @param exampleMessages
     * @return This {@link CreateCampaignResponse} instance.
     */
    public CreateCampaignResponse exampleMessages(java.util.List<String> exampleMessages) {
        this.exampleMessages = exampleMessages;
        return this;
    }

    /**
     * Returns exampleMessages.
     * Field description: Example messages.
     * @return exampleMessages
     */
    @JsonProperty("exampleMessages")
    public java.util.List<String> getExampleMessages() {
        return exampleMessages;
    }

    /**
     * Sets exampleMessages.
     * Field description: Example messages.
     * @param exampleMessages
     */
    @JsonProperty("exampleMessages")
    public void setExampleMessages(java.util.List<String> exampleMessages) {
        this.exampleMessages = exampleMessages;
    }

    /**
     * Sets helpMessage.
     * Field description: Help message.
     * @param helpMessage
     * @return This {@link CreateCampaignResponse} instance.
     */
    public CreateCampaignResponse helpMessage(String helpMessage) {
        this.helpMessage = helpMessage;
        return this;
    }

    /**
     * Returns helpMessage.
     * Field description: Help message.
     * @return helpMessage
     */
    @JsonProperty("helpMessage")
    public String getHelpMessage() {
        return helpMessage;
    }

    /**
     * Sets helpMessage.
     * Field description: Help message.
     * @param helpMessage
     */
    @JsonProperty("helpMessage")
    public void setHelpMessage(String helpMessage) {
        this.helpMessage = helpMessage;
    }

    /**
     * Sets stopMessage.
     * Field description: Stop message.
     * @param stopMessage
     * @return This {@link CreateCampaignResponse} instance.
     */
    public CreateCampaignResponse stopMessage(String stopMessage) {
        this.stopMessage = stopMessage;
        return this;
    }

    /**
     * Returns stopMessage.
     * Field description: Stop message.
     * @return stopMessage
     */
    @JsonProperty("stopMessage")
    public String getStopMessage() {
        return stopMessage;
    }

    /**
     * Sets stopMessage.
     * Field description: Stop message.
     * @param stopMessage
     */
    @JsonProperty("stopMessage")
    public void setStopMessage(String stopMessage) {
        this.stopMessage = stopMessage;
    }

    /**
     * Sets messageTypes.
     * Field description: Message types.
     * @param messageTypes
     * @return This {@link CreateCampaignResponse} instance.
     */
    public CreateCampaignResponse messageTypes(java.util.List<String> messageTypes) {
        this.messageTypes = messageTypes;
        return this;
    }

    /**
     * Returns messageTypes.
     * Field description: Message types.
     * @return messageTypes
     */
    @JsonProperty("messageTypes")
    public java.util.List<String> getMessageTypes() {
        return messageTypes;
    }

    /**
     * Sets messageTypes.
     * Field description: Message types.
     * @param messageTypes
     */
    @JsonProperty("messageTypes")
    public void setMessageTypes(java.util.List<String> messageTypes) {
        this.messageTypes = messageTypes;
    }

    /**
     * Sets termsAndConditionsUrl.
     * Field description: Terms and conditions URL.
     * @param termsAndConditionsUrl
     * @return This {@link CreateCampaignResponse} instance.
     */
    public CreateCampaignResponse termsAndConditionsUrl(String termsAndConditionsUrl) {
        this.termsAndConditionsUrl = termsAndConditionsUrl;
        return this;
    }

    /**
     * Returns termsAndConditionsUrl.
     * Field description: Terms and conditions URL.
     * @return termsAndConditionsUrl
     */
    @JsonProperty("termsAndConditionsUrl")
    public String getTermsAndConditionsUrl() {
        return termsAndConditionsUrl;
    }

    /**
     * Sets termsAndConditionsUrl.
     * Field description: Terms and conditions URL.
     * @param termsAndConditionsUrl
     */
    @JsonProperty("termsAndConditionsUrl")
    public void setTermsAndConditionsUrl(String termsAndConditionsUrl) {
        this.termsAndConditionsUrl = termsAndConditionsUrl;
    }

    /**
     * Sets optIns.
     * Field description: Opt-in details.
     * @param optIns
     * @return This {@link CreateCampaignResponse} instance.
     */
    public CreateCampaignResponse optIns(OptIns optIns) {
        this.optIns = optIns;
        return this;
    }

    /**
     * Returns optIns.
     * Field description: Opt-in details.
     * @return optIns
     */
    @JsonProperty("optIns")
    public OptIns getOptIns() {
        return optIns;
    }

    /**
     * Sets optIns.
     * Field description: Opt-in details.
     * @param optIns
     */
    @JsonProperty("optIns")
    public void setOptIns(OptIns optIns) {
        this.optIns = optIns;
    }

    /**
     * Sets brandPreview.
     * Field description: Brand preview.
     * @param brandPreview
     * @return This {@link CreateCampaignResponse} instance.
     */
    public CreateCampaignResponse brandPreview(BrandPreview brandPreview) {
        this.brandPreview = brandPreview;
        return this;
    }

    /**
     * Returns brandPreview.
     * Field description: Brand preview.
     * @return brandPreview
     */
    @JsonProperty("brandPreview")
    public BrandPreview getBrandPreview() {
        return brandPreview;
    }

    /**
     * Sets brandPreview.
     * Field description: Brand preview.
     * @param brandPreview
     */
    @JsonProperty("brandPreview")
    public void setBrandPreview(BrandPreview brandPreview) {
        this.brandPreview = brandPreview;
    }

    /**
     * Sets customerCarePhone.
     * Field description: Customer care phone.
     * @param customerCarePhone
     * @return This {@link CreateCampaignResponse} instance.
     */
    public CreateCampaignResponse customerCarePhone(String customerCarePhone) {
        this.customerCarePhone = customerCarePhone;
        return this;
    }

    /**
     * Returns customerCarePhone.
     * Field description: Customer care phone.
     * @return customerCarePhone
     */
    @JsonProperty("customerCarePhone")
    public String getCustomerCarePhone() {
        return customerCarePhone;
    }

    /**
     * Sets customerCarePhone.
     * Field description: Customer care phone.
     * @param customerCarePhone
     */
    @JsonProperty("customerCarePhone")
    public void setCustomerCarePhone(String customerCarePhone) {
        this.customerCarePhone = customerCarePhone;
    }

    /**
     * Sets lowVolume.
     * Field description: Low volume flag.
     * @param lowVolume
     * @return This {@link CreateCampaignResponse} instance.
     */
    public CreateCampaignResponse lowVolume(boolean lowVolume) {
        this.lowVolume = lowVolume;
        return this;
    }

    /**
     * Returns lowVolume.
     * Field description: Low volume flag.
     * @return lowVolume
     */
    @JsonProperty("lowVolume")
    public boolean isLowVolume() {
        return lowVolume;
    }

    /**
     * Sets lowVolume.
     * Field description: Low volume flag.
     * @param lowVolume
     */
    @JsonProperty("lowVolume")
    public void setLowVolume(boolean lowVolume) {
        this.lowVolume = lowVolume;
    }

    /**
     * Sets useCase.
     * Field description: Use case.
     * @param useCase
     * @return This {@link CreateCampaignResponse} instance.
     */
    public CreateCampaignResponse useCase(Object useCase) {
        this.useCase = useCase;
        return this;
    }

    /**
     * Returns useCase.
     * Field description: Use case.
     * @return useCase
     */
    @JsonProperty("useCase")
    public Object getUseCase() {
        return useCase;
    }

    /**
     * Sets useCase.
     * Field description: Use case.
     * @param useCase
     */
    @JsonProperty("useCase")
    public void setUseCase(Object useCase) {
        this.useCase = useCase;
    }

    /**
     * Sets useCases.
     * Field description: Use cases.
     * @param useCases
     * @return This {@link CreateCampaignResponse} instance.
     */
    public CreateCampaignResponse useCases(java.util.List<String> useCases) {
        this.useCases = useCases;
        return this;
    }

    /**
     * Returns useCases.
     * Field description: Use cases.
     * @return useCases
     */
    @JsonProperty("useCases")
    public java.util.List<String> getUseCases() {
        return useCases;
    }

    /**
     * Sets useCases.
     * Field description: Use cases.
     * @param useCases
     */
    @JsonProperty("useCases")
    public void setUseCases(java.util.List<String> useCases) {
        this.useCases = useCases;
    }

    /**
     * Sets numberKeys.
     * Field description: Number keys.
     * @param numberKeys
     * @return This {@link CreateCampaignResponse} instance.
     */
    public CreateCampaignResponse numberKeys(java.util.List<String> numberKeys) {
        this.numberKeys = numberKeys;
        return this;
    }

    /**
     * Returns numberKeys.
     * Field description: Number keys.
     * @return numberKeys
     */
    @JsonProperty("numberKeys")
    public java.util.List<String> getNumberKeys() {
        return numberKeys;
    }

    /**
     * Sets numberKeys.
     * Field description: Number keys.
     * @param numberKeys
     */
    @JsonProperty("numberKeys")
    public void setNumberKeys(java.util.List<String> numberKeys) {
        this.numberKeys = numberKeys;
    }

    /**
     * Sets numberPreviews.
     * Field description: Number previews.
     * @param numberPreviews
     * @return This {@link CreateCampaignResponse} instance.
     */
    public CreateCampaignResponse numberPreviews(java.util.List<NumberPreview> numberPreviews) {
        this.numberPreviews = numberPreviews;
        return this;
    }

    /**
     * Returns numberPreviews.
     * Field description: Number previews.
     * @return numberPreviews
     */
    @JsonProperty("numberPreviews")
    public java.util.List<NumberPreview> getNumberPreviews() {
        return numberPreviews;
    }

    /**
     * Sets numberPreviews.
     * Field description: Number previews.
     * @param numberPreviews
     */
    @JsonProperty("numberPreviews")
    public void setNumberPreviews(java.util.List<NumberPreview> numberPreviews) {
        this.numberPreviews = numberPreviews;
    }

    /**
     * Sets ageGated.
     * Field description: Age gated flag.
     * @param ageGated
     * @return This {@link CreateCampaignResponse} instance.
     */
    public CreateCampaignResponse ageGated(boolean ageGated) {
        this.ageGated = ageGated;
        return this;
    }

    /**
     * Returns ageGated.
     * Field description: Age gated flag.
     * @return ageGated
     */
    @JsonProperty("ageGated")
    public boolean isAgeGated() {
        return ageGated;
    }

    /**
     * Sets ageGated.
     * Field description: Age gated flag.
     * @param ageGated
     */
    @JsonProperty("ageGated")
    public void setAgeGated(boolean ageGated) {
        this.ageGated = ageGated;
    }

    /**
     * Sets directLending.
     * Field description: Direct lending flag.
     * @param directLending
     * @return This {@link CreateCampaignResponse} instance.
     */
    public CreateCampaignResponse directLending(boolean directLending) {
        this.directLending = directLending;
        return this;
    }

    /**
     * Returns directLending.
     * Field description: Direct lending flag.
     * @return directLending
     */
    @JsonProperty("directLending")
    public boolean isDirectLending() {
        return directLending;
    }

    /**
     * Sets directLending.
     * Field description: Direct lending flag.
     * @param directLending
     */
    @JsonProperty("directLending")
    public void setDirectLending(boolean directLending) {
        this.directLending = directLending;
    }

    /**
     * Sets embeddedLink.
     * Field description: Embedded link flag.
     * @param embeddedLink
     * @return This {@link CreateCampaignResponse} instance.
     */
    public CreateCampaignResponse embeddedLink(boolean embeddedLink) {
        this.embeddedLink = embeddedLink;
        return this;
    }

    /**
     * Returns embeddedLink.
     * Field description: Embedded link flag.
     * @return embeddedLink
     */
    @JsonProperty("embeddedLink")
    public boolean isEmbeddedLink() {
        return embeddedLink;
    }

    /**
     * Sets embeddedLink.
     * Field description: Embedded link flag.
     * @param embeddedLink
     */
    @JsonProperty("embeddedLink")
    public void setEmbeddedLink(boolean embeddedLink) {
        this.embeddedLink = embeddedLink;
    }

    /**
     * Sets embeddedPhone.
     * Field description: Embedded phone flag.
     * @param embeddedPhone
     * @return This {@link CreateCampaignResponse} instance.
     */
    public CreateCampaignResponse embeddedPhone(boolean embeddedPhone) {
        this.embeddedPhone = embeddedPhone;
        return this;
    }

    /**
     * Returns embeddedPhone.
     * Field description: Embedded phone flag.
     * @return embeddedPhone
     */
    @JsonProperty("embeddedPhone")
    public boolean isEmbeddedPhone() {
        return embeddedPhone;
    }

    /**
     * Sets embeddedPhone.
     * Field description: Embedded phone flag.
     * @param embeddedPhone
     */
    @JsonProperty("embeddedPhone")
    public void setEmbeddedPhone(boolean embeddedPhone) {
        this.embeddedPhone = embeddedPhone;
    }

    /**
     * Sets type.
     * Field description: Campaign type.
     * @param type
     * @return This {@link CreateCampaignResponse} instance.
     */
    public CreateCampaignResponse type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     * Field description: Campaign type.
     * @return type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     * Field description: Campaign type.
     * @param type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Sets campaignFeedback.
     * Field description: Campaign feedback.
     * @param campaignFeedback
     * @return This {@link CreateCampaignResponse} instance.
     */
    public CreateCampaignResponse campaignFeedback(CampaignFeedback campaignFeedback) {
        this.campaignFeedback = campaignFeedback;
        return this;
    }

    /**
     * Returns campaignFeedback.
     * Field description: Campaign feedback.
     * @return campaignFeedback
     */
    @JsonProperty("campaignFeedback")
    public CampaignFeedback getCampaignFeedback() {
        return campaignFeedback;
    }

    /**
     * Sets campaignFeedback.
     * Field description: Campaign feedback.
     * @param campaignFeedback
     */
    @JsonProperty("campaignFeedback")
    public void setCampaignFeedback(CampaignFeedback campaignFeedback) {
        this.campaignFeedback = campaignFeedback;
    }
}
