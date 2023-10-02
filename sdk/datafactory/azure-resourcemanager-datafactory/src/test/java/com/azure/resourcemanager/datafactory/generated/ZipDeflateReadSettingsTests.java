// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ZipDeflateReadSettings;

public final class ZipDeflateReadSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ZipDeflateReadSettings model =
            BinaryData
                .fromString(
                    "{\"type\":\"ZipDeflateReadSettings\",\"preserveZipFileNameAsFolder\":\"datarwxf\",\"\":{\"ofegrzfsfuloo\":\"dataghwfiy\"}}")
                .toObject(ZipDeflateReadSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ZipDeflateReadSettings model = new ZipDeflateReadSettings().withPreserveZipFileNameAsFolder("datarwxf");
        model = BinaryData.fromObject(model).toObject(ZipDeflateReadSettings.class);
    }
}