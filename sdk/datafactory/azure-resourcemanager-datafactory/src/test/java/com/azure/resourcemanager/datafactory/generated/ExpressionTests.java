// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.Expression;
import org.junit.jupiter.api.Assertions;

public final class ExpressionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Expression model = BinaryData.fromString("{\"value\":\"tny\"}").toObject(Expression.class);
        Assertions.assertEquals("tny", model.value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Expression model = new Expression().withValue("tny");
        model = BinaryData.fromObject(model).toObject(Expression.class);
        Assertions.assertEquals("tny", model.value());
    }
}