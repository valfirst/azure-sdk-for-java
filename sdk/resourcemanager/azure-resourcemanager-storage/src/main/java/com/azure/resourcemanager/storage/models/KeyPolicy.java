// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** KeyPolicy assigned to the storage account. */
@Fluent
public final class KeyPolicy {
    /*
     * The key expiration period in days.
     */
    @JsonProperty(value = "keyExpirationPeriodInDays", required = true)
    private int keyExpirationPeriodInDays;

    /**
     * Get the keyExpirationPeriodInDays property: The key expiration period in days.
     *
     * @return the keyExpirationPeriodInDays value.
     */
    public int keyExpirationPeriodInDays() {
        return this.keyExpirationPeriodInDays;
    }

    /**
     * Set the keyExpirationPeriodInDays property: The key expiration period in days.
     *
     * @param keyExpirationPeriodInDays the keyExpirationPeriodInDays value to set.
     * @return the KeyPolicy object itself.
     */
    public KeyPolicy withKeyExpirationPeriodInDays(int keyExpirationPeriodInDays) {
        this.keyExpirationPeriodInDays = keyExpirationPeriodInDays;
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
