// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Web table dataset properties. */
@Fluent
public final class WebTableDatasetTypeProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WebTableDatasetTypeProperties.class);

    /*
     * The zero-based index of the table in the web page. Type: integer (or
     * Expression with resultType integer), minimum: 0.
     */
    @JsonProperty(value = "index", required = true)
    private Object index;

    /*
     * The relative URL to the web page from the linked service URL. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "path")
    private Object path;

    /**
     * Get the index property: The zero-based index of the table in the web page. Type: integer (or Expression with
     * resultType integer), minimum: 0.
     *
     * @return the index value.
     */
    public Object index() {
        return this.index;
    }

    /**
     * Set the index property: The zero-based index of the table in the web page. Type: integer (or Expression with
     * resultType integer), minimum: 0.
     *
     * @param index the index value to set.
     * @return the WebTableDatasetTypeProperties object itself.
     */
    public WebTableDatasetTypeProperties withIndex(Object index) {
        this.index = index;
        return this;
    }

    /**
     * Get the path property: The relative URL to the web page from the linked service URL. Type: string (or Expression
     * with resultType string).
     *
     * @return the path value.
     */
    public Object path() {
        return this.path;
    }

    /**
     * Set the path property: The relative URL to the web page from the linked service URL. Type: string (or Expression
     * with resultType string).
     *
     * @param path the path value to set.
     * @return the WebTableDatasetTypeProperties object itself.
     */
    public WebTableDatasetTypeProperties withPath(Object path) {
        this.path = path;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (index() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property index in model WebTableDatasetTypeProperties"));
        }
    }
}