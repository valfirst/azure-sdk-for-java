// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Validation settings. */
@Fluent
public class ValidationDataSettings {
    /*
     * Validation data MLTable.
     */
    @JsonProperty(value = "data")
    private MLTableJobInput data;

    /*
     * The fraction of training dataset that needs to be set aside for
     * validation purpose.
     * Values between (0.0 , 1.0)
     * Applied when validation dataset is not provided.
     */
    @JsonProperty(value = "validationDataSize")
    private Double validationDataSize;

    /**
     * Get the data property: Validation data MLTable.
     *
     * @return the data value.
     */
    public MLTableJobInput data() {
        return this.data;
    }

    /**
     * Set the data property: Validation data MLTable.
     *
     * @param data the data value to set.
     * @return the ValidationDataSettings object itself.
     */
    public ValidationDataSettings withData(MLTableJobInput data) {
        this.data = data;
        return this;
    }

    /**
     * Get the validationDataSize property: The fraction of training dataset that needs to be set aside for validation
     * purpose. Values between (0.0 , 1.0) Applied when validation dataset is not provided.
     *
     * @return the validationDataSize value.
     */
    public Double validationDataSize() {
        return this.validationDataSize;
    }

    /**
     * Set the validationDataSize property: The fraction of training dataset that needs to be set aside for validation
     * purpose. Values between (0.0 , 1.0) Applied when validation dataset is not provided.
     *
     * @param validationDataSize the validationDataSize value to set.
     * @return the ValidationDataSettings object itself.
     */
    public ValidationDataSettings withValidationDataSize(Double validationDataSize) {
        this.validationDataSize = validationDataSize;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (data() != null) {
            data().validate();
        }
    }
}
