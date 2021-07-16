// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes the Network Security Groups effective on a network interface. */
@Fluent
public final class EffectiveNetworkSecurityGroups {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EffectiveNetworkSecurityGroups.class);

    /*
     * The Azure resource ID of the network interface
     */
    @JsonProperty(value = "networkInterface")
    private String networkInterface;

    /*
     * The Network Security Groups effective on the network interface
     */
    @JsonProperty(value = "networkSecurityGroups")
    private List<String> networkSecurityGroups;

    /**
     * Get the networkInterface property: The Azure resource ID of the network interface.
     *
     * @return the networkInterface value.
     */
    public String networkInterface() {
        return this.networkInterface;
    }

    /**
     * Set the networkInterface property: The Azure resource ID of the network interface.
     *
     * @param networkInterface the networkInterface value to set.
     * @return the EffectiveNetworkSecurityGroups object itself.
     */
    public EffectiveNetworkSecurityGroups withNetworkInterface(String networkInterface) {
        this.networkInterface = networkInterface;
        return this;
    }

    /**
     * Get the networkSecurityGroups property: The Network Security Groups effective on the network interface.
     *
     * @return the networkSecurityGroups value.
     */
    public List<String> networkSecurityGroups() {
        return this.networkSecurityGroups;
    }

    /**
     * Set the networkSecurityGroups property: The Network Security Groups effective on the network interface.
     *
     * @param networkSecurityGroups the networkSecurityGroups value to set.
     * @return the EffectiveNetworkSecurityGroups object itself.
     */
    public EffectiveNetworkSecurityGroups withNetworkSecurityGroups(List<String> networkSecurityGroups) {
        this.networkSecurityGroups = networkSecurityGroups;
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