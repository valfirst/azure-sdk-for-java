// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;

/** Samples for IotSensors List. */
public final class IotSensorsListSamples {
    /**
     * Sample code: List IoT sensors.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void listIoTSensors(com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager
            .iotSensors()
            .listWithResponse(
                "subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23/resourceGroups/myRg/providers/Microsoft.Devices/IotHubs/myHub",
                Context.NONE);
    }
}