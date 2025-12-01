package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Represents WhatsAppBusinessAccountRequest model.
 */
public class WhatsAppBusinessAccountRequest {

    private String businessAccountId;

    /**
     * Sets businessAccountId.
     * <p>
     * Field description:
     * businessAccountId.
     * <p>
     * The field is required.
     *
     * @param businessAccountId
     * @return This {@link WhatsAppBusinessAccountRequest instance}.
     */
    public WhatsAppBusinessAccountRequest businessAccountId(String businessAccountId) {
        this.businessAccountId = businessAccountId;
        return this;
    }

    /**
     * Returns businessAccountId.
     * <p>
     * Field description:
     * businessAccountId.
     * <p>
     * The field is required.
     *
     * @return businessAccountId
     */
    @JsonProperty("businessAccountId")
    public String getBusinessAccountId() {
        return businessAccountId;
    }

    /**
     * Sets businessAccountId.
     * <p>
     * Field description:
     *  businessAccountId.
     * <p>
     * The field is required.
     *
     * @param businessAccountId
     */
    @JsonProperty("businessAccountId")
    public void setBusinessAccountId(String businessAccountId) {
        this.businessAccountId = businessAccountId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppBusinessAccountRequest WhatsAppBusinessAccountRequest = (WhatsAppBusinessAccountRequest) o;
        return Objects.equals(this.businessAccountId, WhatsAppBusinessAccountRequest.businessAccountId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppBusinessAccountRequest {")
                .append(newLine)
                .append("    businessAccountId: ")
                .append(toIndentedString(businessAccountId))
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
