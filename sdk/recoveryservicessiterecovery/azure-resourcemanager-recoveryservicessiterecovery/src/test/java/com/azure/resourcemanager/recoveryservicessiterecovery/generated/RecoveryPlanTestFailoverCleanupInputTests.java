// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanTestFailoverCleanupInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanTestFailoverCleanupInputProperties;
import org.junit.jupiter.api.Assertions;

public final class RecoveryPlanTestFailoverCleanupInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RecoveryPlanTestFailoverCleanupInput model =
            BinaryData
                .fromString("{\"properties\":{\"comments\":\"ysfaqegplwrysh\"}}")
                .toObject(RecoveryPlanTestFailoverCleanupInput.class);
        Assertions.assertEquals("ysfaqegplwrysh", model.properties().comments());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RecoveryPlanTestFailoverCleanupInput model =
            new RecoveryPlanTestFailoverCleanupInput()
                .withProperties(new RecoveryPlanTestFailoverCleanupInputProperties().withComments("ysfaqegplwrysh"));
        model = BinaryData.fromObject(model).toObject(RecoveryPlanTestFailoverCleanupInput.class);
        Assertions.assertEquals("ysfaqegplwrysh", model.properties().comments());
    }
}