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
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Represents NumbersConfigurationResponse model.
 */
public class NumbersConfigurationResponse {

    private String numberId;

    private String phoneNumber;

    private String countryCode;

    private NumbersType type;

    private NumbersStatus status;

    private NumbersConfigurationCapabilities capabilities;

    private String callbackUrl;

    private String applicationId;

    private String entityId;

    private String label;

    private OffsetDateTime createdAt;

    private OffsetDateTime updatedAt;

    /**
     * Sets numberId.
     * <p>
     * Field description:
     * Unique identifier of the number.
     *
     * @param numberId
     * @return This {@link NumbersConfigurationResponse instance}.
     */
    public NumbersConfigurationResponse numberId(String numberId) {
        this.numberId = numberId;
        return this;
    }

    /**
     * Returns numberId.
     * <p>
     * Field description:
     * Unique identifier of the number.
     *
     * @return numberId
     */
    @JsonProperty("numberId")
    public String getNumberId() {
        return numberId;
    }

    /**
     * Sets numberId.
     * <p>
     * Field description:
     * Unique identifier of the number.
     *
     * @param numberId
     */
    @JsonProperty("numberId")
    public void setNumberId(String numberId) {
        this.numberId = numberId;
    }

    /**
     * Sets phoneNumber.
     * <p>
     * Field description:
     * Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
     *
     * @param phoneNumber
     * @return This {@link NumbersConfigurationResponse instance}.
     */
    public NumbersConfigurationResponse phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Returns phoneNumber.
     * <p>
     * Field description:
     * Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
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
     * Phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
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
     * @return This {@link NumbersConfigurationResponse instance}.
     */
    public NumbersConfigurationResponse countryCode(String countryCode) {
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
     * @return This {@link NumbersConfigurationResponse instance}.
     */
    public NumbersConfigurationResponse type(NumbersType type) {
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
     * Sets status.
     *
     * @param status
     * @return This {@link NumbersConfigurationResponse instance}.
     */
    public NumbersConfigurationResponse status(NumbersStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Returns status.
     *
     * @return status
     */
    @JsonProperty("status")
    public NumbersStatus getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status
     */
    @JsonProperty("status")
    public void setStatus(NumbersStatus status) {
        this.status = status;
    }

    /**
     * Sets capabilities.
     *
     * @param capabilities
     * @return This {@link NumbersConfigurationResponse instance}.
     */
    public NumbersConfigurationResponse capabilities(NumbersConfigurationCapabilities capabilities) {
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
     * Sets callbackUrl.
     * <p>
     * Field description:
     * Callback URL for receiving delivery reports and inbound messages.
     *
     * @param callbackUrl
     * @return This {@link NumbersConfigurationResponse instance}.
     */
    public NumbersConfigurationResponse callbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }

    /**
     * Returns callbackUrl.
     * <p>
     * Field description:
     * Callback URL for receiving delivery reports and inbound messages.
     *
     * @return callbackUrl
     */
    @JsonProperty("callbackUrl")
    public String getCallbackUrl() {
        return callbackUrl;
    }

    /**
     * Sets callbackUrl.
     * <p>
     * Field description:
     * Callback URL for receiving delivery reports and inbound messages.
     *
     * @param callbackUrl
     */
    @JsonProperty("callbackUrl")
    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * Application identifier. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
     *
     * @param applicationId
     * @return This {@link NumbersConfigurationResponse instance}.
     */
    public NumbersConfigurationResponse applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns applicationId.
     * <p>
     * Field description:
     * Application identifier. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
     *
     * @return applicationId
     */
    @JsonProperty("applicationId")
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * Application identifier. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
     *
     * @param applicationId
     */
    @JsonProperty("applicationId")
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Sets entityId.
     * <p>
     * Field description:
     * Entity identifier. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
     *
     * @param entityId
     * @return This {@link NumbersConfigurationResponse instance}.
     */
    public NumbersConfigurationResponse entityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Returns entityId.
     * <p>
     * Field description:
     * Entity identifier. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
     *
     * @return entityId
     */
    @JsonProperty("entityId")
    public String getEntityId() {
        return entityId;
    }

    /**
     * Sets entityId.
     * <p>
     * Field description:
     * Entity identifier. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
     *
     * @param entityId
     */
    @JsonProperty("entityId")
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * Sets label.
     * <p>
     * Field description:
     * Label to identify the number configuration.
     *
     * @param label
     * @return This {@link NumbersConfigurationResponse instance}.
     */
    public NumbersConfigurationResponse label(String label) {
        this.label = label;
        return this;
    }

    /**
     * Returns label.
     * <p>
     * Field description:
     * Label to identify the number configuration.
     *
     * @return label
     */
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    /**
     * Sets label.
     * <p>
     * Field description:
     * Label to identify the number configuration.
     *
     * @param label
     */
    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Sets createdAt.
     * <p>
     * Field description:
     * Date and time when the number was created.
     *
     * @param createdAt
     * @return This {@link NumbersConfigurationResponse instance}.
     */
    public NumbersConfigurationResponse createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Returns createdAt.
     * <p>
     * Field description:
     * Date and time when the number was created.
     *
     * @return createdAt
     */
    @JsonProperty("createdAt")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets createdAt.
     * <p>
     * Field description:
     * Date and time when the number was created.
     *
     * @param createdAt
     */
    @JsonProperty("createdAt")
    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Sets updatedAt.
     * <p>
     * Field description:
     * Date and time when the number was last updated.
     *
     * @param updatedAt
     * @return This {@link NumbersConfigurationResponse instance}.
     */
    public NumbersConfigurationResponse updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Returns updatedAt.
     * <p>
     * Field description:
     * Date and time when the number was last updated.
     *
     * @return updatedAt
     */
    @JsonProperty("updatedAt")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Sets updatedAt.
     * <p>
     * Field description:
     * Date and time when the number was last updated.
     *
     * @param updatedAt
     */
    @JsonProperty("updatedAt")
    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersConfigurationResponse numbersConfigurationResponse = (NumbersConfigurationResponse) o;
        return Objects.equals(this.numberId, numbersConfigurationResponse.numberId)
                && Objects.equals(this.phoneNumber, numbersConfigurationResponse.phoneNumber)
                && Objects.equals(this.countryCode, numbersConfigurationResponse.countryCode)
                && Objects.equals(this.type, numbersConfigurationResponse.type)
                && Objects.equals(this.status, numbersConfigurationResponse.status)
                && Objects.equals(this.capabilities, numbersConfigurationResponse.capabilities)
                && Objects.equals(this.callbackUrl, numbersConfigurationResponse.callbackUrl)
                && Objects.equals(this.applicationId, numbersConfigurationResponse.applicationId)
                && Objects.equals(this.entityId, numbersConfigurationResponse.entityId)
                && Objects.equals(this.label, numbersConfigurationResponse.label)
                && Objects.equals(this.createdAt, numbersConfigurationResponse.createdAt)
                && Objects.equals(this.updatedAt, numbersConfigurationResponse.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                numberId,
                phoneNumber,
                countryCode,
                type,
                status,
                capabilities,
                callbackUrl,
                applicationId,
                entityId,
                label,
                createdAt,
                updatedAt);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersConfigurationResponse {")
                .append(newLine)
                .append("    numberId: ")
                .append(toIndentedString(numberId))
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
                .append("    status: ")
                .append(toIndentedString(status))
                .append(newLine)
                .append("    capabilities: ")
                .append(toIndentedString(capabilities))
                .append(newLine)
                .append("    callbackUrl: ")
                .append(toIndentedString(callbackUrl))
                .append(newLine)
                .append("    applicationId: ")
                .append(toIndentedString(applicationId))
                .append(newLine)
                .append("    entityId: ")
                .append(toIndentedString(entityId))
                .append(newLine)
                .append("    label: ")
                .append(toIndentedString(label))
                .append(newLine)
                .append("    createdAt: ")
                .append(toIndentedString(createdAt))
                .append(newLine)
                .append("    updatedAt: ")
                .append(toIndentedString(updatedAt))
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

