package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BillingDetails {
    public double setupFee;
    public double monthlyFee;
    public double totalPaid;

    /**
     * Sets setupFee.
     *
     * @param setupFee the setup fee
     * @return This {@link BillingDetails} instance.
     */
    public BillingDetails setupFee(double setupFee) {
        this.setupFee = setupFee;
        return this;
    }

    /**
     * Returns setupFee.
     *
     * @return setupFee
     */
    @JsonProperty("setupFee")
    public double getSetupFee() {
        return setupFee;
    }

    /**
     * Sets setupFee.
     *
     * @param setupFee the setup fee
     */
    @JsonProperty("setupFee")
    public void setSetupFee(double setupFee) {
        this.setupFee = setupFee;
    }

    /**
     * Sets monthlyFee.
     *
     * @param monthlyFee the monthly fee
     * @return This {@link BillingDetails} instance.
     */
    public BillingDetails monthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
        return this;
    }

    /**
     * Returns monthlyFee.
     *
     * @return monthlyFee
     */
    @JsonProperty("monthlyFee")
    public double getMonthlyFee() {
        return monthlyFee;
    }

    /**
     * Sets monthlyFee.
     *
     * @param monthlyFee the monthly fee
     */
    @JsonProperty("monthlyFee")
    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    /**
     * Sets totalPaid.
     *
     * @param totalPaid the total paid
     * @return This {@link BillingDetails} instance.
     */
    public BillingDetails totalPaid(double totalPaid) {
        this.totalPaid = totalPaid;
        return this;
    }

    /**
     * Returns totalPaid.
     *
     * @return totalPaid
     */
    @JsonProperty("totalPaid")
    public double getTotalPaid() {
        return totalPaid;
    }

    /**
     * Sets totalPaid.
     *
     * @param totalPaid the total paid
     */
    @JsonProperty("totalPaid")
    public void setTotalPaid(double totalPaid) {
        this.totalPaid = totalPaid;
    }

    /**
     * All-args constructor.
     *
     * @param setupFee the setup fee
     * @param monthlyFee the monthly fee
     * @param totalPaid the total paid
     */
    public BillingDetails(double setupFee, double monthlyFee, double totalPaid) {
        this.setupFee = setupFee;
        this.monthlyFee = monthlyFee;
        this.totalPaid = totalPaid;
    }

    /**
     * No-args constructor.
     */
    public BillingDetails() {}
}
