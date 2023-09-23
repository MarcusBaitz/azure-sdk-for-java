// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** VMwareCbt security profile input. */
@Fluent
public final class VMwareCbtSecurityProfileProperties {
    /*
     * The target VM security type.
     */
    @JsonProperty(value = "targetVmSecurityType")
    private SecurityType targetVmSecurityType;

    /*
     * A value indicating whether secure boot to be enabled.
     */
    @JsonProperty(value = "isTargetVmSecureBootEnabled")
    private String isTargetVmSecureBootEnabled;

    /*
     * A value indicating whether trusted platform module to be enabled.
     */
    @JsonProperty(value = "isTargetVmTpmEnabled")
    private String isTargetVmTpmEnabled;

    /*
     * A value indicating whether integrity monitoring to be enabled.
     */
    @JsonProperty(value = "isTargetVmIntegrityMonitoringEnabled")
    private String isTargetVmIntegrityMonitoringEnabled;

    /*
     * A value indicating whether confidential compute encryption to be enabled.
     */
    @JsonProperty(value = "isTargetVmConfidentialEncryptionEnabled")
    private String isTargetVmConfidentialEncryptionEnabled;

    /** Creates an instance of VMwareCbtSecurityProfileProperties class. */
    public VMwareCbtSecurityProfileProperties() {
    }

    /**
     * Get the targetVmSecurityType property: The target VM security type.
     *
     * @return the targetVmSecurityType value.
     */
    public SecurityType targetVmSecurityType() {
        return this.targetVmSecurityType;
    }

    /**
     * Set the targetVmSecurityType property: The target VM security type.
     *
     * @param targetVmSecurityType the targetVmSecurityType value to set.
     * @return the VMwareCbtSecurityProfileProperties object itself.
     */
    public VMwareCbtSecurityProfileProperties withTargetVmSecurityType(SecurityType targetVmSecurityType) {
        this.targetVmSecurityType = targetVmSecurityType;
        return this;
    }

    /**
     * Get the isTargetVmSecureBootEnabled property: A value indicating whether secure boot to be enabled.
     *
     * @return the isTargetVmSecureBootEnabled value.
     */
    public String isTargetVmSecureBootEnabled() {
        return this.isTargetVmSecureBootEnabled;
    }

    /**
     * Set the isTargetVmSecureBootEnabled property: A value indicating whether secure boot to be enabled.
     *
     * @param isTargetVmSecureBootEnabled the isTargetVmSecureBootEnabled value to set.
     * @return the VMwareCbtSecurityProfileProperties object itself.
     */
    public VMwareCbtSecurityProfileProperties withIsTargetVmSecureBootEnabled(String isTargetVmSecureBootEnabled) {
        this.isTargetVmSecureBootEnabled = isTargetVmSecureBootEnabled;
        return this;
    }

    /**
     * Get the isTargetVmTpmEnabled property: A value indicating whether trusted platform module to be enabled.
     *
     * @return the isTargetVmTpmEnabled value.
     */
    public String isTargetVmTpmEnabled() {
        return this.isTargetVmTpmEnabled;
    }

    /**
     * Set the isTargetVmTpmEnabled property: A value indicating whether trusted platform module to be enabled.
     *
     * @param isTargetVmTpmEnabled the isTargetVmTpmEnabled value to set.
     * @return the VMwareCbtSecurityProfileProperties object itself.
     */
    public VMwareCbtSecurityProfileProperties withIsTargetVmTpmEnabled(String isTargetVmTpmEnabled) {
        this.isTargetVmTpmEnabled = isTargetVmTpmEnabled;
        return this;
    }

    /**
     * Get the isTargetVmIntegrityMonitoringEnabled property: A value indicating whether integrity monitoring to be
     * enabled.
     *
     * @return the isTargetVmIntegrityMonitoringEnabled value.
     */
    public String isTargetVmIntegrityMonitoringEnabled() {
        return this.isTargetVmIntegrityMonitoringEnabled;
    }

    /**
     * Set the isTargetVmIntegrityMonitoringEnabled property: A value indicating whether integrity monitoring to be
     * enabled.
     *
     * @param isTargetVmIntegrityMonitoringEnabled the isTargetVmIntegrityMonitoringEnabled value to set.
     * @return the VMwareCbtSecurityProfileProperties object itself.
     */
    public VMwareCbtSecurityProfileProperties withIsTargetVmIntegrityMonitoringEnabled(
        String isTargetVmIntegrityMonitoringEnabled) {
        this.isTargetVmIntegrityMonitoringEnabled = isTargetVmIntegrityMonitoringEnabled;
        return this;
    }

    /**
     * Get the isTargetVmConfidentialEncryptionEnabled property: A value indicating whether confidential compute
     * encryption to be enabled.
     *
     * @return the isTargetVmConfidentialEncryptionEnabled value.
     */
    public String isTargetVmConfidentialEncryptionEnabled() {
        return this.isTargetVmConfidentialEncryptionEnabled;
    }

    /**
     * Set the isTargetVmConfidentialEncryptionEnabled property: A value indicating whether confidential compute
     * encryption to be enabled.
     *
     * @param isTargetVmConfidentialEncryptionEnabled the isTargetVmConfidentialEncryptionEnabled value to set.
     * @return the VMwareCbtSecurityProfileProperties object itself.
     */
    public VMwareCbtSecurityProfileProperties withIsTargetVmConfidentialEncryptionEnabled(
        String isTargetVmConfidentialEncryptionEnabled) {
        this.isTargetVmConfidentialEncryptionEnabled = isTargetVmConfidentialEncryptionEnabled;
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