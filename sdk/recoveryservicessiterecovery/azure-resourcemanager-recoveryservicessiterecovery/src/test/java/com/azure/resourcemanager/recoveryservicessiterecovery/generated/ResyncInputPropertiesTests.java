// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ResyncInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ResyncProviderSpecificInput;

public final class ResyncInputPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResyncInputProperties model =
            BinaryData
                .fromString("{\"providerSpecificDetails\":{\"instanceType\":\"ResyncProviderSpecificInput\"}}")
                .toObject(ResyncInputProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResyncInputProperties model =
            new ResyncInputProperties().withProviderSpecificDetails(new ResyncProviderSpecificInput());
        model = BinaryData.fromObject(model).toObject(ResyncInputProperties.class);
    }
}