// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.AzureMLExecutePipelineActivity;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureMLExecutePipelineActivityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureMLExecutePipelineActivity model =
            BinaryData
                .fromString(
                    "{\"type\":\"AzureMLExecutePipeline\",\"typeProperties\":{\"mlPipelineId\":\"datakkraenzuufpd\",\"mlPipelineEndpointId\":\"datanxephwxdw\",\"version\":\"datawymeqi\",\"experimentName\":\"datajca\",\"mlPipelineParameters\":\"dataxuox\",\"dataPathAssignments\":\"datapleooom\",\"mlParentRunId\":\"datadjfldzvgog\",\"continueOnStepFailure\":\"datacgaofobjlqnaxfvs\"},\"linkedServiceName\":{\"referenceName\":\"strbje\",\"parameters\":{\"wbslrqbdtcjbxoc\":\"databknpzhfhibh\",\"ahbzdgwkim\":\"dataijwpskneprumhik\",\"ujxdnia\":\"datavatrvjkxcrxqpen\",\"qytppjdyikdykxh\":\"dataeterjerhwgiuduw\"}},\"policy\":{\"timeout\":\"datadtucyutrpdgm\",\"retry\":\"datammc\",\"retryIntervalInSeconds\":813552830,\"secureInput\":false,\"secureOutput\":false,\"\":{\"efxaed\":\"datacrjy\",\"vn\":\"datac\",\"jbahshyxhfe\":\"datayfzavs\"}},\"name\":\"tywluxysmq\",\"description\":\"odfp\",\"state\":\"Inactive\",\"onInactiveMarkAs\":\"Skipped\",\"dependsOn\":[{\"activity\":\"ww\",\"dependencyConditions\":[\"Skipped\"],\"\":{\"vjefnlxq\":\"datamcaofxgw\",\"ambjqynwqcov\":\"datatedzxujxkxjrttzh\"}},{\"activity\":\"jvrsurqhhbddxko\",\"dependencyConditions\":[\"Skipped\",\"Completed\",\"Skipped\"],\"\":{\"vlfujsbcfoguub\":\"dataqasdvepldafxmp\",\"ri\":\"datacqnchdzyjugdknbl\",\"khugxtxxwb\":\"datavcpisvprumttr\"}}],\"userProperties\":[{\"name\":\"nlmpmvegxg\",\"value\":\"datamxplrtuegq\"}],\"\":{\"vjuowkt\":\"datalnjeybgpjy\",\"dkydqcgedip\":\"databpv\"}}")
                .toObject(AzureMLExecutePipelineActivity.class);
        Assertions.assertEquals("tywluxysmq", model.name());
        Assertions.assertEquals("odfp", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SKIPPED, model.onInactiveMarkAs());
        Assertions.assertEquals("ww", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SKIPPED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("nlmpmvegxg", model.userProperties().get(0).name());
        Assertions.assertEquals("strbje", model.linkedServiceName().referenceName());
        Assertions.assertEquals(813552830, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(false, model.policy().secureInput());
        Assertions.assertEquals(false, model.policy().secureOutput());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureMLExecutePipelineActivity model =
            new AzureMLExecutePipelineActivity()
                .withName("tywluxysmq")
                .withDescription("odfp")
                .withState(ActivityState.INACTIVE)
                .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SKIPPED)
                .withDependsOn(
                    Arrays
                        .asList(
                            new ActivityDependency()
                                .withActivity("ww")
                                .withDependencyConditions(Arrays.asList(DependencyCondition.SKIPPED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency()
                                .withActivity("jvrsurqhhbddxko")
                                .withDependencyConditions(
                                    Arrays
                                        .asList(
                                            DependencyCondition.SKIPPED,
                                            DependencyCondition.COMPLETED,
                                            DependencyCondition.SKIPPED))
                                .withAdditionalProperties(mapOf())))
                .withUserProperties(
                    Arrays.asList(new UserProperty().withName("nlmpmvegxg").withValue("datamxplrtuegq")))
                .withLinkedServiceName(
                    new LinkedServiceReference()
                        .withReferenceName("strbje")
                        .withParameters(
                            mapOf(
                                "wbslrqbdtcjbxoc",
                                "databknpzhfhibh",
                                "ahbzdgwkim",
                                "dataijwpskneprumhik",
                                "ujxdnia",
                                "datavatrvjkxcrxqpen",
                                "qytppjdyikdykxh",
                                "dataeterjerhwgiuduw")))
                .withPolicy(
                    new ActivityPolicy()
                        .withTimeout("datadtucyutrpdgm")
                        .withRetry("datammc")
                        .withRetryIntervalInSeconds(813552830)
                        .withSecureInput(false)
                        .withSecureOutput(false)
                        .withAdditionalProperties(mapOf()))
                .withMlPipelineId("datakkraenzuufpd")
                .withMlPipelineEndpointId("datanxephwxdw")
                .withVersion("datawymeqi")
                .withExperimentName("datajca")
                .withMlPipelineParameters("dataxuox")
                .withDataPathAssignments("datapleooom")
                .withMlParentRunId("datadjfldzvgog")
                .withContinueOnStepFailure("datacgaofobjlqnaxfvs");
        model = BinaryData.fromObject(model).toObject(AzureMLExecutePipelineActivity.class);
        Assertions.assertEquals("tywluxysmq", model.name());
        Assertions.assertEquals("odfp", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SKIPPED, model.onInactiveMarkAs());
        Assertions.assertEquals("ww", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SKIPPED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("nlmpmvegxg", model.userProperties().get(0).name());
        Assertions.assertEquals("strbje", model.linkedServiceName().referenceName());
        Assertions.assertEquals(813552830, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(false, model.policy().secureInput());
        Assertions.assertEquals(false, model.policy().secureOutput());
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