package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BillingDetails {
    public Double setupFee;
    public Double monthlyFee;
    public Double totalPaid;

    /**
     * Sets setupFee.
     *
     * @param setupFee the setup fee
     * @return This {@link BillingDetails} instance.
     */
    public BillingDetails setupFee(Double setupFee) {
        this.setupFee = setupFee;
        return this;
    }

    /**
     * Returns setupFee.
     *
     * @return setupFee
     */
    @JsonProperty("setupFee")
    public Double getSetupFee() {
        return setupFee;
    }

    /**
     * Sets setupFee.
     *
     * @param setupFee the setup fee
     */
    @JsonProperty("setupFee")
    public void setSetupFee(Double setupFee) {
        this.setupFee = setupFee;
    }

    /**
     * Sets monthlyFee.
     *
     * @param monthlyFee the monthly fee
     * @return This {@link BillingDetails} instance.
     */
    public BillingDetails monthlyFee(Double monthlyFee) {
        this.monthlyFee = monthlyFee;
        return this;
    }

    /**
     * Returns monthlyFee.
     *
     * @return monthlyFee
     */
    @JsonProperty("monthlyFee")
    public Double getMonthlyFee() {
        return monthlyFee;
    }

    /**
     * Sets monthlyFee.
     *
     * @param monthlyFee the monthly fee
     */
    @JsonProperty("monthlyFee")
    public void setMonthlyFee(Double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    /**
     * Sets totalPaid.
     *
     * @param totalPaid the total paid
     * @return This {@link BillingDetails} instance.
     */
    public BillingDetails totalPaid(Double totalPaid) {
        this.totalPaid = totalPaid;
        return this;
    }

    /**
     * Returns totalPaid.
     *
     * @return totalPaid
     */
    @JsonProperty("totalPaid")
    public Double getTotalPaid() {
        return totalPaid;
    }

    /**
     * Sets totalPaid.
     *
     * @param totalPaid the total paid
     */
    @JsonProperty("totalPaid")
    public void setTotalPaid(Double totalPaid) {
        this.totalPaid = totalPaid;
    }

    /**
     * All-args constructor.
     *
     * @param setupFee the setup fee
     * @param monthlyFee the monthly fee
     * @param totalPaid the total paid
     */
    public BillingDetails(Double setupFee, Double monthlyFee, Double totalPaid) {
        this.setupFee = setupFee;
        this.monthlyFee = monthlyFee;
        this.totalPaid = totalPaid;
    }

    /**
     * No-args constructor.
     */
    public BillingDetails() {}
}
