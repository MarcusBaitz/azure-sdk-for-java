// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.A2AProtectionIntentDiskInputDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.StorageAccountCustomDetails;
import org.junit.jupiter.api.Assertions;

public final class A2AProtectionIntentDiskInputDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        A2AProtectionIntentDiskInputDetails model =
            BinaryData
                .fromString(
                    "{\"diskUri\":\"atbwbqam\",\"recoveryAzureStorageAccountCustomInput\":{\"resourceType\":\"StorageAccountCustomDetails\"},\"primaryStagingStorageAccountCustomInput\":{\"resourceType\":\"StorageAccountCustomDetails\"}}")
                .toObject(A2AProtectionIntentDiskInputDetails.class);
        Assertions.assertEquals("atbwbqam", model.diskUri());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        A2AProtectionIntentDiskInputDetails model =
            new A2AProtectionIntentDiskInputDetails()
                .withDiskUri("atbwbqam")
                .withRecoveryAzureStorageAccountCustomInput(new StorageAccountCustomDetails())
                .withPrimaryStagingStorageAccountCustomInput(new StorageAccountCustomDetails());
        model = BinaryData.fromObject(model).toObject(A2AProtectionIntentDiskInputDetails.class);
        Assertions.assertEquals("atbwbqam", model.diskUri());
    }
}