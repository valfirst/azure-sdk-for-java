// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;

/** Samples for IngestionSettings Get. */
public final class IngestionSettingsGetSamples {
    /**
     * Sample code: Get a ingestion setting on subscription.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void getAIngestionSettingOnSubscription(
        com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager.ingestionSettings().getWithResponse("default", Context.NONE);
    }
}