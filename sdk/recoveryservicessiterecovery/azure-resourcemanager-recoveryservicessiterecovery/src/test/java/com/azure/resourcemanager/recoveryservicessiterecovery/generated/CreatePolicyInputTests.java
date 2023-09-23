// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.CreatePolicyInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.CreatePolicyInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.PolicyProviderSpecificInput;

public final class CreatePolicyInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CreatePolicyInput model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"providerSpecificInput\":{\"instanceType\":\"PolicyProviderSpecificInput\"}}}")
                .toObject(CreatePolicyInput.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CreatePolicyInput model =
            new CreatePolicyInput()
                .withProperties(
                    new CreatePolicyInputProperties().withProviderSpecificInput(new PolicyProviderSpecificInput()));
        model = BinaryData.fromObject(model).toObject(CreatePolicyInput.class);
    }
}