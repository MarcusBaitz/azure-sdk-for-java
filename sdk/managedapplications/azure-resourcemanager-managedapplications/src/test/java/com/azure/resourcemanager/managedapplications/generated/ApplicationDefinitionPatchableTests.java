// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managedapplications.models.ApplicationDefinitionPatchable;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ApplicationDefinitionPatchableTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApplicationDefinitionPatchable model =
            BinaryData.fromString("{\"tags\":{\"w\":\"m\"}}").toObject(ApplicationDefinitionPatchable.class);
        Assertions.assertEquals("m", model.tags().get("w"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApplicationDefinitionPatchable model = new ApplicationDefinitionPatchable().withTags(mapOf("w", "m"));
        model = BinaryData.fromObject(model).toObject(ApplicationDefinitionPatchable.class);
        Assertions.assertEquals("m", model.tags().get("w"));
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}