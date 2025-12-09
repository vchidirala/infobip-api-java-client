package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class GetAvailableNumbersResponse {
    private int numberCount;
    private List<AvailableNumber> numbers;

    /**
     * Sets numbers.
     *
     * @param numbers the numbers list
     * @return This {@link GetAvailableNumbersResponse} instance.
     */
    public GetAvailableNumbersResponse numbers(List<AvailableNumber> numbers) {
        this.numbers = numbers;
        return this;
    }

    /**
     * Returns numbers.
     *
     * @return numbers
     */
    @JsonProperty("numbers")
    public List<AvailableNumber> getNumbers() {
        return numbers;
    }

    /**
     * Sets numbers.
     *
     * @param numbers the numbers list
     */
    @JsonProperty("numbers")
    public void setNumbers(List<AvailableNumber> numbers) {
        this.numbers = numbers;
    }

    /**
     * Sets numberCount.
     *
     * @param numberCount the number count
     * @return This {@link GetAvailableNumbersResponse} instance.
     */
    public GetAvailableNumbersResponse numberCount(int numberCount) {
        this.numberCount = numberCount;
        return this;
    }
    /**
     * Returns numberCount.
     *
     * @return numberCount
     */
    @JsonProperty("numberCount")
    public int getNumberCount() {
        return numberCount;
    }
    /**
     * Sets numberCount.
     *
     * @param numberCount the number count
     */
    @JsonProperty("numberCount")
    public void setNumberCount(int numberCount) {
        this.numberCount = numberCount;
    }
}
