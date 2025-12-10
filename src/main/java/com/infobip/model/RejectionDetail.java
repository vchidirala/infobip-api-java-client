package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RejectionDetail {
    private String errorCode;
    private String description;
    private String recommendedAction;
    /**
     * Returns errorCode.
     * <p>
     * Field description:
     * The error code.
     *
     * @return errorCode
     */
    @JsonProperty("errorCode")
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets errorCode.
     * <p>
     * Field description:
     * The error code.
     *
     * @param errorCode
     */
    @JsonProperty("errorCode")
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Returns description.
     * <p>
     * Field description:
     * The description of the rejection.
     *
     * @return description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * The description of the rejection.
     *
     * @param description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns recommendedAction.
     * <p>
     * Field description:
     * The recommended action.
     *
     * @return recommendedAction
     */
    @JsonProperty("recommendedAction")
    public String getRecommendedAction() {
        return recommendedAction;
    }

    /**
     * Sets recommendedAction.
     * <p>
     * Field description:
     * The recommended action.
     *
     * @param recommendedAction
     */
    @JsonProperty("recommendedAction")
    public void setRecommendedAction(String recommendedAction) {
        this.recommendedAction = recommendedAction;
    }
}
