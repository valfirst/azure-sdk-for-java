// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.healthcareapis.models.OperationResultStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties indicating the operation result of an operation on a service. */
@Fluent
public final class OperationResultsDescriptionInner {
    /*
     * The ID of the operation returned.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The name of the operation result.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The status of the operation being performed.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private OperationResultStatus status;

    /*
     * The time that the operation was started.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private String startTime;

    /*
     * The time that the operation finished.
     */
    @JsonProperty(value = "endTime", access = JsonProperty.Access.WRITE_ONLY)
    private String endTime;

    /*
     * Additional properties of the operation result.
     */
    @JsonProperty(value = "properties")
    private Object properties;

    /**
     * Get the id property: The ID of the operation returned.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the operation result.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the status property: The status of the operation being performed.
     *
     * @return the status value.
     */
    public OperationResultStatus status() {
        return this.status;
    }

    /**
     * Get the startTime property: The time that the operation was started.
     *
     * @return the startTime value.
     */
    public String startTime() {
        return this.startTime;
    }

    /**
     * Get the endTime property: The time that the operation finished.
     *
     * @return the endTime value.
     */
    public String endTime() {
        return this.endTime;
    }

    /**
     * Get the properties property: Additional properties of the operation result.
     *
     * @return the properties value.
     */
    public Object properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Additional properties of the operation result.
     *
     * @param properties the properties value to set.
     * @return the OperationResultsDescriptionInner object itself.
     */
    public OperationResultsDescriptionInner withProperties(Object properties) {
        this.properties = properties;
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
