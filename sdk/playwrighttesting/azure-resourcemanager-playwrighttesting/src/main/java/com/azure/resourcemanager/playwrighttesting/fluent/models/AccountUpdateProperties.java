// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.playwrighttesting.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.playwrighttesting.models.EnablementStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The updatable properties of the Account. */
@Fluent
public final class AccountUpdateProperties {
    /*
     * This property sets the connection region for Playwright client workers to cloud-hosted browsers. If enabled,
     * workers connect to browsers in the closest Azure region, ensuring lower latency. If disabled, workers connect to
     * browsers in the Azure region in which the workspace was initially created.
     */
    @JsonProperty(value = "regionalAffinity")
    private EnablementStatus regionalAffinity;

    /*
     * When enabled, Playwright client workers can connect to cloud-hosted browsers. This can increase the number of
     * parallel workers for a test run, significantly minimizing test completion durations.
     */
    @JsonProperty(value = "scalableExecution")
    private EnablementStatus scalableExecution;

    /*
     * When enabled, this feature allows the workspace to upload and display test results, including artifacts like
     * traces and screenshots, in the Playwright portal. This enables faster and more efficient troubleshooting.
     */
    @JsonProperty(value = "reporting")
    private EnablementStatus reporting;

    /** Creates an instance of AccountUpdateProperties class. */
    public AccountUpdateProperties() {
    }

    /**
     * Get the regionalAffinity property: This property sets the connection region for Playwright client workers to
     * cloud-hosted browsers. If enabled, workers connect to browsers in the closest Azure region, ensuring lower
     * latency. If disabled, workers connect to browsers in the Azure region in which the workspace was initially
     * created.
     *
     * @return the regionalAffinity value.
     */
    public EnablementStatus regionalAffinity() {
        return this.regionalAffinity;
    }

    /**
     * Set the regionalAffinity property: This property sets the connection region for Playwright client workers to
     * cloud-hosted browsers. If enabled, workers connect to browsers in the closest Azure region, ensuring lower
     * latency. If disabled, workers connect to browsers in the Azure region in which the workspace was initially
     * created.
     *
     * @param regionalAffinity the regionalAffinity value to set.
     * @return the AccountUpdateProperties object itself.
     */
    public AccountUpdateProperties withRegionalAffinity(EnablementStatus regionalAffinity) {
        this.regionalAffinity = regionalAffinity;
        return this;
    }

    /**
     * Get the scalableExecution property: When enabled, Playwright client workers can connect to cloud-hosted browsers.
     * This can increase the number of parallel workers for a test run, significantly minimizing test completion
     * durations.
     *
     * @return the scalableExecution value.
     */
    public EnablementStatus scalableExecution() {
        return this.scalableExecution;
    }

    /**
     * Set the scalableExecution property: When enabled, Playwright client workers can connect to cloud-hosted browsers.
     * This can increase the number of parallel workers for a test run, significantly minimizing test completion
     * durations.
     *
     * @param scalableExecution the scalableExecution value to set.
     * @return the AccountUpdateProperties object itself.
     */
    public AccountUpdateProperties withScalableExecution(EnablementStatus scalableExecution) {
        this.scalableExecution = scalableExecution;
        return this;
    }

    /**
     * Get the reporting property: When enabled, this feature allows the workspace to upload and display test results,
     * including artifacts like traces and screenshots, in the Playwright portal. This enables faster and more efficient
     * troubleshooting.
     *
     * @return the reporting value.
     */
    public EnablementStatus reporting() {
        return this.reporting;
    }

    /**
     * Set the reporting property: When enabled, this feature allows the workspace to upload and display test results,
     * including artifacts like traces and screenshots, in the Playwright portal. This enables faster and more efficient
     * troubleshooting.
     *
     * @param reporting the reporting value to set.
     * @return the AccountUpdateProperties object itself.
     */
    public AccountUpdateProperties withReporting(EnablementStatus reporting) {
        this.reporting = reporting;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}