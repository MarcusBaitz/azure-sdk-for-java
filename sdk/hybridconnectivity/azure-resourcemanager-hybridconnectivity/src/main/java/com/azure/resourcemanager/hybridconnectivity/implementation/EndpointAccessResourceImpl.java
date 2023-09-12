// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridconnectivity.implementation;

import com.azure.resourcemanager.hybridconnectivity.fluent.models.EndpointAccessResourceInner;
import com.azure.resourcemanager.hybridconnectivity.models.EndpointAccessResource;

public final class EndpointAccessResourceImpl implements EndpointAccessResource {
    private EndpointAccessResourceInner innerObject;

    private final com.azure.resourcemanager.hybridconnectivity.HybridConnectivityManager serviceManager;

    EndpointAccessResourceImpl(
        EndpointAccessResourceInner innerObject,
        com.azure.resourcemanager.hybridconnectivity.HybridConnectivityManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String namespaceName() {
        return this.innerModel().namespaceName();
    }

    public String namespaceNameSuffix() {
        return this.innerModel().namespaceNameSuffix();
    }

    public String hybridConnectionName() {
        return this.innerModel().hybridConnectionName();
    }

    public String accessKey() {
        return this.innerModel().accessKey();
    }

    public Long expiresOn() {
        return this.innerModel().expiresOn();
    }

    public String serviceConfigurationToken() {
        return this.innerModel().serviceConfigurationToken();
    }

    public EndpointAccessResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybridconnectivity.HybridConnectivityManager manager() {
        return this.serviceManager;
    }
}