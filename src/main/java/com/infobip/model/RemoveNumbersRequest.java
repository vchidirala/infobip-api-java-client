package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class RemoveNumbersRequest {
    private List<String> numberKeys;
    private List<String> numbers;

    /**
     * Sets numberKeys.
     *
     * @param numberKeys the list of number keys
     * @return This {@link RemoveNumbersRequest} instance.
     */
    public RemoveNumbersRequest numberKeys(List<String> numberKeys) {
        this.numberKeys = numberKeys;
        return this;
    }

    /**
     * Returns numberKeys.
     *
     * @return numberKeys
     */
    @JsonProperty("numberKeys")
    public List<String> getNumberKeys() {
        return numberKeys;
    }

    /**
     * Sets numberKeys.
     *
     * @param numberKeys the list of number keys
     */
    @JsonProperty("numberKeys")
    public void setNumberKeys(List<String> numberKeys) {
        this.numberKeys = numberKeys;
    }

    /**
     * Sets numbers.
     *
     * @param numbers the list of numbers
     * @return This {@link RemoveNumbersRequest} instance.
     */
    public RemoveNumbersRequest numbers(List<String> numbers) {
        this.numbers = numbers;
        return this;
    }

    /**
     * Returns numbers.
     *
     * @return numbers
     */
    @JsonProperty("numbers")
    public List<String> getNumbers() {
        return numbers;
    }

    /**
     * Sets numbers.
     *
     * @param numbers the list of numbers
     */
    @JsonProperty("numbers")
    public void setNumbers(List<String> numbers) {
        this.numbers = numbers;
    }
}
