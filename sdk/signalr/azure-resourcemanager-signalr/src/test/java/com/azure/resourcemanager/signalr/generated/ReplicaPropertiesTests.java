// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.signalr.fluent.models.ReplicaProperties;

public final class ReplicaPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ReplicaProperties model =
            BinaryData.fromString("{\"provisioningState\":\"Succeeded\"}").toObject(ReplicaProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ReplicaProperties model = new ReplicaProperties();
        model = BinaryData.fromObject(model).toObject(ReplicaProperties.class);
    }
}