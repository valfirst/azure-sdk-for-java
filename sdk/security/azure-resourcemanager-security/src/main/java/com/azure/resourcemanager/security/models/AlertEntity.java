// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** Changing set of properties depending on the entity type. */
@Fluent
public final class AlertEntity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AlertEntity.class);

    /*
     * Type of entity
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Changing set of properties depending on the entity type.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the type property: Type of entity.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the additionalProperties property: Changing set of properties depending on the entity type.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Changing set of properties depending on the entity type.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the AlertEntity object itself.
     */
    public AlertEntity withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}