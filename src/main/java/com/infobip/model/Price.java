package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Price {
    private String currency;
    private double initialMonthPrice;
    private double pricePerMonth;
    private double setupPrice;

    /**
     * Sets currency.
     *
     * @param currency the currency
     * @return This {@link Price} instance.
     */
    public Price currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Returns currency.
     *
     * @return currency
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets currency.
     *
     * @param currency the currency
     */
    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Sets initialMonthPrice.
     *
     * @param initialMonthPrice the initial month price
     * @return This {@link Price} instance.
     */
    public Price initialMonthPrice(double initialMonthPrice) {
        this.initialMonthPrice = initialMonthPrice;
        return this;
    }

    /**
     * Returns initialMonthPrice.
     *
     * @return initialMonthPrice
     */
    @JsonProperty("initialMonthPrice")
    public double getInitialMonthPrice() {
        return initialMonthPrice;
    }

    /**
     * Sets initialMonthPrice.
     *
     * @param initialMonthPrice the initial month price
     */
    @JsonProperty("initialMonthPrice")
    public void setInitialMonthPrice(double initialMonthPrice) {
        this.initialMonthPrice = initialMonthPrice;
    }

    /**
     * Sets pricePerMonth.
     *
     * @param pricePerMonth the price per month
     * @return This {@link Price} instance.
     */
    public Price pricePerMonth(double pricePerMonth) {
        this.pricePerMonth = pricePerMonth;
        return this;
    }

    /**
     * Returns pricePerMonth.
     *
     * @return pricePerMonth
     */
    @JsonProperty("pricePerMonth")
    public double getPricePerMonth() {
        return pricePerMonth;
    }

    /**
     * Sets pricePerMonth.
     *
     * @param pricePerMonth the price per month
     */
    @JsonProperty("pricePerMonth")
    public void setPricePerMonth(double pricePerMonth) {
        this.pricePerMonth = pricePerMonth;
    }

    /**
     * Sets setupPrice.
     *
     * @param setupPrice the setup price
     * @return This {@link Price} instance.
     */
    public Price setupPrice(double setupPrice) {
        this.setupPrice = setupPrice;
        return this;
    }

    /**
     * Returns setupPrice.
     *
     * @return setupPrice
     */
    @JsonProperty("setupPrice")
    public double getSetupPrice() {
        return setupPrice;
    }

    /**
     * Sets setupPrice.
     *
     * @param setupPrice the setup price
     */
    @JsonProperty("setupPrice")
    public void setSetupPrice(double setupPrice) {
        this.setupPrice = setupPrice;
    }
}
