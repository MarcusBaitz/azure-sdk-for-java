// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ExistingRecoveryAvailabilitySet;
import org.junit.jupiter.api.Assertions;

public final class ExistingRecoveryAvailabilitySetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExistingRecoveryAvailabilitySet model =
            BinaryData
                .fromString("{\"resourceType\":\"Existing\",\"recoveryAvailabilitySetId\":\"qimiymqr\"}")
                .toObject(ExistingRecoveryAvailabilitySet.class);
        Assertions.assertEquals("qimiymqr", model.recoveryAvailabilitySetId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExistingRecoveryAvailabilitySet model =
            new ExistingRecoveryAvailabilitySet().withRecoveryAvailabilitySetId("qimiymqr");
        model = BinaryData.fromObject(model).toObject(ExistingRecoveryAvailabilitySet.class);
        Assertions.assertEquals("qimiymqr", model.recoveryAvailabilitySetId());
    }
}