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
 * Represents NumbersPurchaseRequest model.
 */
public class NumbersPurchaseRequest {

    private String phoneNumber;

    private NumbersConfigurationRequest configuration;

    /**
     * Sets phoneNumber.
     * <p>
     * Field description:
     * Phone number to purchase in [E.164](https://en.wikipedia.org/wiki/E.164) format.
     * <p>
     * The field is required.
     *
     * @param phoneNumber
     * @return This {@link NumbersPurchaseRequest instance}.
     */
    public NumbersPurchaseRequest phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Returns phoneNumber.
     * <p>
     * Field description:
     * Phone number to purchase in [E.164](https://en.wikipedia.org/wiki/E.164) format.
     * <p>
     * The field is required.
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
     * Phone number to purchase in [E.164](https://en.wikipedia.org/wiki/E.164) format.
     * <p>
     * The field is required.
     *
     * @param phoneNumber
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Sets configuration.
     * <p>
     * Field description:
     * Initial configuration for the purchased number.
     *
     * @param configuration
     * @return This {@link NumbersPurchaseRequest instance}.
     */
    public NumbersPurchaseRequest configuration(NumbersConfigurationRequest configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * Returns configuration.
     * <p>
     * Field description:
     * Initial configuration for the purchased number.
     *
     * @return configuration
     */
    @JsonProperty("configuration")
    public NumbersConfigurationRequest getConfiguration() {
        return configuration;
    }

    /**
     * Sets configuration.
     * <p>
     * Field description:
     * Initial configuration for the purchased number.
     *
     * @param configuration
     */
    @JsonProperty("configuration")
    public void setConfiguration(NumbersConfigurationRequest configuration) {
        this.configuration = configuration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersPurchaseRequest numbersPurchaseRequest = (NumbersPurchaseRequest) o;
        return Objects.equals(this.phoneNumber, numbersPurchaseRequest.phoneNumber)
                && Objects.equals(this.configuration, numbersPurchaseRequest.configuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber, configuration);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersPurchaseRequest {")
                .append(newLine)
                .append("    phoneNumber: ")
                .append(toIndentedString(phoneNumber))
                .append(newLine)
                .append("    configuration: ")
                .append(toIndentedString(configuration))
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

