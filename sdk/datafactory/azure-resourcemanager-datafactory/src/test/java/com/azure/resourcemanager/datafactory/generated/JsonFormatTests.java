// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.JsonFormat;

public final class JsonFormatTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JsonFormat model =
            BinaryData
                .fromString(
                    "{\"type\":\"JsonFormat\",\"filePattern\":\"datafcwrri\",\"nestingSeparator\":\"dataxeezwyhjmbjiqe\",\"encodingName\":\"dataxdbsohcw\",\"jsonNodeReference\":\"datayvdkgdetszw\",\"jsonPathDefinition\":\"datanzbjekwuycky\",\"serializer\":\"dataensmuffiwjbct\",\"deserializer\":\"datap\",\"\":{\"dxposcsl\":\"dataqjto\",\"uxidhhxomilddxj\":\"datawuusiecktybh\"}}")
                .toObject(JsonFormat.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JsonFormat model =
            new JsonFormat()
                .withSerializer("dataensmuffiwjbct")
                .withDeserializer("datap")
                .withFilePattern("datafcwrri")
                .withNestingSeparator("dataxeezwyhjmbjiqe")
                .withEncodingName("dataxdbsohcw")
                .withJsonNodeReference("datayvdkgdetszw")
                .withJsonPathDefinition("datanzbjekwuycky");
        model = BinaryData.fromObject(model).toObject(JsonFormat.class);
    }
}