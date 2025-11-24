package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class AddNumbersRequest {

    private List<String> numberKeys;
    private List<String> numbers;
    /**
     * Sets numberKeys.
     *
     * @param numberKeys the number keys
     * @return This {@link AddNumbersRequest} instance.
     */
    public AddNumbersRequest numberKeys(List<String> numberKeys) {
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
     * @param numberKeys the number keys
     */
    @JsonProperty("numberKeys")
    public void setNumberKeys(List<String> numberKeys) {
        this.numberKeys = numberKeys;
    }

    /**
     * Sets numbers.
     *
     * @param numbers the numbers
     * @return This {@link AddNumbersRequest} instance.
     */
    public AddNumbersRequest numbers(List<String> numbers) {
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
     * @param numbers the numbers
     */
    @JsonProperty("numbers")
    public void setNumbers(List<String> numbers) {
        this.numbers = numbers;
    }

    /**
     * All-args constructor.
     *
     * @param numberKeys the number keys
     * @param numbers the numbers
     */
    public AddNumbersRequest(List<String> numberKeys, List<String> numbers) {
        this.numberKeys = numberKeys;
        this.numbers = numbers;
    }

    /**
     * No-args constructor.
     */
    public AddNumbersRequest() {}
}
