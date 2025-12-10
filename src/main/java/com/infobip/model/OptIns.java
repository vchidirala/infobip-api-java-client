package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OptIns {
    private Keyword keyword;

    /**
     * Gets the keyword.
     * @return the keyword
     */
    @JsonProperty("keyword")
    public Keyword getKeyword() {
        return keyword;
    }

    /**
     * Sets the keyword.
     * @param keyword the keyword to set
     */
    @JsonProperty("keyword")
    public void setKeyword(Keyword keyword) {
        this.keyword = keyword;
    }
}
