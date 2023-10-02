// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.ExcelDatasetTypeProperties;
import com.azure.resourcemanager.datafactory.models.DatasetCompression;
import com.azure.resourcemanager.datafactory.models.DatasetLocation;
import java.util.HashMap;
import java.util.Map;

public final class ExcelDatasetTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExcelDatasetTypeProperties model =
            BinaryData
                .fromString(
                    "{\"location\":{\"type\":\"DatasetLocation\",\"folderPath\":\"datakobqoclflioe\",\"fileName\":\"datahxessmvrk\",\"\":{\"bdxmd\":\"dataqeq\"}},\"sheetName\":\"datasbrujbjpppktlpdi\",\"sheetIndex\":\"datamthieatnejrnmin\",\"range\":\"dataplgtkihonikzsrzf\",\"firstRowAsHeader\":\"datajilzfbpntogke\",\"compression\":{\"type\":\"datack\",\"level\":\"datamcarm\",\"\":{\"ykhkg\":\"dataxxkwykuqdndx\",\"t\":\"dataapvd\",\"rnrnjrcufmbgacnr\":\"datapeerscd\",\"eubkqiqmlf\":\"datafdtncmspsanma\"}},\"nullValue\":\"datalqcskkqjmxptueip\"}")
                .toObject(ExcelDatasetTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExcelDatasetTypeProperties model =
            new ExcelDatasetTypeProperties()
                .withLocation(
                    new DatasetLocation()
                        .withFolderPath("datakobqoclflioe")
                        .withFileName("datahxessmvrk")
                        .withAdditionalProperties(mapOf("type", "DatasetLocation")))
                .withSheetName("datasbrujbjpppktlpdi")
                .withSheetIndex("datamthieatnejrnmin")
                .withRange("dataplgtkihonikzsrzf")
                .withFirstRowAsHeader("datajilzfbpntogke")
                .withCompression(
                    new DatasetCompression()
                        .withType("datack")
                        .withLevel("datamcarm")
                        .withAdditionalProperties(mapOf()))
                .withNullValue("datalqcskkqjmxptueip");
        model = BinaryData.fromObject(model).toObject(ExcelDatasetTypeProperties.class);
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