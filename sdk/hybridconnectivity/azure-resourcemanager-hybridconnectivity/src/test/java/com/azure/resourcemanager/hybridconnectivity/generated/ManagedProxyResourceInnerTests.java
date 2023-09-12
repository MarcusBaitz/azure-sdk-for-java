// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridconnectivity.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridconnectivity.fluent.models.ManagedProxyResourceInner;
import org.junit.jupiter.api.Assertions;

public final class ManagedProxyResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedProxyResourceInner model =
            BinaryData
                .fromString("{\"proxy\":\"mrldhu\",\"expiresOn\":3804419462481877066}")
                .toObject(ManagedProxyResourceInner.class);
        Assertions.assertEquals("mrldhu", model.proxy());
        Assertions.assertEquals(3804419462481877066L, model.expiresOn());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedProxyResourceInner model =
            new ManagedProxyResourceInner().withProxy("mrldhu").withExpiresOn(3804419462481877066L);
        model = BinaryData.fromObject(model).toObject(ManagedProxyResourceInner.class);
        Assertions.assertEquals("mrldhu", model.proxy());
        Assertions.assertEquals(3804419462481877066L, model.expiresOn());
    }
}