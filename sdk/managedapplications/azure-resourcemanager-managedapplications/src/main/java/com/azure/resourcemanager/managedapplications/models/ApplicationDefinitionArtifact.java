// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Application definition artifact. */
@Fluent
public final class ApplicationDefinitionArtifact {
    /*
     * The managed application definition artifact name.
     */
    @JsonProperty(value = "name", required = true)
    private ApplicationDefinitionArtifactName name;

    /*
     * The managed application definition artifact blob uri.
     */
    @JsonProperty(value = "uri", required = true)
    private String uri;

    /*
     * The managed application definition artifact type.
     */
    @JsonProperty(value = "type", required = true)
    private ApplicationArtifactType type;

    /** Creates an instance of ApplicationDefinitionArtifact class. */
    public ApplicationDefinitionArtifact() {
    }

    /**
     * Get the name property: The managed application definition artifact name.
     *
     * @return the name value.
     */
    public ApplicationDefinitionArtifactName name() {
        return this.name;
    }

    /**
     * Set the name property: The managed application definition artifact name.
     *
     * @param name the name value to set.
     * @return the ApplicationDefinitionArtifact object itself.
     */
    public ApplicationDefinitionArtifact withName(ApplicationDefinitionArtifactName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the uri property: The managed application definition artifact blob uri.
     *
     * @return the uri value.
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the uri property: The managed application definition artifact blob uri.
     *
     * @param uri the uri value to set.
     * @return the ApplicationDefinitionArtifact object itself.
     */
    public ApplicationDefinitionArtifact withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get the type property: The managed application definition artifact type.
     *
     * @return the type value.
     */
    public ApplicationArtifactType type() {
        return this.type;
    }

    /**
     * Set the type property: The managed application definition artifact type.
     *
     * @param type the type value to set.
     * @return the ApplicationDefinitionArtifact object itself.
     */
    public ApplicationDefinitionArtifact withType(ApplicationArtifactType type) {
        this.type = type;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property name in model ApplicationDefinitionArtifact"));
        }
        if (uri() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property uri in model ApplicationDefinitionArtifact"));
        }
        if (type() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property type in model ApplicationDefinitionArtifact"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ApplicationDefinitionArtifact.class);
}