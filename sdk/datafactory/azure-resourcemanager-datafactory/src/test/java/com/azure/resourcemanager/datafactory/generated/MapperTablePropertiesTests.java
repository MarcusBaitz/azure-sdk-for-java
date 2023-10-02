// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.MapperTableProperties;
import com.azure.resourcemanager.datafactory.models.MapperDslConnectorProperties;
import com.azure.resourcemanager.datafactory.models.MapperTableSchema;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MapperTablePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MapperTableProperties model =
            BinaryData
                .fromString(
                    "{\"schema\":[{\"name\":\"toi\",\"dataType\":\"gygvfltgvdiho\"},{\"name\":\"krxwet\",\"dataType\":\"drcyrucpcun\"}],\"dslConnectorProperties\":[{\"name\":\"qumoeno\",\"value\":\"dataaienhqhsknd\"},{\"name\":\"lqkaadlknwf\",\"value\":\"datanniyopetxi\"}]}")
                .toObject(MapperTableProperties.class);
        Assertions.assertEquals("toi", model.schema().get(0).name());
        Assertions.assertEquals("gygvfltgvdiho", model.schema().get(0).dataType());
        Assertions.assertEquals("qumoeno", model.dslConnectorProperties().get(0).name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MapperTableProperties model =
            new MapperTableProperties()
                .withSchema(
                    Arrays
                        .asList(
                            new MapperTableSchema().withName("toi").withDataType("gygvfltgvdiho"),
                            new MapperTableSchema().withName("krxwet").withDataType("drcyrucpcun")))
                .withDslConnectorProperties(
                    Arrays
                        .asList(
                            new MapperDslConnectorProperties().withName("qumoeno").withValue("dataaienhqhsknd"),
                            new MapperDslConnectorProperties().withName("lqkaadlknwf").withValue("datanniyopetxi")));
        model = BinaryData.fromObject(model).toObject(MapperTableProperties.class);
        Assertions.assertEquals("toi", model.schema().get(0).name());
        Assertions.assertEquals("gygvfltgvdiho", model.schema().get(0).dataType());
        Assertions.assertEquals("qumoeno", model.dslConnectorProperties().get(0).name());
    }
}