// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.JobStatusEventDetails;
import org.junit.jupiter.api.Assertions;

public final class JobStatusEventDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JobStatusEventDetails model =
            BinaryData
                .fromString(
                    "{\"instanceType\":\"JobStatus\",\"jobId\":\"wkaupwhlz\",\"jobFriendlyName\":\"kremgjl\",\"jobStatus\":\"vdorsirx\",\"affectedObjectType\":\"yrkqa\"}")
                .toObject(JobStatusEventDetails.class);
        Assertions.assertEquals("wkaupwhlz", model.jobId());
        Assertions.assertEquals("kremgjl", model.jobFriendlyName());
        Assertions.assertEquals("vdorsirx", model.jobStatus());
        Assertions.assertEquals("yrkqa", model.affectedObjectType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JobStatusEventDetails model =
            new JobStatusEventDetails()
                .withJobId("wkaupwhlz")
                .withJobFriendlyName("kremgjl")
                .withJobStatus("vdorsirx")
                .withAffectedObjectType("yrkqa");
        model = BinaryData.fromObject(model).toObject(JobStatusEventDetails.class);
        Assertions.assertEquals("wkaupwhlz", model.jobId());
        Assertions.assertEquals("kremgjl", model.jobFriendlyName());
        Assertions.assertEquals("vdorsirx", model.jobStatus());
        Assertions.assertEquals("yrkqa", model.affectedObjectType());
    }
}