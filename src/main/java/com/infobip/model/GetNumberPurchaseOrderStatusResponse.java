package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetNumberPurchaseOrderStatusResponse {

    private BasicDetails basicDetails;
    private BillingDetails billingDetails;
    private AdditionalData additionalData;

    /**
     * Sets basicDetails.
     *
     * @param basicDetails the basic details
     * @return This {@link GetNumberPurchaseOrderStatusResponse} instance.
     */
    public GetNumberPurchaseOrderStatusResponse basicDetails(BasicDetails basicDetails) {
        this.basicDetails = basicDetails;
        return this;
    }

    /**
     * Returns basicDetails.
     *
     * @return basicDetails
     */
    @JsonProperty("basicDetails")
    public BasicDetails getBasicDetails() {
        return basicDetails;
    }

    /**
     * Sets basicDetails.
     *
     * @param basicDetails the basic details
     */
    @JsonProperty("basicDetails")
    public void setBasicDetails(BasicDetails basicDetails) {
        this.basicDetails = basicDetails;
    }

    /**
     * Sets billingDetails.
     *
     * @param billingDetails the billing details
     * @return This {@link GetNumberPurchaseOrderStatusResponse} instance.
     */
    public GetNumberPurchaseOrderStatusResponse billingDetails(BillingDetails billingDetails) {
        this.billingDetails = billingDetails;
        return this;
    }

    /**
     * Returns billingDetails.
     *
     * @return billingDetails
     */
    @JsonProperty("billingDetails")
    public BillingDetails getBillingDetails() {
        return billingDetails;
    }

    /**
     * Sets billingDetails.
     *
     * @param billingDetails the billing details
     */
    @JsonProperty("billingDetails")
    public void setBillingDetails(BillingDetails billingDetails) {
        this.billingDetails = billingDetails;
    }

    /**
     * Sets additionalData.
     *
     * @param additionalData the additional data
     * @return This {@link GetNumberPurchaseOrderStatusResponse} instance.
     */
    public GetNumberPurchaseOrderStatusResponse additionalData(AdditionalData additionalData) {
        this.additionalData = additionalData;
        return this;
    }

    /**
     * Returns additionalData.
     *
     * @return additionalData
     */
    @JsonProperty("additionalData")
    public AdditionalData getAdditionalData() {
        return additionalData;
    }

    /**
     * Sets additionalData.
     *
     * @param additionalData the additional data
     */
    @JsonProperty("additionalData")
    public void setAdditionalData(AdditionalData additionalData) {
        this.additionalData = additionalData;
    }
}
