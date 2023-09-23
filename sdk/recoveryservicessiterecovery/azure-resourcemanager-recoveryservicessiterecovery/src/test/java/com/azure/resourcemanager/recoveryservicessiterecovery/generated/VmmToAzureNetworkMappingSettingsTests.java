// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.VmmToAzureNetworkMappingSettings;

public final class VmmToAzureNetworkMappingSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VmmToAzureNetworkMappingSettings model =
            BinaryData.fromString("{\"instanceType\":\"VmmToAzure\"}").toObject(VmmToAzureNetworkMappingSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VmmToAzureNetworkMappingSettings model = new VmmToAzureNetworkMappingSettings();
        model = BinaryData.fromObject(model).toObject(VmmToAzureNetworkMappingSettings.class);
    }
}