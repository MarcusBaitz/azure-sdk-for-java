// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.AzurePostgreSqlTableDatasetTypeProperties;

public final class AzurePostgreSqlTableDatasetTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzurePostgreSqlTableDatasetTypeProperties model =
            BinaryData
                .fromString(
                    "{\"tableName\":\"datavcpi\",\"table\":\"dataqbvxqtolpwbopv\",\"schema\":\"databtzaprjxco\"}")
                .toObject(AzurePostgreSqlTableDatasetTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzurePostgreSqlTableDatasetTypeProperties model =
            new AzurePostgreSqlTableDatasetTypeProperties()
                .withTableName("datavcpi")
                .withTable("dataqbvxqtolpwbopv")
                .withSchema("databtzaprjxco");
        model = BinaryData.fromObject(model).toObject(AzurePostgreSqlTableDatasetTypeProperties.class);
    }
}