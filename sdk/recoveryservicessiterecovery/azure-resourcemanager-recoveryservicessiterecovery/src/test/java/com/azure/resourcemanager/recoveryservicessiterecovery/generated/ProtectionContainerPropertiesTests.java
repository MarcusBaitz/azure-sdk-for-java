// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ProtectionContainerFabricSpecificDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ProtectionContainerProperties;
import org.junit.jupiter.api.Assertions;

public final class ProtectionContainerPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProtectionContainerProperties model =
            BinaryData
                .fromString(
                    "{\"fabricFriendlyName\":\"pgn\",\"friendlyName\":\"txhp\",\"fabricType\":\"bzpfzab\",\"protectedItemCount\":687811406,\"pairingStatus\":\"hxw\",\"role\":\"tyq\",\"fabricSpecificDetails\":{\"instanceType\":\"bbovplwzbhvgyugu\"}}")
                .toObject(ProtectionContainerProperties.class);
        Assertions.assertEquals("pgn", model.fabricFriendlyName());
        Assertions.assertEquals("txhp", model.friendlyName());
        Assertions.assertEquals("bzpfzab", model.fabricType());
        Assertions.assertEquals(687811406, model.protectedItemCount());
        Assertions.assertEquals("hxw", model.pairingStatus());
        Assertions.assertEquals("tyq", model.role());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProtectionContainerProperties model =
            new ProtectionContainerProperties()
                .withFabricFriendlyName("pgn")
                .withFriendlyName("txhp")
                .withFabricType("bzpfzab")
                .withProtectedItemCount(687811406)
                .withPairingStatus("hxw")
                .withRole("tyq")
                .withFabricSpecificDetails(new ProtectionContainerFabricSpecificDetails());
        model = BinaryData.fromObject(model).toObject(ProtectionContainerProperties.class);
        Assertions.assertEquals("pgn", model.fabricFriendlyName());
        Assertions.assertEquals("txhp", model.friendlyName());
        Assertions.assertEquals("bzpfzab", model.fabricType());
        Assertions.assertEquals(687811406, model.protectedItemCount());
        Assertions.assertEquals("hxw", model.pairingStatus());
        Assertions.assertEquals("tyq", model.role());
    }
}