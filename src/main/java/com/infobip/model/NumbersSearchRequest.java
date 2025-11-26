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
 * Represents NumbersSearchRequest model.
 */
public class NumbersSearchRequest {

    private String countryCode;

    private NumbersType type;

    private NumbersCapability capability;

    private String pattern;

    /**
     * Sets countryCode.
     * <p>
     * Field description:
     * ISO 3166-1 alpha-2 country code to search for numbers.
     * <p>
     * The field is required.
     *
     * @param countryCode
     * @return This {@link NumbersSearchRequest instance}.
     */
    public NumbersSearchRequest countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Returns countryCode.
     * <p>
     * Field description:
     * ISO 3166-1 alpha-2 country code to search for numbers.
     * <p>
     * The field is required.
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
     * ISO 3166-1 alpha-2 country code to search for numbers.
     * <p>
     * The field is required.
     *
     * @param countryCode
     */
    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Sets type.
     * <p>
     * Field description:
     * Type of number to search for.
     *
     * @param type
     * @return This {@link NumbersSearchRequest instance}.
     */
    public NumbersSearchRequest type(NumbersType type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     * <p>
     * Field description:
     * Type of number to search for.
     *
     * @return type
     */
    @JsonProperty("type")
    public NumbersType getType() {
        return type;
    }

    /**
     * Sets type.
     * <p>
     * Field description:
     * Type of number to search for.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(NumbersType type) {
        this.type = type;
    }

    /**
     * Sets capability.
     * <p>
     * Field description:
     * Required capability of the number.
     *
     * @param capability
     * @return This {@link NumbersSearchRequest instance}.
     */
    public NumbersSearchRequest capability(NumbersCapability capability) {
        this.capability = capability;
        return this;
    }

    /**
     * Returns capability.
     * <p>
     * Field description:
     * Required capability of the number.
     *
     * @return capability
     */
    @JsonProperty("capability")
    public NumbersCapability getCapability() {
        return capability;
    }

    /**
     * Sets capability.
     * <p>
     * Field description:
     * Required capability of the number.
     *
     * @param capability
     */
    @JsonProperty("capability")
    public void setCapability(NumbersCapability capability) {
        this.capability = capability;
    }

    /**
     * Sets pattern.
     * <p>
     * Field description:
     * Pattern to match phone numbers (e.g., &quot;*1234&quot; for numbers ending in 1234).
     *
     * @param pattern
     * @return This {@link NumbersSearchRequest instance}.
     */
    public NumbersSearchRequest pattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * Returns pattern.
     * <p>
     * Field description:
     * Pattern to match phone numbers (e.g., &quot;*1234&quot; for numbers ending in 1234).
     *
     * @return pattern
     */
    @JsonProperty("pattern")
    public String getPattern() {
        return pattern;
    }

    /**
     * Sets pattern.
     * <p>
     * Field description:
     * Pattern to match phone numbers (e.g., &quot;*1234&quot; for numbers ending in 1234).
     *
     * @param pattern
     */
    @JsonProperty("pattern")
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersSearchRequest numbersSearchRequest = (NumbersSearchRequest) o;
        return Objects.equals(this.countryCode, numbersSearchRequest.countryCode)
                && Objects.equals(this.type, numbersSearchRequest.type)
                && Objects.equals(this.capability, numbersSearchRequest.capability)
                && Objects.equals(this.pattern, numbersSearchRequest.pattern);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryCode, type, capability, pattern);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersSearchRequest {")
                .append(newLine)
                .append("    countryCode: ")
                .append(toIndentedString(countryCode))
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
                .append(newLine)
                .append("    capability: ")
                .append(toIndentedString(capability))
                .append(newLine)
                .append("    pattern: ")
                .append(toIndentedString(pattern))
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

