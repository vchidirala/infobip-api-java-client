package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Keyword {
    private String callToAction;
    private List<String> keywords;
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
    public List<String> getKeywords() {
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
    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }
}
