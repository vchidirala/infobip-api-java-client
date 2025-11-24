package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Number {
    private boolean additionalSetupRequired;
    private String applicationId;
    private String entityId;
    private List<String> capabilities;
    private String country;
    private String countryName;
    private EditPermissions editPermissions;
    private List<String> keywords;
    private String network;
    private String note;
    private String number;
    private String numberKey;
    private Price price;
    private boolean shared;
    private String type;

    /**
     * Sets additionalSetupRequired.
     *
     * @param additionalSetupRequired the additional setup required flag
     * @return This {@link Number} instance.
     */
    public Number additionalSetupRequired(boolean additionalSetupRequired) {
        this.additionalSetupRequired = additionalSetupRequired;
        return this;
    }

    /**
     * Returns additionalSetupRequired.
     *
     * @return additionalSetupRequired
     */
    @JsonProperty("additionalSetupRequired")
    public boolean isAdditionalSetupRequired() {
        return additionalSetupRequired;
    }

    /**
     * Sets additionalSetupRequired.
     *
     * @param additionalSetupRequired the additional setup required flag
     */
    @JsonProperty("additionalSetupRequired")
    public void setAdditionalSetupRequired(boolean additionalSetupRequired) {
        this.additionalSetupRequired = additionalSetupRequired;
    }

    /**
     * Sets applicationId.
     *
     * @param applicationId the application id
     * @return This {@link Number} instance.
     */
    public Number applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns applicationId.
     *
     * @return applicationId
     */
    @JsonProperty("applicationId")
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets applicationId.
     *
     * @param applicationId the application id
     */
    @JsonProperty("applicationId")
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Sets entityId.
     *
     * @param entityId the entity id
     * @return This {@link Number} instance.
     */
    public Number entityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Returns entityId.
     *
     * @return entityId
     */
    @JsonProperty("entityId")
    public String getEntityId() {
        return entityId;
    }

    /**
     * Sets entityId.
     *
     * @param entityId the entity id
     */
    @JsonProperty("entityId")
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * Sets capabilities.
     *
     * @param capabilities the capabilities
     * @return This {@link Number} instance.
     */
    public Number capabilities(java.util.List<String> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Returns capabilities.
     *
     * @return capabilities
     */
    @JsonProperty("capabilities")
    public java.util.List<String> getCapabilities() {
        return capabilities;
    }

    /**
     * Sets capabilities.
     *
     * @param capabilities the capabilities
     */
    @JsonProperty("capabilities")
    public void setCapabilities(java.util.List<String> capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * Sets country.
     *
     * @param country the country
     * @return This {@link Number} instance.
     */
    public Number country(String country) {
        this.country = country;
        return this;
    }

    /**
     * Returns country.
     *
     * @return country
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * Sets country.
     *
     * @param country the country
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Sets countryName.
     *
     * @param countryName the country name
     * @return This {@link Number} instance.
     */
    public Number countryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    /**
     * Returns countryName.
     *
     * @return countryName
     */
    @JsonProperty("countryName")
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets countryName.
     *
     * @param countryName the country name
     */
    @JsonProperty("countryName")
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * Sets editPermissions.
     *
     * @param editPermissions the edit permissions
     * @return This {@link Number} instance.
     */
    public Number editPermissions(EditPermissions editPermissions) {
        this.editPermissions = editPermissions;
        return this;
    }

    /**
     * Returns editPermissions.
     *
     * @return editPermissions
     */
    @JsonProperty("editPermissions")
    public EditPermissions getEditPermissions() {
        return editPermissions;
    }

    /**
     * Sets editPermissions.
     *
     * @param editPermissions the edit permissions
     */
    @JsonProperty("editPermissions")
    public void setEditPermissions(EditPermissions editPermissions) {
        this.editPermissions = editPermissions;
    }

    /**
     * Sets keywords.
     *
     * @param keywords the keywords
     * @return This {@link Number} instance.
     */
    public Number keywords(java.util.List<String> keywords) {
        this.keywords = keywords;
        return this;
    }

    /**
     * Returns keywords.
     *
     * @return keywords
     */
    @JsonProperty("keywords")
    public java.util.List<String> getKeywords() {
        return keywords;
    }

    /**
     * Sets keywords.
     *
     * @param keywords the keywords
     */
    @JsonProperty("keywords")
    public void setKeywords(java.util.List<String> keywords) {
        this.keywords = keywords;
    }

    /**
     * Sets network.
     *
     * @param network the network
     * @return This {@link Number} instance.
     */
    public Number network(String network) {
        this.network = network;
        return this;
    }

    /**
     * Returns network.
     *
     * @return network
     */
    @JsonProperty("network")
    public String getNetwork() {
        return network;
    }

    /**
     * Sets network.
     *
     * @param network the network
     */
    @JsonProperty("network")
    public void setNetwork(String network) {
        this.network = network;
    }

    /**
     * Sets note.
     *
     * @param note the note
     * @return This {@link Number} instance.
     */
    public Number note(String note) {
        this.note = note;
        return this;
    }

    /**
     * Returns note.
     *
     * @return note
     */
    @JsonProperty("note")
    public String getNote() {
        return note;
    }

    /**
     * Sets note.
     *
     * @param note the note
     */
    @JsonProperty("note")
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * Sets number.
     *
     * @param number the number
     * @return This {@link Number} instance.
     */
    public Number number(String number) {
        this.number = number;
        return this;
    }

    /**
     * Returns number.
     *
     * @return number
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * Sets number.
     *
     * @param number the number
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Sets numberKey.
     *
     * @param numberKey the number key
     * @return This {@link Number} instance.
     */
    public Number numberKey(String numberKey) {
        this.numberKey = numberKey;
        return this;
    }

    /**
     * Returns numberKey.
     *
     * @return numberKey
     */
    @JsonProperty("numberKey")
    public String getNumberKey() {
        return numberKey;
    }

    /**
     * Sets numberKey.
     *
     * @param numberKey the number key
     */
    @JsonProperty("numberKey")
    public void setNumberKey(String numberKey) {
        this.numberKey = numberKey;
    }

    /**
     * Sets price.
     *
     * @param price the price
     * @return This {@link Number} instance.
     */
    public Number price(Price price) {
        this.price = price;
        return this;
    }

    /**
     * Returns price.
     *
     * @return price
     */
    @JsonProperty("price")
    public Price getPrice() {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price the price
     */
    @JsonProperty("price")
    public void setPrice(Price price) {
        this.price = price;
    }

    /**
     * Sets shared.
     *
     * @param shared the shared flag
     * @return This {@link Number} instance.
     */
    public Number shared(boolean shared) {
        this.shared = shared;
        return this;
    }

    /**
     * Returns shared.
     *
     * @return shared
     */
    @JsonProperty("shared")
    public boolean isShared() {
        return shared;
    }

    /**
     * Sets shared.
     *
     * @param shared the shared flag
     */
    @JsonProperty("shared")
    public void setShared(boolean shared) {
        this.shared = shared;
    }

    /**
     * Sets type.
     *
     * @param type the type
     * @return This {@link Number} instance.
     */
    public Number type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }
}
