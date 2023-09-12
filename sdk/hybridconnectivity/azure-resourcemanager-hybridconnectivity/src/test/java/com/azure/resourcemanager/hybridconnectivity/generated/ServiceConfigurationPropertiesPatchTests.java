// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridconnectivity.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridconnectivity.fluent.models.ServiceConfigurationPropertiesPatch;
import org.junit.jupiter.api.Assertions;

public final class ServiceConfigurationPropertiesPatchTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServiceConfigurationPropertiesPatch model =
            BinaryData.fromString("{\"port\":2309881013133917021}").toObject(ServiceConfigurationPropertiesPatch.class);
        Assertions.assertEquals(2309881013133917021L, model.port());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServiceConfigurationPropertiesPatch model =
            new ServiceConfigurationPropertiesPatch().withPort(2309881013133917021L);
        model = BinaryData.fromObject(model).toObject(ServiceConfigurationPropertiesPatch.class);
        Assertions.assertEquals(2309881013133917021L, model.port());
    }
}