// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.AzureMLUpdateResourceActivity;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureMLUpdateResourceActivityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureMLUpdateResourceActivity model =
            BinaryData
                .fromString(
                    "{\"type\":\"AzureMLUpdateResource\",\"typeProperties\":{\"trainedModelName\":\"datasqovmtidmyc\",\"trainedModelLinkedServiceName\":{\"referenceName\":\"yajlnotmirgip\",\"parameters\":{\"hnj\":\"datanbfxmefymdmfrfz\",\"twmmvbahftkcey\":\"dataqzdzkyqqbqbwbw\"}},\"trainedModelFilePath\":\"datatdeyoxtlq\"},\"linkedServiceName\":{\"referenceName\":\"xftepzrcqnsjqrgt\",\"parameters\":{\"b\":\"datawpzphkm\",\"ondbvlqtpeba\":\"datarqk\",\"vqdwzyvxd\":\"datawzsxpyrbjt\"}},\"policy\":{\"timeout\":\"datanieqlikyc\",\"retry\":\"datanfukehxvktlrc\",\"retryIntervalInSeconds\":1149102333,\"secureInput\":true,\"secureOutput\":false,\"\":{\"zqamxxpfy\":\"datauwnrqf\",\"rtgww\":\"datampftwtepu\"}},\"name\":\"aolfdgjrgp\",\"description\":\"vohvcaqarppkzz\",\"state\":\"Active\",\"onInactiveMarkAs\":\"Failed\",\"dependsOn\":[{\"activity\":\"qou\",\"dependencyConditions\":[\"Completed\",\"Failed\",\"Skipped\",\"Completed\"],\"\":{\"znnpazbfrqotigxn\":\"datahtncadrmthhfx\"}}],\"userProperties\":[{\"name\":\"xnvwq\",\"value\":\"datahklhoss\"},{\"name\":\"pjtiu\",\"value\":\"datagjbfm\"},{\"name\":\"sjgmes\",\"value\":\"datamhxkjj\"}],\"\":{\"yafazwie\":\"datargxskghdadgqpbg\",\"rijcwnthtq\":\"datazzxjjdboxuinrs\",\"zbvdzjlkocjuajcl\":\"databcwtcqjsvlzdus\",\"iprjahgqzb\":\"datatssbkzdgwpyljn\"}}")
                .toObject(AzureMLUpdateResourceActivity.class);
        Assertions.assertEquals("aolfdgjrgp", model.name());
        Assertions.assertEquals("vohvcaqarppkzz", model.description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.FAILED, model.onInactiveMarkAs());
        Assertions.assertEquals("qou", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.COMPLETED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("xnvwq", model.userProperties().get(0).name());
        Assertions.assertEquals("xftepzrcqnsjqrgt", model.linkedServiceName().referenceName());
        Assertions.assertEquals(1149102333, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(false, model.policy().secureOutput());
        Assertions.assertEquals("yajlnotmirgip", model.trainedModelLinkedServiceName().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureMLUpdateResourceActivity model =
            new AzureMLUpdateResourceActivity()
                .withName("aolfdgjrgp")
                .withDescription("vohvcaqarppkzz")
                .withState(ActivityState.ACTIVE)
                .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.FAILED)
                .withDependsOn(
                    Arrays
                        .asList(
                            new ActivityDependency()
                                .withActivity("qou")
                                .withDependencyConditions(
                                    Arrays
                                        .asList(
                                            DependencyCondition.COMPLETED,
                                            DependencyCondition.FAILED,
                                            DependencyCondition.SKIPPED,
                                            DependencyCondition.COMPLETED))
                                .withAdditionalProperties(mapOf())))
                .withUserProperties(
                    Arrays
                        .asList(
                            new UserProperty().withName("xnvwq").withValue("datahklhoss"),
                            new UserProperty().withName("pjtiu").withValue("datagjbfm"),
                            new UserProperty().withName("sjgmes").withValue("datamhxkjj")))
                .withLinkedServiceName(
                    new LinkedServiceReference()
                        .withReferenceName("xftepzrcqnsjqrgt")
                        .withParameters(
                            mapOf("b", "datawpzphkm", "ondbvlqtpeba", "datarqk", "vqdwzyvxd", "datawzsxpyrbjt")))
                .withPolicy(
                    new ActivityPolicy()
                        .withTimeout("datanieqlikyc")
                        .withRetry("datanfukehxvktlrc")
                        .withRetryIntervalInSeconds(1149102333)
                        .withSecureInput(true)
                        .withSecureOutput(false)
                        .withAdditionalProperties(mapOf()))
                .withTrainedModelName("datasqovmtidmyc")
                .withTrainedModelLinkedServiceName(
                    new LinkedServiceReference()
                        .withReferenceName("yajlnotmirgip")
                        .withParameters(mapOf("hnj", "datanbfxmefymdmfrfz", "twmmvbahftkcey", "dataqzdzkyqqbqbwbw")))
                .withTrainedModelFilePath("datatdeyoxtlq");
        model = BinaryData.fromObject(model).toObject(AzureMLUpdateResourceActivity.class);
        Assertions.assertEquals("aolfdgjrgp", model.name());
        Assertions.assertEquals("vohvcaqarppkzz", model.description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.FAILED, model.onInactiveMarkAs());
        Assertions.assertEquals("qou", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.COMPLETED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("xnvwq", model.userProperties().get(0).name());
        Assertions.assertEquals("xftepzrcqnsjqrgt", model.linkedServiceName().referenceName());
        Assertions.assertEquals(1149102333, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(false, model.policy().secureOutput());
        Assertions.assertEquals("yajlnotmirgip", model.trainedModelLinkedServiceName().referenceName());
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