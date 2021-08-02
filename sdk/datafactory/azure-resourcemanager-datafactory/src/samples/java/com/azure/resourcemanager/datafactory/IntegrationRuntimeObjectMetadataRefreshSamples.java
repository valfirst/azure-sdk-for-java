// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory;

import com.azure.core.util.Context;

/** Samples for IntegrationRuntimeObjectMetadata Refresh. */
public final class IntegrationRuntimeObjectMetadataRefreshSamples {
    /**
     * Sample code: IntegrationRuntimeObjectMetadata_Refresh.
     *
     * @param dataFactoryManager Entry point to DataFactoryManager. The Azure Data Factory V2 management API provides a
     *     RESTful set of web services that interact with Azure Data Factory V2 services.
     */
    public static void integrationRuntimeObjectMetadataRefresh(
        com.azure.resourcemanager.datafactory.DataFactoryManager dataFactoryManager) {
        dataFactoryManager
            .integrationRuntimeObjectMetadatas()
            .refresh("exampleResourceGroup", "exampleFactoryName", "testactivityv2", Context.NONE);
    }
}