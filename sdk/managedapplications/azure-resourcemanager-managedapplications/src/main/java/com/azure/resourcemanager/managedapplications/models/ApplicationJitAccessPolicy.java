// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Managed application Jit access policy. */
@Fluent
public final class ApplicationJitAccessPolicy {
    /*
     * Whether the JIT access is enabled.
     */
    @JsonProperty(value = "jitAccessEnabled", required = true)
    private boolean jitAccessEnabled;

    /*
     * JIT approval mode.
     */
    @JsonProperty(value = "jitApprovalMode")
    private JitApprovalMode jitApprovalMode;

    /*
     * The JIT approvers
     */
    @JsonProperty(value = "jitApprovers")
    private List<JitApproverDefinition> jitApprovers;

    /*
     * The maximum duration JIT access is granted. This is an ISO8601 time period value.
     */
    @JsonProperty(value = "maximumJitAccessDuration")
    private String maximumJitAccessDuration;

    /** Creates an instance of ApplicationJitAccessPolicy class. */
    public ApplicationJitAccessPolicy() {
    }

    /**
     * Get the jitAccessEnabled property: Whether the JIT access is enabled.
     *
     * @return the jitAccessEnabled value.
     */
    public boolean jitAccessEnabled() {
        return this.jitAccessEnabled;
    }

    /**
     * Set the jitAccessEnabled property: Whether the JIT access is enabled.
     *
     * @param jitAccessEnabled the jitAccessEnabled value to set.
     * @return the ApplicationJitAccessPolicy object itself.
     */
    public ApplicationJitAccessPolicy withJitAccessEnabled(boolean jitAccessEnabled) {
        this.jitAccessEnabled = jitAccessEnabled;
        return this;
    }

    /**
     * Get the jitApprovalMode property: JIT approval mode.
     *
     * @return the jitApprovalMode value.
     */
    public JitApprovalMode jitApprovalMode() {
        return this.jitApprovalMode;
    }

    /**
     * Set the jitApprovalMode property: JIT approval mode.
     *
     * @param jitApprovalMode the jitApprovalMode value to set.
     * @return the ApplicationJitAccessPolicy object itself.
     */
    public ApplicationJitAccessPolicy withJitApprovalMode(JitApprovalMode jitApprovalMode) {
        this.jitApprovalMode = jitApprovalMode;
        return this;
    }

    /**
     * Get the jitApprovers property: The JIT approvers.
     *
     * @return the jitApprovers value.
     */
    public List<JitApproverDefinition> jitApprovers() {
        return this.jitApprovers;
    }

    /**
     * Set the jitApprovers property: The JIT approvers.
     *
     * @param jitApprovers the jitApprovers value to set.
     * @return the ApplicationJitAccessPolicy object itself.
     */
    public ApplicationJitAccessPolicy withJitApprovers(List<JitApproverDefinition> jitApprovers) {
        this.jitApprovers = jitApprovers;
        return this;
    }

    /**
     * Get the maximumJitAccessDuration property: The maximum duration JIT access is granted. This is an ISO8601 time
     * period value.
     *
     * @return the maximumJitAccessDuration value.
     */
    public String maximumJitAccessDuration() {
        return this.maximumJitAccessDuration;
    }

    /**
     * Set the maximumJitAccessDuration property: The maximum duration JIT access is granted. This is an ISO8601 time
     * period value.
     *
     * @param maximumJitAccessDuration the maximumJitAccessDuration value to set.
     * @return the ApplicationJitAccessPolicy object itself.
     */
    public ApplicationJitAccessPolicy withMaximumJitAccessDuration(String maximumJitAccessDuration) {
        this.maximumJitAccessDuration = maximumJitAccessDuration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (jitApprovers() != null) {
            jitApprovers().forEach(e -> e.validate());
        }
    }
}