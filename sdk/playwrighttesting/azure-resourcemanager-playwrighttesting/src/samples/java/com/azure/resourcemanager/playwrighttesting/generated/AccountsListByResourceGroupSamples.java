// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.playwrighttesting.generated;

/** Samples for Accounts ListByResourceGroup. */
public final class AccountsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/playwrighttesting/resource-manager/Microsoft.AzurePlaywrightService/preview/2023-10-01-preview/examples/Accounts_ListByResourceGroup.json
     */
    /**
     * Sample code: Accounts_ListByResourceGroup.
     *
     * @param manager Entry point to PlaywrightTestingManager.
     */
    public static void accountsListByResourceGroup(
        com.azure.resourcemanager.playwrighttesting.PlaywrightTestingManager manager) {
        manager.accounts().listByResourceGroup("dummyrg", com.azure.core.util.Context.NONE);
    }
}