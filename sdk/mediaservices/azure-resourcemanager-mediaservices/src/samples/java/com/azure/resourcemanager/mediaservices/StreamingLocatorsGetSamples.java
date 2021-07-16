// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices;

import com.azure.core.util.Context;

/** Samples for StreamingLocators Get. */
public final class StreamingLocatorsGetSamples {
    /**
     * Sample code: Get a Streaming Locator by name.
     *
     * @param mediaServicesManager Entry point to MediaServicesManager. This Swagger was generated by the API Framework.
     */
    public static void getAStreamingLocatorByName(
        com.azure.resourcemanager.mediaservices.MediaServicesManager mediaServicesManager) {
        mediaServicesManager
            .streamingLocators()
            .getWithResponse("contoso", "contosomedia", "clearStreamingLocator", Context.NONE);
    }
}