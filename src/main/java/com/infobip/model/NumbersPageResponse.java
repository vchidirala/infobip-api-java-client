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
 * Represents NumbersPageResponse model.
 */
public class NumbersPageResponse {

    private List<NumbersConfigurationResponse> results = null;

    private Integer page;

    private Integer pageSize;

    private Integer totalResults;

    /**
     * Sets results.
     * <p>
     * Field description:
     * List of number configurations.
     *
     * @param results
     * @return This {@link NumbersPageResponse instance}.
     */
    public NumbersPageResponse results(List<NumbersConfigurationResponse> results) {
        this.results = results;
        return this;
    }

    /**
     * Adds and returns a new results.
     * <p>
     * Field description:
     * List of number configurations.
     *
     * @return This {@link NumbersPageResponse instance}.
     */
    public NumbersPageResponse addResultsItem(NumbersConfigurationResponse resultsItem) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(resultsItem);
        return this;
    }

    /**
     * Returns results.
     * <p>
     * Field description:
     * List of number configurations.
     *
     * @return results
     */
    @JsonProperty("results")
    public List<NumbersConfigurationResponse> getResults() {
        return results;
    }

    /**
     * Sets results.
     * <p>
     * Field description:
     * List of number configurations.
     *
     * @param results
     */
    @JsonProperty("results")
    public void setResults(List<NumbersConfigurationResponse> results) {
        this.results = results;
    }

    /**
     * Sets page.
     * <p>
     * Field description:
     * Current page number.
     *
     * @param page
     * @return This {@link NumbersPageResponse instance}.
     */
    public NumbersPageResponse page(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * Returns page.
     * <p>
     * Field description:
     * Current page number.
     *
     * @return page
     */
    @JsonProperty("page")
    public Integer getPage() {
        return page;
    }

    /**
     * Sets page.
     * <p>
     * Field description:
     * Current page number.
     *
     * @param page
     */
    @JsonProperty("page")
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * Sets pageSize.
     * <p>
     * Field description:
     * Number of results per page.
     *
     * @param pageSize
     * @return This {@link NumbersPageResponse instance}.
     */
    public NumbersPageResponse pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * Returns pageSize.
     * <p>
     * Field description:
     * Number of results per page.
     *
     * @return pageSize
     */
    @JsonProperty("pageSize")
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * Sets pageSize.
     * <p>
     * Field description:
     * Number of results per page.
     *
     * @param pageSize
     */
    @JsonProperty("pageSize")
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * Sets totalResults.
     * <p>
     * Field description:
     * Total number of results available.
     *
     * @param totalResults
     * @return This {@link NumbersPageResponse instance}.
     */
    public NumbersPageResponse totalResults(Integer totalResults) {
        this.totalResults = totalResults;
        return this;
    }

    /**
     * Returns totalResults.
     * <p>
     * Field description:
     * Total number of results available.
     *
     * @return totalResults
     */
    @JsonProperty("totalResults")
    public Integer getTotalResults() {
        return totalResults;
    }

    /**
     * Sets totalResults.
     * <p>
     * Field description:
     * Total number of results available.
     *
     * @param totalResults
     */
    @JsonProperty("totalResults")
    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersPageResponse numbersPageResponse = (NumbersPageResponse) o;
        return Objects.equals(this.results, numbersPageResponse.results)
                && Objects.equals(this.page, numbersPageResponse.page)
                && Objects.equals(this.pageSize, numbersPageResponse.pageSize)
                && Objects.equals(this.totalResults, numbersPageResponse.totalResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(results, page, pageSize, totalResults);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersPageResponse {")
                .append(newLine)
                .append("    results: ")
                .append(toIndentedString(results))
                .append(newLine)
                .append("    page: ")
                .append(toIndentedString(page))
                .append(newLine)
                .append("    pageSize: ")
                .append(toIndentedString(pageSize))
                .append(newLine)
                .append("    totalResults: ")
                .append(toIndentedString(totalResults))
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

