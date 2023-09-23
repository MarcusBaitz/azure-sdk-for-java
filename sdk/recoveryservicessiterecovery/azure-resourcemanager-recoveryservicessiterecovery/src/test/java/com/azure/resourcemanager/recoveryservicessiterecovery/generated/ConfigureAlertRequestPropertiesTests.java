// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ConfigureAlertRequestProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ConfigureAlertRequestPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConfigureAlertRequestProperties model =
            BinaryData
                .fromString(
                    "{\"sendToOwners\":\"fziton\",\"customEmailAddresses\":[\"fpjkjlxofp\",\"vhpfxxypininmay\"],\"locale\":\"ybb\"}")
                .toObject(ConfigureAlertRequestProperties.class);
        Assertions.assertEquals("fziton", model.sendToOwners());
        Assertions.assertEquals("fpjkjlxofp", model.customEmailAddresses().get(0));
        Assertions.assertEquals("ybb", model.locale());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConfigureAlertRequestProperties model =
            new ConfigureAlertRequestProperties()
                .withSendToOwners("fziton")
                .withCustomEmailAddresses(Arrays.asList("fpjkjlxofp", "vhpfxxypininmay"))
                .withLocale("ybb");
        model = BinaryData.fromObject(model).toObject(ConfigureAlertRequestProperties.class);
        Assertions.assertEquals("fziton", model.sendToOwners());
        Assertions.assertEquals("fpjkjlxofp", model.customEmailAddresses().get(0));
        Assertions.assertEquals("ybb", model.locale());
    }
}