// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.IpConfigInputDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.VMNicInputDetails;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class VMNicInputDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VMNicInputDetails model =
            BinaryData
                .fromString(
                    "{\"nicId\":\"uq\",\"ipConfigs\":[{\"ipConfigName\":\"gzlvdnkfxu\",\"isPrimary\":true,\"isSeletedForFailover\":false,\"recoverySubnetName\":\"rmuhapfcq\",\"recoveryStaticIPAddress\":\"sqxqvp\",\"recoveryPublicIPAddressId\":\"uoymgccelvezry\",\"recoveryLBBackendAddressPoolIds\":[\"mfe\",\"kerqwkyh\",\"ob\"],\"tfoSubnetName\":\"gxedkow\",\"tfoStaticIPAddress\":\"bqpc\",\"tfoPublicIPAddressId\":\"kbwcc\",\"tfoLBBackendAddressPoolIds\":[\"vcdwxlpqekftn\",\"htjsying\",\"fq\"]},{\"ipConfigName\":\"mtdh\",\"isPrimary\":true,\"isSeletedForFailover\":false,\"recoverySubnetName\":\"gikdgsz\",\"recoveryStaticIPAddress\":\"kbir\",\"recoveryPublicIPAddressId\":\"uzhlhkjoqrv\",\"recoveryLBBackendAddressPoolIds\":[\"atjinrvgoupmfiib\",\"ggjioolvr\",\"x\",\"v\"],\"tfoSubnetName\":\"k\",\"tfoStaticIPAddress\":\"lqwjygvjayvblm\",\"tfoPublicIPAddressId\":\"k\",\"tfoLBBackendAddressPoolIds\":[\"bxvvyhg\",\"opbyrqufegxu\",\"wz\",\"bnhlmc\"]},{\"ipConfigName\":\"p\",\"isPrimary\":false,\"isSeletedForFailover\":true,\"recoverySubnetName\":\"gbmhrixkwmyi\",\"recoveryStaticIPAddress\":\"jvegrhbpnaixexcc\",\"recoveryPublicIPAddressId\":\"reaxhcexdr\",\"recoveryLBBackendAddressPoolIds\":[\"ahqkg\",\"tpwijnh\",\"jsvfycxzbfvoowv\",\"vmtgjqppy\"],\"tfoSubnetName\":\"tronzmyhgfi\",\"tfoStaticIPAddress\":\"sxkm\",\"tfoPublicIPAddressId\":\"a\",\"tfoLBBackendAddressPoolIds\":[\"rjreafxts\",\"umh\",\"glikkxwslolb\"]},{\"ipConfigName\":\"vuzlm\",\"isPrimary\":false,\"isSeletedForFailover\":false,\"recoverySubnetName\":\"tgp\",\"recoveryStaticIPAddress\":\"rpw\",\"recoveryPublicIPAddressId\":\"eznoig\",\"recoveryLBBackendAddressPoolIds\":[\"jwmwkpnbs\",\"zejjoqk\",\"gfhsxttaugzxn\",\"aa\"],\"tfoSubnetName\":\"xdtnkdmkqjjlw\",\"tfoStaticIPAddress\":\"nvrk\",\"tfoPublicIPAddressId\":\"ou\",\"tfoLBBackendAddressPoolIds\":[\"rebqaaysjk\"]}],\"selectionType\":\"qtnqtt\",\"recoveryNetworkSecurityGroupId\":\"lwfffi\",\"enableAcceleratedNetworkingOnRecovery\":true,\"tfoNetworkSecurityGroupId\":\"pqqmted\",\"enableAcceleratedNetworkingOnTfo\":false,\"recoveryNicName\":\"jihy\",\"recoveryNicResourceGroupName\":\"zphv\",\"reuseExistingNic\":true,\"tfoNicName\":\"qncygupkvi\",\"tfoNicResourceGroupName\":\"dscwxqupevzhf\",\"tfoReuseExistingNic\":true,\"targetNicName\":\"xhojuj\"}")
                .toObject(VMNicInputDetails.class);
        Assertions.assertEquals("uq", model.nicId());
        Assertions.assertEquals("gzlvdnkfxu", model.ipConfigs().get(0).ipConfigName());
        Assertions.assertEquals(true, model.ipConfigs().get(0).isPrimary());
        Assertions.assertEquals(false, model.ipConfigs().get(0).isSeletedForFailover());
        Assertions.assertEquals("rmuhapfcq", model.ipConfigs().get(0).recoverySubnetName());
        Assertions.assertEquals("sqxqvp", model.ipConfigs().get(0).recoveryStaticIpAddress());
        Assertions.assertEquals("uoymgccelvezry", model.ipConfigs().get(0).recoveryPublicIpAddressId());
        Assertions.assertEquals("mfe", model.ipConfigs().get(0).recoveryLBBackendAddressPoolIds().get(0));
        Assertions.assertEquals("gxedkow", model.ipConfigs().get(0).tfoSubnetName());
        Assertions.assertEquals("bqpc", model.ipConfigs().get(0).tfoStaticIpAddress());
        Assertions.assertEquals("kbwcc", model.ipConfigs().get(0).tfoPublicIpAddressId());
        Assertions.assertEquals("vcdwxlpqekftn", model.ipConfigs().get(0).tfoLBBackendAddressPoolIds().get(0));
        Assertions.assertEquals("qtnqtt", model.selectionType());
        Assertions.assertEquals("lwfffi", model.recoveryNetworkSecurityGroupId());
        Assertions.assertEquals(true, model.enableAcceleratedNetworkingOnRecovery());
        Assertions.assertEquals("pqqmted", model.tfoNetworkSecurityGroupId());
        Assertions.assertEquals(false, model.enableAcceleratedNetworkingOnTfo());
        Assertions.assertEquals("jihy", model.recoveryNicName());
        Assertions.assertEquals("zphv", model.recoveryNicResourceGroupName());
        Assertions.assertEquals(true, model.reuseExistingNic());
        Assertions.assertEquals("qncygupkvi", model.tfoNicName());
        Assertions.assertEquals("dscwxqupevzhf", model.tfoNicResourceGroupName());
        Assertions.assertEquals(true, model.tfoReuseExistingNic());
        Assertions.assertEquals("xhojuj", model.targetNicName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VMNicInputDetails model =
            new VMNicInputDetails()
                .withNicId("uq")
                .withIpConfigs(
                    Arrays
                        .asList(
                            new IpConfigInputDetails()
                                .withIpConfigName("gzlvdnkfxu")
                                .withIsPrimary(true)
                                .withIsSeletedForFailover(false)
                                .withRecoverySubnetName("rmuhapfcq")
                                .withRecoveryStaticIpAddress("sqxqvp")
                                .withRecoveryPublicIpAddressId("uoymgccelvezry")
                                .withRecoveryLBBackendAddressPoolIds(Arrays.asList("mfe", "kerqwkyh", "ob"))
                                .withTfoSubnetName("gxedkow")
                                .withTfoStaticIpAddress("bqpc")
                                .withTfoPublicIpAddressId("kbwcc")
                                .withTfoLBBackendAddressPoolIds(Arrays.asList("vcdwxlpqekftn", "htjsying", "fq")),
                            new IpConfigInputDetails()
                                .withIpConfigName("mtdh")
                                .withIsPrimary(true)
                                .withIsSeletedForFailover(false)
                                .withRecoverySubnetName("gikdgsz")
                                .withRecoveryStaticIpAddress("kbir")
                                .withRecoveryPublicIpAddressId("uzhlhkjoqrv")
                                .withRecoveryLBBackendAddressPoolIds(
                                    Arrays.asList("atjinrvgoupmfiib", "ggjioolvr", "x", "v"))
                                .withTfoSubnetName("k")
                                .withTfoStaticIpAddress("lqwjygvjayvblm")
                                .withTfoPublicIpAddressId("k")
                                .withTfoLBBackendAddressPoolIds(
                                    Arrays.asList("bxvvyhg", "opbyrqufegxu", "wz", "bnhlmc")),
                            new IpConfigInputDetails()
                                .withIpConfigName("p")
                                .withIsPrimary(false)
                                .withIsSeletedForFailover(true)
                                .withRecoverySubnetName("gbmhrixkwmyi")
                                .withRecoveryStaticIpAddress("jvegrhbpnaixexcc")
                                .withRecoveryPublicIpAddressId("reaxhcexdr")
                                .withRecoveryLBBackendAddressPoolIds(
                                    Arrays.asList("ahqkg", "tpwijnh", "jsvfycxzbfvoowv", "vmtgjqppy"))
                                .withTfoSubnetName("tronzmyhgfi")
                                .withTfoStaticIpAddress("sxkm")
                                .withTfoPublicIpAddressId("a")
                                .withTfoLBBackendAddressPoolIds(Arrays.asList("rjreafxts", "umh", "glikkxwslolb")),
                            new IpConfigInputDetails()
                                .withIpConfigName("vuzlm")
                                .withIsPrimary(false)
                                .withIsSeletedForFailover(false)
                                .withRecoverySubnetName("tgp")
                                .withRecoveryStaticIpAddress("rpw")
                                .withRecoveryPublicIpAddressId("eznoig")
                                .withRecoveryLBBackendAddressPoolIds(
                                    Arrays.asList("jwmwkpnbs", "zejjoqk", "gfhsxttaugzxn", "aa"))
                                .withTfoSubnetName("xdtnkdmkqjjlw")
                                .withTfoStaticIpAddress("nvrk")
                                .withTfoPublicIpAddressId("ou")
                                .withTfoLBBackendAddressPoolIds(Arrays.asList("rebqaaysjk"))))
                .withSelectionType("qtnqtt")
                .withRecoveryNetworkSecurityGroupId("lwfffi")
                .withEnableAcceleratedNetworkingOnRecovery(true)
                .withTfoNetworkSecurityGroupId("pqqmted")
                .withEnableAcceleratedNetworkingOnTfo(false)
                .withRecoveryNicName("jihy")
                .withRecoveryNicResourceGroupName("zphv")
                .withReuseExistingNic(true)
                .withTfoNicName("qncygupkvi")
                .withTfoNicResourceGroupName("dscwxqupevzhf")
                .withTfoReuseExistingNic(true)
                .withTargetNicName("xhojuj");
        model = BinaryData.fromObject(model).toObject(VMNicInputDetails.class);
        Assertions.assertEquals("uq", model.nicId());
        Assertions.assertEquals("gzlvdnkfxu", model.ipConfigs().get(0).ipConfigName());
        Assertions.assertEquals(true, model.ipConfigs().get(0).isPrimary());
        Assertions.assertEquals(false, model.ipConfigs().get(0).isSeletedForFailover());
        Assertions.assertEquals("rmuhapfcq", model.ipConfigs().get(0).recoverySubnetName());
        Assertions.assertEquals("sqxqvp", model.ipConfigs().get(0).recoveryStaticIpAddress());
        Assertions.assertEquals("uoymgccelvezry", model.ipConfigs().get(0).recoveryPublicIpAddressId());
        Assertions.assertEquals("mfe", model.ipConfigs().get(0).recoveryLBBackendAddressPoolIds().get(0));
        Assertions.assertEquals("gxedkow", model.ipConfigs().get(0).tfoSubnetName());
        Assertions.assertEquals("bqpc", model.ipConfigs().get(0).tfoStaticIpAddress());
        Assertions.assertEquals("kbwcc", model.ipConfigs().get(0).tfoPublicIpAddressId());
        Assertions.assertEquals("vcdwxlpqekftn", model.ipConfigs().get(0).tfoLBBackendAddressPoolIds().get(0));
        Assertions.assertEquals("qtnqtt", model.selectionType());
        Assertions.assertEquals("lwfffi", model.recoveryNetworkSecurityGroupId());
        Assertions.assertEquals(true, model.enableAcceleratedNetworkingOnRecovery());
        Assertions.assertEquals("pqqmted", model.tfoNetworkSecurityGroupId());
        Assertions.assertEquals(false, model.enableAcceleratedNetworkingOnTfo());
        Assertions.assertEquals("jihy", model.recoveryNicName());
        Assertions.assertEquals("zphv", model.recoveryNicResourceGroupName());
        Assertions.assertEquals(true, model.reuseExistingNic());
        Assertions.assertEquals("qncygupkvi", model.tfoNicName());
        Assertions.assertEquals("dscwxqupevzhf", model.tfoNicResourceGroupName());
        Assertions.assertEquals(true, model.tfoReuseExistingNic());
        Assertions.assertEquals("xhojuj", model.targetNicName());
    }
}