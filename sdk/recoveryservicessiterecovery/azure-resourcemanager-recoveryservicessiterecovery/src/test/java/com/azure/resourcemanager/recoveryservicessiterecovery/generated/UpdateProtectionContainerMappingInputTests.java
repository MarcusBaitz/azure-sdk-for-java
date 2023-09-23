// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationProviderSpecificUpdateContainerMappingInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.UpdateProtectionContainerMappingInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.UpdateProtectionContainerMappingInputProperties;

public final class UpdateProtectionContainerMappingInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdateProtectionContainerMappingInput model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"providerSpecificInput\":{\"instanceType\":\"ReplicationProviderSpecificUpdateContainerMappingInput\"}}}")
                .toObject(UpdateProtectionContainerMappingInput.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdateProtectionContainerMappingInput model =
            new UpdateProtectionContainerMappingInput()
                .withProperties(
                    new UpdateProtectionContainerMappingInputProperties()
                        .withProviderSpecificInput(new ReplicationProviderSpecificUpdateContainerMappingInput()));
        model = BinaryData.fromObject(model).toObject(UpdateProtectionContainerMappingInput.class);
    }
}