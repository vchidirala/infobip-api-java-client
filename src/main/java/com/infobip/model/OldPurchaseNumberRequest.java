package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OldPurchaseNumberRequest {
    private String numberKey;
    private String number;
    private String applicationId;
    private String entityId;

    /**
     * Sets numberKey.
     *
     * @param numberKey the number key
     * @return This {@link OldPurchaseNumberRequest} instance.
     */
    public OldPurchaseNumberRequest numberKey(String numberKey) {
        this.numberKey = numberKey;
        return this;
    }

    /**
     * Returns numberKey.
     *
     * @return numberKey
     */
    @JsonProperty("numberKey")
    public String getNumberKey() {
        return numberKey;
    }

    /**
     * Sets numberKey.
     *
     * @param numberKey the number key
     */
    @JsonProperty("numberKey")
    public void setNumberKey(String numberKey) {
        this.numberKey = numberKey;
    }

    /**
     * Sets number.
     *
     * @param number the number
     * @return This {@link OldPurchaseNumberRequest} instance.
     */
    public OldPurchaseNumberRequest number(String number) {
        this.number = number;
        return this;
    }

    /**
     * Returns number.
     *
     * @return number
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * Sets number.
     *
     * @param number the number
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Sets applicationId.
     *
     * @param applicationId the application id
     * @return This {@link OldPurchaseNumberRequest} instance.
     */
    public OldPurchaseNumberRequest applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns applicationId.
     *
     * @return applicationId
     */
    @JsonProperty("applicationId")
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets applicationId.
     *
     * @param applicationId the application id
     */
    @JsonProperty("applicationId")
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Sets entityId.
     *
     * @param entityId the entity id
     * @return This {@link OldPurchaseNumberRequest} instance.
     */
    public OldPurchaseNumberRequest entityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Returns entityId.
     *
     * @return entityId
     */
    @JsonProperty("entityId")
    public String getEntityId() {
        return entityId;
    }

    /**
     * Sets entityId.
     *
     * @param entityId the entity id
     */
    @JsonProperty("entityId")
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }
}
