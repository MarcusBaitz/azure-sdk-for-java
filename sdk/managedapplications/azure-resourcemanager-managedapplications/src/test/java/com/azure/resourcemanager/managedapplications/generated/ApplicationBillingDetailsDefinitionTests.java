// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managedapplications.models.ApplicationBillingDetailsDefinition;
import org.junit.jupiter.api.Assertions;

public final class ApplicationBillingDetailsDefinitionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApplicationBillingDetailsDefinition model =
            BinaryData
                .fromString("{\"resourceUsageId\":\"wjzrnfygxgisp\"}")
                .toObject(ApplicationBillingDetailsDefinition.class);
        Assertions.assertEquals("wjzrnfygxgisp", model.resourceUsageId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApplicationBillingDetailsDefinition model =
            new ApplicationBillingDetailsDefinition().withResourceUsageId("wjzrnfygxgisp");
        model = BinaryData.fromObject(model).toObject(ApplicationBillingDetailsDefinition.class);
        Assertions.assertEquals("wjzrnfygxgisp", model.resourceUsageId());
    }
}