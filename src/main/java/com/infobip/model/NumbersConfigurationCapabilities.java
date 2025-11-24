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
 * Represents NumbersConfigurationCapabilities model.
 */
public class NumbersConfigurationCapabilities {

    private Boolean sms;

    private Boolean voice;

    private Boolean mms;

    private Boolean fax;

    /**
     * Sets sms.
     * <p>
     * Field description:
     * Indicates if the number supports SMS.
     *
     * @param sms
     * @return This {@link NumbersConfigurationCapabilities instance}.
     */
    public NumbersConfigurationCapabilities sms(Boolean sms) {
        this.sms = sms;
        return this;
    }

    /**
     * Returns sms.
     * <p>
     * Field description:
     * Indicates if the number supports SMS.
     *
     * @return sms
     */
    @JsonProperty("sms")
    public Boolean getSms() {
        return sms;
    }

    /**
     * Sets sms.
     * <p>
     * Field description:
     * Indicates if the number supports SMS.
     *
     * @param sms
     */
    @JsonProperty("sms")
    public void setSms(Boolean sms) {
        this.sms = sms;
    }

    /**
     * Sets voice.
     * <p>
     * Field description:
     * Indicates if the number supports voice calls.
     *
     * @param voice
     * @return This {@link NumbersConfigurationCapabilities instance}.
     */
    public NumbersConfigurationCapabilities voice(Boolean voice) {
        this.voice = voice;
        return this;
    }

    /**
     * Returns voice.
     * <p>
     * Field description:
     * Indicates if the number supports voice calls.
     *
     * @return voice
     */
    @JsonProperty("voice")
    public Boolean getVoice() {
        return voice;
    }

    /**
     * Sets voice.
     * <p>
     * Field description:
     * Indicates if the number supports voice calls.
     *
     * @param voice
     */
    @JsonProperty("voice")
    public void setVoice(Boolean voice) {
        this.voice = voice;
    }

    /**
     * Sets mms.
     * <p>
     * Field description:
     * Indicates if the number supports MMS.
     *
     * @param mms
     * @return This {@link NumbersConfigurationCapabilities instance}.
     */
    public NumbersConfigurationCapabilities mms(Boolean mms) {
        this.mms = mms;
        return this;
    }

    /**
     * Returns mms.
     * <p>
     * Field description:
     * Indicates if the number supports MMS.
     *
     * @return mms
     */
    @JsonProperty("mms")
    public Boolean getMms() {
        return mms;
    }

    /**
     * Sets mms.
     * <p>
     * Field description:
     * Indicates if the number supports MMS.
     *
     * @param mms
     */
    @JsonProperty("mms")
    public void setMms(Boolean mms) {
        this.mms = mms;
    }

    /**
     * Sets fax.
     * <p>
     * Field description:
     * Indicates if the number supports fax.
     *
     * @param fax
     * @return This {@link NumbersConfigurationCapabilities instance}.
     */
    public NumbersConfigurationCapabilities fax(Boolean fax) {
        this.fax = fax;
        return this;
    }

    /**
     * Returns fax.
     * <p>
     * Field description:
     * Indicates if the number supports fax.
     *
     * @return fax
     */
    @JsonProperty("fax")
    public Boolean getFax() {
        return fax;
    }

    /**
     * Sets fax.
     * <p>
     * Field description:
     * Indicates if the number supports fax.
     *
     * @param fax
     */
    @JsonProperty("fax")
    public void setFax(Boolean fax) {
        this.fax = fax;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersConfigurationCapabilities numbersConfigurationCapabilities = (NumbersConfigurationCapabilities) o;
        return Objects.equals(this.sms, numbersConfigurationCapabilities.sms)
                && Objects.equals(this.voice, numbersConfigurationCapabilities.voice)
                && Objects.equals(this.mms, numbersConfigurationCapabilities.mms)
                && Objects.equals(this.fax, numbersConfigurationCapabilities.fax);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sms, voice, mms, fax);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersConfigurationCapabilities {")
                .append(newLine)
                .append("    sms: ")
                .append(toIndentedString(sms))
                .append(newLine)
                .append("    voice: ")
                .append(toIndentedString(voice))
                .append(newLine)
                .append("    mms: ")
                .append(toIndentedString(mms))
                .append(newLine)
                .append("    fax: ")
                .append(toIndentedString(fax))
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

