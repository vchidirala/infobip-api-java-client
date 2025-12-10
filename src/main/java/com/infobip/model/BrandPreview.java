package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BrandPreview {
    private String brandId;
    private String brandName;
    /**
     * Returns brandId.
     * <p>
     * Field description:
     * The brand ID.
     *
     * @return brandId
     */
    @JsonProperty("brandId")
    public String getBrandId() {
        return brandId;
    }

    /**
     * Sets brandId.
     * <p>
     * Field description:
     * The brand ID.
     *
     * @param brandId
     */
    @JsonProperty("brandId")
    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    /**
     * Returns brandName.
     * <p>
     * Field description:
     * The brand name.
     *
     * @return brandName
     */
    @JsonProperty("brandName")
    public String getBrandName() {
        return brandName;
    }

    /**
     * Sets brandName.
     * <p>
     * Field description:
     * The brand name.
     *
     * @param brandName
     */
    @JsonProperty("brandName")
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
