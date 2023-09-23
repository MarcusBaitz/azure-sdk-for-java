// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageDiskExclusionInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageDiskSignatureExclusionOptions;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageVolumeExclusionOptions;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class InMageDiskExclusionInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InMageDiskExclusionInput model =
            BinaryData
                .fromString(
                    "{\"volumeOptions\":[{\"volumeLabel\":\"injmuymve\",\"onlyExcludeIfSingleVolume\":\"ztscbgmusaictds\"},{\"volumeLabel\":\"kzzohnrddc\",\"onlyExcludeIfSingleVolume\":\"eqozrehlbz\"},{\"volumeLabel\":\"xbnjrqvzyuexoz\",\"onlyExcludeIfSingleVolume\":\"ynp\"},{\"volumeLabel\":\"eudpab\",\"onlyExcludeIfSingleVolume\":\"euwzosgyjxvc\"}],\"diskSignatureOptions\":[{\"diskSignature\":\"rmrexzvdube\"},{\"diskSignature\":\"zygba\"}]}")
                .toObject(InMageDiskExclusionInput.class);
        Assertions.assertEquals("injmuymve", model.volumeOptions().get(0).volumeLabel());
        Assertions.assertEquals("ztscbgmusaictds", model.volumeOptions().get(0).onlyExcludeIfSingleVolume());
        Assertions.assertEquals("rmrexzvdube", model.diskSignatureOptions().get(0).diskSignature());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InMageDiskExclusionInput model =
            new InMageDiskExclusionInput()
                .withVolumeOptions(
                    Arrays
                        .asList(
                            new InMageVolumeExclusionOptions()
                                .withVolumeLabel("injmuymve")
                                .withOnlyExcludeIfSingleVolume("ztscbgmusaictds"),
                            new InMageVolumeExclusionOptions()
                                .withVolumeLabel("kzzohnrddc")
                                .withOnlyExcludeIfSingleVolume("eqozrehlbz"),
                            new InMageVolumeExclusionOptions()
                                .withVolumeLabel("xbnjrqvzyuexoz")
                                .withOnlyExcludeIfSingleVolume("ynp"),
                            new InMageVolumeExclusionOptions()
                                .withVolumeLabel("eudpab")
                                .withOnlyExcludeIfSingleVolume("euwzosgyjxvc")))
                .withDiskSignatureOptions(
                    Arrays
                        .asList(
                            new InMageDiskSignatureExclusionOptions().withDiskSignature("rmrexzvdube"),
                            new InMageDiskSignatureExclusionOptions().withDiskSignature("zygba")));
        model = BinaryData.fromObject(model).toObject(InMageDiskExclusionInput.class);
        Assertions.assertEquals("injmuymve", model.volumeOptions().get(0).volumeLabel());
        Assertions.assertEquals("ztscbgmusaictds", model.volumeOptions().get(0).onlyExcludeIfSingleVolume());
        Assertions.assertEquals("rmrexzvdube", model.diskSignatureOptions().get(0).diskSignature());
    }
}