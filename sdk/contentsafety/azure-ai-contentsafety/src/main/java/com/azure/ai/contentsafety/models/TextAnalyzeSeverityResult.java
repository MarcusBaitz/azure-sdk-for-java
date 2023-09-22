// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.contentsafety.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Text analysis result. */
@Immutable
public final class TextAnalyzeSeverityResult {
    /*
     * The text category.
     */
    @Generated
    @JsonProperty(value = "category")
    private TextCategory category;

    /*
     * The higher the severity of input content, the larger this value is. The values could be: 0,2,4,6.
     */
    @Generated
    @JsonProperty(value = "severity")
    private int severity;

    /**
     * Creates an instance of TextAnalyzeSeverityResult class.
     *
     * @param category the category value to set.
     * @param severity the severity value to set.
     */
    @Generated
    @JsonCreator
    private TextAnalyzeSeverityResult(
            @JsonProperty(value = "category") TextCategory category, @JsonProperty(value = "severity") int severity) {
        this.category = category;
        this.severity = severity;
    }

    /**
     * Get the category property: The text category.
     *
     * @return the category value.
     */
    @Generated
    public TextCategory getCategory() {
        return this.category;
    }

    /**
     * Get the severity property: The higher the severity of input content, the larger this value is. The values could
     * be: 0,2,4,6.
     *
     * @return the severity value.
     */
    @Generated
    public int getSeverity() {
        return this.severity;
    }
}