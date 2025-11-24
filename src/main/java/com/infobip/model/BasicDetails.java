package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class BasicDetails {
    public String orderId;
    public String type;
    public String status;
    public String requestedDate;
    public String country;
    public String countryName;
    public String numberType;
    public int quantity;
    public String applicationId;
    public String entityId;
    public String[] capabilities;
    public List<OrderNumber> orderNumbers;

    /**
     * Sets orderId.
     *
     * @param orderId the order id
     * @return This {@link BasicDetails} instance.
     */
    public BasicDetails orderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * Returns orderId.
     *
     * @return orderId
     */
    @JsonProperty("orderId")
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets orderId.
     *
     * @param orderId the order id
     */
    @JsonProperty("orderId")
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * Sets type.
     *
     * @param type the type
     * @return This {@link BasicDetails} instance.
     */
    public BasicDetails type(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public BasicDetails status(String status) {
        this.status = status;
        return this;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public BasicDetails requestedDate(String requestedDate) {
        this.requestedDate = requestedDate;
        return this;
    }

    @JsonProperty("requestedDate")
    public String getRequestedDate() {
        return requestedDate;
    }

    @JsonProperty("requestedDate")
    public void setRequestedDate(String requestedDate) {
        this.requestedDate = requestedDate;
    }

    public BasicDetails country(String country) {
        this.country = country;
        return this;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    public BasicDetails countryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    @JsonProperty("countryName")
    public String getCountryName() {
        return countryName;
    }

    @JsonProperty("countryName")
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public BasicDetails numberType(String numberType) {
        this.numberType = numberType;
        return this;
    }

    @JsonProperty("numberType")
    public String getNumberType() {
        return numberType;
    }

    @JsonProperty("numberType")
    public void setNumberType(String numberType) {
        this.numberType = numberType;
    }

    public BasicDetails quantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    @JsonProperty("quantity")
    public int getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BasicDetails applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    @JsonProperty("applicationId")
    public String getApplicationId() {
        return applicationId;
    }

    @JsonProperty("applicationId")
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public BasicDetails entityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    @JsonProperty("entityId")
    public String getEntityId() {
        return entityId;
    }

    @JsonProperty("entityId")
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public BasicDetails capabilities(String[] capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    @JsonProperty("capabilities")
    public String[] getCapabilities() {
        return capabilities;
    }

    @JsonProperty("capabilities")
    public void setCapabilities(String[] capabilities) {
        this.capabilities = capabilities;
    }

    public BasicDetails orderNumbers(List<OrderNumber> orderNumbers) {
        this.orderNumbers = orderNumbers;
        return this;
    }

    @JsonProperty("orderNumbers")
    public List<OrderNumber> getOrderNumbers() {
        return orderNumbers;
    }

    @JsonProperty("orderNumbers")
    public void setOrderNumbers(List<OrderNumber> orderNumbers) {
        this.orderNumbers = orderNumbers;
    }
}
