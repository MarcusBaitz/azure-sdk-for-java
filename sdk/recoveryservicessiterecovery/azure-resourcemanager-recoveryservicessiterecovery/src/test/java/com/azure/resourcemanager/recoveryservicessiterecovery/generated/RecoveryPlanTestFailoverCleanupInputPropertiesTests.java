// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanTestFailoverCleanupInputProperties;
import org.junit.jupiter.api.Assertions;

public final class RecoveryPlanTestFailoverCleanupInputPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RecoveryPlanTestFailoverCleanupInputProperties model =
            BinaryData
                .fromString("{\"comments\":\"d\"}")
                .toObject(RecoveryPlanTestFailoverCleanupInputProperties.class);
        Assertions.assertEquals("d", model.comments());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RecoveryPlanTestFailoverCleanupInputProperties model =
            new RecoveryPlanTestFailoverCleanupInputProperties().withComments("d");
        model = BinaryData.fromObject(model).toObject(RecoveryPlanTestFailoverCleanupInputProperties.class);
        Assertions.assertEquals("d", model.comments());
    }
}