package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RegisterCampaignRequest {
    private String priorityId;
    /**
     * Sets priorityId.
     *
     * @param priorityId the priority id
     * @return This {@link RegisterCampaignRequest} instance.
     */
    public RegisterCampaignRequest priorityId(String priorityId) {
        this.priorityId = priorityId;
        return this;
    }

    /**
     * Returns priorityId.
     *
     * @return priorityId
     */
    @JsonProperty("priorityId")
    public String getPriorityId() {
        return priorityId;
    }

    /**
     * Sets priorityId.
     *
     * @param priorityId the priority id
     */
    @JsonProperty("priorityId")
    public void setPriorityId(String priorityId) {
        this.priorityId = priorityId;
    }
}
