// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Type of operation: get, read, delete, etc. */
@Fluent
public final class DimensionProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DimensionProperties.class);

    /*
     * Name of dimension.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Display name of dimension.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Internal name of dimension.
     */
    @JsonProperty(value = "internalName")
    private String internalName;

    /**
     * Get the name property: Name of dimension.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of dimension.
     *
     * @param name the name value to set.
     * @return the DimensionProperties object itself.
     */
    public DimensionProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: Display name of dimension.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name of dimension.
     *
     * @param displayName the displayName value to set.
     * @return the DimensionProperties object itself.
     */
    public DimensionProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the internalName property: Internal name of dimension.
     *
     * @return the internalName value.
     */
    public String internalName() {
        return this.internalName;
    }

    /**
     * Set the internalName property: Internal name of dimension.
     *
     * @param internalName the internalName value to set.
     * @return the DimensionProperties object itself.
     */
    public DimensionProperties withInternalName(String internalName) {
        this.internalName = internalName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
