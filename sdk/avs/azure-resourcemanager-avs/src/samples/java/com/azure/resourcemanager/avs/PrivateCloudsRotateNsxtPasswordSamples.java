// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs;

import com.azure.core.util.Context;

/** Samples for PrivateClouds RotateNsxtPassword. */
public final class PrivateCloudsRotateNsxtPasswordSamples {
    /**
     * Sample code: PrivateClouds_RotateNsxtPassword.
     *
     * @param avsManager Entry point to AvsManager. Azure VMware Solution API.
     */
    public static void privateCloudsRotateNsxtPassword(com.azure.resourcemanager.avs.AvsManager avsManager) {
        avsManager.privateClouds().rotateNsxtPassword("group1", "cloud1", Context.NONE);
    }
}