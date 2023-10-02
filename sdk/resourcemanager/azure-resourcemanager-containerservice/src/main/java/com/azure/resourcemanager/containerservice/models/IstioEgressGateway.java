// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Istio egress gateway configuration. */
@Fluent
public final class IstioEgressGateway {
    /*
     * Whether to enable the egress gateway.
     */
    @JsonProperty(value = "enabled", required = true)
    private boolean enabled;

    /*
     * NodeSelector for scheduling the egress gateway.
     */
    @JsonProperty(value = "nodeSelector")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> nodeSelector;

    /** Creates an instance of IstioEgressGateway class. */
    public IstioEgressGateway() {
    }

    /**
     * Get the enabled property: Whether to enable the egress gateway.
     *
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Whether to enable the egress gateway.
     *
     * @param enabled the enabled value to set.
     * @return the IstioEgressGateway object itself.
     */
    public IstioEgressGateway withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the nodeSelector property: NodeSelector for scheduling the egress gateway.
     *
     * @return the nodeSelector value.
     */
    public Map<String, String> nodeSelector() {
        return this.nodeSelector;
    }

    /**
     * Set the nodeSelector property: NodeSelector for scheduling the egress gateway.
     *
     * @param nodeSelector the nodeSelector value to set.
     * @return the IstioEgressGateway object itself.
     */
    public IstioEgressGateway withNodeSelector(Map<String, String> nodeSelector) {
        this.nodeSelector = nodeSelector;
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