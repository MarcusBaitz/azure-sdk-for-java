// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.VMwareCbtEventDetails;

public final class VMwareCbtEventDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VMwareCbtEventDetails model =
            BinaryData
                .fromString("{\"instanceType\":\"VMwareCbt\",\"migrationItemName\":\"rnxhjtlxfikjk\"}")
                .toObject(VMwareCbtEventDetails.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VMwareCbtEventDetails model = new VMwareCbtEventDetails();
        model = BinaryData.fromObject(model).toObject(VMwareCbtEventDetails.class);
    }
}