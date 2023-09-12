// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridconnectivity.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridconnectivity.fluent.models.ServiceConfigurationResourceInner;
import com.azure.resourcemanager.hybridconnectivity.models.ServiceConfigurationList;
import com.azure.resourcemanager.hybridconnectivity.models.ServiceName;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ServiceConfigurationListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServiceConfigurationList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"serviceName\":\"SSH\",\"resourceId\":\"sprozvcput\",\"port\":7394887039726775075,\"provisioningState\":\"Creating\"},\"id\":\"fdatsc\",\"name\":\"dvpjhulsuuvmk\",\"type\":\"ozkrwfndiodjpslw\"},{\"properties\":{\"serviceName\":\"WAC\",\"resourceId\":\"vwryoqpso\",\"port\":8671483261747232397,\"provisioningState\":\"Creating\"},\"id\":\"akl\",\"name\":\"lahbcryff\",\"type\":\"fdosyg\"},{\"properties\":{\"serviceName\":\"WAC\",\"resourceId\":\"ojakhmsbzjhcrze\",\"port\":5524797481405641879,\"provisioningState\":\"Updating\"},\"id\":\"aolthqtrg\",\"name\":\"jbp\",\"type\":\"zfsinzgvf\"}],\"nextLink\":\"rwzoxxjtfelluwf\"}")
                .toObject(ServiceConfigurationList.class);
        Assertions.assertEquals(ServiceName.SSH, model.value().get(0).serviceName());
        Assertions.assertEquals("sprozvcput", model.value().get(0).resourceId());
        Assertions.assertEquals(7394887039726775075L, model.value().get(0).port());
        Assertions.assertEquals("rwzoxxjtfelluwf", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServiceConfigurationList model =
            new ServiceConfigurationList()
                .withValue(
                    Arrays
                        .asList(
                            new ServiceConfigurationResourceInner()
                                .withServiceName(ServiceName.SSH)
                                .withResourceId("sprozvcput")
                                .withPort(7394887039726775075L),
                            new ServiceConfigurationResourceInner()
                                .withServiceName(ServiceName.WAC)
                                .withResourceId("vwryoqpso")
                                .withPort(8671483261747232397L),
                            new ServiceConfigurationResourceInner()
                                .withServiceName(ServiceName.WAC)
                                .withResourceId("ojakhmsbzjhcrze")
                                .withPort(5524797481405641879L)))
                .withNextLink("rwzoxxjtfelluwf");
        model = BinaryData.fromObject(model).toObject(ServiceConfigurationList.class);
        Assertions.assertEquals(ServiceName.SSH, model.value().get(0).serviceName());
        Assertions.assertEquals("sprozvcput", model.value().get(0).resourceId());
        Assertions.assertEquals(7394887039726775075L, model.value().get(0).port());
        Assertions.assertEquals("rwzoxxjtfelluwf", model.nextLink());
    }
}