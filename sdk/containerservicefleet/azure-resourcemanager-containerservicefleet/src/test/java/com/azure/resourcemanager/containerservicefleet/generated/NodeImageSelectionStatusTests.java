// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.containerservicefleet.models.NodeImageSelectionStatus;

public final class NodeImageSelectionStatusTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NodeImageSelectionStatus model =
            BinaryData
                .fromString("{\"selectedNodeImageVersions\":[{\"version\":\"btfhvpesaps\"}]}")
                .toObject(NodeImageSelectionStatus.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NodeImageSelectionStatus model = new NodeImageSelectionStatus();
        model = BinaryData.fromObject(model).toObject(NodeImageSelectionStatus.class);
    }
}