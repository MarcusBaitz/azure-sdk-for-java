// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DelimitedTextSink;
import com.azure.resourcemanager.datafactory.models.DelimitedTextWriteSettings;
import com.azure.resourcemanager.datafactory.models.StoreWriteSettings;
import java.util.HashMap;
import java.util.Map;

public final class DelimitedTextSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DelimitedTextSink model =
            BinaryData
                .fromString(
                    "{\"type\":\"DelimitedTextSink\",\"storeSettings\":{\"type\":\"StoreWriteSettings\",\"maxConcurrentConnections\":\"dataagzmyxsoxqarjt\",\"disableMetricsCollection\":\"datalllmtiyguuhylzbd\",\"copyBehavior\":\"datatdohjxfqyyu\",\"\":{\"znxhbttkkicxjxu\":\"datal\",\"jvkqj\":\"datailix\"}},\"formatSettings\":{\"type\":\"DelimitedTextWriteSettings\",\"quoteAllText\":\"datalhcmxxxp\",\"fileExtension\":\"datakxclj\",\"maxRowsPerFile\":\"datamsfsquxxqcimnchv\",\"fileNamePrefix\":\"datawrivagc\",\"\":{\"ysfjdcokbpbpq\":\"datatepsybdgtfo\",\"tnbyvbgrdrumu\":\"datalmszobtne\",\"wecdsybiazfvx\":\"datau\",\"eqly\":\"datakwv\"}},\"writeBatchSize\":\"datayqqonkre\",\"writeBatchTimeout\":\"dataojusmdod\",\"sinkRetryCount\":\"datak\",\"sinkRetryWait\":\"datantaovlyyk\",\"maxConcurrentConnections\":\"datafpkdsldyw\",\"disableMetricsCollection\":\"datavswlhj\",\"\":{\"kqzfwl\":\"dataqygszhpnatltj\",\"ayyuqecwrtr\":\"datayrnmgsbubz\",\"smvvfpkymqnvvwfa\":\"dataderzsnfgmohhcgh\",\"armtuprqtcxqkoh\":\"datarulboawzplwghfgq\"}}")
                .toObject(DelimitedTextSink.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DelimitedTextSink model =
            new DelimitedTextSink()
                .withWriteBatchSize("datayqqonkre")
                .withWriteBatchTimeout("dataojusmdod")
                .withSinkRetryCount("datak")
                .withSinkRetryWait("datantaovlyyk")
                .withMaxConcurrentConnections("datafpkdsldyw")
                .withDisableMetricsCollection("datavswlhj")
                .withStoreSettings(
                    new StoreWriteSettings()
                        .withMaxConcurrentConnections("dataagzmyxsoxqarjt")
                        .withDisableMetricsCollection("datalllmtiyguuhylzbd")
                        .withCopyBehavior("datatdohjxfqyyu")
                        .withAdditionalProperties(mapOf("type", "StoreWriteSettings")))
                .withFormatSettings(
                    new DelimitedTextWriteSettings()
                        .withQuoteAllText("datalhcmxxxp")
                        .withFileExtension("datakxclj")
                        .withMaxRowsPerFile("datamsfsquxxqcimnchv")
                        .withFileNamePrefix("datawrivagc"));
        model = BinaryData.fromObject(model).toObject(DelimitedTextSink.class);
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