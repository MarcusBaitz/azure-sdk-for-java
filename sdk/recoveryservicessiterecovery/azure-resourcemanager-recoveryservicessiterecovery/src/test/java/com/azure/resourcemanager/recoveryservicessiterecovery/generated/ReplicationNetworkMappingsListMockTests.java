// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.NetworkMapping;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ReplicationNetworkMappingsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"state\":\"zzkueruwcjomi\",\"primaryNetworkFriendlyName\":\"wkau\",\"primaryNetworkId\":\"twykoxvbw\",\"primaryFabricFriendlyName\":\"xxdplrelfkvga\",\"recoveryNetworkFriendlyName\":\"btuxlbpxrhrfje\",\"recoveryNetworkId\":\"azwef\",\"recoveryFabricArmId\":\"tlhqas\",\"recoveryFabricFriendlyName\":\"ostjixyz\",\"fabricSpecificSettings\":{\"instanceType\":\"NetworkMappingFabricSpecificSettings\"}},\"location\":\"i\",\"id\":\"zzdw\",\"name\":\"tacfvvtdpcbp\",\"type\":\"fomcsau\"}]}";

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

        PagedIterable<NetworkMapping> response =
            manager.replicationNetworkMappings().list("vphirlzbip", "unnep", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("zzkueruwcjomi", response.iterator().next().properties().state());
        Assertions.assertEquals("wkau", response.iterator().next().properties().primaryNetworkFriendlyName());
        Assertions.assertEquals("twykoxvbw", response.iterator().next().properties().primaryNetworkId());
        Assertions.assertEquals("xxdplrelfkvga", response.iterator().next().properties().primaryFabricFriendlyName());
        Assertions
            .assertEquals("btuxlbpxrhrfje", response.iterator().next().properties().recoveryNetworkFriendlyName());
        Assertions.assertEquals("azwef", response.iterator().next().properties().recoveryNetworkId());
        Assertions.assertEquals("tlhqas", response.iterator().next().properties().recoveryFabricArmId());
        Assertions.assertEquals("ostjixyz", response.iterator().next().properties().recoveryFabricFriendlyName());
        Assertions.assertEquals("i", response.iterator().next().location());
    }
}