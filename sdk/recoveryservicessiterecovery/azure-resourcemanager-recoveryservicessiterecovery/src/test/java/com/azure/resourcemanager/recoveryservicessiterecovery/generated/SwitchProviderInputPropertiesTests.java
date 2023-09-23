// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.SwitchProviderInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.SwitchProviderSpecificInput;
import org.junit.jupiter.api.Assertions;

public final class SwitchProviderInputPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SwitchProviderInputProperties model =
            BinaryData
                .fromString(
                    "{\"targetInstanceType\":\"trgjupauutpwoqh\",\"providerSpecificDetails\":{\"instanceType\":\"SwitchProviderSpecificInput\"}}")
                .toObject(SwitchProviderInputProperties.class);
        Assertions.assertEquals("trgjupauutpwoqh", model.targetInstanceType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SwitchProviderInputProperties model =
            new SwitchProviderInputProperties()
                .withTargetInstanceType("trgjupauutpwoqh")
                .withProviderSpecificDetails(new SwitchProviderSpecificInput());
        model = BinaryData.fromObject(model).toObject(SwitchProviderInputProperties.class);
        Assertions.assertEquals("trgjupauutpwoqh", model.targetInstanceType());
    }
}