/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents NumbersSearchResponse model.
 */
public class NumbersSearchResponse {

    private List<NumbersAvailableNumber> numbers = null;

    /**
     * Sets numbers.
     * <p>
     * Field description:
     * List of available phone numbers.
     *
     * @param numbers
     * @return This {@link NumbersSearchResponse instance}.
     */
    public NumbersSearchResponse numbers(List<NumbersAvailableNumber> numbers) {
        this.numbers = numbers;
        return this;
    }

    /**
     * Adds and returns a new numbers.
     * <p>
     * Field description:
     * List of available phone numbers.
     *
     * @return This {@link NumbersSearchResponse instance}.
     */
    public NumbersSearchResponse addNumbersItem(NumbersAvailableNumber numbersItem) {
        if (this.numbers == null) {
            this.numbers = new ArrayList<>();
        }
        this.numbers.add(numbersItem);
        return this;
    }

    /**
     * Returns numbers.
     * <p>
     * Field description:
     * List of available phone numbers.
     *
     * @return numbers
     */
    @JsonProperty("numbers")
    public List<NumbersAvailableNumber> getNumbers() {
        return numbers;
    }

    /**
     * Sets numbers.
     * <p>
     * Field description:
     * List of available phone numbers.
     *
     * @param numbers
     */
    @JsonProperty("numbers")
    public void setNumbers(List<NumbersAvailableNumber> numbers) {
        this.numbers = numbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersSearchResponse numbersSearchResponse = (NumbersSearchResponse) o;
        return Objects.equals(this.numbers, numbersSearchResponse.numbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numbers);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersSearchResponse {")
                .append(newLine)
                .append("    numbers: ")
                .append(toIndentedString(numbers))
                .append(newLine)
                .append("}")
                .toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        String lineSeparator = System.lineSeparator();
        String lineSeparatorFollowedByIndentation = lineSeparator + "    ";
        return o.toString().replace(lineSeparator, lineSeparatorFollowedByIndentation);
    }
}

