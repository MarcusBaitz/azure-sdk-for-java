// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

/** Samples for ChangeDataCapture Start. */
public final class ChangeDataCaptureStartSamples {
    /*
     * x-ms-original-file: specification/datafactory/resource-manager/Microsoft.DataFactory/stable/2018-06-01/examples/ChangeDataCapture_Start.json
     */
    /**
     * Sample code: ChangeDataCapture_Start.
     *
     * @param manager Entry point to DataFactoryManager.
     */
    public static void changeDataCaptureStart(com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager
            .changeDataCaptures()
            .startWithResponse(
                "exampleResourceGroup",
                "exampleFactoryName",
                "exampleChangeDataCapture",
                com.azure.core.util.Context.NONE);
    }
}