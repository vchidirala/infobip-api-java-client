package com.infobip.model;

public class AdditionalData {
    public String state;
    public int npa;
    public int nxx;

    /**
     * Sets state.
     *
     * @param state the state
     * @return This {@link AdditionalData} instance.
     */
    public AdditionalData state(String state) {
        this.state = state;
        return this;
    }

    /**
     * Returns state.
     *
     * @return state
     */
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * Sets state.
     *
     * @param state the state
     */
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Sets npa.
     *
     * @param npa the npa
     * @return This {@link AdditionalData} instance.
     */
    public AdditionalData npa(int npa) {
        this.npa = npa;
        return this;
    }

    /**
     * Returns npa.
     *
     * @return npa
     */
    @com.fasterxml.jackson.annotation.JsonProperty("npa")
    public int getNpa() {
        return npa;
    }

    /**
     * Sets npa.
     *
     * @param npa the npa
     */
    @com.fasterxml.jackson.annotation.JsonProperty("npa")
    public void setNpa(int npa) {
        this.npa = npa;
    }

    /**
     * Sets nxx.
     *
     * @param nxx the nxx
     * @return This {@link AdditionalData} instance.
     */
    public AdditionalData nxx(int nxx) {
        this.nxx = nxx;
        return this;
    }

    /**
     * Returns nxx.
     *
     * @return nxx
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nxx")
    public int getNxx() {
        return nxx;
    }

    /**
     * Sets nxx.
     *
     * @param nxx the nxx
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nxx")
    public void setNxx(int nxx) {
        this.nxx = nxx;
    }

    /**
     * All-args constructor.
     */
    public AdditionalData(String state, int npa, int nxx) {
        this.state = state;
        this.npa = npa;
        this.nxx = nxx;
    }

    /**
     * No-args constructor.
     */
    public AdditionalData() {}
}
