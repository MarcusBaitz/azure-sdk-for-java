// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Agent profile for the Fleet hub. */
@Fluent
public final class AgentProfile {
    /*
     * The ID of the subnet which the Fleet hub node will join on startup. If this is not specified, a vnet and subnet
     * will be generated and used.
     */
    @JsonProperty(value = "subnetId")
    private String subnetId;

    /** Creates an instance of AgentProfile class. */
    public AgentProfile() {
    }

    /**
     * Get the subnetId property: The ID of the subnet which the Fleet hub node will join on startup. If this is not
     * specified, a vnet and subnet will be generated and used.
     *
     * @return the subnetId value.
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Set the subnetId property: The ID of the subnet which the Fleet hub node will join on startup. If this is not
     * specified, a vnet and subnet will be generated and used.
     *
     * @param subnetId the subnetId value to set.
     * @return the AgentProfile object itself.
     */
    public AgentProfile withSubnetId(String subnetId) {
        this.subnetId = subnetId;
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