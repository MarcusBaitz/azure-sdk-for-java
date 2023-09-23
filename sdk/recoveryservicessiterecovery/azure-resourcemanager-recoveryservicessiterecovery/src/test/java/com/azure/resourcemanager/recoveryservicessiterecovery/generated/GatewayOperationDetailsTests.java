// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.GatewayOperationDetails;

public final class GatewayOperationDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GatewayOperationDetails model =
            BinaryData
                .fromString(
                    "{\"state\":\"g\",\"progressPercentage\":2029904789,\"timeElapsed\":322502128306108788,\"timeRemaining\":7668781915393184343,\"uploadSpeed\":826381918369159803,\"hostName\":\"ilaywkdcwm\",\"dataStores\":[\"ri\",\"mhxdqaolfy\",\"nkkbjpjvlywltmfw\",\"bbjwhlw\"],\"vmwareReadThroughput\":8018197232244540786}")
                .toObject(GatewayOperationDetails.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GatewayOperationDetails model = new GatewayOperationDetails();
        model = BinaryData.fromObject(model).toObject(GatewayOperationDetails.class);
    }
}