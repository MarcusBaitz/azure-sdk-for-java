// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.NewProtectionProfile;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.SetMultiVmSyncStatus;
import org.junit.jupiter.api.Assertions;

public final class NewProtectionProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NewProtectionProfile model =
            BinaryData
                .fromString(
                    "{\"resourceType\":\"New\",\"policyName\":\"pc\",\"recoveryPointHistory\":1754737974,\"crashConsistentFrequencyInMinutes\":381406744,\"appConsistentFrequencyInMinutes\":198630766,\"multiVmSyncStatus\":\"Enable\"}")
                .toObject(NewProtectionProfile.class);
        Assertions.assertEquals("pc", model.policyName());
        Assertions.assertEquals(1754737974, model.recoveryPointHistory());
        Assertions.assertEquals(381406744, model.crashConsistentFrequencyInMinutes());
        Assertions.assertEquals(198630766, model.appConsistentFrequencyInMinutes());
        Assertions.assertEquals(SetMultiVmSyncStatus.ENABLE, model.multiVmSyncStatus());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NewProtectionProfile model =
            new NewProtectionProfile()
                .withPolicyName("pc")
                .withRecoveryPointHistory(1754737974)
                .withCrashConsistentFrequencyInMinutes(381406744)
                .withAppConsistentFrequencyInMinutes(198630766)
                .withMultiVmSyncStatus(SetMultiVmSyncStatus.ENABLE);
        model = BinaryData.fromObject(model).toObject(NewProtectionProfile.class);
        Assertions.assertEquals("pc", model.policyName());
        Assertions.assertEquals(1754737974, model.recoveryPointHistory());
        Assertions.assertEquals(381406744, model.crashConsistentFrequencyInMinutes());
        Assertions.assertEquals(198630766, model.appConsistentFrequencyInMinutes());
        Assertions.assertEquals(SetMultiVmSyncStatus.ENABLE, model.multiVmSyncStatus());
    }
}