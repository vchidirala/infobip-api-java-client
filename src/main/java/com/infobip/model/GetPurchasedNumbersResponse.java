package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class GetPurchasedNumbersResponse {
    private int numberCount;
    private List<Number> numbers;

    /**
     * Sets numberCount.
     *
     * @param numberCount the number count
     * @return This {@link GetPurchasedNumbersResponse} instance.
     */
    public GetPurchasedNumbersResponse numberCount(int numberCount) {
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

    /**
     * Sets numbers.
     *
     * @param numbers the numbers list
     * @return This {@link GetPurchasedNumbersResponse} instance.
     */
    public GetPurchasedNumbersResponse numbers(List<Number> numbers) {
        this.numbers = numbers;
        return this;
    }

    /**
     * Returns numbers.
     *
     * @return numbers
     */
    @JsonProperty("numbers")
    public List<Number> getNumbers() {
        return numbers;
    }

    /**
     * Sets numbers.
     *
     * @param numbers the numbers list
     */
    @JsonProperty("numbers")
    public void setNumbers(List<Number> numbers) {
        this.numbers = numbers;
    }
}
