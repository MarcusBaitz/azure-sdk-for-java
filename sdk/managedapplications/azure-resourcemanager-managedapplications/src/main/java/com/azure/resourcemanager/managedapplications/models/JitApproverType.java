// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The approver type. */
public final class JitApproverType extends ExpandableStringEnum<JitApproverType> {
    /** Static value user for JitApproverType. */
    public static final JitApproverType USER = fromString("user");

    /** Static value group for JitApproverType. */
    public static final JitApproverType GROUP = fromString("group");

    /**
     * Creates a new instance of JitApproverType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public JitApproverType() {
    }

    /**
     * Creates or finds a JitApproverType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding JitApproverType.
     */
    @JsonCreator
    public static JitApproverType fromString(String name) {
        return fromString(name, JitApproverType.class);
    }

    /**
     * Gets known JitApproverType values.
     *
     * @return known JitApproverType values.
     */
    public static Collection<JitApproverType> values() {
        return values(JitApproverType.class);
    }
}