package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class GetAvailableNumbersRequest {
    private List<String> capabilities;
    private String country;
    private String state;
    private String npa;
    private String nxx;
    private String number;
    private Integer limit;
    private Integer page;

    /**
     * Sets capabilities.
     *
     * @param capabilities the capabilities list
     * @return This {@link GetAvailableNumbersRequest} instance.
     */
    public GetAvailableNumbersRequest capabilities(List<String> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Returns capabilities.
     *
     * @return capabilities
     */
    @JsonProperty("capabilities")
    public List<String> getCapabilities() {
        return capabilities;
    }

    /**
     * Sets capabilities.
     *
     * @param capabilities the capabilities list
     */
    @JsonProperty("capabilities")
    public void setCapabilities(List<String> capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * Sets country.
     *
     * @param country the country
     * @return This {@link GetAvailableNumbersRequest} instance.
     */
    public GetAvailableNumbersRequest country(String country) {
        this.country = country;
        return this;
    }

    /**
     * Returns country.
     *
     * @return country
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * Sets country.
     *
     * @param country the country
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Sets state.
     *
     * @param state the state
     * @return This {@link GetAvailableNumbersRequest} instance.
     */
    public GetAvailableNumbersRequest state(String state) {
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
     * @return This {@link GetAvailableNumbersRequest} instance.
     */
    public GetAvailableNumbersRequest npa(String npa) {
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
     * @return This {@link GetAvailableNumbersRequest} instance.
     */
    public GetAvailableNumbersRequest nxx(String nxx) {
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
     * Sets number.
     *
     * @param number the number
     * @return This {@link GetAvailableNumbersRequest} instance.
     */
    public GetAvailableNumbersRequest number(String number) {
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
     * Sets limit.
     *
     * @param limit the limit
     * @return This {@link GetAvailableNumbersRequest} instance.
     */
    public GetAvailableNumbersRequest limit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Returns limit.
     *
     * @return limit
     */
    @JsonProperty("limit")
    public Integer getLimit() {
        return limit;
    }

    /**
     * Sets limit.
     *
     * @param limit the limit
     */
    @JsonProperty("limit")
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * Sets page.
     *
     * @param page the page
     * @return This {@link GetAvailableNumbersRequest} instance.
     */
    public GetAvailableNumbersRequest page(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * Returns page.
     *
     * @return page
     */
    @JsonProperty("page")
    public Integer getPage() {
        return page;
    }

    /**
     * Sets page.
     *
     * @param page the page
     */
    @JsonProperty("page")
    public void setPage(Integer page) {
        this.page = page;
    }
}
