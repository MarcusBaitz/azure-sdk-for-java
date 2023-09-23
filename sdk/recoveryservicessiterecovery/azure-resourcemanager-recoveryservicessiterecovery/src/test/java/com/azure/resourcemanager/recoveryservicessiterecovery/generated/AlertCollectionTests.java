// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.AlertInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.AlertCollection;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.AlertProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AlertCollectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AlertCollection model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"sendToOwners\":\"n\",\"customEmailAddresses\":[\"ybrk\"],\"locale\":\"dumjgrtfwvuk\"},\"location\":\"audccsnhs\",\"id\":\"cnyejhkryhtnapcz\",\"name\":\"lokjyemkk\",\"type\":\"ni\"}],\"nextLink\":\"oxzjnchgejspod\"}")
                .toObject(AlertCollection.class);
        Assertions.assertEquals("n", model.value().get(0).properties().sendToOwners());
        Assertions.assertEquals("ybrk", model.value().get(0).properties().customEmailAddresses().get(0));
        Assertions.assertEquals("dumjgrtfwvuk", model.value().get(0).properties().locale());
        Assertions.assertEquals("audccsnhs", model.value().get(0).location());
        Assertions.assertEquals("oxzjnchgejspod", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AlertCollection model =
            new AlertCollection()
                .withValue(
                    Arrays
                        .asList(
                            new AlertInner()
                                .withProperties(
                                    new AlertProperties()
                                        .withSendToOwners("n")
                                        .withCustomEmailAddresses(Arrays.asList("ybrk"))
                                        .withLocale("dumjgrtfwvuk"))
                                .withLocation("audccsnhs")))
                .withNextLink("oxzjnchgejspod");
        model = BinaryData.fromObject(model).toObject(AlertCollection.class);
        Assertions.assertEquals("n", model.value().get(0).properties().sendToOwners());
        Assertions.assertEquals("ybrk", model.value().get(0).properties().customEmailAddresses().get(0));
        Assertions.assertEquals("dumjgrtfwvuk", model.value().get(0).properties().locale());
        Assertions.assertEquals("audccsnhs", model.value().get(0).location());
        Assertions.assertEquals("oxzjnchgejspod", model.nextLink());
    }
}