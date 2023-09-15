// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.generated;

/** Samples for AccessPolicy List. */
public final class AccessPolicyListSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/stable/2023-08-01/examples/RedisCacheAccessPolicyList.json
     */
    /**
     * Sample code: RedisCacheAccessPolicyList.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void redisCacheAccessPolicyList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .redisCaches()
            .manager()
            .serviceClient()
            .getAccessPolicies()
            .list("rg1", "cache1", com.azure.core.util.Context.NONE);
    }
}