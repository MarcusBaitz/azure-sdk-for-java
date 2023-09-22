// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Managed application locking policy. */
@Fluent
public final class ApplicationPackageLockingPolicyDefinition {
    /*
     * The deny assignment excluded actions.
     */
    @JsonProperty(value = "allowedActions")
    private List<String> allowedActions;

    /*
     * The deny assignment excluded data actions.
     */
    @JsonProperty(value = "allowedDataActions")
    private List<String> allowedDataActions;

    /** Creates an instance of ApplicationPackageLockingPolicyDefinition class. */
    public ApplicationPackageLockingPolicyDefinition() {
    }

    /**
     * Get the allowedActions property: The deny assignment excluded actions.
     *
     * @return the allowedActions value.
     */
    public List<String> allowedActions() {
        return this.allowedActions;
    }

    /**
     * Set the allowedActions property: The deny assignment excluded actions.
     *
     * @param allowedActions the allowedActions value to set.
     * @return the ApplicationPackageLockingPolicyDefinition object itself.
     */
    public ApplicationPackageLockingPolicyDefinition withAllowedActions(List<String> allowedActions) {
        this.allowedActions = allowedActions;
        return this;
    }

    /**
     * Get the allowedDataActions property: The deny assignment excluded data actions.
     *
     * @return the allowedDataActions value.
     */
    public List<String> allowedDataActions() {
        return this.allowedDataActions;
    }

    /**
     * Set the allowedDataActions property: The deny assignment excluded data actions.
     *
     * @param allowedDataActions the allowedDataActions value to set.
     * @return the ApplicationPackageLockingPolicyDefinition object itself.
     */
    public ApplicationPackageLockingPolicyDefinition withAllowedDataActions(List<String> allowedDataActions) {
        this.allowedDataActions = allowedDataActions;
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