// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Devices. */
public interface Devices {
    /**
     * Get device.
     *
     * @param resourceId The identifier of the resource.
     * @param deviceId Identifier of the device.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return device.
     */
    Device get(String resourceId, String deviceId);

    /**
     * Get device.
     *
     * @param resourceId The identifier of the resource.
     * @param deviceId Identifier of the device.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return device.
     */
    Response<Device> getWithResponse(String resourceId, String deviceId, Context context);
}