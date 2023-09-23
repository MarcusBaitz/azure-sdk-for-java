// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageRcmFailbackEventDetails;

public final class InMageRcmFailbackEventDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InMageRcmFailbackEventDetails model =
            BinaryData
                .fromString(
                    "{\"instanceType\":\"InMageRcmFailback\",\"protectedItemName\":\"hsxrznmgsdaluyc\",\"vmName\":\"efrbhseuerbg\",\"applianceName\":\"ebjludc\",\"serverType\":\"tujraxdtpryjm\",\"componentDisplayName\":\"nsewouxl\"}")
                .toObject(InMageRcmFailbackEventDetails.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InMageRcmFailbackEventDetails model = new InMageRcmFailbackEventDetails();
        model = BinaryData.fromObject(model).toObject(InMageRcmFailbackEventDetails.class);
    }
}