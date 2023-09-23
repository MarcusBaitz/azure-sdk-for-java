// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ConfigurationSettings;

public final class ConfigurationSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConfigurationSettings model =
            BinaryData.fromString("{\"instanceType\":\"ConfigurationSettings\"}").toObject(ConfigurationSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConfigurationSettings model = new ConfigurationSettings();
        model = BinaryData.fromObject(model).toObject(ConfigurationSettings.class);
    }
}