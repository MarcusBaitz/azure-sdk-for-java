// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.PossibleOperationsDirections;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlan;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanGroupType;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanPlannedFailoverInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanPlannedFailoverInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanProviderSpecificFailoverInput;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ReplicationRecoveryPlansPlannedFailoverMockTests {
    @Test
    public void testPlannedFailover() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"friendlyName\":\"mcer\",\"primaryFabricId\":\"feiqb\",\"primaryFabricFriendlyName\":\"thzw\",\"recoveryFabricId\":\"pssvnonij\",\"recoveryFabricFriendlyName\":\"cj\",\"failoverDeploymentModel\":\"zjku\",\"replicationProviders\":[\"qqbt\",\"kvocu\"],\"allowedOperations\":[\"lbpwarhwettohg\",\"z\",\"xyvtkzbhizxp\",\"sddmwnfhmju\"],\"lastPlannedFailoverTime\":\"2021-03-26T04:51:04Z\",\"lastUnplannedFailoverTime\":\"2021-01-08T10:12:47Z\",\"lastTestFailoverTime\":\"2021-08-31T12:11:02Z\",\"currentScenario\":{\"scenarioName\":\"lxudhek\",\"jobId\":\"nirmidtvhjc\",\"startTime\":\"2021-06-10T15:34:30Z\"},\"currentScenarioStatus\":\"bqygkxr\",\"currentScenarioStatusDescription\":\"ojlclpumveybodhr\",\"groups\":[{\"groupType\":\"Boot\",\"replicationProtectedItems\":[{},{}],\"startGroupActions\":[{\"actionName\":\"bcumjv\",\"failoverTypes\":[],\"failoverDirections\":[],\"customDetails\":{\"instanceType\":\"RecoveryPlanActionDetails\"}},{\"actionName\":\"gpdxtsaujtco\",\"failoverTypes\":[],\"failoverDirections\":[],\"customDetails\":{\"instanceType\":\"RecoveryPlanActionDetails\"}},{\"actionName\":\"jybolqoxupt\",\"failoverTypes\":[],\"failoverDirections\":[],\"customDetails\":{\"instanceType\":\"RecoveryPlanActionDetails\"}},{\"actionName\":\"l\",\"failoverTypes\":[],\"failoverDirections\":[],\"customDetails\":{\"instanceType\":\"RecoveryPlanActionDetails\"}}],\"endGroupActions\":[{\"actionName\":\"mlkwk\",\"failoverTypes\":[],\"failoverDirections\":[],\"customDetails\":{\"instanceType\":\"RecoveryPlanActionDetails\"}},{\"actionName\":\"linvamtykxsz\",\"failoverTypes\":[],\"failoverDirections\":[],\"customDetails\":{\"instanceType\":\"RecoveryPlanActionDetails\"}},{\"actionName\":\"ekfxcs\",\"failoverTypes\":[],\"failoverDirections\":[],\"customDetails\":{\"instanceType\":\"RecoveryPlanActionDetails\"}}]}],\"providerSpecificDetails\":[{\"instanceType\":\"RecoveryPlanProviderSpecificDetails\"},{\"instanceType\":\"RecoveryPlanProviderSpecificDetails\"},{\"instanceType\":\"RecoveryPlanProviderSpecificDetails\"},{\"instanceType\":\"RecoveryPlanProviderSpecificDetails\"}]},\"location\":\"ozkt\",\"id\":\"dpcz\",\"name\":\"ohplrgcnbvmhvq\",\"type\":\"kedaxkuyorfj\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        SiteRecoveryManager manager =
            SiteRecoveryManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        RecoveryPlan response =
            manager
                .replicationRecoveryPlans()
                .plannedFailover(
                    "sugqcglma",
                    "fzto",
                    "xvqlauu",
                    new RecoveryPlanPlannedFailoverInput()
                        .withProperties(
                            new RecoveryPlanPlannedFailoverInputProperties()
                                .withFailoverDirection(PossibleOperationsDirections.PRIMARY_TO_RECOVERY)
                                .withProviderSpecificDetails(
                                    Arrays
                                        .asList(
                                            new RecoveryPlanProviderSpecificFailoverInput(),
                                            new RecoveryPlanProviderSpecificFailoverInput(),
                                            new RecoveryPlanProviderSpecificFailoverInput(),
                                            new RecoveryPlanProviderSpecificFailoverInput()))),
                    com.azure.core.util.Context.NONE);

        Assertions.assertEquals("mcer", response.properties().friendlyName());
        Assertions.assertEquals("feiqb", response.properties().primaryFabricId());
        Assertions.assertEquals("thzw", response.properties().primaryFabricFriendlyName());
        Assertions.assertEquals("pssvnonij", response.properties().recoveryFabricId());
        Assertions.assertEquals("cj", response.properties().recoveryFabricFriendlyName());
        Assertions.assertEquals("zjku", response.properties().failoverDeploymentModel());
        Assertions.assertEquals("qqbt", response.properties().replicationProviders().get(0));
        Assertions.assertEquals("lbpwarhwettohg", response.properties().allowedOperations().get(0));
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-03-26T04:51:04Z"), response.properties().lastPlannedFailoverTime());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-01-08T10:12:47Z"), response.properties().lastUnplannedFailoverTime());
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-08-31T12:11:02Z"), response.properties().lastTestFailoverTime());
        Assertions.assertEquals("lxudhek", response.properties().currentScenario().scenarioName());
        Assertions.assertEquals("nirmidtvhjc", response.properties().currentScenario().jobId());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-06-10T15:34:30Z"), response.properties().currentScenario().startTime());
        Assertions.assertEquals("bqygkxr", response.properties().currentScenarioStatus());
        Assertions.assertEquals("ojlclpumveybodhr", response.properties().currentScenarioStatusDescription());
        Assertions.assertEquals(RecoveryPlanGroupType.BOOT, response.properties().groups().get(0).groupType());
        Assertions
            .assertEquals("bcumjv", response.properties().groups().get(0).startGroupActions().get(0).actionName());
        Assertions.assertEquals("mlkwk", response.properties().groups().get(0).endGroupActions().get(0).actionName());
        Assertions.assertEquals("ozkt", response.location());
    }
}