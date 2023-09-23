// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.DiscoverProtectableItemRequest;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.DiscoverProtectableItemRequestProperties;
import org.junit.jupiter.api.Assertions;

public final class DiscoverProtectableItemRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DiscoverProtectableItemRequest model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"friendlyName\":\"sxnkjzkdeslpvlo\",\"ipAddress\":\"i\",\"osType\":\"ghxpkdw\"}}")
                .toObject(DiscoverProtectableItemRequest.class);
        Assertions.assertEquals("sxnkjzkdeslpvlo", model.properties().friendlyName());
        Assertions.assertEquals("i", model.properties().ipAddress());
        Assertions.assertEquals("ghxpkdw", model.properties().osType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DiscoverProtectableItemRequest model =
            new DiscoverProtectableItemRequest()
                .withProperties(
                    new DiscoverProtectableItemRequestProperties()
                        .withFriendlyName("sxnkjzkdeslpvlo")
                        .withIpAddress("i")
                        .withOsType("ghxpkdw"));
        model = BinaryData.fromObject(model).toObject(DiscoverProtectableItemRequest.class);
        Assertions.assertEquals("sxnkjzkdeslpvlo", model.properties().friendlyName());
        Assertions.assertEquals("i", model.properties().ipAddress());
        Assertions.assertEquals("ghxpkdw", model.properties().osType());
    }
}