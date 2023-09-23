// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ExtendedLocation;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ExtendedLocationType;
import org.junit.jupiter.api.Assertions;

public final class ExtendedLocationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExtendedLocation model =
            BinaryData.fromString("{\"name\":\"moenodnaien\",\"type\":\"EdgeZone\"}").toObject(ExtendedLocation.class);
        Assertions.assertEquals("moenodnaien", model.name());
        Assertions.assertEquals(ExtendedLocationType.EDGE_ZONE, model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExtendedLocation model =
            new ExtendedLocation().withName("moenodnaien").withType(ExtendedLocationType.EDGE_ZONE);
        model = BinaryData.fromObject(model).toObject(ExtendedLocation.class);
        Assertions.assertEquals("moenodnaien", model.name());
        Assertions.assertEquals(ExtendedLocationType.EDGE_ZONE, model.type());
    }
}