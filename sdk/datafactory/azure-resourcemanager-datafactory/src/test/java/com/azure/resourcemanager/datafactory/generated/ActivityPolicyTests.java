// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ActivityPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ActivityPolicy model =
            BinaryData
                .fromString(
                    "{\"timeout\":\"datamsgg\",\"retry\":\"datacmazilq\",\"retryIntervalInSeconds\":840058407,\"secureInput\":false,\"secureOutput\":false,\"\":{\"zykmdklwbqkmtwua\":\"datay\"}}")
                .toObject(ActivityPolicy.class);
        Assertions.assertEquals(840058407, model.retryIntervalInSeconds());
        Assertions.assertEquals(false, model.secureInput());
        Assertions.assertEquals(false, model.secureOutput());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ActivityPolicy model =
            new ActivityPolicy()
                .withTimeout("datamsgg")
                .withRetry("datacmazilq")
                .withRetryIntervalInSeconds(840058407)
                .withSecureInput(false)
                .withSecureOutput(false)
                .withAdditionalProperties(mapOf());
        model = BinaryData.fromObject(model).toObject(ActivityPolicy.class);
        Assertions.assertEquals(840058407, model.retryIntervalInSeconds());
        Assertions.assertEquals(false, model.secureInput());
        Assertions.assertEquals(false, model.secureOutput());
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