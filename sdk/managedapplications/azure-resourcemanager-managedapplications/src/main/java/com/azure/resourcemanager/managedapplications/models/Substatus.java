// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The sub status. */
public final class Substatus extends ExpandableStringEnum<Substatus> {
    /** Static value NotSpecified for Substatus. */
    public static final Substatus NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value Approved for Substatus. */
    public static final Substatus APPROVED = fromString("Approved");

    /** Static value Denied for Substatus. */
    public static final Substatus DENIED = fromString("Denied");

    /** Static value Failed for Substatus. */
    public static final Substatus FAILED = fromString("Failed");

    /** Static value Expired for Substatus. */
    public static final Substatus EXPIRED = fromString("Expired");

    /** Static value Timeout for Substatus. */
    public static final Substatus TIMEOUT = fromString("Timeout");

    /**
     * Creates a new instance of Substatus value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Substatus() {
    }

    /**
     * Creates or finds a Substatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Substatus.
     */
    @JsonCreator
    public static Substatus fromString(String name) {
        return fromString(name, Substatus.class);
    }

    /**
     * Gets known Substatus values.
     *
     * @return known Substatus values.
     */
    public static Collection<Substatus> values() {
        return values(Substatus.class);
    }
}