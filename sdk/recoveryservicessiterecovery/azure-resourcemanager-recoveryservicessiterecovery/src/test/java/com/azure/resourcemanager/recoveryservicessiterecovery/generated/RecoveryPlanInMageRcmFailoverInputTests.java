// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanInMageRcmFailoverInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanPointType;
import org.junit.jupiter.api.Assertions;

public final class RecoveryPlanInMageRcmFailoverInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RecoveryPlanInMageRcmFailoverInput model =
            BinaryData
                .fromString(
                    "{\"instanceType\":\"InMageRcm\",\"recoveryPointType\":\"LatestApplicationConsistent\",\"useMultiVmSyncPoint\":\"suc\"}")
                .toObject(RecoveryPlanInMageRcmFailoverInput.class);
        Assertions.assertEquals(RecoveryPlanPointType.LATEST_APPLICATION_CONSISTENT, model.recoveryPointType());
        Assertions.assertEquals("suc", model.useMultiVmSyncPoint());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RecoveryPlanInMageRcmFailoverInput model =
            new RecoveryPlanInMageRcmFailoverInput()
                .withRecoveryPointType(RecoveryPlanPointType.LATEST_APPLICATION_CONSISTENT)
                .withUseMultiVmSyncPoint("suc");
        model = BinaryData.fromObject(model).toObject(RecoveryPlanInMageRcmFailoverInput.class);
        Assertions.assertEquals(RecoveryPlanPointType.LATEST_APPLICATION_CONSISTENT, model.recoveryPointType());
        Assertions.assertEquals("suc", model.useMultiVmSyncPoint());
    }
}