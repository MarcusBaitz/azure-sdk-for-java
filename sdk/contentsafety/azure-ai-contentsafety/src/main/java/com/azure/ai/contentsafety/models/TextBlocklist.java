// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.contentsafety.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Text Blocklist. */
@Fluent
public final class TextBlocklist {
    /*
     * Text blocklist name.
     */
    @Generated
    @JsonProperty(value = "blocklistName", access = JsonProperty.Access.WRITE_ONLY)
    private String blocklistName;

    /*
     * Text blocklist description.
     */
    @Generated
    @JsonProperty(value = "description")
    private String description;

    /** Creates an instance of TextBlocklist class. */
    @Generated
    public TextBlocklist() {}

    /**
     * Get the blocklistName property: Text blocklist name.
     *
     * @return the blocklistName value.
     */
    @Generated
    public String getBlocklistName() {
        return this.blocklistName;
    }

    /**
     * Get the description property: Text blocklist description.
     *
     * @return the description value.
     */
    @Generated
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: Text blocklist description.
     *
     * @param description the description value to set.
     * @return the TextBlocklist object itself.
     */
    @Generated
    public TextBlocklist setDescription(String description) {
        this.description = description;
        return this;
    }
}