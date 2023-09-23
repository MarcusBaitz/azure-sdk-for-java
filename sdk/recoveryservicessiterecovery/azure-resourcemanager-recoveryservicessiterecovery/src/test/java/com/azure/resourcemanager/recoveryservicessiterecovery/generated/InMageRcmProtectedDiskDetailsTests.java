// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.DiskAccountType;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageRcmProtectedDiskDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageRcmSyncDetails;
import org.junit.jupiter.api.Assertions;

public final class InMageRcmProtectedDiskDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InMageRcmProtectedDiskDetails model =
            BinaryData
                .fromString(
                    "{\"diskId\":\"tpdyzoutxfptof\",\"diskName\":\"nuywe\",\"isOSDisk\":\"gvad\",\"capacityInBytes\":9185978745071534533,\"logStorageAccountId\":\"vkgjpytpmpvd\",\"diskEncryptionSetId\":\"gehlufbortbnu\",\"seedManagedDiskId\":\"faxzsvbxxyjissk\",\"seedBlobUri\":\"qocl\",\"targetManagedDiskId\":\"ioewyhxes\",\"diskType\":\"StandardSSD_LRS\",\"dataPendingInLogDataStoreInMB\":56.49629137496913,\"dataPendingAtSourceAgentInMB\":18.951668101900808,\"isInitialReplicationComplete\":\"qfbdxmdses\",\"irDetails\":{\"progressHealth\":\"NoProgress\",\"transferredBytes\":3596991969048751162,\"last15MinutesTransferredBytes\":4059127042163303518,\"lastDataTransferTimeUtc\":\"lpdib\",\"processedBytes\":1471676215734551835,\"startTime\":\"eatnejrnminzq\",\"lastRefreshTime\":\"gtkihonikzsr\",\"progressPercentage\":785240806},\"resyncDetails\":{\"progressHealth\":\"Queued\",\"transferredBytes\":778176165721909518,\"last15MinutesTransferredBytes\":3766908090253531975,\"lastDataTransferTimeUtc\":\"ogkensckhbmcar\",\"processedBytes\":5626892338199425573,\"startTime\":\"xkwyk\",\"lastRefreshTime\":\"dndx\",\"progressPercentage\":470451433}}")
                .toObject(InMageRcmProtectedDiskDetails.class);
        Assertions.assertEquals(DiskAccountType.STANDARD_SSD_LRS, model.diskType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InMageRcmProtectedDiskDetails model =
            new InMageRcmProtectedDiskDetails()
                .withDiskType(DiskAccountType.STANDARD_SSD_LRS)
                .withIrDetails(new InMageRcmSyncDetails())
                .withResyncDetails(new InMageRcmSyncDetails());
        model = BinaryData.fromObject(model).toObject(InMageRcmProtectedDiskDetails.class);
        Assertions.assertEquals(DiskAccountType.STANDARD_SSD_LRS, model.diskType());
    }
}