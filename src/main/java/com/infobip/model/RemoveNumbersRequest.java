package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RemoveNumbersRequest {
    private java.util.List<String> numberKeys;
    private java.util.List<String> numbers;

    /**
     * Sets numberKeys.
     *
     * @param numberKeys the list of number keys
     * @return This {@link RemoveNumbersRequest} instance.
     */
    public RemoveNumbersRequest numberKeys(java.util.List<String> numberKeys) {
        this.numberKeys = numberKeys;
        return this;
    }

    /**
     * Returns numberKeys.
     *
     * @return numberKeys
     */
    @JsonProperty("numberKeys")
    public java.util.List<String> getNumberKeys() {
        return numberKeys;
    }

    /**
     * Sets numberKeys.
     *
     * @param numberKeys the list of number keys
     */
    @JsonProperty("numberKeys")
    public void setNumberKeys(java.util.List<String> numberKeys) {
        this.numberKeys = numberKeys;
    }

    /**
     * Sets numbers.
     *
     * @param numbers the list of numbers
     * @return This {@link RemoveNumbersRequest} instance.
     */
    public RemoveNumbersRequest numbers(java.util.List<String> numbers) {
        this.numbers = numbers;
        return this;
    }

    /**
     * Returns numbers.
     *
     * @return numbers
     */
    @JsonProperty("numbers")
    public java.util.List<String> getNumbers() {
        return numbers;
    }

    /**
     * Sets numbers.
     *
     * @param numbers the list of numbers
     */
    @JsonProperty("numbers")
    public void setNumbers(java.util.List<String> numbers) {
        this.numbers = numbers;
    }
}
