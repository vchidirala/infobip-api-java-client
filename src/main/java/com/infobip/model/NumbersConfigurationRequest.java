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
 * Represents NumbersConfigurationRequest model.
 */
public class NumbersConfigurationRequest {

    private String callbackUrl;

    private String applicationId;

    private String entityId;

    private String label;

    /**
     * Sets callbackUrl.
     * <p>
     * Field description:
     * Callback URL for receiving delivery reports and inbound messages.
     *
     * @param callbackUrl
     * @return This {@link NumbersConfigurationRequest instance}.
     */
    public NumbersConfigurationRequest callbackUrl(String callbackUrl) {
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
     * @return This {@link NumbersConfigurationRequest instance}.
     */
    public NumbersConfigurationRequest applicationId(String applicationId) {
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
     * @return This {@link NumbersConfigurationRequest instance}.
     */
    public NumbersConfigurationRequest entityId(String entityId) {
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
     * @return This {@link NumbersConfigurationRequest instance}.
     */
    public NumbersConfigurationRequest label(String label) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersConfigurationRequest numbersConfigurationRequest = (NumbersConfigurationRequest) o;
        return Objects.equals(this.callbackUrl, numbersConfigurationRequest.callbackUrl)
                && Objects.equals(this.applicationId, numbersConfigurationRequest.applicationId)
                && Objects.equals(this.entityId, numbersConfigurationRequest.entityId)
                && Objects.equals(this.label, numbersConfigurationRequest.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callbackUrl, applicationId, entityId, label);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersConfigurationRequest {")
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

