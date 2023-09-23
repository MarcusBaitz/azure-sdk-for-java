// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReverseReplicationProviderSpecificInput;

public final class ReverseReplicationProviderSpecificInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ReverseReplicationProviderSpecificInput model =
            BinaryData
                .fromString("{\"instanceType\":\"ReverseReplicationProviderSpecificInput\"}")
                .toObject(ReverseReplicationProviderSpecificInput.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ReverseReplicationProviderSpecificInput model = new ReverseReplicationProviderSpecificInput();
        model = BinaryData.fromObject(model).toObject(ReverseReplicationProviderSpecificInput.class);
    }
}