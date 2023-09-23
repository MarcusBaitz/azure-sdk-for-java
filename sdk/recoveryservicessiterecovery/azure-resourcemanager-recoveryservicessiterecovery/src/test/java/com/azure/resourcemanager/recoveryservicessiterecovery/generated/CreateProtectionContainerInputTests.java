// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.CreateProtectionContainerInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.CreateProtectionContainerInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationProviderSpecificContainerCreationInput;
import java.util.Arrays;

public final class CreateProtectionContainerInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CreateProtectionContainerInput model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"providerSpecificInput\":[{\"instanceType\":\"ReplicationProviderSpecificContainerCreationInput\"},{\"instanceType\":\"ReplicationProviderSpecificContainerCreationInput\"},{\"instanceType\":\"ReplicationProviderSpecificContainerCreationInput\"}]}}")
                .toObject(CreateProtectionContainerInput.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CreateProtectionContainerInput model =
            new CreateProtectionContainerInput()
                .withProperties(
                    new CreateProtectionContainerInputProperties()
                        .withProviderSpecificInput(
                            Arrays
                                .asList(
                                    new ReplicationProviderSpecificContainerCreationInput(),
                                    new ReplicationProviderSpecificContainerCreationInput(),
                                    new ReplicationProviderSpecificContainerCreationInput())));
        model = BinaryData.fromObject(model).toObject(CreateProtectionContainerInput.class);
    }
}