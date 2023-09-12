// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The health of the auth credential. */
@Fluent
public final class CredentialHealth {
    /*
     * The health status of credential.
     */
    @JsonProperty(value = "status")
    private CredentialHealthStatus status;

    /*
     * Error code representing the health check error.
     */
    @JsonProperty(value = "errorCode")
    private String errorCode;

    /*
     * Descriptive message representing the health check error.
     */
    @JsonProperty(value = "errorMessage")
    private String errorMessage;

    /** Creates an instance of CredentialHealth class. */
    public CredentialHealth() {
    }

    /**
     * Get the status property: The health status of credential.
     *
     * @return the status value.
     */
    public CredentialHealthStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The health status of credential.
     *
     * @param status the status value to set.
     * @return the CredentialHealth object itself.
     */
    public CredentialHealth withStatus(CredentialHealthStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the errorCode property: Error code representing the health check error.
     *
     * @return the errorCode value.
     */
    public String errorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: Error code representing the health check error.
     *
     * @param errorCode the errorCode value to set.
     * @return the CredentialHealth object itself.
     */
    public CredentialHealth withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get the errorMessage property: Descriptive message representing the health check error.
     *
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Set the errorMessage property: Descriptive message representing the health check error.
     *
     * @param errorMessage the errorMessage value to set.
     * @return the CredentialHealth object itself.
     */
    public CredentialHealth withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
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