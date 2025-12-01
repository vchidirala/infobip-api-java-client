package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class AvailableNumber {
    private List<String> capabilities;
    private String country;
    private String number;
    private String numberKey;
    private Price price;
    private boolean shared;
    private String type;

    /**
     * Sets capabilities.
     *
     * @param capabilities the capabilities list
     * @return This {@link AvailableNumber} instance.
     */
    public AvailableNumber capabilities(List<String> capabilities) {
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
     * @return This {@link AvailableNumber} instance.
     */
    public AvailableNumber country(String country) {
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
     * Sets number.
     *
     * @param number the number
     * @return This {@link AvailableNumber} instance.
     */
    public AvailableNumber number(String number) {
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
     * Sets numberKey.
     *
     * @param numberKey the number key
     * @return This {@link AvailableNumber} instance.
     */
    public AvailableNumber numberKey(String numberKey) {
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
     * Sets price.
     *
     * @param price the price
     * @return This {@link AvailableNumber} instance.
     */
    public AvailableNumber price(Price price) {
        this.price = price;
        return this;
    }

    /**
     * Returns price.
     *
     * @return price
     */
    @JsonProperty("price")
    public Price getPrice() {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price the price
     */
    @JsonProperty("price")
    public void setPrice(Price price) {
        this.price = price;
    }

    /**
     * Sets shared.
     *
     * @param shared the shared flag
     * @return This {@link AvailableNumber} instance.
     */
    public AvailableNumber shared(boolean shared) {
        this.shared = shared;
        return this;
    }

    /**
     * Returns shared.
     *
     * @return shared
     */
    @JsonProperty("shared")
    public boolean isShared() {
        return shared;
    }

    /**
     * Sets shared.
     *
     * @param shared the shared flag
     */
    @JsonProperty("shared")
    public void setShared(boolean shared) {
        this.shared = shared;
    }

    /**
     * Sets type.
     *
     * @param type the type
     * @return This {@link AvailableNumber} instance.
     */
    public AvailableNumber type(String type) {
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
}
