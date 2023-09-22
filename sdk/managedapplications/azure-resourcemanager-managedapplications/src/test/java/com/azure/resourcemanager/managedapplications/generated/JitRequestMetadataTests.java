// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managedapplications.models.JitRequestMetadata;
import org.junit.jupiter.api.Assertions;

public final class JitRequestMetadataTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JitRequestMetadata model =
            BinaryData
                .fromString(
                    "{\"originRequestId\":\"rrqnbpoczvyifqrv\",\"requestorId\":\"vjsllrmvvdfw\",\"tenantDisplayName\":\"kpnpulexxbczwtr\",\"subjectDisplayName\":\"iqzbq\"}")
                .toObject(JitRequestMetadata.class);
        Assertions.assertEquals("rrqnbpoczvyifqrv", model.originRequestId());
        Assertions.assertEquals("vjsllrmvvdfw", model.requestorId());
        Assertions.assertEquals("kpnpulexxbczwtr", model.tenantDisplayName());
        Assertions.assertEquals("iqzbq", model.subjectDisplayName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JitRequestMetadata model =
            new JitRequestMetadata()
                .withOriginRequestId("rrqnbpoczvyifqrv")
                .withRequestorId("vjsllrmvvdfw")
                .withTenantDisplayName("kpnpulexxbczwtr")
                .withSubjectDisplayName("iqzbq");
        model = BinaryData.fromObject(model).toObject(JitRequestMetadata.class);
        Assertions.assertEquals("rrqnbpoczvyifqrv", model.originRequestId());
        Assertions.assertEquals("vjsllrmvvdfw", model.requestorId());
        Assertions.assertEquals("kpnpulexxbczwtr", model.tenantDisplayName());
        Assertions.assertEquals("iqzbq", model.subjectDisplayName());
    }
}