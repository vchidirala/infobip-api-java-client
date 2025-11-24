package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CampaignFeedback {
    private java.util.List<String> rejectionReasons;
    private java.util.List<RejectionDetail> rejectionDetails;
    /**
     * Returns rejectionReasons.
     * <p>
     * Field description:
     * The list of rejection reasons.
     *
     * @return rejectionReasons
     */
    @JsonProperty("rejectionReasons")
    public java.util.List<String> getRejectionReasons() {
        return rejectionReasons;
    }

    /**
     * Sets rejectionReasons.
     * <p>
     * Field description:
     * The list of rejection reasons.
     *
     * @param rejectionReasons
     */
    @JsonProperty("rejectionReasons")
    public void setRejectionReasons(java.util.List<String> rejectionReasons) {
        this.rejectionReasons = rejectionReasons;
    }

    /**
     * Returns rejectionDetails.
     * <p>
     * Field description:
     * The list of rejection details.
     *
     * @return rejectionDetails
     */
    @JsonProperty("rejectionDetails")
    public java.util.List<RejectionDetail> getRejectionDetails() {
        return rejectionDetails;
    }

    /**
     * Sets rejectionDetails.
     * <p>
     * Field description:
     * The list of rejection details.
     *
     * @param rejectionDetails
     */
    @JsonProperty("rejectionDetails")
    public void setRejectionDetails(java.util.List<RejectionDetail> rejectionDetails) {
        this.rejectionDetails = rejectionDetails;
    }
}
