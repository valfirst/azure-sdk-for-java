// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.models;

import com.azure.resourcemanager.elastic.fluent.models.VMIngestionDetailsResponseInner;

/** An immutable client-side representation of VMIngestionDetailsResponse. */
public interface VMIngestionDetailsResponse {
    /**
     * Gets the cloudId property: The cloudId of given Elastic monitor resource.
     *
     * @return the cloudId value.
     */
    String cloudId();

    /**
     * Gets the ingestionKey property: Ingestion details to install agent on given VM.
     *
     * @return the ingestionKey value.
     */
    String ingestionKey();

    /**
     * Gets the inner com.azure.resourcemanager.elastic.fluent.models.VMIngestionDetailsResponseInner object.
     *
     * @return the inner object.
     */
    VMIngestionDetailsResponseInner innerModel();
}