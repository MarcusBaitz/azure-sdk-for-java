// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.DiskAccountType;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.HyperVReplicaAzureDiskInputDetails;
import org.junit.jupiter.api.Assertions;

public final class HyperVReplicaAzureDiskInputDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HyperVReplicaAzureDiskInputDetails model =
            BinaryData
                .fromString(
                    "{\"diskId\":\"jlnsj\",\"logStorageAccountId\":\"ju\",\"diskType\":\"StandardSSD_LRS\",\"diskEncryptionSetId\":\"xqvmvuay\"}")
                .toObject(HyperVReplicaAzureDiskInputDetails.class);
        Assertions.assertEquals("jlnsj", model.diskId());
        Assertions.assertEquals("ju", model.logStorageAccountId());
        Assertions.assertEquals(DiskAccountType.STANDARD_SSD_LRS, model.diskType());
        Assertions.assertEquals("xqvmvuay", model.diskEncryptionSetId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HyperVReplicaAzureDiskInputDetails model =
            new HyperVReplicaAzureDiskInputDetails()
                .withDiskId("jlnsj")
                .withLogStorageAccountId("ju")
                .withDiskType(DiskAccountType.STANDARD_SSD_LRS)
                .withDiskEncryptionSetId("xqvmvuay");
        model = BinaryData.fromObject(model).toObject(HyperVReplicaAzureDiskInputDetails.class);
        Assertions.assertEquals("jlnsj", model.diskId());
        Assertions.assertEquals("ju", model.logStorageAccountId());
        Assertions.assertEquals(DiskAccountType.STANDARD_SSD_LRS, model.diskType());
        Assertions.assertEquals("xqvmvuay", model.diskEncryptionSetId());
    }
}