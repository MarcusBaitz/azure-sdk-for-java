// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.ai.contentsafety {
    requires transitive com.azure.core;

    exports com.azure.ai.contentsafety;
    exports com.azure.ai.contentsafety.models;

    opens com.azure.ai.contentsafety.models to
            com.azure.core,
            com.fasterxml.jackson.databind;
}