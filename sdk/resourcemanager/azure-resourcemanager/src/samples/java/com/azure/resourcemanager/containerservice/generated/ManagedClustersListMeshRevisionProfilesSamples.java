// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated;

/** Samples for ManagedClusters ListMeshRevisionProfiles. */
public final class ManagedClustersListMeshRevisionProfilesSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2023-08-01/examples/ManagedClustersList_MeshRevisionProfiles.json
     */
    /**
     * Sample code: List mesh revision profiles in a location.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listMeshRevisionProfilesInALocation(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .kubernetesClusters()
            .manager()
            .serviceClient()
            .getManagedClusters()
            .listMeshRevisionProfiles("location1", com.azure.core.util.Context.NONE);
    }
}