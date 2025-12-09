package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderNumber {
    public String status;
    public String numberKey;
    public String number;

    /**
     * Sets status.
     *
     * @param status the status
     * @return This {@link OrderNumber} instance.
     */
    public OrderNumber status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Returns status.
     *
     * @return status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Sets numberKey.
     *
     * @param numberKey the number key
     * @return This {@link OrderNumber} instance.
     */
    public OrderNumber numberKey(String numberKey) {
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
     * @return This {@link OrderNumber} instance.
     */
    public OrderNumber number(String number) {
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
}
