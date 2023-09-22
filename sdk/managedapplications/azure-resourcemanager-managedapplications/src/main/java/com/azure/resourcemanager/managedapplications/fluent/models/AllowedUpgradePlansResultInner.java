// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.managedapplications.models.Plan;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The array of plan. */
@Fluent
public final class AllowedUpgradePlansResultInner {
    /*
     * The array of plans.
     */
    @JsonProperty(value = "value")
    private List<Plan> value;

    /** Creates an instance of AllowedUpgradePlansResultInner class. */
    public AllowedUpgradePlansResultInner() {
    }

    /**
     * Get the value property: The array of plans.
     *
     * @return the value value.
     */
    public List<Plan> value() {
        return this.value;
    }

    /**
     * Set the value property: The array of plans.
     *
     * @param value the value value to set.
     * @return the AllowedUpgradePlansResultInner object itself.
     */
    public AllowedUpgradePlansResultInner withValue(List<Plan> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}