// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureDataLakeStoreWriteSettings;

public final class AzureDataLakeStoreWriteSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureDataLakeStoreWriteSettings model =
            BinaryData
                .fromString(
                    "{\"type\":\"AzureDataLakeStoreWriteSettings\",\"expiryDateTime\":\"datakoxqbozezx\",\"maxConcurrentConnections\":\"datainrguk\",\"disableMetricsCollection\":\"databov\",\"copyBehavior\":\"dataltqlqufkrnrbnjkc\",\"\":{\"qvv\":\"datazqlyputawdmdikuf\",\"hvfojcvnh\":\"dataujzofyldxk\",\"kysg\":\"dataebuiy\"}}")
                .toObject(AzureDataLakeStoreWriteSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureDataLakeStoreWriteSettings model =
            new AzureDataLakeStoreWriteSettings()
                .withMaxConcurrentConnections("datainrguk")
                .withDisableMetricsCollection("databov")
                .withCopyBehavior("dataltqlqufkrnrbnjkc")
                .withExpiryDateTime("datakoxqbozezx");
        model = BinaryData.fromObject(model).toObject(AzureDataLakeStoreWriteSettings.class);
    }
}