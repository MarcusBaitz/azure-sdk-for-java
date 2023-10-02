// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.OperationMetricAvailability;
import org.junit.jupiter.api.Assertions;

public final class OperationMetricAvailabilityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationMetricAvailability model =
            BinaryData
                .fromString("{\"timeGrain\":\"ddntwndei\",\"blobDuration\":\"twnpzaoqvuhrhcf\"}")
                .toObject(OperationMetricAvailability.class);
        Assertions.assertEquals("ddntwndei", model.timeGrain());
        Assertions.assertEquals("twnpzaoqvuhrhcf", model.blobDuration());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationMetricAvailability model =
            new OperationMetricAvailability().withTimeGrain("ddntwndei").withBlobDuration("twnpzaoqvuhrhcf");
        model = BinaryData.fromObject(model).toObject(OperationMetricAvailability.class);
        Assertions.assertEquals("ddntwndei", model.timeGrain());
        Assertions.assertEquals("twnpzaoqvuhrhcf", model.blobDuration());
    }
}