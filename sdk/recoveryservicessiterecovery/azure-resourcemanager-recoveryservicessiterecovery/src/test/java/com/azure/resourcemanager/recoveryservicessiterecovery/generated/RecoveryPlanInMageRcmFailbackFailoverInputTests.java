// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageRcmFailbackRecoveryPointType;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanInMageRcmFailbackFailoverInput;
import org.junit.jupiter.api.Assertions;

public final class RecoveryPlanInMageRcmFailbackFailoverInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RecoveryPlanInMageRcmFailbackFailoverInput model =
            BinaryData
                .fromString(
                    "{\"instanceType\":\"InMageRcmFailback\",\"recoveryPointType\":\"ApplicationConsistent\",\"useMultiVmSyncPoint\":\"raqp\"}")
                .toObject(RecoveryPlanInMageRcmFailbackFailoverInput.class);
        Assertions.assertEquals(InMageRcmFailbackRecoveryPointType.APPLICATION_CONSISTENT, model.recoveryPointType());
        Assertions.assertEquals("raqp", model.useMultiVmSyncPoint());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RecoveryPlanInMageRcmFailbackFailoverInput model =
            new RecoveryPlanInMageRcmFailbackFailoverInput()
                .withRecoveryPointType(InMageRcmFailbackRecoveryPointType.APPLICATION_CONSISTENT)
                .withUseMultiVmSyncPoint("raqp");
        model = BinaryData.fromObject(model).toObject(RecoveryPlanInMageRcmFailbackFailoverInput.class);
        Assertions.assertEquals(InMageRcmFailbackRecoveryPointType.APPLICATION_CONSISTENT, model.recoveryPointType());
        Assertions.assertEquals("raqp", model.useMultiVmSyncPoint());
    }
}