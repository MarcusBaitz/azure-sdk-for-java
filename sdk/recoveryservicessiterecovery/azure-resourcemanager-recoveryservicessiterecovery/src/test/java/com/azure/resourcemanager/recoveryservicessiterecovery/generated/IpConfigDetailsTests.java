// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.IpConfigDetails;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class IpConfigDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IpConfigDetails model =
            BinaryData
                .fromString(
                    "{\"name\":\"r\",\"isPrimary\":true,\"subnetName\":\"gaxwmzwdfkbnrzo\",\"staticIPAddress\":\"dltb\",\"ipAddressType\":\"tqjfgxxsaet\",\"isSeletedForFailover\":false,\"recoverySubnetName\":\"vpyigdaqq\",\"recoveryStaticIPAddress\":\"zdcduwjoedxng\",\"recoveryIPAddressType\":\"aifpaurwwgil\",\"recoveryPublicIPAddressId\":\"qqa\",\"recoveryLBBackendAddressPoolIds\":[\"kxwxdcvjwcyziake\",\"iqch\",\"rtui\",\"dsiwdfmmp\"],\"tfoSubnetName\":\"zzwvywrgyng\",\"tfoStaticIPAddress\":\"grpxncakiqaondjr\",\"tfoPublicIPAddressId\":\"lamgglvlmfejdo\",\"tfoLBBackendAddressPoolIds\":[\"kgltyg\",\"hqfgqkayejsx\"]}")
                .toObject(IpConfigDetails.class);
        Assertions.assertEquals("r", model.name());
        Assertions.assertEquals(true, model.isPrimary());
        Assertions.assertEquals("gaxwmzwdfkbnrzo", model.subnetName());
        Assertions.assertEquals("dltb", model.staticIpAddress());
        Assertions.assertEquals("tqjfgxxsaet", model.ipAddressType());
        Assertions.assertEquals(false, model.isSeletedForFailover());
        Assertions.assertEquals("vpyigdaqq", model.recoverySubnetName());
        Assertions.assertEquals("zdcduwjoedxng", model.recoveryStaticIpAddress());
        Assertions.assertEquals("aifpaurwwgil", model.recoveryIpAddressType());
        Assertions.assertEquals("qqa", model.recoveryPublicIpAddressId());
        Assertions.assertEquals("kxwxdcvjwcyziake", model.recoveryLBBackendAddressPoolIds().get(0));
        Assertions.assertEquals("zzwvywrgyng", model.tfoSubnetName());
        Assertions.assertEquals("grpxncakiqaondjr", model.tfoStaticIpAddress());
        Assertions.assertEquals("lamgglvlmfejdo", model.tfoPublicIpAddressId());
        Assertions.assertEquals("kgltyg", model.tfoLBBackendAddressPoolIds().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IpConfigDetails model =
            new IpConfigDetails()
                .withName("r")
                .withIsPrimary(true)
                .withSubnetName("gaxwmzwdfkbnrzo")
                .withStaticIpAddress("dltb")
                .withIpAddressType("tqjfgxxsaet")
                .withIsSeletedForFailover(false)
                .withRecoverySubnetName("vpyigdaqq")
                .withRecoveryStaticIpAddress("zdcduwjoedxng")
                .withRecoveryIpAddressType("aifpaurwwgil")
                .withRecoveryPublicIpAddressId("qqa")
                .withRecoveryLBBackendAddressPoolIds(Arrays.asList("kxwxdcvjwcyziake", "iqch", "rtui", "dsiwdfmmp"))
                .withTfoSubnetName("zzwvywrgyng")
                .withTfoStaticIpAddress("grpxncakiqaondjr")
                .withTfoPublicIpAddressId("lamgglvlmfejdo")
                .withTfoLBBackendAddressPoolIds(Arrays.asList("kgltyg", "hqfgqkayejsx"));
        model = BinaryData.fromObject(model).toObject(IpConfigDetails.class);
        Assertions.assertEquals("r", model.name());
        Assertions.assertEquals(true, model.isPrimary());
        Assertions.assertEquals("gaxwmzwdfkbnrzo", model.subnetName());
        Assertions.assertEquals("dltb", model.staticIpAddress());
        Assertions.assertEquals("tqjfgxxsaet", model.ipAddressType());
        Assertions.assertEquals(false, model.isSeletedForFailover());
        Assertions.assertEquals("vpyigdaqq", model.recoverySubnetName());
        Assertions.assertEquals("zdcduwjoedxng", model.recoveryStaticIpAddress());
        Assertions.assertEquals("aifpaurwwgil", model.recoveryIpAddressType());
        Assertions.assertEquals("qqa", model.recoveryPublicIpAddressId());
        Assertions.assertEquals("kxwxdcvjwcyziake", model.recoveryLBBackendAddressPoolIds().get(0));
        Assertions.assertEquals("zzwvywrgyng", model.tfoSubnetName());
        Assertions.assertEquals("grpxncakiqaondjr", model.tfoStaticIpAddress());
        Assertions.assertEquals("lamgglvlmfejdo", model.tfoPublicIpAddressId());
        Assertions.assertEquals("kgltyg", model.tfoLBBackendAddressPoolIds().get(0));
    }
}