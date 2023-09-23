// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.FabricSpecificCreateNetworkMappingInput;

public final class FabricSpecificCreateNetworkMappingInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FabricSpecificCreateNetworkMappingInput model =
            BinaryData
                .fromString("{\"instanceType\":\"FabricSpecificCreateNetworkMappingInput\"}")
                .toObject(FabricSpecificCreateNetworkMappingInput.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FabricSpecificCreateNetworkMappingInput model = new FabricSpecificCreateNetworkMappingInput();
        model = BinaryData.fromObject(model).toObject(FabricSpecificCreateNetworkMappingInput.class);
    }
}