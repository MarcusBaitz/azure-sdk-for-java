// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.AddRecoveryServicesProviderInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.AddRecoveryServicesProviderInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.IdentityProviderInput;
import org.junit.jupiter.api.Assertions;

public final class AddRecoveryServicesProviderInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AddRecoveryServicesProviderInput model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"machineName\":\"xg\",\"machineId\":\"oyxcdyuib\",\"biosId\":\"fdn\",\"authenticationIdentityInput\":{\"tenantId\":\"zydvfvf\",\"applicationId\":\"jnaeois\",\"objectId\":\"vhmgorffukis\",\"audience\":\"vwmzhwplefaxvxil\",\"aadAuthority\":\"btgn\"},\"resourceAccessIdentityInput\":{\"tenantId\":\"nzeyqxtjj\",\"applicationId\":\"zqlqhyc\",\"objectId\":\"vodggxdbee\",\"audience\":\"mieknlraria\",\"aadAuthority\":\"wiuagydwqf\"},\"dataPlaneAuthenticationIdentityInput\":{\"tenantId\":\"lyr\",\"applicationId\":\"giagtcojo\",\"objectId\":\"qwogfnzjvus\",\"audience\":\"zldmozuxy\",\"aadAuthority\":\"fsbtkad\"}}}")
                .toObject(AddRecoveryServicesProviderInput.class);
        Assertions.assertEquals("xg", model.properties().machineName());
        Assertions.assertEquals("oyxcdyuib", model.properties().machineId());
        Assertions.assertEquals("fdn", model.properties().biosId());
        Assertions.assertEquals("zydvfvf", model.properties().authenticationIdentityInput().tenantId());
        Assertions.assertEquals("jnaeois", model.properties().authenticationIdentityInput().applicationId());
        Assertions.assertEquals("vhmgorffukis", model.properties().authenticationIdentityInput().objectId());
        Assertions.assertEquals("vwmzhwplefaxvxil", model.properties().authenticationIdentityInput().audience());
        Assertions.assertEquals("btgn", model.properties().authenticationIdentityInput().aadAuthority());
        Assertions.assertEquals("nzeyqxtjj", model.properties().resourceAccessIdentityInput().tenantId());
        Assertions.assertEquals("zqlqhyc", model.properties().resourceAccessIdentityInput().applicationId());
        Assertions.assertEquals("vodggxdbee", model.properties().resourceAccessIdentityInput().objectId());
        Assertions.assertEquals("mieknlraria", model.properties().resourceAccessIdentityInput().audience());
        Assertions.assertEquals("wiuagydwqf", model.properties().resourceAccessIdentityInput().aadAuthority());
        Assertions.assertEquals("lyr", model.properties().dataPlaneAuthenticationIdentityInput().tenantId());
        Assertions.assertEquals("giagtcojo", model.properties().dataPlaneAuthenticationIdentityInput().applicationId());
        Assertions.assertEquals("qwogfnzjvus", model.properties().dataPlaneAuthenticationIdentityInput().objectId());
        Assertions.assertEquals("zldmozuxy", model.properties().dataPlaneAuthenticationIdentityInput().audience());
        Assertions.assertEquals("fsbtkad", model.properties().dataPlaneAuthenticationIdentityInput().aadAuthority());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AddRecoveryServicesProviderInput model =
            new AddRecoveryServicesProviderInput()
                .withProperties(
                    new AddRecoveryServicesProviderInputProperties()
                        .withMachineName("xg")
                        .withMachineId("oyxcdyuib")
                        .withBiosId("fdn")
                        .withAuthenticationIdentityInput(
                            new IdentityProviderInput()
                                .withTenantId("zydvfvf")
                                .withApplicationId("jnaeois")
                                .withObjectId("vhmgorffukis")
                                .withAudience("vwmzhwplefaxvxil")
                                .withAadAuthority("btgn"))
                        .withResourceAccessIdentityInput(
                            new IdentityProviderInput()
                                .withTenantId("nzeyqxtjj")
                                .withApplicationId("zqlqhyc")
                                .withObjectId("vodggxdbee")
                                .withAudience("mieknlraria")
                                .withAadAuthority("wiuagydwqf"))
                        .withDataPlaneAuthenticationIdentityInput(
                            new IdentityProviderInput()
                                .withTenantId("lyr")
                                .withApplicationId("giagtcojo")
                                .withObjectId("qwogfnzjvus")
                                .withAudience("zldmozuxy")
                                .withAadAuthority("fsbtkad")));
        model = BinaryData.fromObject(model).toObject(AddRecoveryServicesProviderInput.class);
        Assertions.assertEquals("xg", model.properties().machineName());
        Assertions.assertEquals("oyxcdyuib", model.properties().machineId());
        Assertions.assertEquals("fdn", model.properties().biosId());
        Assertions.assertEquals("zydvfvf", model.properties().authenticationIdentityInput().tenantId());
        Assertions.assertEquals("jnaeois", model.properties().authenticationIdentityInput().applicationId());
        Assertions.assertEquals("vhmgorffukis", model.properties().authenticationIdentityInput().objectId());
        Assertions.assertEquals("vwmzhwplefaxvxil", model.properties().authenticationIdentityInput().audience());
        Assertions.assertEquals("btgn", model.properties().authenticationIdentityInput().aadAuthority());
        Assertions.assertEquals("nzeyqxtjj", model.properties().resourceAccessIdentityInput().tenantId());
        Assertions.assertEquals("zqlqhyc", model.properties().resourceAccessIdentityInput().applicationId());
        Assertions.assertEquals("vodggxdbee", model.properties().resourceAccessIdentityInput().objectId());
        Assertions.assertEquals("mieknlraria", model.properties().resourceAccessIdentityInput().audience());
        Assertions.assertEquals("wiuagydwqf", model.properties().resourceAccessIdentityInput().aadAuthority());
        Assertions.assertEquals("lyr", model.properties().dataPlaneAuthenticationIdentityInput().tenantId());
        Assertions.assertEquals("giagtcojo", model.properties().dataPlaneAuthenticationIdentityInput().applicationId());
        Assertions.assertEquals("qwogfnzjvus", model.properties().dataPlaneAuthenticationIdentityInput().objectId());
        Assertions.assertEquals("zldmozuxy", model.properties().dataPlaneAuthenticationIdentityInput().audience());
        Assertions.assertEquals("fsbtkad", model.properties().dataPlaneAuthenticationIdentityInput().aadAuthority());
    }
}