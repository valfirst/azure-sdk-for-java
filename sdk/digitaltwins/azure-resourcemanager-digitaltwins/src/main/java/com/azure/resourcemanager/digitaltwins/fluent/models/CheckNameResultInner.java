// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.digitaltwins.models.Reason;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The result returned from a check name availability request. */
@Fluent
public final class CheckNameResultInner {
    /*
     * Specifies a Boolean value that indicates if the name is available.
     */
    @JsonProperty(value = "nameAvailable")
    private Boolean nameAvailable;

    /*
     * Message indicating an unavailable name due to a conflict, or a
     * description of the naming rules that are violated.
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * Message providing the reason why the given name is invalid.
     */
    @JsonProperty(value = "reason")
    private Reason reason;

    /**
     * Get the nameAvailable property: Specifies a Boolean value that indicates if the name is available.
     *
     * @return the nameAvailable value.
     */
    public Boolean nameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Set the nameAvailable property: Specifies a Boolean value that indicates if the name is available.
     *
     * @param nameAvailable the nameAvailable value to set.
     * @return the CheckNameResultInner object itself.
     */
    public CheckNameResultInner withNameAvailable(Boolean nameAvailable) {
        this.nameAvailable = nameAvailable;
        return this;
    }

    /**
     * Get the message property: Message indicating an unavailable name due to a conflict, or a description of the
     * naming rules that are violated.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: Message indicating an unavailable name due to a conflict, or a description of the
     * naming rules that are violated.
     *
     * @param message the message value to set.
     * @return the CheckNameResultInner object itself.
     */
    public CheckNameResultInner withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the reason property: Message providing the reason why the given name is invalid.
     *
     * @return the reason value.
     */
    public Reason reason() {
        return this.reason;
    }

    /**
     * Set the reason property: Message providing the reason why the given name is invalid.
     *
     * @param reason the reason value to set.
     * @return the CheckNameResultInner object itself.
     */
    public CheckNameResultInner withReason(Reason reason) {
        this.reason = reason;
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
