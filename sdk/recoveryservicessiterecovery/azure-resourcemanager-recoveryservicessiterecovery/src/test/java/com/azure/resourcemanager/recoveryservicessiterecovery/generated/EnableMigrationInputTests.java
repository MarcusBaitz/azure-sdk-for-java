// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.EnableMigrationInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.EnableMigrationInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.EnableMigrationProviderSpecificInput;
import org.junit.jupiter.api.Assertions;

public final class EnableMigrationInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EnableMigrationInput model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"policyId\":\"hjkbegibtnmxieb\",\"providerSpecificDetails\":{\"instanceType\":\"EnableMigrationProviderSpecificInput\"}}}")
                .toObject(EnableMigrationInput.class);
        Assertions.assertEquals("hjkbegibtnmxieb", model.properties().policyId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EnableMigrationInput model =
            new EnableMigrationInput()
                .withProperties(
                    new EnableMigrationInputProperties()
                        .withPolicyId("hjkbegibtnmxieb")
                        .withProviderSpecificDetails(new EnableMigrationProviderSpecificInput()));
        model = BinaryData.fromObject(model).toObject(EnableMigrationInput.class);
        Assertions.assertEquals("hjkbegibtnmxieb", model.properties().policyId());
    }
}