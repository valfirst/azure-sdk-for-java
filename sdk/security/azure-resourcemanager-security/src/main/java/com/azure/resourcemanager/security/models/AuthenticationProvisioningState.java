// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AuthenticationProvisioningState. */
public final class AuthenticationProvisioningState extends ExpandableStringEnum<AuthenticationProvisioningState> {
    /** Static value Valid for AuthenticationProvisioningState. */
    public static final AuthenticationProvisioningState VALID = fromString("Valid");

    /** Static value Invalid for AuthenticationProvisioningState. */
    public static final AuthenticationProvisioningState INVALID = fromString("Invalid");

    /** Static value Expired for AuthenticationProvisioningState. */
    public static final AuthenticationProvisioningState EXPIRED = fromString("Expired");

    /** Static value IncorrectPolicy for AuthenticationProvisioningState. */
    public static final AuthenticationProvisioningState INCORRECT_POLICY = fromString("IncorrectPolicy");

    /**
     * Creates or finds a AuthenticationProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AuthenticationProvisioningState.
     */
    @JsonCreator
    public static AuthenticationProvisioningState fromString(String name) {
        return fromString(name, AuthenticationProvisioningState.class);
    }

    /** @return known AuthenticationProvisioningState values. */
    public static Collection<AuthenticationProvisioningState> values() {
        return values(AuthenticationProvisioningState.class);
    }
}