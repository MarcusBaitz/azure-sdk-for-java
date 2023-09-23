// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.HyperVReplicaPolicyInput;
import org.junit.jupiter.api.Assertions;

public final class HyperVReplicaPolicyInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HyperVReplicaPolicyInput model =
            BinaryData
                .fromString(
                    "{\"instanceType\":\"HyperVReplica2012\",\"recoveryPoints\":1848793230,\"applicationConsistentSnapshotFrequencyInHours\":60033751,\"compression\":\"apbxwieexuyade\",\"initialReplicationMethod\":\"tfo\",\"onlineReplicationStartTime\":\"k\",\"offlineReplicationImportPath\":\"imyc\",\"offlineReplicationExportPath\":\"r\",\"replicationPort\":360310908,\"allowedAuthenticationType\":1678727382,\"replicaDeletion\":\"nnuifersej\"}")
                .toObject(HyperVReplicaPolicyInput.class);
        Assertions.assertEquals(1848793230, model.recoveryPoints());
        Assertions.assertEquals(60033751, model.applicationConsistentSnapshotFrequencyInHours());
        Assertions.assertEquals("apbxwieexuyade", model.compression());
        Assertions.assertEquals("tfo", model.initialReplicationMethod());
        Assertions.assertEquals("k", model.onlineReplicationStartTime());
        Assertions.assertEquals("imyc", model.offlineReplicationImportPath());
        Assertions.assertEquals("r", model.offlineReplicationExportPath());
        Assertions.assertEquals(360310908, model.replicationPort());
        Assertions.assertEquals(1678727382, model.allowedAuthenticationType());
        Assertions.assertEquals("nnuifersej", model.replicaDeletion());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HyperVReplicaPolicyInput model =
            new HyperVReplicaPolicyInput()
                .withRecoveryPoints(1848793230)
                .withApplicationConsistentSnapshotFrequencyInHours(60033751)
                .withCompression("apbxwieexuyade")
                .withInitialReplicationMethod("tfo")
                .withOnlineReplicationStartTime("k")
                .withOfflineReplicationImportPath("imyc")
                .withOfflineReplicationExportPath("r")
                .withReplicationPort(360310908)
                .withAllowedAuthenticationType(1678727382)
                .withReplicaDeletion("nnuifersej");
        model = BinaryData.fromObject(model).toObject(HyperVReplicaPolicyInput.class);
        Assertions.assertEquals(1848793230, model.recoveryPoints());
        Assertions.assertEquals(60033751, model.applicationConsistentSnapshotFrequencyInHours());
        Assertions.assertEquals("apbxwieexuyade", model.compression());
        Assertions.assertEquals("tfo", model.initialReplicationMethod());
        Assertions.assertEquals("k", model.onlineReplicationStartTime());
        Assertions.assertEquals("imyc", model.offlineReplicationImportPath());
        Assertions.assertEquals("r", model.offlineReplicationExportPath());
        Assertions.assertEquals(360310908, model.replicationPort());
        Assertions.assertEquals(1678727382, model.allowedAuthenticationType());
        Assertions.assertEquals("nnuifersej", model.replicaDeletion());
    }
}