// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.AzureMLBatchExecutionActivity;
import com.azure.resourcemanager.datafactory.models.AzureMLWebServiceFile;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureMLBatchExecutionActivityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureMLBatchExecutionActivity model =
            BinaryData
                .fromString(
                    "{\"type\":\"AzureMLBatchExecution\",\"typeProperties\":{\"globalParameters\":{\"zhyceteidf\":\"datangiaadgx\",\"ikyn\":\"dataofmcnnicmlomlnpr\"},\"webServiceOutputs\":{\"c\":{\"filePath\":\"datagquphqnuitumxhve\",\"linkedServiceName\":{\"referenceName\":\"ogabcwvibjfkc\",\"parameters\":{\"utjdmd\":\"datan\",\"qehgrjgvrawjom\":\"datatbdtrqiuohijjlax\",\"dwfyagvhe\":\"datagb\",\"ndapxxgvcsvtf\":\"dataptcuqzdwpcupejzo\"}}}},\"webServiceInputs\":{\"ixxiukghxde\":{\"filePath\":\"datateexapfypdfie\",\"linkedServiceName\":{\"referenceName\":\"utcedeygsrrg\",\"parameters\":{\"wo\":\"dataaqyesahvowlib\",\"okkagkaitihncysa\":\"datadwzzacyrkc\",\"ora\":\"datajlq\",\"ajlptydvebipkeo\":\"datatbiskkceb\"}}},\"gpqxiyllamdz\":{\"filePath\":\"dataqptvxibpzhkn\",\"linkedServiceName\":{\"referenceName\":\"uevzqawjnwj\",\"parameters\":{\"sjghfaldxsd\":\"dataubpfe\",\"jseftvwu\":\"datalbbp\",\"naqyeswinoecwabu\":\"datafmakn\",\"eqayvkmp\":\"dataqflwskb\"}}},\"glimacztkypyvz\":{\"filePath\":\"datazjrlm\",\"linkedServiceName\":{\"referenceName\":\"dboesxpc\",\"parameters\":{\"tbd\":\"databpahbcyggflos\",\"bd\":\"datapydc\"}}}}},\"linkedServiceName\":{\"referenceName\":\"h\",\"parameters\":{\"xdyyo\":\"datarcum\",\"vuemjcjeja\":\"databbtwpkg\"}},\"policy\":{\"timeout\":\"datavxumtxuvdotei\",\"retry\":\"datawrmdqqg\",\"retryIntervalInSeconds\":1560089068,\"secureInput\":false,\"secureOutput\":false,\"\":{\"yfszluzmzgat\":\"dataym\",\"ckmcukzwzgio\":\"dataagroejsaer\",\"iwbvyraazsc\":\"datazrxgqxddvuiu\",\"xmkmybo\":\"dataikjyjcshmtpdvu\"}},\"name\":\"ax\",\"description\":\"ckfivi\",\"state\":\"Inactive\",\"onInactiveMarkAs\":\"Succeeded\",\"dependsOn\":[{\"activity\":\"dqzg\",\"dependencyConditions\":[\"Failed\",\"Skipped\",\"Completed\"],\"\":{\"y\":\"datafraohiyeyfsvuy\"}}],\"userProperties\":[{\"name\":\"zpjnakqcsgoozyxu\",\"value\":\"dataieitp\"},{\"name\":\"kjyjhkrk\",\"value\":\"dataznifpxiqpjnqyylk\"},{\"name\":\"bkljj\",\"value\":\"datauirmcupbehqbmhqi\"}],\"\":{\"ocvctmpxnbnhogb\":\"datadhoagcu\",\"efgett\":\"datahaw\",\"kbvhd\":\"datazlokttpmbxn\"}}")
                .toObject(AzureMLBatchExecutionActivity.class);
        Assertions.assertEquals("ax", model.name());
        Assertions.assertEquals("ckfivi", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SUCCEEDED, model.onInactiveMarkAs());
        Assertions.assertEquals("dqzg", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.FAILED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("zpjnakqcsgoozyxu", model.userProperties().get(0).name());
        Assertions.assertEquals("h", model.linkedServiceName().referenceName());
        Assertions.assertEquals(1560089068, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(false, model.policy().secureInput());
        Assertions.assertEquals(false, model.policy().secureOutput());
        Assertions
            .assertEquals("ogabcwvibjfkc", model.webServiceOutputs().get("c").linkedServiceName().referenceName());
        Assertions
            .assertEquals(
                "utcedeygsrrg", model.webServiceInputs().get("ixxiukghxde").linkedServiceName().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureMLBatchExecutionActivity model =
            new AzureMLBatchExecutionActivity()
                .withName("ax")
                .withDescription("ckfivi")
                .withState(ActivityState.INACTIVE)
                .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SUCCEEDED)
                .withDependsOn(
                    Arrays
                        .asList(
                            new ActivityDependency()
                                .withActivity("dqzg")
                                .withDependencyConditions(
                                    Arrays
                                        .asList(
                                            DependencyCondition.FAILED,
                                            DependencyCondition.SKIPPED,
                                            DependencyCondition.COMPLETED))
                                .withAdditionalProperties(mapOf())))
                .withUserProperties(
                    Arrays
                        .asList(
                            new UserProperty().withName("zpjnakqcsgoozyxu").withValue("dataieitp"),
                            new UserProperty().withName("kjyjhkrk").withValue("dataznifpxiqpjnqyylk"),
                            new UserProperty().withName("bkljj").withValue("datauirmcupbehqbmhqi")))
                .withLinkedServiceName(
                    new LinkedServiceReference()
                        .withReferenceName("h")
                        .withParameters(mapOf("xdyyo", "datarcum", "vuemjcjeja", "databbtwpkg")))
                .withPolicy(
                    new ActivityPolicy()
                        .withTimeout("datavxumtxuvdotei")
                        .withRetry("datawrmdqqg")
                        .withRetryIntervalInSeconds(1560089068)
                        .withSecureInput(false)
                        .withSecureOutput(false)
                        .withAdditionalProperties(mapOf()))
                .withGlobalParameters(mapOf("zhyceteidf", "datangiaadgx", "ikyn", "dataofmcnnicmlomlnpr"))
                .withWebServiceOutputs(
                    mapOf(
                        "c",
                        new AzureMLWebServiceFile()
                            .withFilePath("datagquphqnuitumxhve")
                            .withLinkedServiceName(
                                new LinkedServiceReference()
                                    .withReferenceName("ogabcwvibjfkc")
                                    .withParameters(
                                        mapOf(
                                            "utjdmd",
                                            "datan",
                                            "qehgrjgvrawjom",
                                            "datatbdtrqiuohijjlax",
                                            "dwfyagvhe",
                                            "datagb",
                                            "ndapxxgvcsvtf",
                                            "dataptcuqzdwpcupejzo")))))
                .withWebServiceInputs(
                    mapOf(
                        "ixxiukghxde",
                        new AzureMLWebServiceFile()
                            .withFilePath("datateexapfypdfie")
                            .withLinkedServiceName(
                                new LinkedServiceReference()
                                    .withReferenceName("utcedeygsrrg")
                                    .withParameters(
                                        mapOf(
                                            "wo",
                                            "dataaqyesahvowlib",
                                            "okkagkaitihncysa",
                                            "datadwzzacyrkc",
                                            "ora",
                                            "datajlq",
                                            "ajlptydvebipkeo",
                                            "datatbiskkceb"))),
                        "gpqxiyllamdz",
                        new AzureMLWebServiceFile()
                            .withFilePath("dataqptvxibpzhkn")
                            .withLinkedServiceName(
                                new LinkedServiceReference()
                                    .withReferenceName("uevzqawjnwj")
                                    .withParameters(
                                        mapOf(
                                            "sjghfaldxsd",
                                            "dataubpfe",
                                            "jseftvwu",
                                            "datalbbp",
                                            "naqyeswinoecwabu",
                                            "datafmakn",
                                            "eqayvkmp",
                                            "dataqflwskb"))),
                        "glimacztkypyvz",
                        new AzureMLWebServiceFile()
                            .withFilePath("datazjrlm")
                            .withLinkedServiceName(
                                new LinkedServiceReference()
                                    .withReferenceName("dboesxpc")
                                    .withParameters(mapOf("tbd", "databpahbcyggflos", "bd", "datapydc")))));
        model = BinaryData.fromObject(model).toObject(AzureMLBatchExecutionActivity.class);
        Assertions.assertEquals("ax", model.name());
        Assertions.assertEquals("ckfivi", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SUCCEEDED, model.onInactiveMarkAs());
        Assertions.assertEquals("dqzg", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.FAILED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("zpjnakqcsgoozyxu", model.userProperties().get(0).name());
        Assertions.assertEquals("h", model.linkedServiceName().referenceName());
        Assertions.assertEquals(1560089068, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(false, model.policy().secureInput());
        Assertions.assertEquals(false, model.policy().secureOutput());
        Assertions
            .assertEquals("ogabcwvibjfkc", model.webServiceOutputs().get("c").linkedServiceName().referenceName());
        Assertions
            .assertEquals(
                "utcedeygsrrg", model.webServiceInputs().get("ixxiukghxde").linkedServiceName().referenceName());
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