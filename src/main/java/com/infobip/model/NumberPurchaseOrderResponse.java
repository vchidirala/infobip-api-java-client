package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NumberPurchaseOrderResponse {
    private String orderId;

    /**
     * Sets orderId.
     *
     * @param orderId the order id
     * @return This {@link NumberPurchaseOrderResponse} instance.
     */
    public NumberPurchaseOrderResponse orderId(String orderId) {
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
}
