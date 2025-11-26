package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Keyword {
    private String callToAction;
    private java.util.List<String> keywords;
    /**
     * Returns callToAction.
     * <p>
     * Field description:
     * The call to action.
     *
     * @return callToAction
     */
    @JsonProperty("callToAction")
    public String getCallToAction() {
        return callToAction;
    }

    /**
     * Sets callToAction.
     * <p>
     * Field description:
     * The call to action.
     *
     * @param callToAction
     */
    @JsonProperty("callToAction")
    public void setCallToAction(String callToAction) {
        this.callToAction = callToAction;
    }

    /**
     * Returns keywords.
     * <p>
     * Field description:
     * The list of keywords.
     *
     * @return keywords
     */
    @JsonProperty("keywords")
    public java.util.List<String> getKeywords() {
        return keywords;
    }

    /**
     * Sets keywords.
     * <p>
     * Field description:
     * The list of keywords.
     *
     * @param keywords
     */
    @JsonProperty("keywords")
    public void setKeywords(java.util.List<String> keywords) {
        this.keywords = keywords;
    }

    /**
     * Constructs a new Keyword.
     *
     * @param callToAction The call to action.
     * @param keywords The list of keywords.
     */
    public Keyword(String callToAction, java.util.List<String> keywords) {
        this.callToAction = callToAction;
        this.keywords = keywords;
    }
}
