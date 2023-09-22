// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managedapplications.models.ApplicationPackageLockingPolicyDefinition;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ApplicationPackageLockingPolicyDefinitionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApplicationPackageLockingPolicyDefinition model =
            BinaryData
                .fromString(
                    "{\"allowedActions\":[\"hd\",\"xibqeojnx\",\"bzv\",\"dntwndeicbtw\"],\"allowedDataActions\":[\"aoqvuh\"]}")
                .toObject(ApplicationPackageLockingPolicyDefinition.class);
        Assertions.assertEquals("hd", model.allowedActions().get(0));
        Assertions.assertEquals("aoqvuh", model.allowedDataActions().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApplicationPackageLockingPolicyDefinition model =
            new ApplicationPackageLockingPolicyDefinition()
                .withAllowedActions(Arrays.asList("hd", "xibqeojnx", "bzv", "dntwndeicbtw"))
                .withAllowedDataActions(Arrays.asList("aoqvuh"));
        model = BinaryData.fromObject(model).toObject(ApplicationPackageLockingPolicyDefinition.class);
        Assertions.assertEquals("hd", model.allowedActions().get(0));
        Assertions.assertEquals("aoqvuh", model.allowedDataActions().get(0));
    }
}