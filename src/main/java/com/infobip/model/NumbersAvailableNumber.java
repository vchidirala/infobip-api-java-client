/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Represents NumbersAvailableNumber model.
 */
public class NumbersAvailableNumber {

    private String phoneNumber;

    private String countryCode;

    private NumbersType type;

    private NumbersConfigurationCapabilities capabilities;

    private String monthlyPrice;

    private String setupPrice;

    private String currency;

    /**
     * Sets phoneNumber.
     * <p>
     * Field description:
     * Available phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
     *
     * @param phoneNumber
     * @return This {@link NumbersAvailableNumber instance}.
     */
    public NumbersAvailableNumber phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Returns phoneNumber.
     * <p>
     * Field description:
     * Available phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
     *
     * @return phoneNumber
     */
    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets phoneNumber.
     * <p>
     * Field description:
     * Available phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
     *
     * @param phoneNumber
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Sets countryCode.
     * <p>
     * Field description:
     * ISO 3166-1 alpha-2 country code.
     *
     * @param countryCode
     * @return This {@link NumbersAvailableNumber instance}.
     */
    public NumbersAvailableNumber countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Returns countryCode.
     * <p>
     * Field description:
     * ISO 3166-1 alpha-2 country code.
     *
     * @return countryCode
     */
    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets countryCode.
     * <p>
     * Field description:
     * ISO 3166-1 alpha-2 country code.
     *
     * @param countryCode
     */
    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Sets type.
     *
     * @param type
     * @return This {@link NumbersAvailableNumber instance}.
     */
    public NumbersAvailableNumber type(NumbersType type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public NumbersType getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(NumbersType type) {
        this.type = type;
    }

    /**
     * Sets capabilities.
     *
     * @param capabilities
     * @return This {@link NumbersAvailableNumber instance}.
     */
    public NumbersAvailableNumber capabilities(NumbersConfigurationCapabilities capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Returns capabilities.
     *
     * @return capabilities
     */
    @JsonProperty("capabilities")
    public NumbersConfigurationCapabilities getCapabilities() {
        return capabilities;
    }

    /**
     * Sets capabilities.
     *
     * @param capabilities
     */
    @JsonProperty("capabilities")
    public void setCapabilities(NumbersConfigurationCapabilities capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * Sets monthlyPrice.
     * <p>
     * Field description:
     * Monthly rental price for the number.
     *
     * @param monthlyPrice
     * @return This {@link NumbersAvailableNumber instance}.
     */
    public NumbersAvailableNumber monthlyPrice(String monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
        return this;
    }

    /**
     * Returns monthlyPrice.
     * <p>
     * Field description:
     * Monthly rental price for the number.
     *
     * @return monthlyPrice
     */
    @JsonProperty("monthlyPrice")
    public String getMonthlyPrice() {
        return monthlyPrice;
    }

    /**
     * Sets monthlyPrice.
     * <p>
     * Field description:
     * Monthly rental price for the number.
     *
     * @param monthlyPrice
     */
    @JsonProperty("monthlyPrice")
    public void setMonthlyPrice(String monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
    }

    /**
     * Sets setupPrice.
     * <p>
     * Field description:
     * One-time setup price for the number.
     *
     * @param setupPrice
     * @return This {@link NumbersAvailableNumber instance}.
     */
    public NumbersAvailableNumber setupPrice(String setupPrice) {
        this.setupPrice = setupPrice;
        return this;
    }

    /**
     * Returns setupPrice.
     * <p>
     * Field description:
     * One-time setup price for the number.
     *
     * @return setupPrice
     */
    @JsonProperty("setupPrice")
    public String getSetupPrice() {
        return setupPrice;
    }

    /**
     * Sets setupPrice.
     * <p>
     * Field description:
     * One-time setup price for the number.
     *
     * @param setupPrice
     */
    @JsonProperty("setupPrice")
    public void setSetupPrice(String setupPrice) {
        this.setupPrice = setupPrice;
    }

    /**
     * Sets currency.
     * <p>
     * Field description:
     * Currency code (e.g., USD, EUR).
     *
     * @param currency
     * @return This {@link NumbersAvailableNumber instance}.
     */
    public NumbersAvailableNumber currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Returns currency.
     * <p>
     * Field description:
     * Currency code (e.g., USD, EUR).
     *
     * @return currency
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets currency.
     * <p>
     * Field description:
     * Currency code (e.g., USD, EUR).
     *
     * @param currency
     */
    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersAvailableNumber numbersAvailableNumber = (NumbersAvailableNumber) o;
        return Objects.equals(this.phoneNumber, numbersAvailableNumber.phoneNumber)
                && Objects.equals(this.countryCode, numbersAvailableNumber.countryCode)
                && Objects.equals(this.type, numbersAvailableNumber.type)
                && Objects.equals(this.capabilities, numbersAvailableNumber.capabilities)
                && Objects.equals(this.monthlyPrice, numbersAvailableNumber.monthlyPrice)
                && Objects.equals(this.setupPrice, numbersAvailableNumber.setupPrice)
                && Objects.equals(this.currency, numbersAvailableNumber.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber, countryCode, type, capabilities, monthlyPrice, setupPrice, currency);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersAvailableNumber {")
                .append(newLine)
                .append("    phoneNumber: ")
                .append(toIndentedString(phoneNumber))
                .append(newLine)
                .append("    countryCode: ")
                .append(toIndentedString(countryCode))
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
                .append(newLine)
                .append("    capabilities: ")
                .append(toIndentedString(capabilities))
                .append(newLine)
                .append("    monthlyPrice: ")
                .append(toIndentedString(monthlyPrice))
                .append(newLine)
                .append("    setupPrice: ")
                .append(toIndentedString(setupPrice))
                .append(newLine)
                .append("    currency: ")
                .append(toIndentedString(currency))
                .append(newLine)
                .append("}")
                .toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        String lineSeparator = System.lineSeparator();
        String lineSeparatorFollowedByIndentation = lineSeparator + "    ";
        return o.toString().replace(lineSeparator, lineSeparatorFollowedByIndentation);
    }
}

