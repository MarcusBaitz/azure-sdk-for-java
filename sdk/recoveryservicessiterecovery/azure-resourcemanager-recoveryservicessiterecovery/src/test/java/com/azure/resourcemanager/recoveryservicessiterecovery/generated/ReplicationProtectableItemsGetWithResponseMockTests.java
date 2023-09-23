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
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ProtectableItem;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ReplicationProtectableItemsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"friendlyName\":\"dahyclxrsidoeb\",\"protectionStatus\":\"poiaffjkrtn\",\"replicationProtectedItemId\":\"evimxmaxcj\",\"recoveryServicesProviderId\":\"itygvdwds\",\"protectionReadinessErrors\":[\"bf\"],\"supportedReplicationProviders\":[\"ozbzchnqekwan\"],\"customDetails\":{\"instanceType\":\"ConfigurationSettings\"}},\"location\":\"urlcydjhtkjs\",\"id\":\"rwiyndurdonkgobx\",\"name\":\"lr\",\"type\":\"olenrswknpdr\"}";

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

        ProtectableItem response =
            manager
                .replicationProtectableItems()
                .getWithResponse("wdalisd", "qngca", "dz", "nloou", "p", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("dahyclxrsidoeb", response.properties().friendlyName());
        Assertions.assertEquals("poiaffjkrtn", response.properties().protectionStatus());
        Assertions.assertEquals("evimxmaxcj", response.properties().replicationProtectedItemId());
        Assertions.assertEquals("itygvdwds", response.properties().recoveryServicesProviderId());
        Assertions.assertEquals("bf", response.properties().protectionReadinessErrors().get(0));
        Assertions.assertEquals("ozbzchnqekwan", response.properties().supportedReplicationProviders().get(0));
        Assertions.assertEquals("urlcydjhtkjs", response.location());
    }
}