// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.OSVersionWrapper;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.SupportedOSDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.SupportedOSProperty;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SupportedOSPropertyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SupportedOSProperty model =
            BinaryData
                .fromString(
                    "{\"instanceType\":\"vzrrryveimi\",\"supportedOs\":[{\"osName\":\"yzatvfuzkaft\",\"osType\":\"vru\",\"osVersions\":[{\"version\":\"syeipqd\",\"servicePack\":\"jtgrqgdgkkileplk\"},{\"version\":\"mknhwtbbaedor\",\"servicePack\":\"mqfl\"},{\"version\":\"gbdg\",\"servicePack\":\"mgxdgdhpabgd\"},{\"version\":\"jddvjsaqw\",\"servicePack\":\"mmwllc\"}]},{\"osName\":\"srsxaptefh\",\"osType\":\"cgjokjljnhvlq\",\"osVersions\":[{\"version\":\"peeksnbksdqhjv\",\"servicePack\":\"lxeslkhh\"}]},{\"osName\":\"tcpoqma\",\"osType\":\"wqjwgok\",\"osVersions\":[{\"version\":\"jj\",\"servicePack\":\"ybwfdbkjb\"},{\"version\":\"ensvkzykjtj\",\"servicePack\":\"sxfwushcdp\"},{\"version\":\"pn\",\"servicePack\":\"mgjfbpkuwxeoio\"}]}]}")
                .toObject(SupportedOSProperty.class);
        Assertions.assertEquals("vzrrryveimi", model.instanceType());
        Assertions.assertEquals("yzatvfuzkaft", model.supportedOs().get(0).osName());
        Assertions.assertEquals("vru", model.supportedOs().get(0).osType());
        Assertions.assertEquals("syeipqd", model.supportedOs().get(0).osVersions().get(0).version());
        Assertions.assertEquals("jtgrqgdgkkileplk", model.supportedOs().get(0).osVersions().get(0).servicePack());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SupportedOSProperty model =
            new SupportedOSProperty()
                .withInstanceType("vzrrryveimi")
                .withSupportedOs(
                    Arrays
                        .asList(
                            new SupportedOSDetails()
                                .withOsName("yzatvfuzkaft")
                                .withOsType("vru")
                                .withOsVersions(
                                    Arrays
                                        .asList(
                                            new OSVersionWrapper()
                                                .withVersion("syeipqd")
                                                .withServicePack("jtgrqgdgkkileplk"),
                                            new OSVersionWrapper().withVersion("mknhwtbbaedor").withServicePack("mqfl"),
                                            new OSVersionWrapper().withVersion("gbdg").withServicePack("mgxdgdhpabgd"),
                                            new OSVersionWrapper().withVersion("jddvjsaqw").withServicePack("mmwllc"))),
                            new SupportedOSDetails()
                                .withOsName("srsxaptefh")
                                .withOsType("cgjokjljnhvlq")
                                .withOsVersions(
                                    Arrays
                                        .asList(
                                            new OSVersionWrapper()
                                                .withVersion("peeksnbksdqhjv")
                                                .withServicePack("lxeslkhh"))),
                            new SupportedOSDetails()
                                .withOsName("tcpoqma")
                                .withOsType("wqjwgok")
                                .withOsVersions(
                                    Arrays
                                        .asList(
                                            new OSVersionWrapper().withVersion("jj").withServicePack("ybwfdbkjb"),
                                            new OSVersionWrapper()
                                                .withVersion("ensvkzykjtj")
                                                .withServicePack("sxfwushcdp"),
                                            new OSVersionWrapper()
                                                .withVersion("pn")
                                                .withServicePack("mgjfbpkuwxeoio")))));
        model = BinaryData.fromObject(model).toObject(SupportedOSProperty.class);
        Assertions.assertEquals("vzrrryveimi", model.instanceType());
        Assertions.assertEquals("yzatvfuzkaft", model.supportedOs().get(0).osName());
        Assertions.assertEquals("vru", model.supportedOs().get(0).osType());
        Assertions.assertEquals("syeipqd", model.supportedOs().get(0).osVersions().get(0).version());
        Assertions.assertEquals("jtgrqgdgkkileplk", model.supportedOs().get(0).osVersions().get(0).servicePack());
    }
}