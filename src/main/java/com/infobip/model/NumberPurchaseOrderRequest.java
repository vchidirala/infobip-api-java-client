package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NumberPurchaseOrderRequest {
    private String state;
    private String npa;
    private String nxx;
    private String type;
    private String applicationId;
    private String entityId;
    private int quantity;

    /**
     * Sets state.
     *
     * @param state the state
     * @return This {@link NumberPurchaseOrderRequest} instance.
     */
    public NumberPurchaseOrderRequest state(String state) {
        this.state = state;
        return this;
    }

    /**
     * Returns state.
     *
     * @return state
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * Sets state.
     *
     * @param state the state
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Sets npa.
     *
     * @param npa the npa
     * @return This {@link NumberPurchaseOrderRequest} instance.
     */
    public NumberPurchaseOrderRequest npa(String npa) {
        this.npa = npa;
        return this;
    }

    /**
     * Returns npa.
     *
     * @return npa
     */
    @JsonProperty("npa")
    public String getNpa() {
        return npa;
    }

    /**
     * Sets npa.
     *
     * @param npa the npa
     */
    @JsonProperty("npa")
    public void setNpa(String npa) {
        this.npa = npa;
    }

    /**
     * Sets nxx.
     *
     * @param nxx the nxx
     * @return This {@link NumberPurchaseOrderRequest} instance.
     */
    public NumberPurchaseOrderRequest nxx(String nxx) {
        this.nxx = nxx;
        return this;
    }

    /**
     * Returns nxx.
     *
     * @return nxx
     */
    @JsonProperty("nxx")
    public String getNxx() {
        return nxx;
    }

    /**
     * Sets nxx.
     *
     * @param nxx the nxx
     */
    @JsonProperty("nxx")
    public void setNxx(String nxx) {
        this.nxx = nxx;
    }

    /**
     * Sets type.
     *
     * @param type the type
     * @return This {@link NumberPurchaseOrderRequest} instance.
     */
    public NumberPurchaseOrderRequest type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Sets applicationId.
     *
     * @param applicationId the application id
     * @return This {@link NumberPurchaseOrderRequest} instance.
     */
    public NumberPurchaseOrderRequest applicationId(String applicationId) {
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
     * @return This {@link NumberPurchaseOrderRequest} instance.
     */
    public NumberPurchaseOrderRequest entityId(String entityId) {
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

    /**
     * Sets quantity.
     *
     * @param quantity the quantity
     * @return This {@link NumberPurchaseOrderRequest} instance.
     */
    public NumberPurchaseOrderRequest quantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Returns quantity.
     *
     * @return quantity
     */
    @JsonProperty("quantity")
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets quantity.
     *
     * @param quantity the quantity
     */
    @JsonProperty("quantity")
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
