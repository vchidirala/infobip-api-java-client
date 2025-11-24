package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class CreateCampaignRequest {
    private String referenceId;
    private String type;
    private String applicationId;
    private String entityId;
    private String name;
    private List<String> numberKeys;
    private String brandId;
    private String confirmationMessage;
    private String customerCarePhone;
    private String customerCareEmail;
    private List<String> exampleMessages;
    private String helpMessage;
    private boolean lowVolume;
    private List<String> messageTypes;
    private String programSummary;
    private String stopMessage;
    private String termsAndConditionsUrl;
    private List<String> useCases;
    private OptIns optIns;
    private boolean ageGated;
    private boolean directLending;
    private boolean embeddedLink;
    private boolean embeddedPhone;
    private String externalCampaignId;
    /**
     * Sets referenceId.
     * Field description: Reference identifier for the campaign.
     * @param referenceId
     * @return This {@link CreateCampaignRequest} instance.
     */
    public CreateCampaignRequest referenceId(String referenceId) {
        this.referenceId = referenceId;
        return this;
    }

    /**
     * Returns referenceId.
     * Field description: Reference identifier for the campaign.
     * @return referenceId
     */
    @JsonProperty("referenceId")
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Sets referenceId.
     * Field description: Reference identifier for the campaign.
     * @param referenceId
     */
    @JsonProperty("referenceId")
    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * Sets type.
     * Field description: Type of the campaign.
     * @param type
     * @return This {@link CreateCampaignRequest} instance.
     */
    public CreateCampaignRequest type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     * Field description: Type of the campaign.
     * @return type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     * Field description: Type of the campaign.
     * @param type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Sets applicationId.
     * Field description: Application identifier.
     * @param applicationId
     * @return This {@link CreateCampaignRequest} instance.
     */
    public CreateCampaignRequest applicationId(String applicationId) {
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
     * @return This {@link CreateCampaignRequest} instance.
     */
    public CreateCampaignRequest entityId(String entityId) {
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
     * Field description: Name of the campaign.
     * @param name
     * @return This {@link CreateCampaignRequest} instance.
     */
    public CreateCampaignRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * Field description: Name of the campaign.
     * @return name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     * Field description: Name of the campaign.
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets numberKeys.
     * Field description: List of number keys.
     * @param numberKeys
     * @return This {@link CreateCampaignRequest} instance.
     */
    public CreateCampaignRequest numberKeys(java.util.List<String> numberKeys) {
        this.numberKeys = numberKeys;
        return this;
    }

    /**
     * Returns numberKeys.
     * Field description: List of number keys.
     * @return numberKeys
     */
    @JsonProperty("numberKeys")
    public java.util.List<String> getNumberKeys() {
        return numberKeys;
    }

    /**
     * Sets numberKeys.
     * Field description: List of number keys.
     * @param numberKeys
     */
    @JsonProperty("numberKeys")
    public void setNumberKeys(java.util.List<String> numberKeys) {
        this.numberKeys = numberKeys;
    }

    /**
     * Sets brandId.
     * Field description: Brand identifier.
     * @param brandId
     * @return This {@link CreateCampaignRequest} instance.
     */
    public CreateCampaignRequest brandId(String brandId) {
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
     * Sets confirmationMessage.
     * Field description: Confirmation message.
     * @param confirmationMessage
     * @return This {@link CreateCampaignRequest} instance.
     */
    public CreateCampaignRequest confirmationMessage(String confirmationMessage) {
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
     * Sets customerCarePhone.
     * Field description: Customer care phone number.
     * @param customerCarePhone
     * @return This {@link CreateCampaignRequest} instance.
     */
    public CreateCampaignRequest customerCarePhone(String customerCarePhone) {
        this.customerCarePhone = customerCarePhone;
        return this;
    }

    /**
     * Returns customerCarePhone.
     * Field description: Customer care phone number.
     * @return customerCarePhone
     */
    @JsonProperty("customerCarePhone")
    public String getCustomerCarePhone() {
        return customerCarePhone;
    }

    /**
     * Sets customerCarePhone.
     * Field description: Customer care phone number.
     * @param customerCarePhone
     */
    @JsonProperty("customerCarePhone")
    public void setCustomerCarePhone(String customerCarePhone) {
        this.customerCarePhone = customerCarePhone;
    }

    /**
     * Sets customerCareEmail.
     * Field description: Customer care email.
     * @param customerCareEmail
     * @return This {@link CreateCampaignRequest} instance.
     */
    public CreateCampaignRequest customerCareEmail(String customerCareEmail) {
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
     * @return This {@link CreateCampaignRequest} instance.
     */
    public CreateCampaignRequest exampleMessages(java.util.List<String> exampleMessages) {
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
     * @return This {@link CreateCampaignRequest} instance.
     */
    public CreateCampaignRequest helpMessage(String helpMessage) {
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
     * Sets lowVolume.
     * Field description: Indicates if the campaign is low volume.
     * @param lowVolume
     * @return This {@link CreateCampaignRequest} instance.
     */
    public CreateCampaignRequest lowVolume(boolean lowVolume) {
        this.lowVolume = lowVolume;
        return this;
    }

    /**
     * Returns lowVolume.
     * Field description: Indicates if the campaign is low volume.
     * @return lowVolume
     */
    @JsonProperty("lowVolume")
    public boolean isLowVolume() {
        return lowVolume;
    }

    /**
     * Sets lowVolume.
     * Field description: Indicates if the campaign is low volume.
     * @param lowVolume
     */
    @JsonProperty("lowVolume")
    public void setLowVolume(boolean lowVolume) {
        this.lowVolume = lowVolume;
    }

    /**
     * Sets messageTypes.
     * Field description: List of message types.
     * @param messageTypes
     * @return This {@link CreateCampaignRequest} instance.
     */
    public CreateCampaignRequest messageTypes(java.util.List<String> messageTypes) {
        this.messageTypes = messageTypes;
        return this;
    }

    /**
     * Returns messageTypes.
     * Field description: List of message types.
     * @return messageTypes
     */
    @JsonProperty("messageTypes")
    public java.util.List<String> getMessageTypes() {
        return messageTypes;
    }

    /**
     * Sets messageTypes.
     * Field description: List of message types.
     * @param messageTypes
     */
    @JsonProperty("messageTypes")
    public void setMessageTypes(java.util.List<String> messageTypes) {
        this.messageTypes = messageTypes;
    }

    /**
     * Sets programSummary.
     * Field description: Program summary.
     * @param programSummary
     * @return This {@link CreateCampaignRequest} instance.
     */
    public CreateCampaignRequest programSummary(String programSummary) {
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
     * Sets stopMessage.
     * Field description: Stop message.
     * @param stopMessage
     * @return This {@link CreateCampaignRequest} instance.
     */
    public CreateCampaignRequest stopMessage(String stopMessage) {
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
     * Sets termsAndConditionsUrl.
     * Field description: Terms and conditions URL.
     * @param termsAndConditionsUrl
     * @return This {@link CreateCampaignRequest} instance.
     */
    public CreateCampaignRequest termsAndConditionsUrl(String termsAndConditionsUrl) {
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
     * Sets useCases.
     * Field description: List of use cases.
     * @param useCases
     * @return This {@link CreateCampaignRequest} instance.
     */
    public CreateCampaignRequest useCases(java.util.List<String> useCases) {
        this.useCases = useCases;
        return this;
    }

    /**
     * Returns useCases.
     * Field description: List of use cases.
     * @return useCases
     */
    @JsonProperty("useCases")
    public java.util.List<String> getUseCases() {
        return useCases;
    }

    /**
     * Sets useCases.
     * Field description: List of use cases.
     * @param useCases
     */
    @JsonProperty("useCases")
    public void setUseCases(java.util.List<String> useCases) {
        this.useCases = useCases;
    }

    /**
     * Sets optIns.
     * Field description: Opt-in information.
     * @param optIns
     * @return This {@link CreateCampaignRequest} instance.
     */
    public CreateCampaignRequest optIns(OptIns optIns) {
        this.optIns = optIns;
        return this;
    }

    /**
     * Returns optIns.
     * Field description: Opt-in information.
     * @return optIns
     */
    @JsonProperty("optIns")
    public OptIns getOptIns() {
        return optIns;
    }

    /**
     * Sets optIns.
     * Field description: Opt-in information.
     * @param optIns
     */
    @JsonProperty("optIns")
    public void setOptIns(OptIns optIns) {
        this.optIns = optIns;
    }

    /**
     * Sets ageGated.
     * Field description: Indicates if age gating is enabled.
     * @param ageGated
     * @return This {@link CreateCampaignRequest} instance.
     */
    public CreateCampaignRequest ageGated(boolean ageGated) {
        this.ageGated = ageGated;
        return this;
    }

    /**
     * Returns ageGated.
     * Field description: Indicates if age gating is enabled.
     * @return ageGated
     */
    @JsonProperty("ageGated")
    public boolean isAgeGated() {
        return ageGated;
    }

    /**
     * Sets ageGated.
     * Field description: Indicates if age gating is enabled.
     * @param ageGated
     */
    @JsonProperty("ageGated")
    public void setAgeGated(boolean ageGated) {
        this.ageGated = ageGated;
    }

    /**
     * Sets directLending.
     * Field description: Indicates if direct lending is enabled.
     * @param directLending
     * @return This {@link CreateCampaignRequest} instance.
     */
    public CreateCampaignRequest directLending(boolean directLending) {
        this.directLending = directLending;
        return this;
    }

    /**
     * Returns directLending.
     * Field description: Indicates if direct lending is enabled.
     * @return directLending
     */
    @JsonProperty("directLending")
    public boolean isDirectLending() {
        return directLending;
    }

    /**
     * Sets directLending.
     * Field description: Indicates if direct lending is enabled.
     * @param directLending
     */
    @JsonProperty("directLending")
    public void setDirectLending(boolean directLending) {
        this.directLending = directLending;
    }

    /**
     * Sets embeddedLink.
     * Field description: Indicates if embedded link is enabled.
     * @param embeddedLink
     * @return This {@link CreateCampaignRequest} instance.
     */
    public CreateCampaignRequest embeddedLink(boolean embeddedLink) {
        this.embeddedLink = embeddedLink;
        return this;
    }

    /**
     * Returns embeddedLink.
     * Field description: Indicates if embedded link is enabled.
     * @return embeddedLink
     */
    @JsonProperty("embeddedLink")
    public boolean isEmbeddedLink() {
        return embeddedLink;
    }

    /**
     * Sets embeddedLink.
     * Field description: Indicates if embedded link is enabled.
     * @param embeddedLink
     */
    @JsonProperty("embeddedLink")
    public void setEmbeddedLink(boolean embeddedLink) {
        this.embeddedLink = embeddedLink;
    }

    /**
     * Sets embeddedPhone.
     * Field description: Indicates if embedded phone is enabled.
     * @param embeddedPhone
     * @return This {@link CreateCampaignRequest} instance.
     */
    public CreateCampaignRequest embeddedPhone(boolean embeddedPhone) {
        this.embeddedPhone = embeddedPhone;
        return this;
    }

    /**
     * Returns embeddedPhone.
     * Field description: Indicates if embedded phone is enabled.
     * @return embeddedPhone
     */
    @JsonProperty("embeddedPhone")
    public boolean isEmbeddedPhone() {
        return embeddedPhone;
    }

    /**
     * Sets embeddedPhone.
     * Field description: Indicates if embedded phone is enabled.
     * @param embeddedPhone
     */
    @JsonProperty("embeddedPhone")
    public void setEmbeddedPhone(boolean embeddedPhone) {
        this.embeddedPhone = embeddedPhone;
    }

    /**
     * Sets externalCampaignId.
     * Field description: External campaign identifier.
     * @param externalCampaignId
     * @return This {@link CreateCampaignRequest} instance.
     */
    public CreateCampaignRequest externalCampaignId(String externalCampaignId) {
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
}
