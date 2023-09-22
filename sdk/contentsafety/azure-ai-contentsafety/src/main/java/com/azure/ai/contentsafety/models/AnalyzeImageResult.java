// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.contentsafety.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The analysis response of the image. */
@Immutable
public final class AnalyzeImageResult {
    /*
     * Analysis result for Hate category.
     */
    @Generated
    @JsonProperty(value = "hateResult")
    private ImageAnalyzeSeverityResult hateResult;

    /*
     * Analysis result for SelfHarm category.
     */
    @Generated
    @JsonProperty(value = "selfHarmResult")
    private ImageAnalyzeSeverityResult selfHarmResult;

    /*
     * Analysis result for Sexual category.
     */
    @Generated
    @JsonProperty(value = "sexualResult")
    private ImageAnalyzeSeverityResult sexualResult;

    /*
     * Analysis result for Violence category.
     */
    @Generated
    @JsonProperty(value = "violenceResult")
    private ImageAnalyzeSeverityResult violenceResult;

    /** Creates an instance of AnalyzeImageResult class. */
    @Generated
    private AnalyzeImageResult() {}

    /**
     * Get the hateResult property: Analysis result for Hate category.
     *
     * @return the hateResult value.
     */
    @Generated
    public ImageAnalyzeSeverityResult getHateResult() {
        return this.hateResult;
    }

    /**
     * Get the selfHarmResult property: Analysis result for SelfHarm category.
     *
     * @return the selfHarmResult value.
     */
    @Generated
    public ImageAnalyzeSeverityResult getSelfHarmResult() {
        return this.selfHarmResult;
    }

    /**
     * Get the sexualResult property: Analysis result for Sexual category.
     *
     * @return the sexualResult value.
     */
    @Generated
    public ImageAnalyzeSeverityResult getSexualResult() {
        return this.sexualResult;
    }

    /**
     * Get the violenceResult property: Analysis result for Violence category.
     *
     * @return the violenceResult value.
     */
    @Generated
    public ImageAnalyzeSeverityResult getViolenceResult() {
        return this.violenceResult;
    }
}