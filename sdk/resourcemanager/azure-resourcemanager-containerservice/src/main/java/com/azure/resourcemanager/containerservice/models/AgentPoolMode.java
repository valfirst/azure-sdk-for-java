// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AgentPoolMode. */
public final class AgentPoolMode extends ExpandableStringEnum<AgentPoolMode> {
    /** Static value System for AgentPoolMode. */
    public static final AgentPoolMode SYSTEM = fromString("System");

    /** Static value User for AgentPoolMode. */
    public static final AgentPoolMode USER = fromString("User");

    /**
     * Creates or finds a AgentPoolMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AgentPoolMode.
     */
    @JsonCreator
    public static AgentPoolMode fromString(String name) {
        return fromString(name, AgentPoolMode.class);
    }

    /**
     * Gets known AgentPoolMode values.
     *
     * @return known AgentPoolMode values.
     */
    public static Collection<AgentPoolMode> values() {
        return values(AgentPoolMode.class);
    }
}
